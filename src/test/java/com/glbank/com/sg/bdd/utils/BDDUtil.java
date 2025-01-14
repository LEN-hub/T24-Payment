package com.glbank.com.sg.bdd.utils;

import cn.hutool.core.date.DateUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.Assert.assertTrue;



public class BDDUtil extends PageObject {
    private Set<String> handles;
    private String homeWindow;
    private String thirdWindow;
    private static String systemPath = System.getProperty("user.dir");
    public static List<String> date = new ArrayList<>();
    public static int size = 0;
    public static Map<String, Object> params = new HashMap<String, Object>();

    @FindBy(id = "userName")
    private WebElementFacade userNameInputBox;

    @FindBy(xpath = "//*[text() = 'Next']")
    private WebElementFacade nextButton;

    @FindBy(id = "password")
    private WebElementFacade passwordInputBox;

    @FindBy(id = "security-code")
    private WebElementFacade securityCodeInputBox;

    @FindBy(xpath = "//*[text() = 'Log on']")
    private WebElementFacade logOnButton;

    @FindBy(xpath = "//div[@data-analytics-event-content='profile selector']")
    private WebElementFacade okProfileButton;

    @FindBy(xpath = "//span[@class='current-profile']")
    private WebElementFacade errorProfileButton;

//    @FindBy(xpath = "//div[@class='tooltip-inner']")
    @FindBy(xpath = "//div[@class='dropdown-menu scrollable-y']")
    private WebElementFacade profileListElem;

    @FindBy(xpath = "//div[@class='tooltip-profile']")
    private WebElementFacade currentProfile;

    //Push Auth
    @FindBy(xpath = "//*[@id='tab_hsbc_app']")
    private WebElementFacade tab_HSBC_App;
    @FindBy(id = "push-password")
    private WebElementFacade pushAuthPasswordInputBox;
    @FindBy(xpath="//span[text()='Continue']")
    private WebElementFacade continueBtn;
    @FindBy(xpath="//span[text()='Send notification']")
    private WebElementFacade sendNotification;

    @FindBy(xpath = "//input[@id='sercurity-code']")
    private WebElementFacade otpCodeInputBox;

    @FindBy(xpath = "//*[text()='Please update business information.']")
    public List<WebElementFacade> topTips;

    @FindBy(xpath = "//div[@class='notification-content']")
    private WebElementFacade logonAlertError;
    //eCare

    @FindBy(id = "j_username")
    private WebElementFacade userNameForEcare;
    @FindBy(id = "j_password")
    private WebElementFacade passwordForEcare;
    @FindBy(xpath = "//button[text()='Log in']")
    private WebElementFacade logInForEcare;

    @FindBy(xpath = "//button[contains(text(), 'Acknowledge')]")
    private WebElementFacade ackOverLayBtn;

    private static final Logger LOGGER = LoggerFactory.getLogger(BDDUtil.class);
    private static String url;
    private String username;
    private String password = "b2g3ifd";
    private static String securityCodeUrl;
    private static String profile;
    private static String suprofile;
    private static String env;
    private int logonRetryCount = 2;
    private boolean isLogonSuccess = false;
    public static EnvironmentVariables envVariable;


    public void setEnv(String env) {
        this.env = env;
    }

    public String getEnv() {
        return env;
    }

    public String getUrl() {
        return this.url;
    }

    public void getConfig(String env){
        if (envVariable.getProperty("environment") != null) {
            env = envVariable.getProperty("environment");
        }
        setEnv(env);

        url = getEnvVariable("environments." + env + ".webdriver.base.url");
        username = getEnvVariable("environments." + env + ".username");
        if (getEnvVariable("environments." + env + ".password") != null)
            password = getEnvVariable("environments." + env + ".password");
        securityCodeUrl = getEnvVariable("environments." + env + ".security.token.url");
        profile = getEnvVariable("environments." + env + ".profile");
        suprofile = getEnvVariable("environments." + env + ".suprofile");

    }

    private void getConfigForOtherEnv(String env,String type){
        if (envVariable.getProperty("environment") != null) {
            env = envVariable.getProperty("environment");
        }
        setEnv(env);
        url = getEnvVariable(type +"." + env + ".webdriver.base.url");
        username = getEnvVariable(type+"." + env + ".username");
        password = getEnvVariable(type+"." + env + ".password");
    }

    public String getEnvVariable(String key){
        return envVariable.getProperty(key);
    }

    /** @deprecated
     * Use skipTour() method instead
     * */

    public void selectProfile(String profileName){
        if (isMockEnv() && currentProfile.getText().split("\n")[0].equals(profileName)){
            //if the current selected profile is your target profile, then need to skip because the profile is not clickable.
            return;
        }

        if(getTitle().equals("Error")){
            errorProfileButton.click();
        } else {
            okProfileButton.click();
        }

        find(By.partialLinkText(profileName)).click();

        if(getTitle().equals("Business Internet Banking")){
            LOGGER.info("Logon DBB success.");
        } else if(getTitle().equals("Error")){
            throw new RuntimeException("Logon DBB with profile '" + profileName + "' failed.");
        }
    }

    @Step
    public void verifyOtpAndConfirm() {
        String code = getLogonToken(securityCodeUrl);
        enter(code).into(otpCodeInputBox);
        find(By.xpath("//div[@translate='confirm']")).click();
    }


    public String screenShort(){
        int size = 1;
        for (File file : Objects.requireNonNull(new File(systemPath + "/src/test/resources/testData/screenShots").listFiles())){
            if (file.isFile()){
                size++;
            }
        }
        File srcfile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            String path = systemPath + "/src/test/resources/testData/screenShots/";
            String fileName = WordUtils.getDate + size;
            date.add(fileName);
            FileUtils.copyFile(srcfile, new File(path + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isMockEnv(){
        if (!securityCodeUrl.startsWith("http")) {
            // LL, Mock
            return true;
        }
        return false;
    }

    /** @deprecated
     * timeout issue was fixed in chrome driver version 83.
     * */
    @Deprecated
    public void openURL(String url) {
        /*
        add silentOutput=ture to avoid frequently useless timeout output like the following:
        00:02:28.064 [1587610345.658][SEVERE]: Timed out receiving message from renderer: 0.100
        */
        System.setProperty("webdriver.chrome.silentOutput", "true");
        openUrl(url);
    }

    public String getPaymentToken(String verifyCode) {
        if (isMockEnv()) {
            return securityCodeUrl;
        }

        LOGGER.info("Verify Code : '" + verifyCode + "'");
        System.out.println(securityCodeUrl);
        String urlString = securityCodeUrl.replace("type=1", "type=3") + "&account=" + verifyCode;

        disableSSLCertificateChecking();
        String dataString = accessURL(urlString);
        String token = "";
        for (String str : dataString.split(",")) {
            if (str.contains("token")) {
                token = str.split(":")[1].replace("\"","");
                break;
            }
        }
        if (token == ""){
            throw new RuntimeException("Fail to get payment Token!");
        }else {
            LOGGER.info("Get payment token OK : '" + token + "'");
            return token;
        }
    }

    public String getLogonToken(String urlString) {
        if (isMockEnv()) {
            // LL, Mock, return "111111"
            return urlString;
        }

        disableSSLCertificateChecking();
        String dataString = accessURL(urlString);
        String token = "";
        for (String str : dataString.split(",")) {
            if (str.contains("token")) {
                token = str.split(":")[1].replace("\"","");
                break;
            }
        }

        if (token == ""){
            LOGGER.info("Token string : " + dataString);
            throw new RuntimeException("Fail to get Token.");
        }else {
            return token;
        }
    }

    private void disableSSLCertificateChecking() {
        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                // Not implemented
            }

            @Override
            public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                // Not implemented
            }
        } };

        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public String accessURL(String urlString) {
        URL url = null;
        BufferedReader bufferedReader = null;
        StringBuffer stringBuffer = new StringBuffer();

        try {
            url = new URL(urlString);
            try {
                InputStream inputStream;
                try {
                    inputStream = url.openStream();
                } catch (UnknownHostException e) {
                    System.setProperty("https.proxyHost", "intpxy1.hk.hsbc");
                    System.setProperty("https.proxyPort", "8080");
                    inputStream = url.openStream();
                }
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                String str = null;
                while((str=bufferedReader.readLine())!=null){
                    stringBuffer.append(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String getCurrentTimestamp(){
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyyMMddhhmmss");
        return ft.format(dNow);
    }

    public String getDeltaDate(int delta){
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, delta);
        Date date = calendar.getTime();
        return ft.format(date);
    }

    public void scrollWindow(int width, int height){
        String x = Integer.toString(width);
        String y = Integer.toString(height);
        evaluateJavascript("scroll("+x+","+y+")");
    }

    public WebElement scrollWindowToElement(WebElement element){
        //we have a fixed header + a fixed footer. So simply scrolling 100px up as a "padding".
//        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();window.scrollBy(0,-100);", element);
        evaluateJavascript("arguments[0].scrollIntoView();window.scrollBy(0,-100);", element);
        return element;
    }

    public void setDate(WebElementFacade element,String date){
        evaluateJavascript("arguments[0].removeAttribute('readonly');",element);
        enter(date + Keys.ENTER).into(element);
    }

    public void clickByJS(WebElementFacade element) {
        evaluateJavascript("arguments[0].click()", element);
    }

    public static Object executeJS(String code, WebDriver driver) {
         JavascriptExecutor executor = (JavascriptExecutor) driver;
         return executor.executeScript(code);
    }

    public void quitDriver(){
        getDriver().quit();
    }

    public void clickWithRetry(WebElementFacade element){
        int i=2;
        sleep(2);
        while(i>0) {
            if (element.isEnabled() && element.isVisible()) {
//                evaluateJavascript("arguments[0].click()", element);
                element.waitUntilClickable().click();
                break;
            }
            sleep(2);
            i--;
        }
    }

    public void enterWithRetry(String value,WebElementFacade element ){
        int i=10;
        sleep(3);
        while(i>0) {
            if ( element.isCurrentlyVisible()&&element.isEnabled()) {
                enter(value).into(element);
                break;
            }
            sleep(2);
            i--;
        }
    }

    public String  ourGetText(WebElementFacade element ){
        int i=10;
        while(i>0) {
            if (element.isEnabled() && element.isVisible()) {
                return element.waitUntilVisible().getText();
            }
            sleep(2);
            i--;
        }
        return "";
    }

    public void scrolltoButtom() {
        evaluateJavascript("window.scrollTo(0, document.body.scrollHeight)");
    }


    public void switchToSecondWindows(){
        //获取当前窗口句柄
        String win = getDriver().getWindowHandle();
        //获取所有窗口句柄
        Set<String>Windows = getDriver().getWindowHandles();
        //把获取到的窗口句柄放到list中
        List<String>allWindows = new ArrayList<String>(Windows);
        int j = 0;
        //切换到新打开的窗口并最大化
        for (int i = 0; i < allWindows.size(); i++) {
            if (!allWindows.get(i).equals(win)) {
                j = i;
            }
        }
        getDriver().switchTo().window(allWindows.get(j-1));
    }

    public void switchToWindows(){
        //获取当前窗口句柄
        String win = getDriver().getWindowHandle();
        //获取所有窗口句柄
        Set<String>Windows = getDriver().getWindowHandles();
        //把获取到的窗口句柄放到list中
        List<String>allWindows = new ArrayList<String>(Windows);
        int j = 0;
        //切换到新打开的窗口并最大化
        for (int i = 0; i < allWindows.size(); i++) {
            if (!allWindows.get(i).equals(win)) {
                j = i;
            }
        }
        getDriver().switchTo().window(allWindows.get(j));
    }

    public void switchToHomeWindow(){
        getDriver().close();
        getDriver().switchTo().window(homeWindow);
    }

    public void closeWindow() {
        try {
            String winHandleBefore = getDriver().getWindowHandle();//关闭当前窗口前，获取当前窗口句柄
            Set<String> winHandles = getDriver().getWindowHandles();//使用set集合获取所有窗口句柄
            getDriver().close();//关闭窗口
            Iterator<String> it = winHandles.iterator();//创建迭代器，迭代winHandles里的句柄
            while (it.hasNext()) {//用it.hasNext()判断时候有下一个窗口,如果有就切换到下一个窗口
                String win = it.next();//获取集合中的元素
                if (!win.equals(winHandleBefore)) { //如果此窗口不是关闭前的窗口
                    getDriver().switchTo().window(win);//切换到新窗口
                    System.out.println("Switch Window From " + winHandleBefore + " to " + win);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchToNewWindow(){
        String handle = getDriver().getWindowHandle();
        for (String temhandle : getDriver().getWindowHandles()) {
            if (!temhandle.equals(handle))
                getDriver().switchTo().window(temhandle);
        }
    }

    public static String getTimeNowThroughCalendar(){
        //使用默认时区和语言环境获得一个日历。
        Calendar    rightNow    =    Calendar.getInstance();
		/*用Calendar的get(int field)方法返回给定日历字段的值。
		HOUR 用于 12 小时制时钟 (0 - 11)，HOUR_OF_DAY 用于 24 小时制时钟。*/
        Integer year = rightNow.get(Calendar.YEAR);
        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
        Integer day = rightNow.get(rightNow.DAY_OF_MONTH);
        Integer hour12 = rightNow.get(rightNow.HOUR);
        Integer hour24 = rightNow.get(rightNow.HOUR_OF_DAY);
        Integer minute = rightNow.get(rightNow.MINUTE);
        Integer second = rightNow.get(rightNow.SECOND);
        Integer millisecond = rightNow.get(rightNow.MILLISECOND);
        String TimeNow12 = year+"-"+month+"-"+day+" "+hour12+":"+minute+":"+second+":"+millisecond;
        String TimeNow24 = year+"-"+month+"-"+day+" "+hour24+":"+minute+":"+second+":"+millisecond;
        return TimeNow24;
//        System.out.println("日历："+rightNow+"\n12小时制时钟："+TimeNow12+"\n24小时制时钟："+TimeNow24);
    }

    public String dateFormate(){
        Date date = new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    public String lastDate(){
        Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_MONTH, -365);
        String endDate = new SimpleDateFormat("yyyy-MM-dd").format(now.getTime());
        System.out.println(endDate);
        return endDate;//一年以前的日期。
    }

    public String dateBirth(){
        Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_MONTH, -7650);
        String endDate = new SimpleDateFormat("yyyy-MM-dd").format(now.getTime());
        System.out.println(endDate);
        return endDate;//21年前。
    }

    @Step
    public void fileUpload(){
        //实现文件上传。通过Runtime的静态方法获取Runtime对象
        Runtime runtime = Runtime.getRuntime();
        //通过Runtime对象调用exe方法
        try {
            runtime.exec("src/test/resources/testData/autopay/chromUpload.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

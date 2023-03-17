package com.glbank.com.sg.bdd.steps.enterpriseNetSilver;

import com.glbank.com.sg.bdd.glue.enterpriseNetSilver.Logon_glue;
import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.Logon_page;
import com.glbank.com.sg.bdd.utils.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import redis.clients.jedis.Jedis;

import java.awt.*;
import java.net.MalformedURLException;
import java.util.Set;

import static com.glbank.com.sg.bdd.utils.MobileConfig.driver;
import static com.glbank.com.sg.bdd.utils.RedisUtil.cli_single;

public class Logon_step extends ScenarioSteps {
    private Logon_page logonPage;
    private BDDUtil bddUtil;
    public static String password;
    public static String email;
    public static String organisationID;
    public static String deviceName;
    public static String newPassword;
    public static String loginOtp;
    public static String scfSitPassWord;
    public static String scfSitUserName;
    public static String cookie;

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        logonPage.openUrl(logonUrl);
    }

    @Step
    public void clickOkButton(){
        if (logonPage.clickSecondPageOkBtn.isVisible()){
            logonPage.clickSecondPageOkBtn.click();
        }
    }

    @Step
    public String enter_OrganisationID_into_box(String envName) {
        organisationID = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".organisationID");
        logonPage.enterOrganisationID(organisationID);
        return organisationID;
    }

    @Step
    public void checkLanguage(){
        Actions action=new Actions(getDriver());
        action.moveToElement(logonPage.checkLanguage).perform();
        bddUtil.sleep(1);
        logonPage.selectChinese.click();
    }

    @Step
    public String enter_email_into_box(String envName) {
        email = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".email");
        logonPage.enterEmailAddress(email);
        return email;
    }

    @Step
    public String enter_password_into_box(String envName) {
        password = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".password");
        logonPage.enterPassWord(password);
        return password;
    }

    @Step
    public String get_New_password(String envName) {
        newPassword = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".newPassword");
        return newPassword;
    }

    @Step
    public String getDeviceName(String envName) {
        deviceName = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".deviceName");
        return deviceName;
    }

    @Step
    public void clickLogonBtn(){
        logonPage.logonBtn.click();
    }

    @Step
    public void clickOkBtnOnTitle(){
        logonPage.clickOkBtnOnTitle.click();
    }

    @Step
    public void clickSitEnvOtpBtn(){
        logonPage.clickSitEnvOtpBtn.click();
        bddUtil.sleep(2);
        loginOtp = getDriver().switchTo().alert().getText().substring(7, 13);
        System.out.println(loginOtp);
        getDriver().switchTo().alert().accept();
        logonPage.enterSitEnvOtp.sendKeys(loginOtp);
        logonPage.clickOkBtn.click();
    }

    @Step
    public void getVcodeTitle(){
        logonPage.vcodeTitle.isVisible();
    }

    @Step
    public void clickNextBtn(){
        logonPage.nextBtn.click();
    }

    @Step
    public void clickSitNextBtn(){
        logonPage.clickSitNextBtn.click();
    }

    @Step
    public void enterVcode() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        System.out.println(MobileConfig.vcode);
        logonPage.vcode1.click();
        enterKeys.EnterKeys(MobileConfig.vcode.substring(0,1));
        logonPage.vcode2.click();
        enterKeys.EnterKeys(MobileConfig.vcode.substring(1,2));
        logonPage.vcode3.click();
        enterKeys.EnterKeys(MobileConfig.vcode.substring(2,3));
        logonPage.vcode4.click();
        enterKeys.EnterKeys(MobileConfig.vcode.substring(3,4));
        logonPage.vcode5.click();
        enterKeys.EnterKeys(MobileConfig.vcode.substring(4,5));
        logonPage.vcode6.click();
        enterKeys.EnterKeys(MobileConfig.vcode.substring(5,6));
    }

    @Step
    public static void vkeyAppVcode() throws MalformedURLException, InterruptedException {
        try{
        MobileConfig test = new MobileConfig();
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server");
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server.test");
        test.testMobile();
        Thread.sleep(20000);
//        if (driver.findElement(By.xpath("//android.widget.Button[ends-with(@text,'OK')]")).isDisplayed()){
//            driver.findElementByXPath("//android.widget.Button[ends-with(@text,'OK')]").click();
//        }
        if (driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'btn_otp')]/child::android.widget.TextView[2]").getText().equals("一次性\n密码")) {
          test.getVcode();
        }else {
            test.clickSystemPopupWindows();
            test.clickStartButton();
            test.logonVkeyApp(organisationID, email, password);
            test.clickLetUsStart();
            test.verification();
            test.clickCreatPassword();
            }
        } finally {
            quitAndroidDriver();
        }
    }

    public void secondVkeyAppVcode() throws MalformedURLException, InterruptedException {
        MobileConfig test = new MobileConfig();
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server");
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server.test");
        test.testSecondMobile();
        Thread.sleep(5000);
        if (driver.findElementByXPath("//android.widget.TextView[ends-with(@resource-id,'permission_message')]").isDisplayed()) {
            test.clickSystemPopupWindows();
            test.clickStartButton();
            test.clickLetUsStart();
            test.logonVkeyApp(organisationID, email, password);
            test.enterOpt();
            test.clickCreatPassword();
            test.getVcode();
        }else {
            test.getVcode();
        }
    }

    @Step
    public void getAuthenticateNowBtn(){
        logonPage.authenticateNowBtn.click();
    }

    @Step
    public void resetPassword() throws MalformedURLException, InterruptedException, AWTException {
        if (logonPage.changePasswordTitle.isVisible()){
            logonPage.originalPassword.sendKeys(password);
            logonPage.firstEnterPassword.sendKeys(newPassword);
            logonPage.secondEnterPassword.sendKeys(newPassword);
            logonPage.resetPasswordBtn.click();
            enter_OrganisationID_into_box(Logon_glue.envTag);
            enter_email_into_box(Logon_glue.envTag);
            logonPage.password.sendKeys(newPassword);
            clickLogonBtn();
            getVcodeTitle();
            clickNextBtn();
            vkeyAppVcode();
            enterVcode();
            getAuthenticateNowBtn();
        }
    }

    @Step
    public static void quitAndroidDriver(){
        MobileConfig test = new MobileConfig();
        test.quitAndroid();
    }

    @Step
    public String scfSitEnvLogin(){
        WebDriver.Options manage = getDriver().manage();
        Set<Cookie> cookies = manage.getCookies();
        for (Cookie c: cookies){
            if (c.getName().equals("CAPTCHAID")) {
                cookie = c.getValue();
                System.out.println(c.getValue());
            }
        }
        //ip地址，端口号
        Jedis jedis = cli_single("10.28.7.48", 6379);
        jedis.auth("Asdf1234");
        System.out.println("redis连接成功");
        jedis.select(80);
        String value = jedis.get(cookie);
        String value2 = value.replaceAll("\"","");
        System.out.println(value2);
        jedis.close();
        return value2;
    }
    @Step
    public String enter_scf_sit_userName_into_box(String envName) {
        scfSitUserName = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".username");
        logonPage.scfSitEenUserName(scfSitUserName);
        return password;
    }

    @Step
    public String enter_scf_sit_password_into_box(String envName) {
        scfSitPassWord = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".password");
        logonPage.scfSitEenPassword(scfSitPassWord);
        return password;
    }
    public void getRedisCodeEnterScfSitEnvPage(){
        logonPage.enterVerificationCode.sendKeys(scfSitEnvLogin());
        logonPage.clickLoginBtn.click();
    }

    public void changePassWord(){
        logonPage.password.clear();
        logonPage.password.sendKeys(FileUtils.LastReadFileInput3("changePassword"));
    }

}

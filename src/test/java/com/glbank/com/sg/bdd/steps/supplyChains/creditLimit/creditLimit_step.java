package com.glbank.com.sg.bdd.steps.supplyChains.creditLimit;

import com.glbank.com.sg.bdd.pages.supplyChains.creditLimit.creditLimit_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import com.glbank.com.sg.bdd.utils.RandomPhoneNumber;
import com.glbank.com.sg.bdd.utils.historyExcel;
import net.thucydides.core.steps.ScenarioSteps;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class creditLimit_step extends ScenarioSteps {
    private creditLimit_page creditLimit_page;
    private BDDUtil bddUtil;
    public static String envTag;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/BR.jpg";
    String uploadExcel = systemPath + "/src/test/resources/testData/excel/HistoricalExcel.xlsx";
    String ChromePath = systemPath+"/src/test/resources/drivers/chromedriver.exe";
    @Step
    public void clickUnderWritingAndApproval(){
        creditLimit_page.underWriting.click();
        bddUtil.sleep(1);
        creditLimit_page.underWritingApproval.click();
    }

    @Step
    public void seeUnderWritingAndApprovalText(){
        assertEquals("Underwriting Approval",creditLimit_page.underWritingApprovalText.getText());
    }

    @Step
    public void clickBuyerAssignBtn(){
        List<WebElementFacade> role = creditLimit_page.role;
        List<WebElementFacade> assignBtn = creditLimit_page.assignToMeBtn;
        for (int i = 0; i <8 ; i++) {
            if (role.get(i).getText().equals("Buyer")){
                assignBtn.get(i).click();
                break;
            }

        }
        bddUtil.sleep(1);
    }

    @Step
    public void clickBuyerTestDataAssignBtn(){
        List<WebElementFacade> data = creditLimit_page.applicant;
        List<WebElementFacade> assignBtn = creditLimit_page.assignToMeBtn;
        for (int i = 0; i < data.size(); i++) {
            if (FileUtils.LastReadFileInput3("buyer").equals(data.get(i).getText())){
                bddUtil.scrollWindowToElement(data.get(i)).click();
//                assignBtn.get(i).click();
                bddUtil.clickByJS(assignBtn.get(i));
                break;
            }
        }
        bddUtil.sleep(1);
        /*for (int i = 0; i <8 ; i++) {
            if (data.get(i).getText().equals("test06")){
                assignBtn.get(i).click();
                break;
            }

        }*/
    }

    @Step
    public void clickTopAssignBtn(){
        bddUtil.sleep(2);
        creditLimit_page.assignToMeTopBtn.click();
    }

    @Step
    public void seeProceedBtn(){
        bddUtil.sleep(2);
        creditLimit_page.proceedBtn.click();
    }

    @Step
    public void clickCompletedBtn(){
        creditLimit_page.completed.click();
        bddUtil.sleep(1);
    }

    @Step
    public void updateLimit(){
        bddUtil.find(By.xpath("//label[@for='limitType']"));
        bddUtil.sleep(1);
        creditLimit_page.updateLimit.clear();
        creditLimit_page.updateLimit.sendKeys("2500000");
    }

    @Step
    public void clickResultBtn(){
        creditLimit_page.result.click();
    }

    @Step
    public void clickApproveBtn(){
        List<WebElementFacade> roles = creditLimit_page.resultList;
        for (int i = 0; i <roles.size() ; i++) {
            System.out.println(roles.get(i).getText());
            if (roles.get(i).getText().equals("Approve")){
                roles.get(i).click();
                break;
            }
        }
        bddUtil.sleep(1);
        creditLimit_page.SubmitBtn.click();
        bddUtil.sleep(2);
//        bddUtil.quitDriver();
    }

    @Step
    public void clickUnderWritingListBtn(){
        creditLimit_page.choseUnderWriting.click();
        bddUtil.sleep(2);
        creditLimit_page.underwritingListBtn.click();
        bddUtil.sleep(2);
    }

    @Step
    public void clickProceedBtn(){
        bddUtil.sleep(2);
        List<WebElementFacade> roles = creditLimit_page.roleList;
        List<WebElementFacade> actions = creditLimit_page.actionList;
        for (int i = 0; i <roles.size() ; i++) {
            if (roles.get(i).getText().equals(FileUtils.LastReadFileInput3("buyer"))){
                getDriver().findElements(By.xpath("//table[@class='fixed-right-table']//td[@data-key='f31h3cr2']//span[contains(text(),'Proceed')]")).get(i).click();
//                bddUtil.clickByJS(actions.get(i));
//                actions.get(i).click();
                bddUtil.sleep(2);
                break;
            }
        }
    }

    @Step
    public void clickSupplierAssignBtn(){
        List<WebElementFacade> role = creditLimit_page.role;
        List<WebElementFacade> assignBtn = creditLimit_page.assignToMeBtn;
        for (int i = 0; i <8 ; i++) {
            if (role.get(i).getText().equals("Supplier")){
                assignBtn.get(i).click();
                break;
            }

        }
        bddUtil.sleep(1);
    }

    @Step
    public void clickSupplierTestDataAssignBtn(){
        List<WebElementFacade> data = creditLimit_page.applicant;
        List<WebElementFacade> assignBtn = creditLimit_page.assignBtn;
        for (int i = 0; i < data.size(); i++) {
            if (FileUtils.LastReadFileInput3("companyData").equals(data.get(i).getText())){
                bddUtil.scrollWindowToElement(data.get(i)).click();
                assignBtn.get(i).click();
                break;
            }
        }
        bddUtil.sleep(1);
    }

    @Step
    public void clickSupplierProceedBtn(){
        bddUtil.sleep(3);
        List<WebElementFacade> roles = creditLimit_page.roleList;
        List<WebElementFacade> actions = creditLimit_page.actionList;
        for (int i = 0; i <roles.size() ; i++) {
            if (roles.get(i).getText().equals(FileUtils.LastReadFileInput3("companyData"))){
                getDriver().findElements(By.xpath("//div[@class='lowcode-table-fixed-right table-shadow']//span[@data-key='f0v0nf51']")).get(i).click();
//                bddUtil.clickByJS(actions.get(i));
                bddUtil.sleep(2);
                break;
            }
        }
    }


    @Step
    public void openToSupplierPortalUat() {     //跳转供应商门户
        String Url = "http://10.24.9.126:8080/";
        creditLimit_page.openUrl(Url);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(8);
    }

    @Step
    public void openToSupplierPortalSit() {     //跳转供应商门户
        String Url = "http://10.24.7.8:8080/";
        creditLimit_page.openUrl(Url);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(8);
    }

    @Step
    public void loginEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
//        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
//        System.out.println("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");
        //"+FileUtils.LastReadFileInput3("emailData")+");
    }

    @Step
    public void inputOtherData(String passWord,String CompanyID) {
        bddUtil.sleep(20);
        creditLimit_page.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        creditLimit_page.GLDBEmailPassword.sendKeys(passWord);
        creditLimit_page.enterCompanyId.sendKeys(CompanyID);
//        bddUtil.switchToNewWindow();
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
//      新邮箱地址
        webdriver.executeScript("window.open(\"https://ihotmails.com/\");");
        bddUtil.switchToNewWindow();
        // 隐式等待
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        creditLimit_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        creditLimit_page.sendKeysEmailName.clear();
        creditLimit_page.sendKeysEmailName.sendKeys(FileUtils.LastReadFileInput3("emailData").substring(0,8));
        creditLimit_page.clickEditEmailName.click();
        bddUtil.switchToNewWindow();
        creditLimit_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
        creditLimit_page.clickFirstEmailName.click();
        String otp = bddUtil.scrollWindowToElement(creditLimit_page.getEmailOtp).getText();
        bddUtil.switchToWindows();
        creditLimit_page.inputSendCode.sendKeys(otp);
        creditLimit_page.GLDBEmailLoginBtn.click();
        bddUtil.sleep(3);
//        bddUtil.switchToWindows();
//        //打开第二封邮件。
//        String directEmail = FileUtils.LastReadFileInput3("directEmail").substring(0,7);
//        webdriver.executeScript("window.open(\"https://mail.td/zh/mail/"+directEmail+"@uuf.me"+"\");");
          //获取所有句柄存到list集合
      /*  ArrayList<String> list = new ArrayList<>(getDriver().getWindowHandles());
        System.out.println(list);
        //打开第二封邮件，一起签署BR
        creditLimit_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        creditLimit_page.sendKeysEmailName.clear();
        creditLimit_page.sendKeysEmailName.sendKeys(FileUtils.LastReadFileInput3("emailData").substring(0,8)+"2");
        creditLimit_page.clickEditEmailName.click();
        bddUtil.sleep(2);
        //切换到第二个页签的句柄，重新填写邮箱，才能收到BR的邮件
        getDriver().switchTo().window(list.get(1));
        creditLimit_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        creditLimit_page.sendKeysEmailName.clear();
        creditLimit_page.sendKeysEmailName.sendKeys(FileUtils.LastReadFileInput3("emailData").substring(0,8));
        creditLimit_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        //切换到第二个邮箱页面，重新填写邮箱才能收到邮件。
        getDriver().switchTo().window(list.get(2));
        creditLimit_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        creditLimit_page.sendKeysEmailName.clear();
        creditLimit_page.sendKeysEmailName.sendKeys(FileUtils.LastReadFileInput3("emailData").substring(0,8)+"2");
        creditLimit_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        //切换到客户端首页进行操作。
        getDriver().switchTo().window(list.get(0));*/
    }

    @Step
    public void clickPendingSignatureBtn(){
        creditLimit_page.pendingSignatureBtn.click();
    }

    @Step
    public void clickConfirmBtn(){
        creditLimit_page.confirmBtn.click();
    }

    @Step
    public void ToggleOneEmail(){
        String oneEmail = FileUtils.LastReadFileInput3("emailData").substring(0,8);
        bddUtil.switchToWindows();
       /* //        一次性邮箱需要验证。
        if (creditLimit_page.find(By.xpath("//div[@id='main-message']/h1")).isVisible()){
            getDriver().findElement(By.xpath("//div[@class='nav-wrapper']/button[3]")).click();
            bddUtil.sleep(1);
            getDriver().findElement(By.xpath("//p[@id='final-paragraph']/a")).click();
        }*/
        bddUtil.sleep(2);
        creditLimit_page.selectEmailDropDown.click();
        creditLimit_page.selectC0c.click();
        creditLimit_page.changeSendEmail.clear();
        bddUtil.find(By.xpath("//input[@placeholder=\"请输入邮箱账号\"]")).sendKeys(oneEmail);
        bddUtil.sleep(1);
        creditLimit_page.clickRefresh.click();
        bddUtil.sleep(5);
    }


    @Step
    public void signTheOneBR(){
       /* creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(4);
        creditLimit_page.agreement.get(0).click();
        bddUtil.sleep(1);
        creditLimit_page.plainText.click();
        creditLimit_page.tokenLink.click();
        bddUtil.sleep(3);
        bddUtil.switchToWindows();
        bddUtil.switchToWindows();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        creditLimit_page.otpToken.click();
        bddUtil.sleep(1);
        String emailToken = creditLimit_page.emailToken.getText();
        bddUtil.sleep(1);
//        creditLimit_page.agreement.get(0).click();
        bddUtil.switchToWindows();
        bddUtil.sleep(2);
//        creditLimit_page.inputToken.sendKeys(emailToken);
//        bddUtil.scrollWindowToElement(creditLimit_page.inputToken).sendKeys(emailToken);
        getDriver().findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(emailToken);
//        creditLimit_page.otpToken.click();
        bddUtil.sleep(5);*/
        creditLimit_page.clickRefresh.click();
        List<WebElementFacade> selectEmail = creditLimit_page.emailSubject;
        List<WebElementFacade> clickViewBtn = creditLimit_page.clickViewBtn;
        for (int i = 0; i < selectEmail.size(); i++) {
            if (selectEmail.get(i).getText().equals("[GreenLinkDigitalBank]AccountOpening-DigitalSignCertifiedExtractofBoardResolution")){
                clickViewBtn.get(i).click();
                break;
            }
        }
        creditLimit_page.DigitalSign.click();
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
        bddUtil.switchToNewWindow();
        creditLimit_page.selectEmailDropDown.click();
        creditLimit_page.selectC0c.click();
        creditLimit_page.changeSendEmail.clear();
        creditLimit_page.changeSendEmail.sendKeys(FileUtils.LastReadFileInput3("emailData").substring(0,8));
        bddUtil.sleep(4);
        creditLimit_page.clickRefresh.click();
        bddUtil.sleep(1);
        creditLimit_page.clickRefresh.click();
//        List<WebElementFacade> selectEmail1 = creditLimit_page.emailSubject;
//        List<WebElementFacade> clickViewBtn1 = creditLimit_page.clickViewBtn;
//        for (int i = 0; i < selectEmail1.size(); i++) {
//            if (selectEmail1.get(i).getText().equals("GreenLinkDigitalBank-VerificationCode")){
//                clickViewBtn1.get(i).click();
//                break;
//            }
//        }
        bddUtil.sleep(3);
        creditLimit_page.clickViewBtn.get(0).click();
        bddUtil.sleep(3);
//        String emailToken = creditLimit_page.emailVerificationCode.getText();
        String emailToken = getDriver().findElements(By.xpath("//div[@class='box_botweenTitleLeft']//h5//b")).get(2).getText();
        bddUtil.sleep(2);
        bddUtil.switchToWindows();
        creditLimit_page.inputToken.sendKeys(emailToken);
        bddUtil.sleep(4);
//        bddUtil.scrollWindowToElement(creditLimit_page.inputToken).sendKeys(emailToken);
//        bddUtil.sleep(1);
//        getDriver().findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(emailToken);
//        creditLimit_page.otpToken.click();
//        bddUtil.sleep(5);
    }

    @Step
    public void clickEmail(){
//        bddUtil.switchToNewWindow();
//        bddUtil.sleep(40);//应该留40S
//        creditLimit_page.clickRefresh.click();
        bddUtil.sleep(4);
        /*creditLimit_page.agreement.get(0).click();
        bddUtil.sleep(1);
        creditLimit_page.plainText.click();
        creditLimit_page.tokenLink.click();
        bddUtil.sleep(3);
        bddUtil.switchToWindows();
        bddUtil.switchToWindows();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        creditLimit_page.otpToken.click();
        bddUtil.sleep(1);
        String emailToken = creditLimit_page.emailToken.getText();
        bddUtil.sleep(1);
//        creditLimit_page.agreement.get(0).click();
        bddUtil.switchToWindows();
        bddUtil.sleep(2);
//        creditLimit_page.inputToken.sendKeys(emailToken);
//        bddUtil.scrollWindowToElement(creditLimit_page.inputToken).sendKeys(emailToken);
        getDriver().findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(emailToken);
//        creditLimit_page.otpToken.click();
        bddUtil.sleep(5);*/
//        新邮箱
        creditLimit_page.clickRefresh.click();
        List<WebElementFacade> selectEmail = creditLimit_page.emailSubject;
        List<WebElementFacade> clickViewBtn = creditLimit_page.clickViewBtn;
        for (int i = 0; i < selectEmail.size(); i++) {
            if (selectEmail.get(i).getText().equals("[GreenLinkDigitalBank]AccountOpening-DigitalSignCertifiedExtractofBoardResolution")){
                clickViewBtn.get(i).click();
                break;
            }
        }
        creditLimit_page.DigitalSign.click();
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
        bddUtil.switchToNewWindow();
        creditLimit_page.selectEmailDropDown.click();
        creditLimit_page.selectC0c.click();
        creditLimit_page.changeSendEmail.clear();
        creditLimit_page.changeSendEmail.sendKeys(FileUtils.LastReadFileInput3("emailData").substring(0,8));
        bddUtil.sleep(2);
        creditLimit_page.clickRefresh.click();
        bddUtil.sleep(3);
        creditLimit_page.clickRefresh.click();
//        List<WebElementFacade> selectEmail1 = creditLimit_page.emailSubject;
//        List<WebElementFacade> clickViewBtn1 = creditLimit_page.clickViewBtn;
//        for (int i = 0; i < selectEmail1.size(); i++) {
//            if (selectEmail1.get(i).getText().equals("GreenLinkDigitalBank-VerificationCode")){
//                clickViewBtn1.get(i).click();
//                break;
//            }
//        }
        bddUtil.sleep(3);
        creditLimit_page.clickViewBtn.get(0).click();
        bddUtil.sleep(3);
//        String emailToken = creditLimit_page.emailVerificationCode.getText();
        String emailToken = getDriver().findElements(By.xpath("//div[@class='box_botweenTitleLeft']//h5//b")).get(2).getText();
        bddUtil.sleep(2);
        bddUtil.switchToWindows();
        creditLimit_page.inputToken.sendKeys(emailToken);
        bddUtil.sleep(4);

    }


    @Step
    public void toSign(){
        //登录第一封邮件进行签约BR
        System.setProperty("webdriver.chrome.driver",ChromePath);
        //更换selenium打开浏览器机制
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        ChromeDriver driver = new ChromeDriver(options);
        JavascriptExecutor webdriver = (JavascriptExecutor) driver;
        String directEmail = FileUtils.LastReadFileInput3("directEmail").substring(0,7);
        String Url = "https://mail.td/zh/mail/"+directEmail+"@uuf.me";
        driver.get(Url);
        driver.manage().window().maximize();
        //开始签约
        bddUtil.sleep(3);
        //点击签约邮件
        driver.findElement(By.xpath("//div[text()='[Green Link Digital Bank] Account Opening - Digital Sign Certified Extract of Board Resolution']")).click();
        bddUtil.sleep(2);
        //获取签约链接并且在新标签页打开。
        //切入iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='flex justify-between']/following-sibling::div/iframe")));
        String href = driver.findElement(By.xpath("//a[text()='Proceed to Digital Sign']")).getAttribute("href");
        webdriver.executeScript("window.open('"+href+"')");
        bddUtil.sleep(5);
        //获取浏览器句柄，切换标签页
        ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(0));
        driver.findElement(By.xpath("//nav[@id='nav']//span[text()='收件箱']")).click();
        //点击OTP验证码邮件
        bddUtil.sleep(3);
        driver.findElement(By.xpath("//div[contains(text(),'Digital Sign OTP')]")).click();
        bddUtil.sleep(2);
        //获取验证码
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='flex justify-between']/following-sibling::div/iframe")));
        String token = driver.findElement(By.xpath("//h5/b")).getText().substring(1,7);
        //切换到签约界面界面
        driver.switchTo().window(list.get(1));
        driver.findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(token);
        bddUtil.sleep(8);
        //跳转到签约位置
        driver.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//div[@id='pdfList']//div[5]//span[1]")));
        driver.findElement(By.xpath("//div[@id='pdfList']//div[5]//span[1]")).click();
        //上传文件签约
        driver.findElement(By.xpath("//div[@class='upload-demo']//div//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        driver.findElement(By.xpath("//span[text()='Confirm Digital Signature']")).click();
        bddUtil.sleep(6);
        //关闭当前浏览器
        driver.quit();
    }

    @Step
    public void toSignTwoEmail(){
        //登录第二封邮件进行签约BR
        System.setProperty("webdriver.chrome.driver",ChromePath);
        //更换selenium打开浏览器机制
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        ChromeDriver driver = new ChromeDriver(options);
        JavascriptExecutor webdriver = (JavascriptExecutor) driver;
        String directEmail = FileUtils.LastReadFileInput3("directEmail").substring(0,7);
        String Url = "https://mail.td/zh/mail/"+directEmail+"2@uuf.me";
        driver.get(Url);
        driver.manage().window().maximize();
        //开始签约
        bddUtil.sleep(3);
        //点击签约邮件
        driver.findElement(By.xpath("//div[text()='[Green Link Digital Bank] Account Opening - Digital Sign Certified Extract of Board Resolution']")).click();
        bddUtil.sleep(2);
        //获取签约链接并且在新标签页打开。
        //切入iframe
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='flex justify-between']/following-sibling::div/iframe")));
        String href = driver.findElement(By.xpath("//a[text()='Proceed to Digital Sign']")).getAttribute("href");
        webdriver.executeScript("window.open('"+href+"')");
        bddUtil.sleep(5);
        //获取浏览器句柄，切换标签页
        ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(0));
        driver.findElement(By.xpath("//nav[@id='nav']//span[text()='收件箱']")).click();
        //点击OTP验证码邮件
        bddUtil.sleep(3);
        driver.findElement(By.xpath("//div[contains(text(),'Digital Sign OTP')]")).click();
        bddUtil.sleep(2);
        //获取验证码
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='flex justify-between']/following-sibling::div/iframe")));
        String token = driver.findElement(By.xpath("//h5/b")).getText().substring(1,7);
        //切换到签约界面界面
        driver.switchTo().window(list.get(1));
        driver.findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(token);
        bddUtil.sleep(10);
        //跳转到签约位置
        driver.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//div[@id='pdfList']//div[5]//span[1]")));
        driver.findElement(By.xpath("//div[@id='pdfList']//div[5]//span[1]")).click();
        //上传文件签约
        driver.findElement(By.xpath("//div[@class='upload-demo']//div//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        driver.findElement(By.xpath("//span[text()='Confirm Digital Signature']")).click();
        bddUtil.sleep(6);
        driver.quit();
    }

    @Step
    public void ToggleSecondEmail(){
        String twoEmail = FileUtils.LastReadFileInput3("emailData").substring(0,8)+"2";
        bddUtil.switchToWindows();
       /* //        一次性邮箱需要验证。
        if (creditLimit_page.find(By.xpath("//div[@id='main-message']/h1")).isVisible()){
            getDriver().findElement(By.xpath("//div[@class='nav-wrapper']/button[3]")).click();
            bddUtil.sleep(1);
            getDriver().findElement(By.xpath("//p[@id='final-paragraph']/a")).click();
        }*/
        bddUtil.sleep(2);
        creditLimit_page.selectEmailDropDown.click();
        creditLimit_page.selectC0c.click();
        creditLimit_page.changeSendEmail.clear();
        bddUtil.find(By.xpath("//input[@placeholder=\"请输入邮箱账号\"]")).sendKeys(twoEmail);
        bddUtil.sleep(1);
        creditLimit_page.clickRefresh.click();
        bddUtil.sleep(5);
    }

    @Step
    public void signTheSecondBR(){
       /* creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(4);
        creditLimit_page.agreement.get(0).click();
        bddUtil.sleep(1);
        creditLimit_page.plainText.click();
        creditLimit_page.tokenLink.click();
        bddUtil.sleep(3);
        bddUtil.switchToWindows();
        bddUtil.switchToWindows();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        creditLimit_page.otpToken.click();
        bddUtil.sleep(1);
        String emailToken = creditLimit_page.emailToken.getText();
        bddUtil.sleep(1);
//        creditLimit_page.agreement.get(0).click();
        bddUtil.switchToWindows();
        bddUtil.sleep(2);
//        creditLimit_page.inputToken.sendKeys(emailToken);
//        bddUtil.scrollWindowToElement(creditLimit_page.inputToken).sendKeys(emailToken);
        getDriver().findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(emailToken);
//        creditLimit_page.otpToken.click();
        bddUtil.sleep(5);*/
        creditLimit_page.clickRefresh.click();
        List<WebElementFacade> selectEmail = creditLimit_page.emailSubject;
        List<WebElementFacade> clickViewBtn = creditLimit_page.clickViewBtn;
        for (int i = 0; i < selectEmail.size(); i++) {
            if (selectEmail.get(i).getText().equals("[GreenLinkDigitalBank]AccountOpening-DigitalSignCertifiedExtractofBoardResolution")){
                clickViewBtn.get(i).click();
                break;
            }
        }
        creditLimit_page.DigitalSign.click();
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
        bddUtil.switchToNewWindow();
        creditLimit_page.selectEmailDropDown.click();
        creditLimit_page.selectC0c.click();
        creditLimit_page.changeSendEmail.clear();
        creditLimit_page.changeSendEmail.sendKeys(FileUtils.LastReadFileInput3("emailData").substring(0,8)+"2");
        bddUtil.sleep(3);
        creditLimit_page.clickRefresh.click();
//        List<WebElementFacade> selectEmail1 = creditLimit_page.emailSubject;
//        List<WebElementFacade> clickViewBtn1 = creditLimit_page.clickViewBtn;
//        for (int i = 0; i < selectEmail1.size(); i++) {
//            if (selectEmail1.get(i).getText().equals("GreenLinkDigitalBank-VerificationCode")){
//                clickViewBtn1.get(i).click();
//                break;
//            }
//        }
        bddUtil.sleep(3);
        creditLimit_page.clickViewBtn.get(0).click();
        bddUtil.sleep(3);
//        String emailToken = creditLimit_page.emailVerificationCode.getText();
        String emailToken = getDriver().findElements(By.xpath("//div[@class='box_botweenTitleLeft']//h5//b")).get(2).getText();
        bddUtil.sleep(2);
        bddUtil.switchToWindows();
        creditLimit_page.inputToken.sendKeys(emailToken);
        bddUtil.sleep(4);
//        bddUtil.scrollWindowToElement(creditLimit_page.inputToken).sendKeys(emailToken);
//        bddUtil.sleep(1);
//        getDriver().findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(emailToken);
//        creditLimit_page.otpToken.click();
//        bddUtil.sleep(5);
    }

    @Step
    public void clickRefreshBtn(){
        creditLimit_page.refreshListBtn.click();
    }

    @Step
    public void clickFirstEmail(){
        creditLimit_page.firstEmail.click();
    }

    @Step
    public void storeToken(){
        creditLimit_page.firstEmail.click();
        bddUtil.sleep(1);
        bddUtil.scrollWindowToElement(creditLimit_page.token);
        String token = creditLimit_page.token.getText();
        bddUtil.sleep(1);
        bddUtil.scrollWindowToElement(creditLimit_page.secondEmail);
        creditLimit_page.secondEmail.click();
        bddUtil.sleep(1);
        creditLimit_page.plainText.click();
        creditLimit_page.tokenLink.click();
        bddUtil.switchToNewWindow();
        creditLimit_page.inputToken.sendKeys(token);

    }

    public void changeRating(){
        bddUtil.scrollWindowToElement(creditLimit_page.underWritingMode);
        creditLimit_page.rating.click();
        List<WebElementFacade> roles = creditLimit_page.resultList;
        for (int i = 0; i <roles.size() ; i++) {
            System.out.println(roles.get(i).getText());
            if (roles.get(i).getText().equals("BB")){
                roles.get(i).click();
                break;
            }
        }
    }

    public void clickDocsListBtn(){
        creditLimit_page.docsList.click();
        bddUtil.sleep(2);
    }

    public void uploadHistoricalDocuments(){
        historyExcel historyExcel = new historyExcel();
        historyExcel.excelPOI("HistoricalExcel");
        creditLimit_page.uploadHistorical.click();
        bddUtil.sleep(2);
//        creditLimit_page.uploadInput.sendKeys(uploadExcel);    //上传文件 只能用getDriver上传
        getDriver().findElement(By.xpath("//div[@class='upload-widget']//input")).sendKeys(uploadExcel);
        bddUtil.sleep(2);
        creditLimit_page.cfmbtn.click();
        bddUtil.sleep(3);
    }

    public void assertUploadExcel(){
//        creditLimit_page.inputSupplier.sendKeys(FileUtils.LastReadFileInput3("companyData"));
//        bddUtil.sleep(1);
        creditLimit_page.clickOther.click();
        bddUtil.sleep(3);

    }
}

package com.glbank.com.sg.bdd.steps.supplyChains.RPA;
import cn.hutool.core.date.DateUtil;
import com.glbank.com.sg.bdd.pages.supplyChains.RPA.rpa_page;
import com.glbank.com.sg.bdd.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class rpa_steps extends ScenarioSteps {
    private BDDUtil bddUtil;
    private rpa_page rpaPage;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/test.jpg";

    public static String content = JRandomNameTool.getStringRandom(6);

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        rpaPage.openUrl(logonUrl);
    }


    @Step
    public void clickCustomers(){
        bddUtil.sleep(5);
        rpaPage.Customers.click();
    }

    @Step
    public void clickContractManagement(){rpaPage.ContractManagement.click();}

    @Step
    public void titleOverview() throws Exception{
        bddUtil.sleep(5);
        rpaPage.titleOverview.isDisabled();
        if (rpaPage.titleOverview.getText().equals("Overview")){
            System.out.println("ISSO系统正常");
        }else {
            System.out.println("ISSO系统有问题");
            throw new Exception("ISSO系统有问题");
        }
        bddUtil.sleep(3);
    }

    @Step
    public void clickCompanyName(){
        rpaPage.enterCompanyName.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        rpaPage.clickContractType.click();
        rpaPage.clickUploadBtn.click();
        getDriver().findElement(By.xpath("//div[@class='lls-upload-dragger']/following-sibling::input")).sendKeys(fileAddress);
        String Date = DateUtil.format(DateUtil.offsetDay(new Date(),365),"yyyy-MM-dd");
        rpaPage.enterDate.sendKeys(Date);
        bddUtil.sleep(3);
        rpaPage.clickNextBtn.click();
        bddUtil.sleep(1);
        rpaPage.clickConfirmBtn.click();
        bddUtil.sleep(5);
    }

    @Step
    public void uploadRpa(){
        rpaPage.uploadBtn.click();
        bddUtil.sleep(1);
        rpaPage.companyName.click();
        bddUtil.sleep(3);
        rpaPage.companyName.sendKeys("testVaultData4");
        bddUtil.sleep(1);
        rpaPage.companyName.clear();
        rpaPage.companyName.sendKeys("testVaultData4");
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//span[text()='testVaultData4']")).click();
        rpaPage.ContractType.click();
        bddUtil.sleep(2);
        getDriver().findElements(By.xpath("//span[text()='RPA Full Recourse']")).get(1).click();
        getDriver().findElement(By.xpath("//div[@class='lls-upload-dragger']/following-sibling::input")).sendKeys(fileAddress);
        bddUtil.sleep(3);
        rpaPage.clickNextBtn.click();
        bddUtil.sleep(1);
        rpaPage.clickConfirmBtn.click();
        bddUtil.sleep(5);
    }

    @Step
    public void uploadRpaUAT(){
        rpaPage.uploadBtn.click();
        bddUtil.sleep(1);
        rpaPage.companyName.click();
        bddUtil.sleep(3);
        rpaPage.companyName.sendKeys("BuyerTest");
        bddUtil.sleep(1);
        rpaPage.companyName.clear();
        rpaPage.companyName.sendKeys("BuyerTest");
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//span[text()='BuyerTest']")).click();
        rpaPage.ContractType.click();
        bddUtil.sleep(2);
        getDriver().findElements(By.xpath("//span[text()='RPA Full Recourse']")).get(1).click();
        getDriver().findElement(By.xpath("//div[@class='lls-upload-dragger']/following-sibling::input")).sendKeys(fileAddress);
        bddUtil.sleep(3);
        rpaPage.clickNextBtn.click();
        bddUtil.sleep(1);
        rpaPage.clickConfirmBtn.click();
        bddUtil.sleep(5);
    }

    @Step
    public void clickCompanyNameClickReset(){
        rpaPage.CompanyNameClickReset.click();
    }

    @Step
    public void clickUpload(){
        bddUtil.sleep(3);
        rpaPage.upload.click();
    }

    @Step
    public void clickBrowse(String fileAddress) {
//        rpaPage.browse.click();
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='upload-widget']//input")).sendKeys(fileAddress);
//        bddUtil.fileUpload();
        bddUtil.sleep(5);
    }

    @Step
    public void clickData(){
        rpaPage.sendData.sendKeys("2024-05-06");
        }

    @Step
    public void clickConfirms(){
        rpaPage.confirms.click();
        bddUtil.sleep(1);
        rpaPage.confirmsTwo.click();
    }

    @Step
    public void jumpToSupplierPortal() {     //跳转供应商门户
        JavascriptExecutor webdriver = (JavascriptExecutor) getDriver();
        webdriver.executeScript("window.open('http://10.24.9.126:8080//')");
        bddUtil.switchToNewWindow();
        bddUtil.sleep(10);
    }

    @Step
    public void openEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
//        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
//        System.out.println("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");
    }


    @Step
    public void loginServiceAgreementWindow() {
        bddUtil.sleep(7);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        rpaPage.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        rpaPage.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        rpaPage.enterCompanyId.sendKeys("1234");
        rpaPage.sendCodeBtn.click();
//        bddUtil.switchToNewWindow();
//        bddUtil.sleep(3);
//        rpaPage.clickRefreshBtn.click();
//        bddUtil.sleep(1);
//        rpaPage.thirdEmail.click();
//        String Vcode = rpaPage.emailVerificationCode.getText();
//        bddUtil.switchToWindows();
//        rpaPage.inputSendCode.sendKeys(Vcode);
//        新邮箱
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
        String twoEmail = FileUtils.LastReadFileInput3("emailData").substring(0,8);
        bddUtil.switchToWindows();
        bddUtil.sleep(2);
        rpaPage.selectEmailDropDown.click();
        rpaPage.selectC0c.click();
        rpaPage.changeSendEmail.clear();
        bddUtil.find(By.xpath("//input[@placeholder=\"请输入邮箱账号\"]")).sendKeys(twoEmail);
        bddUtil.sleep(2);
        rpaPage.clickRefresh.click();
        bddUtil.sleep(3);
        List<WebElementFacade> selectEmail = rpaPage.emailSubject;
        List<WebElementFacade> clickViewBtn = rpaPage.clickViewBtn;
        for (int i = 0; i < selectEmail.size(); i++) {
            if (selectEmail.get(i).getText().equals("GreenLinkDigitalBank-VerificationCode")){
                clickViewBtn.get(i).click();
                break;
            }
        }
        bddUtil.sleep(1);
        String Vcode = rpaPage.emailVerificationCode.getText();
        bddUtil.sleep(2);
        bddUtil.switchToWindows();
        rpaPage.inputSendCode.sendKeys(Vcode);
        rpaPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(5);
//        rpaPage.inputSendCode.sendKeys("1234");
//        rpaPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(10);
        rpaPage.Contract.click();
        assertEquals("RPA Limited Recourse",rpaPage.find(By.xpath("//td[text()='RPA Limited Recourse']")).getText());
        bddUtil.sleep(2);
    }

    public void clickReport(){
        rpaPage.Report.click();
        bddUtil.sleep(2);
//        rpaPage.firstViewAdvice.click();
        bddUtil.clickByJS(rpaPage.find(By.xpath("//div[@class='container']//div[@class='lls-design-page']//div[@class='is-not-empty']//td[@title='1']//following-sibling::td[@data-fixed='true']//button//span")));
        bddUtil.sleep(5);
    }

    public void errorEmailLink() {
        bddUtil.switchToNewWindow();
        if (rpaPage.errorText.isVisible()){
            rpaPage.advancedButton.click();
            rpaPage.enterEmailLink.click();
        }
    }

    public void loginClientUseFixeData(String emailName){
        rpaPage.GLDBEmailInput.sendKeys(emailName+"@ihotmails.com");//("362DDf6O@MailTemp.top");
        rpaPage.GLDBEmailPassword.sendKeys("P@ssw0rd_1234");
        rpaPage.enterCompanyId.sendKeys("1234");
        // 换新邮箱地址了
        /*JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        bddUtil.switchToNewWindow();
        if (rpaPage.errorText.isVisible()){
            rpaPage.advancedButton.click();
            rpaPage.enterEmailLink.click();
        }
        bddUtil.sleep(3);
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(3);
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(3);
        rpaPage.thirdEmail.click();
        String Vcode = rpaPage.emailVerificationCode.getText();
        bddUtil.switchToWindows();*/
//        新邮箱
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://ihotmails.com/\");");
        bddUtil.switchToNewWindow();
        rpaPage.clickEditEmailName.click();
        bddUtil.sleep(3);
        rpaPage.sendKeysEmailName.clear();
        rpaPage.sendKeysEmailName.sendKeys(emailName);
        rpaPage.clickEditEmailName.click();
        bddUtil.switchToWindows();
        rpaPage.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
        bddUtil.scrollWindowToElement(rpaPage.clickFirstEmailName).click();
        String otp = bddUtil.scrollWindowToElement(rpaPage.getEmailOtp).getText();
        bddUtil.switchToWindows();
        rpaPage.inputSendCode.sendKeys(otp);
        rpaPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(5);
        //断言是否登录成功
        assertEquals("Home",getDriver().findElement(By.xpath("//span[text()='Home']")).getText());
        bddUtil.sleep(2);
    }

    public void loginClientUseFixeDataUat(String emailName){
        rpaPage.GLDBEmailInput.sendKeys(emailName+"@ihotmails.com");//("362DDf6O@MailTemp.top");
        rpaPage.GLDBEmailPassword.sendKeys("P@ssw0rd_1234..");
        rpaPage.enterCompanyId.sendKeys("1234");
        // 换新邮箱地址了
        /*JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        bddUtil.switchToNewWindow();
        if (rpaPage.errorText.isVisible()){
            rpaPage.advancedButton.click();
            rpaPage.enterEmailLink.click();
        }
        bddUtil.sleep(3);
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(3);
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(3);
        rpaPage.thirdEmail.click();
        String Vcode = rpaPage.emailVerificationCode.getText();
        bddUtil.switchToWindows();*/
//        新邮箱
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://ihotmails.com/\");");
        bddUtil.switchToNewWindow();
        rpaPage.clickEditEmailName.click();
        bddUtil.sleep(3);
        rpaPage.sendKeysEmailName.clear();
        rpaPage.sendKeysEmailName.sendKeys(emailName);
        rpaPage.clickEditEmailName.click();
        bddUtil.switchToWindows();
        rpaPage.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
        bddUtil.scrollWindowToElement(rpaPage.clickFirstEmailName).click();
        String otp = bddUtil.scrollWindowToElement(rpaPage.getEmailOtp).getText();
        bddUtil.switchToWindows();
        rpaPage.inputSendCode.sendKeys(otp);
        rpaPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(5);
        //断言是否登录成功
        assertEquals("Home",getDriver().findElement(By.xpath("//span[text()='Home']")).getText());
        bddUtil.sleep(2);
    }

    public void clickGoToDigibankLink(){
        rpaPage.clickGoToDigibankLink.click();
    }

    public void jumpToInbLink() throws Exception{
        bddUtil.switchToNewWindow();
        // 获取当前URL
        String url = getDriver().getCurrentUrl();
        // 拼接成新URL
        String newUrl = "https://inb-sit.intranet.glbank.com/"+url.substring(34,url.length());
        System.out.println(newUrl);
        getDriver().get(newUrl);
//        if (rpaPage.clickSeniorBtn.isVisible()){
//            rpaPage.clickSeniorBtn.click();
//            rpaPage.getJumpToInbLink.click();
//            rpaPage.jumpToInbLinkCheck.click();
//        }else {
//            rpaPage.jumpToInbLinkCheck.click();
//        }
        //断言是否进入INB系统
        getDriver().findElement(By.xpath("//span[text()='Tips']")).getText().equals("Tips");
        if (getDriver().findElement(By.xpath("//span[text()='Tips']")).getText().equals("Tips")){
            System.out.println("成功进入系统");
        }else {
            throw new Exception("INB系统进入失败");
        }
        bddUtil.sleep(3);
    }

    public void jumpToInbLinkUAT() throws Exception{
        bddUtil.switchToNewWindow();
        if (rpaPage.clickSeniorBtn.isVisible()){
            rpaPage.clickSeniorBtn.click();
            rpaPage.getJumpToInbLink.click();
            if (rpaPage.okBtn.isVisible()){
                rpaPage.okBtn.click();
                bddUtil.sleep(2);
            }
            rpaPage.jumpToInbLinkCheck.click();
        }else {
            rpaPage.jumpToInbLinkCheck.click();
        }
        //断言是否进入INB系统
        if (getDriver().findElement(By.xpath("//div[text()='Select the option that best describes your situation:']")).getText().equals("Select the option that best describes your situation:")){
            System.out.println("成功进入系统");
        }else {
            throw new Exception("INB系统进入失败");
        }
        bddUtil.sleep(3);
    }

    public void inputLogin(){
        rpaPage.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        rpaPage.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        rpaPage.enterCompanyId.sendKeys("1234");
        // 换新邮箱地址了
        /*JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        bddUtil.switchToNewWindow();
        if (rpaPage.errorText.isVisible()){
            rpaPage.advancedButton.click();
            rpaPage.enterEmailLink.click();
        }
        bddUtil.sleep(3);
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(3);
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(3);
        rpaPage.thirdEmail.click();
        String Vcode = rpaPage.emailVerificationCode.getText();
        bddUtil.switchToWindows();*/
//        新邮箱
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://ihotmails.com/\");");
        String twoEmail = FileUtils.LastReadFileInput3("emailData").substring(0,8);
        bddUtil.switchToNewWindow();
        rpaPage.clickEditEmailName.click();
        bddUtil.sleep(3);
        rpaPage.sendKeysEmailName.clear();
        rpaPage.sendKeysEmailName.sendKeys(twoEmail);
        rpaPage.clickEditEmailName.click();
        bddUtil.switchToWindows();
        rpaPage.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        //隐式等待
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        bddUtil.scrollWindowToElement(rpaPage.clickFirstEmailName).click();
        String otp = bddUtil.scrollWindowToElement(rpaPage.getEmailOtp).getText();
        bddUtil.switchToWindows();
        rpaPage.inputSendCode.sendKeys(otp);
        rpaPage.GLDBEmailLoginBtn.click();
    }

    public void clickCreateUser(String firstPassword,String secondPassword){
        rpaPage.setting.click();
        bddUtil.sleep(1);
        rpaPage.createUser.click();
        rpaPage.firstName.sendKeys(JRandomNameTool.getStringRandom(5));
        rpaPage.lastName.sendKeys(JRandomNameTool.getStringRandom(4));
        rpaPage.emailAdd.sendKeys(content+ "@MailTemp.top");
        rpaPage.phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        rpaPage.confirmBtn.click();
        bddUtil.sleep(5);
        rpaPage.sendEmail.click();
        rpaPage.confirmInvitation.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        rpaPage.DisposableEmail.sendKeys(content);
        rpaPage.emailView.click();
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(2);
        rpaPage.firstEmail.click();
        String Vcode = rpaPage.emailVerificationCode.getText();
        rpaPage.logonLink.click();
        rpaPage.GLDBEmailInput.sendKeys(content+"@MailTemp.top");
        rpaPage.GLDBEmailPassword.sendKeys(Vcode);
        rpaPage.enterCompanyId.sendKeys("1234");
        rpaPage.sendCodeBtn.click();
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        bddUtil.switchToNewWindow();
        if (rpaPage.errorText.isVisible()){
            rpaPage.advancedButton.click();
            rpaPage.enterEmailLink.click();
        }
        bddUtil.sleep(3);
        rpaPage.DisposableEmail.sendKeys(content);
        rpaPage.emailView.click();
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(1);
        rpaPage.thirdEmail.click();
        String vCode2 = rpaPage.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        rpaPage.inputSendCode.sendKeys(vCode2);
        bddUtil.sleep(1);
        rpaPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(5);
        rpaPage.firstNewPassword.sendKeys(firstPassword);
        rpaPage.secondNewPassword.sendKeys(secondPassword);
        rpaPage.newPasswordPageConfirmBtn.click();
        bddUtil.sleep(2);
        rpaPage.GLDBEmailInput.sendKeys(content+"@MailTemp.top");
        rpaPage.GLDBEmailPassword.sendKeys(firstPassword);
        rpaPage.enterCompanyId.sendKeys("1234");
        rpaPage.sendCodeBtn.click();
        bddUtil.sleep(3);
        bddUtil.switchToWindows();
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(1);
        rpaPage.thirdEmail.click();
        String vCode3 = rpaPage.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        rpaPage.inputSendCode.sendKeys(vCode3);
        bddUtil.sleep(1);
        rpaPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(10);
    }
}


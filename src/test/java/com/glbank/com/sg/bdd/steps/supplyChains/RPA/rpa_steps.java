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
        rpaPage.Customers.click();
    }

    @Step
    public void clickContractManagement(){rpaPage.ContractManagement.click();}

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
    public void clickConfirms(){rpaPage.confirms.click();}

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

    public void inputLogin(){
        rpaPage.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        rpaPage.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        rpaPage.enterCompanyId.sendKeys("1234");
        rpaPage.sendCodeBtn.click();
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


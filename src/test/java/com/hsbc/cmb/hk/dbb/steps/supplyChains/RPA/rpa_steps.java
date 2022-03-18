package com.hsbc.cmb.hk.dbb.steps.supplyChains.RPA;
import com.hsbc.cmb.hk.dbb.pages.supplyChains.RPA.rpa_page;
import com.hsbc.cmb.hk.dbb.utils.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.*;

public class rpa_steps extends ScenarioSteps {
    private BDDUtil bddUtil;
    private rpa_page rpaPage;

    public static String content = JRandomNameTool.getStringRandom(6);

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        rpaPage.openUrl(logonUrl);
    }


    @Step
    public void clickCustomers(){rpaPage.Customers.click();}

    @Step
    public void clickContractManagement(){rpaPage.ContractManagement.click();}

    @Step
    public void clickCompanyName(){rpaPage.CompanyName.sendKeys(FileUtils.LastReadFileInput3("test"));}

    @Step
    public void clickCompanyNameClickReset(){rpaPage.CompanyNameClickReset.click();}

    @Step
    public void clickUpload(){
        rpaPage.upload.click();
    }

    @Step
    public void clickBrowse() {
        rpaPage.browse.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
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
        webdriver.executeScript("window.open('http://119.8.173.195:8080')");
        bddUtil.switchToNewWindow();
        bddUtil.sleep(10);
    }

    @Step
    public void openEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        System.out.println("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");
    }


    @Step
    public void loginServiceAgreementWindow() {
        rpaPage.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        rpaPage.GLDBEmailPassword.sendKeys("Gl123456");
        rpaPage.enterCompanyId.sendKeys("1234");
        rpaPage.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(3);
        rpaPage.clickRefreshBtn.click();
        bddUtil.sleep(1);
        rpaPage.thirdEmail.click();
        String Vcode = rpaPage.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        rpaPage.inputSendCode.sendKeys(Vcode);
        rpaPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(10);
        rpaPage.Contract.click();
        assertEquals("RPA Agreement",rpaPage.find(By.xpath("//td[text()='RPA Agreement']")).getText());

    }



}


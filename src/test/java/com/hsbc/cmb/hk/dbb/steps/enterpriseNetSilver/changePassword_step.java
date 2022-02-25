package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.changePassword_page;
import com.hsbc.cmb.hk.dbb.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.util.List;
import java.util.WeakHashMap;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class changePassword_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private changePassword_page changePassword_page;
    public static String idCard;
    public static String passPort;
    public static String emailText;
    public static String iphoneText;
    public static String verificationCode;
    public static String passWord = JRandomNameTool.getStringRandom(6);
    public static String newPassWordText;

    public void clickForgotPassword(){
        changePassword_page.forgotPassword.click();
        bddUtil.sleep(1);
    }

    public void inputOtherDataOnForgotPassword(){
        changePassword_page.inputCustomerNumber.sendKeys();
    }

    public void openRearTubePlatform(String url,String username,String password){
//        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
//        webdriver.executeScript("window.open(\"http://10.24.9.100:8080/mweb/emptyTrs.do#/login\");");
//        String logonUrl = "http://10.24.9.100:8080/mweb/emptyTrs.do#/login";
        changePassword_page.openUrl(url);
        changePassword_page.userName.sendKeys(username);
        changePassword_page.password.sendKeys(password);
        changePassword_page.logonBtn.click();
        bddUtil.sleep(2);
    }

    public void openOnlineBanking(String url){
        changePassword_page.open(url);
        bddUtil.sleep(2);
    }

    //进到企业用户管理界面。
    public void clickEnterpriseUserManagement(){
        changePassword_page.customerCenter.click();
        changePassword_page.contractMaintenance.click();
        changePassword_page.UserManagement.click();
    }

    public void inputSelectClientNumber(String clientNumber){
        changePassword_page.inputClientNumber.sendKeys(clientNumber);
        changePassword_page.selectBtn.click();
        bddUtil.sleep(2);
        changePassword_page.check.click();
        bddUtil.sleep(3);
    }
    //循环找到我需要修改账户的详细信息。
    public void selectRequiredAccountDetails(String email){
        List<WebElementFacade> details = changePassword_page.detailsBtn;
        for (int i = 0; i < details.size(); i++) {
            details.get(i).click();
            bddUtil.sleep(1);
            bddUtil.scrollWindowToElement(changePassword_page.emailData);
            if (changePassword_page.emailData.getText().equals(email)){
                emailText = changePassword_page.emailData.getText();
                iphoneText = changePassword_page.iphoneNumber.getText();
                System.out.println(emailText+iphoneText);
                bddUtil.scrollWindowToElement(changePassword_page.idType);
                if (changePassword_page.idType.getText().equals("身份证")){
                    idCard = changePassword_page.idNumber.getText();
                }else {
                    passPort = changePassword_page.idNumber.getText();//护照
                }
            }else {
            bddUtil.scrollWindowToElement(changePassword_page.returnPage).click();
            }
            break;
        }
        bddUtil.sleep(2);
    }

    public void checkIdCardOrPassPort(){
        if (idCard == null){

        }else{

        }
    }

    public void sendDataOnChangePasswordPage(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.24.8.5:60006/direct/index.html#/login");
        bddUtil.sleep(10);
    }

    public void inputCustomerNumber(String customerNumber){
        changePassword_page.inputCustomerNumber.sendKeys(customerNumber);

    }

    public void clickIdCardBtn(String idCardNumber){
        changePassword_page.idCardBtn.click();
        bddUtil.sleep(1);
        changePassword_page.idCardInputBox.sendKeys(idCardNumber);
    }

    public void clickPassPortBtn(String passPortNumber){
        changePassword_page.passPortBtn.click();
        bddUtil.sleep(1);
        changePassword_page.idCardInputBox.sendKeys(passPortNumber);
    }

    public void selectCountryCode(String countryCode,String iphoneNumber){
        changePassword_page.countryCode.sendKeys(countryCode);
        bddUtil.scrollWindowToElement(changePassword_page.countryName);
        changePassword_page.countryName.click();
        changePassword_page.iphoneInputBox.sendKeys(iphoneNumber);
    }

    public void clickCodeButton() {
        changePassword_page.getCodeBtn.click();
        bddUtil.sleep(1);
        getDriver().switchTo().alert().getText();
        verificationCode = getDriver().switchTo().alert().getText().substring(7, 13);
        System.out.println(verificationCode);
        getDriver().switchTo().alert().accept();
        bddUtil.sleep(2);
    }

    public void inputCode() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        bddUtil.sleep(1);
        changePassword_page.sendKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(0, 1));
        bddUtil.sleep(1);
        changePassword_page.secondKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(1, 2));
        changePassword_page.thirdKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(2, 3));
        changePassword_page.fourKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(3, 4));
        changePassword_page.fiveKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(4, 5));
        changePassword_page.sixKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(5, 6));
    }

    public void inputEmailAddress(String emailAddress){
        changePassword_page.emailInputBox.sendKeys(emailAddress);
        changePassword_page.getCodeBtn.click();
    }

    public void clickNextBtn(){
        changePassword_page.nextBtn.click();
        bddUtil.sleep(2);
    }

    public void inputNewPassword(){
        System.out.println(passWord+".");
        newPassWordText = "Gl"+passWord+".";//将改变后的密码 写入TXT文件里。
        FileUtils.FileString4("changePassWord_tian",newPassWordText);
        changePassword_page.newPassword.sendKeys("Gl"+passWord+".");
        changePassword_page.confirmNewPassword.sendKeys("Gl"+passWord+".");
        changePassword_page.confirmBtn.click();
        bddUtil.sleep(5);

    }
}

package com.glbank.com.sg.bdd.steps.enterpriseNetSilver;

import com.glbank.com.sg.bdd.glue.enterpriseNetSilver.Logon_glue;
import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.Logon_page;
import com.glbank.com.sg.bdd.utils.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.net.MalformedURLException;

public class Logon_step extends ScenarioSteps {
    private Logon_page logonPage;
    private BDDUtil bddUtil;
    public static String password;
    public static String email;
    public static String organisationID;
    public static String deviceName;
    public static String newPassword;
    public static String loginOtp;

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        logonPage.openUrl(logonUrl);
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
        Thread.sleep(5000);
        if (MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'btn_otp')]/child::android.widget.TextView[2]").getText().equals("一次性\n密码")) {
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
        if (MobileConfig.driver.findElementByXPath("//android.widget.TextView[ends-with(@resource-id,'permission_message')]").isDisplayed()) {
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

}

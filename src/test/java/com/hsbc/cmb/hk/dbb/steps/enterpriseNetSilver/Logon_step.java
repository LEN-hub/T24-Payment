package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.Logon_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
import com.hsbc.cmb.hk.dbb.utils.EnterKeys;
import com.hsbc.cmb.hk.dbb.utils.MobileConfig;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.awt.*;
import java.net.MalformedURLException;

public class Logon_step extends ScenarioSteps {
    private Logon_page logonPage;
    private BDDUtil bddUtil;
    public static String password;


    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        logonPage.openUrl(logonUrl);
    }

    @Step
    public void enter_OrganisationID_into_box(String envName) {
        String OrganisationID = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".organisationID");
        logonPage.enterOrganisationID(OrganisationID);
    }

    @Step
    public void enter_email_into_box(String envName) {
        String email = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".email");
        logonPage.enterEmailAddress(email);
    }

    @Step
    public String enter_password_into_box(String envName) {
        password = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".password");
        logonPage.enterPassWord(password);
        return password;
    }

    @Step
    public void clickLogonBtn(){
        logonPage.logonBtn.click();
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
//        for (int i = 0; i <=6; i++){
//            logonPage.find(By.xpath("//div[@class='OTP-One-Time-Passwo']/following-sibling::div/span["+i+1+"]/i")).sendKeys(MobileConfig.vcode.substring(1,i+1));
//        }
        EnterKeys enterKeys = new EnterKeys();
//        robot.delay((int) t1)
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
        bddUtil.sleep(10000000);
    }

    @Step
    public void vkeyAppVcode() throws MalformedURLException, InterruptedException {
        MobileConfig test = new MobileConfig();
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server");
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server.test");
        test.testMobile();
        Thread.sleep(3000);
        if (!MobileConfig.driver.findElementById("vkey_title").getText().equals("数字令牌")) {
            test.clickSystemPopupWindows();
            test.clickStartButton();
            test.logonVkeyApp("201019", "17762216590@163.com", password);
            test.clickLetUsStart();
            test.verification();
            test.clickCreatPassword();
        }
        test.getVcode();
    }

    @Step
    public void getAuthenticateNowBtn(){
        logonPage.authenticateNowBtn.click();
    }

    @Step
    public void resetPassword(String value) throws MalformedURLException, InterruptedException, AWTException {
        if (logonPage.changePasswordTitle.isVisible()){
            logonPage.originalPassword.sendKeys(password);
            logonPage.firstEnterPassword.sendKeys(value);
            logonPage.secondEnterPassword.sendKeys(value);
            logonPage.resetPasswordBtn.click();
            enter_OrganisationID_into_box("netSilverEnv");
            enter_email_into_box("netSilverEnv");
            enter_password_into_box("netSilverEnv");
            clickLogonBtn();
            getVcodeTitle();
            clickNextBtn();
            vkeyAppVcode();
            enterVcode();
            getAuthenticateNowBtn();
        }
    }

}

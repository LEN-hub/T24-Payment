package com.glbank.com.sg.bdd.glue.enterpriseNetSilver;

import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.Logon_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import com.glbank.com.sg.bdd.utils.WordUtils;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import javax.xml.crypto.Data;
import java.awt.*;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

public class Logon_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private Logon_step logon_step;
    public static String envTag;
    private BDDUtil bddUtil;

    @Given("^logon \"([^\"]*)\" on enterprise net silver$")
    public void logonOnEnterpriseNetSilver(String envName) throws MalformedURLException, InterruptedException, AWTException {
        bddUtil.quitDriver();
        envTag = envName;
        if (!envName.isEmpty()) {
            try {
                logon_step.open_the_first_dbb_logon_page(envName);
//                logon_step.checkLanguage();
                logon_step.enter_OrganisationID_into_box(envName);
                logon_step.enter_email_into_box(envName);
                logon_step.enter_password_into_box(envName);
                logon_step.getDeviceName(envName);
                logon_step.get_New_password(envName);
                logon_step.clickLogonBtn();
                logon_step.getVcodeTitle();
                logon_step.clickNextBtn();
                Logon_step.vkeyAppVcode();
                logon_step.enterVcode();
                logon_step.getAuthenticateNowBtn();
                logon_step.resetPassword();
            } finally {
                Logon_step.quitAndroidDriver();
            }
        }
    }

    @Given("^logon second \"([^\"]*)\" on enterprise net silver$")
    public void logonSecondOnEnterpriseNetSilver(String envName) throws MalformedURLException, InterruptedException, AWTException {
        envTag = envName;
        bddUtil.sleep(10);
        if (!envName.isEmpty()) {
            try {
                logon_step.open_the_first_dbb_logon_page(envName);
//                logon_step.checkLanguage();
                logon_step.enter_OrganisationID_into_box(envName);
                logon_step.enter_email_into_box(envName);
                logon_step.enter_password_into_box(envName);
                logon_step.getDeviceName(envName);
                logon_step.get_New_password(envName);
                logon_step.secondVkeyAppVcode();
                logon_step.clickLogonBtn();
                logon_step.getVcodeTitle();
                logon_step.clickNextBtn();
                logon_step.enterVcode();
                logon_step.getAuthenticateNowBtn();
                logon_step.resetPassword();
            }catch (Exception e){
                e.printStackTrace();
            }
//            } finally {
//                Logon_step.quitAndroidDriver();
//            }
        }
    }


    @Given("^I am on the login screen$")
    public void iAmOnTheLoginScreen(String envName) throws MalformedURLException, InterruptedException, AWTException {
        envTag = envName;
        if (!envName.isEmpty()) {
            try {
                logon_step.open_the_first_dbb_logon_page(envName);
//                logon_step.checkLanguage();
            } finally {
                logon_step.quitAndroidDriver();
            }
        }
    }

    @Given("^open \"([^\"]*)\" on enterprise net silver$")
    public void openOnEnterpriseNetSilver(String envName) throws MalformedURLException, InterruptedException, AWTException {
        envTag = envName;
        if (!envName.isEmpty()) {
                logon_step.open_the_first_dbb_logon_page(envName);
//                logon_step.checkLanguage();
        }
    }

    @Given("^logon \"([^\"]*)\" in SIT environment and bypass Vkey$")
    public void logonInSITEnvironmentAndBypassVkey(String envName) {
        bddUtil.getDriver().quit();
        envTag = envName;
        bddUtil.sleep(10);
        if (!envName.isEmpty()) {
            logon_step.open_the_first_dbb_logon_page(envName);
            logon_step.enter_OrganisationID_into_box(envName);
            logon_step.enter_email_into_box(envName);
            logon_step.enter_password_into_box(envName);
            logon_step.clickLogonBtn();
//            logon_step.clickNextBtn();
//            logon_step.clickSitEnvOtpBtn();
        }
    }

    @Given("^logon second \"([^\"]*)\" in SIT environment and bypass Vkey$")
    public void logonSecondInSITEnvironmentAndBypassVkey(String envName) {
        bddUtil.getDriver().quit();
        envTag = envName;
        bddUtil.sleep(10);
        if (!envName.isEmpty()) {
            logon_step.open_the_first_dbb_logon_page(envName);
            logon_step.enter_OrganisationID_into_box(envName);
            logon_step.enter_email_into_box(envName);
            logon_step.enter_password_into_box(envName);
            logon_step.clickLogonBtn();
//            logon_step.clickNextBtn();
//            logon_step.clickSitEnvOtpBtn();
        }
    }
}

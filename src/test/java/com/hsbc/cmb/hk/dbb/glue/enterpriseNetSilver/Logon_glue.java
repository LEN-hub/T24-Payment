package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.CBSOnline.logon_step;
import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.Logon_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.awt.*;
import java.net.MalformedURLException;

public class Logon_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private Logon_step logon_step;
    public static String envTag;
    private BDDUtil bddUtil;

    @Given("^logon \"([^\"]*)\" on enterprise net silver$")
    public void logonOnEnterpriseNetSilver(String envName) throws MalformedURLException, InterruptedException, AWTException {
        envTag = envName;
        if (!envName.isEmpty()) {
            logon_step.open_the_first_dbb_logon_page(envName);
            logon_step.checkLanguage();
            logon_step.enter_OrganisationID_into_box(envName);
            logon_step.enter_email_into_box(envName);
            logon_step.enter_password_into_box(envName);
            logon_step.getDeviceName(envName);
            logon_step.get_New_password(envName);
            logon_step.clickLogonBtn();
            logon_step.getVcodeTitle();
            logon_step.clickNextBtn();
             logon_step.vkeyAppVcode();
            logon_step.enterVcode();
            logon_step.getAuthenticateNowBtn();
            logon_step.resetPassword();
        }
    }


}

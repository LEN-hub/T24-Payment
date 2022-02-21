package com.hsbc.cmb.hk.dbb.glue.EnterpriseManagementDeskAccountManagement;


import com.hsbc.cmb.hk.dbb.steps.EnterpriseManagementDeskAccountManagement.accountChange_steps;
import com.hsbc.cmb.hk.dbb.steps.EnterpriseManagementDeskAccountManagement.userManagement_steps;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.awt.*;
import java.net.MalformedURLException;

public class userManagement_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private userManagement_steps  userManagement_steps;
    private BDDUtil bddUtil;

    @When("^I click on the Enterprise Administration as well user administration$")
    public void iClickOnTheEnterpriseAdministrationAsWellUserAdministration() {
        userManagement_steps.clickEnterpriseManagementDesk();
    }


//修改手机号
    @When("^I click modify info menu$")
    public void iClickModifyInfoMenu() {
        userManagement_steps.clickAccountManagements();
        userManagement_steps.selectTheMenus();
        userManagement_steps.clickModifyInformation();
        userManagement_steps.clickMobilePHONNO();
        userManagement_steps.clickNext();
        userManagement_steps.clickSumbits();
    }


    @Then("^I click Next$")
    public void iClickNext() {
        userManagement_steps.clickCodeNext();
        userManagement_steps.tcCode();
        userManagement_steps.clickNextBtn();
    }

    @When("^I initiate captcha verification$")
    public void iInitiateCaptchaVerification() throws MalformedURLException, InterruptedException, AWTException {
        userManagement_steps.vkeyTCCode();
        userManagement_steps.enterTcCode();
        userManagement_steps.authenticateNowBtn();
    }

//新增用户
    @When("^I click on Add user$")
    public void iClickOnAddUser() throws AWTException {
        userManagement_steps.clickAccountManagements();
        userManagement_steps.clickAddUsers();
        userManagement_steps.clickCall();
        userManagement_steps.clickMr();
        userManagement_steps.clickSendKeyName();
        userManagement_steps.clickPassport();
        userManagement_steps.passportNumber();
        userManagement_steps.clickTimeLimit();
        userManagement_steps.clickBirthday();
        userManagement_steps.clickCountries();
        userManagement_steps.clickPNumber();
        userManagement_steps.clickValidation();
        userManagement_steps.clickValidationCode();
        userManagement_steps.sendKeyBoth();
        userManagement_steps.clickKeysEmail();
        userManagement_steps.clickValidationEmail();
        userManagement_steps.clickValidationCode();
        userManagement_steps.sendKeyBoth();
        userManagement_steps.clickPermissions();
        userManagement_steps.clickNextOne();
        userManagement_steps.clickNextOne();
        userManagement_steps.NextBtnS();

    }



    //用户注销
    @When("^I click the menu select User Logout$")
    public void iClickTheMenuSelectUserLogout() {
    }

//停用用户
    @When("^I click on user deactivate confirm$")
    public void iClickOnUserDeactivateConfirm() {
        userManagement_steps.clickAccountManagements();
        userManagement_steps.selectTheMenus();
        userManagement_steps.clickStopUser();
        userManagement_steps.clickSure();

    }
    @Then("^End the deal$")
    public void endTheDeal() {
        userManagement_steps.clickComplete();
        userManagement_steps.seeViewLabel();
        bddUtil.quitDriver();
    }

    //启动用户
    @When("^I click launch user and click ok$")
    public void iClickLaunchUserAndClickOk() {
        userManagement_steps.clickAccountManagements();
        userManagement_steps.selectTheMenus();
        userManagement_steps.clickStartUser();
        userManagement_steps.clickSure();

    }

    @Then("^End the deals$")
    public void endTheDeals() {
        userManagement_steps.clickComplete();
        userManagement_steps.seeViewStart();
        bddUtil.quitDriver();
    }


    //启用用户















}

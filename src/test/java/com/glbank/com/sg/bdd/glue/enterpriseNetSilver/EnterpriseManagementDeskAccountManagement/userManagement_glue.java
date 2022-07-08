package com.glbank.com.sg.bdd.glue.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement;


import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement.userManagement_steps;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.ConnectLinux;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.awt.*;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

public class userManagement_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private userManagement_steps userManagement_steps;
    private BDDUtil bddUtil;

    @When("^I click on the Enterprise Administration as well user administration$")
    public void iClickOnTheEnterpriseAdministrationAsWellUserAdministration() {
        userManagement_steps.clickEnterpriseManagementDesk();
    }

    //修改手机号
    @When("^I click modify info menu$")
    public void iClickModifyInfoMenu(DataTable emailAddress) {
        List<Map<String, String>> maps = emailAddress.asMaps(String.class, String.class);
        userManagement_steps.clickAccountManagements();
        userManagement_steps.selectTheMenus(maps.get(0).get("emailAddress"));
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
    public void iClickOnAddUser(DataTable payDetail) throws AWTException {
        userManagement_steps.clickAccountManagements();
        userManagement_steps.clickAddUsers();
        userManagement_steps.clickCall();
        userManagement_steps.clickMr();
        userManagement_steps.clickSendKeyName();
        userManagement_steps.clickPassport();
        userManagement_steps.passportNumber();
        List<Map<String, String>> payToInf = payDetail.asMaps(String.class,String.class);
        userManagement_steps.clickTimeLimit(payToInf.get(0).get("TimeLimit"));
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class,String.class);
        userManagement_steps.clickBirthday(payToInfo.get(0).get("birthday"));
        List<Map<String, String>> payToInfN = payDetail.asMaps(String.class,String.class);
        userManagement_steps.clickCountries(payToInfN.get(0).get("countries"));
        userManagement_steps.clickPNumber();
        userManagement_steps.clickValidation();
    }

    @When("^I get the OTP verification code from the server$")
    public void iGetTheOTPVerificationCodeFromTheServer() throws MalformedURLException, InterruptedException, AWTException{
        userManagement_steps.clickValidationCode();
        userManagement_steps.sendKeyBoth();
    }

    @When("^fill in my email$")
    public void fillInMyEmail() {
        userManagement_steps.clickKeysEmail();
        userManagement_steps.clickValidationEmail();
    }

    @And("^fill in and submit the new user information$")
    public void fillInAndSubmitTheNewUserInformation() {
        userManagement_steps.clickPermissions();
        userManagement_steps.clickNextOne();
        userManagement_steps.clickNextOne();
        userManagement_steps.NextBtnS();
    }



    @Then("^I Verify success$")
    public void iVerifySuccess() {
        userManagement_steps.authorizations();
    }

    //用户注销
    @When("^I click the menu select User Logout$")
    public void iClickTheMenuSelectUserLogout(DataTable emailAddress) {
        List<Map<String, String>> maps = emailAddress.asMaps(String.class, String.class);
        userManagement_steps.clickAccountManagements();
        userManagement_steps.selectTheMenus(maps.get(0).get("emailAddress"));
        userManagement_steps.selectMenus();
        userManagement_steps.clickLogOut();
        userManagement_steps.clickSure();


    }

    //停用用户
    @When("^I click on user deactivate confirm$")
    public void iClickOnUserDeactivateConfirm(DataTable emailAddress) {
        List<Map<String, String>> maps = emailAddress.asMaps(String.class, String.class);
        userManagement_steps.clickAccountManagements();
        userManagement_steps.selectTheMenus(maps.get(0).get("emailAddress"));
        userManagement_steps.clickStopUser();
        userManagement_steps.clickSure();

    }

    @Then("^End the deal$")
    public void endTheDeal() {
        userManagement_steps.clickComplete();
        userManagement_steps.seeViewLabel();
    }

    //启动用户
    @When("^I click launch user and click ok$")
    public void iClickLaunchUserAndClickOk(DataTable emailAddress) {
        List<Map<String, String>> maps = emailAddress.asMaps(String.class, String.class);
        userManagement_steps.clickAccountManagements();
        userManagement_steps.selectTheMenus(maps.get(0).get("emailAddress"));
        userManagement_steps.clickStartUser();
        userManagement_steps.clickSure();

    }

    @Then("^End the deals$")
    public void endTheDeals() {
        userManagement_steps.clickComplete();
        userManagement_steps.seeViewStart();
    }
}


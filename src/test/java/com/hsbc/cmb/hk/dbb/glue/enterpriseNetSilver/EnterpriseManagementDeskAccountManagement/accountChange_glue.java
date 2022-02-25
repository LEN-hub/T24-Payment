package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement.accountChange_steps;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.awt.*;
import java.net.MalformedURLException;

public class accountChange_glue {

    @ManagedPages
    public Pages pages;

    @Steps
    private accountChange_steps accountChange_steps;
    private BDDUtil bddUtil;


//账户权限修改
    @When("^I click on the Enterprise Administration Desk and select Account Management$")
    public void iClickOnTheEnterpriseAdministrationDeskAndSelectAccountManagement() {
        accountChange_steps.selectEnterpriseManagementDesk();
        accountChange_steps.accountManagement();
    }

    @When("^I hit Permissions modify$")
    public void iHitPermissionsModify() {
        accountChange_steps.selectModifyList();
        accountChange_steps.clickModify();
        accountChange_steps.clickFinancial();
        accountChange_steps.clickNumberList();
        accountChange_steps.clickNext();
        accountChange_steps.clickSubmitChange();
    }


    @Then("^TC code is then required for Vkey authentication$")
    public void tcCodeIsThenRequiredForVkeyAuthentication() {
        accountChange_steps.clickCodeNext();
    }

//账户加挂
    @When("^I click link account$")
    public void iClickLinkAccount() {
        accountChange_steps.clickLinkAccount();
        accountChange_steps.clickAccountSelect();
        accountChange_steps.clickAccountChoose();
        accountChange_steps.clickFinancial();
        accountChange_steps.clickNumberList();
        accountChange_steps.clickNext();
        accountChange_steps.clickSubmit1();
    }

    //CA账户开立
    @When("^I click account Opening$")
    public void iClickAccountOpening() {
        accountChange_steps.clickAccountOpening();
        accountChange_steps.clickAccountSelect();
        accountChange_steps.clickCA();
        accountChange_steps.clickTransfer();
        accountChange_steps.clickChooseFinancial();
        accountChange_steps.clickNext();
        accountChange_steps.clickAgree();
        accountChange_steps.clickNextSubmit();
    }


//MCA账户开立


    @When("^click open account and select MCA$")
    public void clickOpenAccountAndSelectMCA() {
        accountChange_steps.clickAccountOpening();
        accountChange_steps.clickAccountSelect();
        accountChange_steps.clickMCA();
        accountChange_steps.clickTransfer();
        accountChange_steps.clickChooseFinancial();
        accountChange_steps.clickNext();
        accountChange_steps.clickAgree();
        accountChange_steps.clickNextSubmit();
    }

    @When("^I get the TC code and click Next$")
    public void iGetTheTCCodeAndClickNext() {
        accountChange_steps.tcCode();
        accountChange_steps.clickNextBtn();
    }

    @When("^I typed TC Code and click Authenticate Now$")
    public void iTypedTCCodeAndClickAuthenticateNow() throws MalformedURLException, InterruptedException, AWTException {
        accountChange_steps.vkeyTCCode();
        accountChange_steps.enterTcCode();
        accountChange_steps.authenticateNowBtn();
    }

}
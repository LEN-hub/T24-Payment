package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.Logon_step;
import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.accountService_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.awt.*;
import java.net.MalformedURLException;

public class accountService_glue {

    @ManagedPages
    public Pages pages;

    @Steps
    private accountService_step accountService_step;
    private BDDUtil bddUtil;


    @When("^click the Account Details menu in the account$")
    public void clickTheAccountDetailsMenuInTheAccount() {
        accountService_step.selectAccountDetails();
        accountService_step.accountInformationQuery();
        accountService_step.detailsList();
        accountService_step.accountDetails();
        accountService_step.accountInformationDetails();
    }

    @When("^click the Account Details menu and set alias information$")
    public void clickTheAccountDetailsMenuAndSetAliasInformation() {
        accountService_step.selectAccountDetails();
        accountService_step.accountInformationQuery();
        accountService_step.clickEditAlias();
        accountService_step.inputAlias();
    }

    @Then("^alias entered and saved successfully$")
    public void aliasEnteredAndSavedSuccessfully() {
        accountService_step.aliasTextCheck();
    }

    @When("^succeeded in downloading the batch added domestic payee template$")
    public void successfullyDownloadedBatchNewDomesticPayeeTemplate() {
        accountService_step.clickDownloadBtn();
    }

    @When("^click Download after the file is generated successfully$")
    public void clickDownloadAfterTheFileIsGeneratedSuccessfully() {
        accountService_step.viewEstatements();
    }

    @When("^modifying customer nicknames$")
    public void modifyingCustomerNicknames() {
        accountService_step.mySetting();
    }

    @Then("^the customer nickname is changed successfully$")
    public void theCustomerNicknameIsChangedSuccessfully() {
        accountService_step.checkEditProfile();
    }

    @When("^query operation logs of the personal center$")
    public void queryOperationLogsOfThePersonalCenter() {
       accountService_step.enterpriseManagementDesk();
    }

    @Then("^operation logs of the personal center are successfully queried$")
    public void operationLogsOfThePersonalCenterAreSuccessfullyQueried() {
        accountService_step.querySuccess();
    }

    @When("^personal center online banking transaction query screening conditions$")
    public void personalCenterOnlineBankingTransactionQueryScreeningConditions() {
        accountService_step.myTransactions();
    }

    @When("^personal center online banking transaction query submission time selection nearly seven days$")
    public void personalCenterOnlineBankingTransactionQuerySubmissionTimeSelectionNearlySevenDays() {
        accountService_step.selectSevenDay();
    }

    @When("^account details page display$")
    public void accountDetailsPageDisplay() {
        accountService_step.selectAccountDetails();
        accountService_step.accountInformationQuery();
        accountService_step.accountAndCurrency();
    }

    @When("^click account Details to query and verify the presence of elements$")
    public void clickAccountDetailsToQueryAndVerifyThePresenceOfElements() {
        accountService_step.selectAccountDetails();
        accountService_step.accountDetailsQuery();
        accountService_step.accountTitle();
    }

    @When("^click the Account details query and click the query button to query$")
    public void clickTheAccountDetailsQueryAndClickTheQueryButtonToQuery() {
        accountService_step.selectAccountDetails();
        accountService_step.accountDetailsQuery();
        accountService_step.accountTitle();
        accountService_step.queryButton();
    }

    @When("^I click My Tasks button on the logon page$")
    public void iClickMyTasksButtonOnTheLogonPage() {
        accountService_step.clickMyTaskBtn();
    }

    @Then("^I should direct to the Awaiting authorization page$")
    public void iShouldDirectToTheAwaitingAuthorizationPage() {
        accountService_step.seeApprovalTitle();
    }

    @When("^I click on the first piece of data to authorize$")
    public void iClickOnTheFirstPieceOfDataToAuthorize() {
        accountService_step.clickFirstAuthorizeBtn();
    }

    @When("^I click next to continue$")
    public void iClickNextToContinue() {
        accountService_step.clickNextBtn();
    }

    @When("^I switched to the account of the Level two Authorized$")
    public void iSwitchedToTheAccountOfTheLevelTwoAuthorized() {
    }
}

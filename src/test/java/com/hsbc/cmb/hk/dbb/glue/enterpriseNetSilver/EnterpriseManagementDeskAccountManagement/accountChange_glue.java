package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement.accountChange_steps;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
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

    }

    @When("^I hit Permissions modify$")
    public void iHitPermissionsModify() {
        accountChange_steps.accountManagement();
        accountChange_steps.selectModifyList();
        accountChange_steps.clickModify();
        accountChange_steps.clickFinancial();
        accountChange_steps.clickNumberList();
        accountChange_steps.clickFirstPeople();
        accountChange_steps.clickNext();
        accountChange_steps.clickSubmitChange();
    }


    @Then("^TC code is then required for Vkey authentication$")
    public void tcCodeIsThenRequiredForVkeyAuthentication() {
        accountChange_steps.clickCodeNext();
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

    //账户加挂
    @When("^I click link account$")
    public void iClickLinkAccount() {
        accountChange_steps.accountManagement();
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
    public void iClickAccountOpening(DataTable payDetails) {
        accountChange_steps.accountManagement();
        accountChange_steps.clickAccountOpening();
        accountChange_steps.clickAccountSelect();
        List<Map<String, String>> payToI = payDetails.asMaps(String.class,String.class);
        accountChange_steps.clickCA(payToI.get(0).get("CA"));}
//        List<Map<String, String>> payToIO = payDetails.asMaps(String.class,String.class);
//        accountChange_steps.selectCurrency(payToIO.get(0).get("selectCurrencyBth"),payToIO.get(0).get("selectCurrencyEng"));}

    @And("^I choose the currency to open the account SGD$")
    public void iChooseTheCurrencyToOpenTheAccountSGD() {accountChange_steps.selectCurrencySGD();}

    @And("^I choose the currency to open the account USD$")
    public void iChooseTheCurrencyToOpenTheAccountUSD() {accountChange_steps.selectCurrencyUSD();}

    @And("^I choose the currency to open the account CNY$")
    public void iChooseTheCurrencyToOpenTheAccountCNY() {accountChange_steps.selectCurrencyCNY();}

    @And("^I choose the currency to open the account HKD$")
    public void iChooseTheCurrencyToOpenTheAccountHKD() {accountChange_steps.selectCurrencyHKD();}

    @And("^I choose the currency to open the account EUR$")
    public void iChooseTheCurrencyToOpenTheAccountEUR() {accountChange_steps.selectCurrencyEUR();}


    @When("^I select account permissions$")
    public void iSelectAccountPermissions() {
        accountChange_steps.clickTransfer();
        accountChange_steps.clickChooseFinancial();
        accountChange_steps.clickNumberList();
        accountChange_steps.clickNext();
        accountChange_steps.clickAgree();
        accountChange_steps.clickNextSubmit();
    }


//MCA账户开立
    @And("^I choose the currency to open CNY$")
    public void iChooseTheCurrencyToOpenCNY() { accountChange_steps.macCNY();}

    @And("^I choose the currency to open USD$")
    public void iChooseTheCurrencyToOpenUSD() { accountChange_steps.mcaUSD();}

    @And("^I choose the currency to open HKD$")
    public void iChooseTheCurrencyToOpenHKD() { accountChange_steps.mcaHKD();}

    @And("^I choose the currency to open EUR$")
    public void iChooseTheCurrencyToOpenEUR() { accountChange_steps.mcaEUR();}

    @And("^I choose the currency to open All$")
    public void iChooseTheCurrencyToOpenAll() {
        accountChange_steps.macCNY();
        accountChange_steps.mcaUSD();
        accountChange_steps.mcaHKD();
        accountChange_steps.mcaEUR();
    }
    @And("^I choose the currency to open SGD USD CNY$")
    public void iChooseTheCurrencyToOpenSGDUSDCNY() {
        accountChange_steps.mcaUSD();
        accountChange_steps.macCNY();
    }
    @And("^I choose the currency to open SGD USD EUR$")
    public void iChooseTheCurrencyToOpenSGDUSDEUR() {
        accountChange_steps.mcaUSD();
        accountChange_steps.mcaEUR();
    }
    @And("^I choose the currency to open SGD USD HKD$")
    public void iChooseTheCurrencyToOpenSGDUSDHKD() {
        accountChange_steps.mcaUSD();
        accountChange_steps.mcaHKD();
    }
    @And("^I choose the currency to open SGD CNY HKD$")
    public void iChooseTheCurrencyToOpenSGDCNYHKD() {
        accountChange_steps.macCNY();
        accountChange_steps.mcaHKD();
    }

    //授权模式双人
    @When("^click authorization$")
    public void clickAuthorization() {
        accountChange_steps.clickAuthorization();
        accountChange_steps.clickChangeAuthorization();
    }

    @When("^I choose two-person authorization management mode$")
    public void iChooseTwoPersonAuthorizationManagementMode() {accountChange_steps.dualASingle();}

    @And("^Confirm the authorization mode and submit it$")
    public void confirmTheAuthorizationModeAndSubmitIt() {
        accountChange_steps.clickConfirmBt();
        accountChange_steps.determine();
    }

    @When("^secondary authorized person notification is then displayed$")
    public void secondaryAuthorizedPersonNotificationIsThenDisplayed() {accountChange_steps.secondaryAuthorization();}

    @Then("^I verify that the transaction is successful$")
    public void iVerifyThatTheTransactionIsSuccessful() {accountChange_steps.authorizations();}

    //授权模式单人
    @When("^I choose single-player license management mode$")
    public void iChooseSinglePlayerLicenseManagementMode() {accountChange_steps.singleASingle();}

    //无授权模式
    @When("^I choose unlicensed management mode$")
    public void iChooseUnlicensedManagementMode() {accountChange_steps.aSingle();}


    //新增币种

    @When("^I click add currency to fill in the information$")
    public void iClickAddCurrencyToFillInTheInformation() {
        accountChange_steps.accountManagement();
        accountChange_steps.selectModifyList();
        accountChange_steps.clickCurrencyManagement();
        accountChange_steps.clickAddCurrency();
        accountChange_steps.clickSelectCurrency();
        accountChange_steps.clickNextCurrency();
        accountChange_steps.clickSubmitCurrency();

    }
    @Then("^verify whether to wait for authorization$")
    public void verifyWhetherToWaitForAuthorization() {
        accountChange_steps.authorization();
    }

    //删除币种

    @When("^I click delete currency information$")
    public void iClickDeleteCurrencyInformation() {
        accountChange_steps.accountManagement();
        accountChange_steps.selectModifyList();
        accountChange_steps.clickCurrencyManagement();
        accountChange_steps.clickDelCurrency();
        accountChange_steps.clickRemoveCurrencyBox();
        accountChange_steps.clickSelectRemoveCurrency();
        accountChange_steps.clickBalanceToBox();
        accountChange_steps.clickSelectCount();
        accountChange_steps.clickCurrencyBox();
        accountChange_steps.clickSelectCurrencyBt();
        accountChange_steps.clickNextCurrency();
        accountChange_steps.clickSubmitCurrency();
    }



}
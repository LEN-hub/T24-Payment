package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.paymentService_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.util.List;
import java.util.Map;

public class paymentService_glue {

    @ManagedPages
    public Pages pages;

    private BDDUtil bddUtil;

    @Steps
    private paymentService_step paymentService_step;

    @Then("^I check to see if the page jumps$")
    public void iCheckToSeeIfThePageJumps() {
        paymentService_step.accountTitleVerify();
    }

    @When("^I verify the page information and click the Next button$")
    public void iVerifyThePageInformationAndClickTheNextButton() {
        paymentService_step.clickSubmitBtn();
    }

    @Then("^My account has been transferred successfully$")
    public void myAccountHasBeenTransferredSuccessfully() {
        paymentService_step.successTitle();
    }

    @When("^I will complete the inter-bank transfer on the page$")
    public void iWillConvertSingaporeDollarsToUSDollarsOnThePage(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        paymentService_step.sdgTransferToUsd(payToInfo.get(0).get("rollOutAccount"),payToInfo.get(0).get("intoAccount"),payToInfo.get(0).get("amount"));
    }

    @When("^I fill in the transfer information of domestic transfer bank$")
    public void iFillInTheTransferInformationOfDomesticTransferBank(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        paymentService_step.domesticTransfer(payToInfo.get(0).get("bank name"),payToInfo.get(0).get("account name"),payToInfo.get(0).get("receiving account"),payToInfo.get(0).get("transfer amount"),payToInfo.get(0).get("transfer purpose"));
    }

    @Then("^I verify the information on the next page$")
    public void iVerifyTheInformationOnTheNextPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        paymentService_step.checkCollectionName(payToInfo.get(0).get("account name"),payToInfo.get(0).get("receiving account"),payToInfo.get(0).get("transfer amount"),payToInfo.get(0).get("transfer purpose"));
    }

    @When("^I click Next to go to the verification page$")
    public void iClickNextToGoToTheVerificationPage() {
        paymentService_step.confirmInformationNextBtn();
    }

    @When("^I click next button on the domestic transfer bank page$")
    public void iClickNextButtonOnTheDomesticTransferBankPage() {
        paymentService_step.clickNextBtn();
    }

    @When("^I select date on the domestic transfer bank page$")
    public void iSelectDateOnTheDomesticTransferBankPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        paymentService_step.rollOutDate(payToInfo.get(0).get("selectDate"));
    }

    @When("^I choose Periods to fill in the information for the in-country transfer$")
    public void iChoosePeriodsToFillInTheInformationForTheInCountryTransfer(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        paymentService_step.enterPeriods(payToInfo.get(0).get("periods"));
    }

    @Then("^I jump to the successful transfer page$")
    public void iJumpToTheSuccessfulTransferPage() {
        paymentService_step.transferSuccessTitle();
    }

    @Then("^I check the details on the transfer success details page$")
    public void iCheckTheDetailsOnTheTransferSuccessDetailsPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        paymentService_step.checkAccountDetails(payToInfo.get(0).get("account name"),payToInfo.get(0).get("receiving account"),payToInfo.get(0).get("transfer amount"),payToInfo.get(0).get("transfer purpose"));

    }

    @When("^If the transfer failure window pops up I will click the continue button$")
    public void ifTheTransferFailureWindowPopsUpIWillClickTheContinueButton() {
        paymentService_step.getPopWindowsTitle();
    }

    @When("^I selected the date on the domestic transfer bank page not after twenty-nine$")
    public void iSelectedTheDateOnTheDomesticTransferBankPageNotAfterTwentyNine(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        paymentService_step.rollOutDateTwentyNine(payToInfo.get(0).get("selectDate"));
    }

    @When("^I fill in the transfer information of overseas domestic transfer bank$")
    public void iFillInTheTransferInformationOfOverseasDomesticTransferBank(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        paymentService_step.otherDomesticTransfer(payToInfo.get(0).get("account name"),payToInfo.get(0).get("receiving account"),payToInfo.get(0).get("transfer amount"),payToInfo.get(0).get("transfer purpose"));
    }


//境外转账
//    @When("^I click overseas transfer and fill in the required information$")
//    public void iClickOverseasTransferAndFillInTheRequiredInformation(DataTable payDetail) {
//
//    }


    @When("^I click on overseas transfer payment and select the account$")
    public void iClickOnOverseasTransferPaymentAndSelectTheAccount() {
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.overseasTransfer();
        paymentService_step.accountBox();
        paymentService_step.selectAccount();}

    @When("^I input the payment amount$")
    public void iInputThePaymentAmount(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class,String.class);
        paymentService_step.enterAmount(payToInfo.get(0).get("enterAmount"));}

    @And("^I choose the payment currency$")
    public void iChooseThePaymentCurrency() {
        paymentService_step.currencyBox();
        paymentService_step.selectUsd();    }


    @When("^I enter the payee information$")
    public void iEnterThePayeeInformation(DataTable payDetail) {
        List<Map<String, String>> payToInfos = payDetail.asMaps(String.class,String.class);
        paymentService_step.sendPaymentAccount(payToInfos.get(0).get("sendPaymentAccount"));
        List<Map<String, String>> payToInf = payDetail.asMaps(String.class,String.class);
        paymentService_step.namePayee(payToInf.get(0).get("namePayee"));
//        paymentService_step.collectingBankBox();
//        paymentService_step.collectingBank();
//        paymentService_step.clickYes();
        List<Map<String, String>> payToIn = payDetail.asMaps(String.class,String.class);
        paymentService_step.payeeAdd(payToIn.get(0).get("payeeAdd"));
        paymentService_step.payeeCountriesEnCdBox();
        paymentService_step.clickUsd();
        List<Map<String, String>> payToI = payDetail.asMaps(String.class,String.class);
        paymentService_step.remittancePostscriptContent(payToI.get(0).get("remittancePostscriptContent"));
    }

    @When("^I choose cost information$")
    public void iChooseCostInformation() {
        paymentService_step.expenseBox();
        paymentService_step.expense();
    }

    @Then("^I choose payment properties and click next$")
    public void iChoosePaymentPropertiesAndClickNext() {
        paymentService_step.paymentAttributeCd();
        paymentService_step.selectPaymentAttributeCd();
        paymentService_step.clickNextBox();
    }

    //USD--SGD
    @When("^I choose the currency of payment$")
    public void iChooseTheCurrencyOfPayment() {
       paymentService_step.clickCurrencyBox();
       paymentService_step.selectUSD();

    }

    @And("^I choose the payment currency SGD$")
    public void iChooseThePaymentCurrencySGD() {
        paymentService_step.currencyBox();
        paymentService_step.selectSgd();
    }

    @When("^I choose cost information all$")
    public void iChooseCostInformationAll() {
        paymentService_step.expenseBox();
        paymentService_step.expenseBth();
    }
}
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
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.sdgTransferToUsd(payToInfo.get(0).get("rollOutAccount"), payToInfo.get(0).get("intoAccount"), payToInfo.get(0).get("amount"));
    }

    @When("^I fill in the transfer information of domestic transfer bank$")
    public void iFillInTheTransferInformationOfDomesticTransferBank(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.domesticTransfer(payToInfo.get(0).get("bank name"), payToInfo.get(0).get("account name"), payToInfo.get(0).get("receiving account"), payToInfo.get(0).get("transfer amount"), payToInfo.get(0).get("transfer purpose"));
    }

    @Then("^I verify the information on the next page$")
    public void iVerifyTheInformationOnTheNextPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.checkCollectionName(payToInfo.get(0).get("account name"), payToInfo.get(0).get("receiving account"), payToInfo.get(0).get("transfer amount"), payToInfo.get(0).get("transfer purpose"));
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
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.rollOutDate(payToInfo.get(0).get("selectDate"));
    }

    @When("^I choose Periods to fill in the information for the in-country transfer$")
    public void iChoosePeriodsToFillInTheInformationForTheInCountryTransfer(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.enterPeriods(payToInfo.get(0).get("periods"));
    }

    @Then("^I jump to the successful transfer page$")
    public void iJumpToTheSuccessfulTransferPage() {
        paymentService_step.transferSuccessTitle();
    }

    @Then("^I check the details on the transfer success details page$")
    public void iCheckTheDetailsOnTheTransferSuccessDetailsPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.checkAccountDetails(payToInfo.get(0).get("account name"), payToInfo.get(0).get("receiving account"), payToInfo.get(0).get("transfer amount"), payToInfo.get(0).get("transfer purpose"));

    }

    @When("^If the transfer failure window pops up I will click the continue button$")
    public void ifTheTransferFailureWindowPopsUpIWillClickTheContinueButton() {
        paymentService_step.getPopWindowsTitle();
    }

    @When("^I selected the date on the domestic transfer bank page not after twenty-nine$")
    public void iSelectedTheDateOnTheDomesticTransferBankPageNotAfterTwentyNine(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.rollOutDateTwentyNine(payToInfo.get(0).get("selectDate"));
    }

    @When("^I fill in the transfer information of overseas domestic transfer bank$")
    public void iFillInTheTransferInformationOfOverseasDomesticTransferBank(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.otherDomesticTransfer(payToInfo.get(0).get("account name"), payToInfo.get(0).get("receiving account"), payToInfo.get(0).get("transfer amount"), payToInfo.get(0).get("transfer purpose"));
    }


//境外转账

    @When("^I click on overseas transfer payment and select the account$")
    public void iClickOnOverseasTransferPaymentAndSelectTheAccount() {
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.overseasTransfer();
    }

    @When("^I select the payment account, enter the payment currency and the payment amount and the cost commitment$")
    public void iSelectThePaymentAccountEnterThePaymentCurrencyAndThePaymentAmountAndTheCostCommitment(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.selectPaymentAccount(payToInfo.get(0).get("selectAccount"));
        List<Map<String, String>> payToInfoN = payDetail.asMaps(String.class, String.class);
        paymentService_step.clickCurrency(payToInfoN.get(0).get("payeeCurrency"));
        List<Map<String, String>> payToInfoU = payDetail.asMaps(String.class, String.class);
        paymentService_step.enterAmount(payToInfoU.get(0).get("enterAmount"));
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.expense(payToI.get(0).get("expense"), payToI.get(0).get("expenseEnglish"));
    }

    @And("^I choose the payment currency$")
    public void iChooseThePaymentCurrency(DataTable payDetail) {
        List<Map<String, String>> payToInfoE = payDetail.asMaps(String.class, String.class);
        paymentService_step.selectAccBth(payToInfoE.get(0).get("selectAccBth"));
    }

    @When("^I enter the payee information$")
    public void iEnterThePayeeInformation(DataTable payDetail) {
        List<Map<String, String>> payToInfos = payDetail.asMaps(String.class, String.class);
        paymentService_step.sendPaymentAccount(payToInfos.get(0).get("sendPaymentAccount"));
        List<Map<String, String>> payToInf = payDetail.asMaps(String.class, String.class);
        paymentService_step.namePayee(payToInf.get(0).get("namePayee"));
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.collectingBankBox(payToInfo.get(0).get("collectingBank"));
        List<Map<String, String>> payToIn = payDetail.asMaps(String.class, String.class);
        paymentService_step.payeeAdd(payToIn.get(0).get("payeeAdd"));
        List<Map<String, String>> payToInq = payDetail.asMaps(String.class, String.class);
        paymentService_step.payeeCountriesEnCd(payToInq.get(0).get("payeeCountries"));
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.remittancePostscriptContent(payToI.get(0).get("remittancePostscriptContent"));
    }

    @When("^I choose the nature of payment$")
    public void iChooseTheNatureOfPayment(DataTable payDetail) {
        List<Map<String, String>> payToIN = payDetail.asMaps(String.class, String.class);
        paymentService_step.paymentAttributeCd(payToIN.get(0).get("selectPaymentAttributeCd"));
    }

    @When("^I choose to submit the transfer information$")
    public void iChooseToSubmitTheTransferInformation() {
        paymentService_step.clickNextBox();
        paymentService_step.staging();
        paymentService_step.selectSumB();
    }

    @Then("^I checked the details on the successful overseas transfer details page$")
    public void iCheckedTheDetailsOnTheSuccessfulOverseasTransferDetailsPage(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.InspectionStatus(payToInfo.get(0).get("selectAccount"), payToInfo.get(0).get("sendPaymentAccount"));
    }

    @When("^I click save content to template$")
    public void iClickSaveContentToTemplate(DataTable payDetail) {
        paymentService_step.saveTemplate();
        List<Map<String, String>> payToIN = payDetail.asMaps(String.class, String.class);
        paymentService_step.templateName(payToIN.get(0).get("templateName"));
        paymentService_step.saveB();
        paymentService_step.theMenu();
        paymentService_step.templateImport();

    }

    @When("^I chose trade finance, the transportation route chose nautical$")
    public void iChoseTradeFinanceTheTransportationRouteChoseNautical(DataTable payDetail) {
        List<Map<String, String>> payToIN = payDetail.asMaps(String.class, String.class);
        paymentService_step.TransportationWay(payToIN.get(0).get("TransportationWay"));
        List<Map<String, String>> payToINO = payDetail.asMaps(String.class, String.class);
        paymentService_step.shipNm(payToINO.get(0).get("shipNm"));
        List<Map<String, String>> payToINU = payDetail.asMaps(String.class, String.class);
        paymentService_step.shipNo(payToINU.get(0).get("shipNo"));
        List<Map<String, String>> payToINY = payDetail.asMaps(String.class, String.class);
        paymentService_step.shipmentAddR(payToINY.get(0).get("shipmentAddR"));
        List<Map<String, String>> payToINK = payDetail.asMaps(String.class, String.class);
        paymentService_step.trafficAddR(payToINK.get(0).get("trafficAddR"));
        List<Map<String, String>> payToINH = payDetail.asMaps(String.class, String.class);
        paymentService_step.goodInvolved(payToINH.get(0).get("goodInvolved"));
        paymentService_step.invoice();
        paymentService_step.billLading();

    }

}
package com.glbank.com.sg.bdd.glue.enterpriseNetSilver;

import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.paymentService_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import javax.xml.crypto.Data;
import java.awt.*;
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
    public void myAccountHasBeenTransferredSuccessfully(DataTable payDetails) throws Exception {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.successTitleToFXLocalPayment(payToInfo.get(0).get("WordPath"));
    }

    @Then("^My account has been transferred successfully To Local Payment$")
    public void myAccountHasBeenTransferredSuccessfullyToLocalPayment(DataTable payDetails) throws Exception {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.successTitleToFXLocalPayment(payToInfo.get(0).get("WordPath"));
    }

    @When("^I will complete the inter-bank transfer on the page$")
    public void iWillConvertSingaporeDollarsToUSDollarsOnThePage(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.sdgTransferToUsd(payToInfo.get(0).get("From Account"), payToInfo.get(0).get("To Account"), payToInfo.get(0).get("currency"));
    }

    @When("^I fill in the transfer information of domestic transfer bank$")
    public void iFillInTheTransferInformationOfDomesticTransferBank(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.domesticTransfer(payToInfo.get(0).get("Payee's Bank"), payToInfo.get(0).get("Payee's Account Number"), payToInfo.get(0).get("Purpose of Transfer"), payToInfo.get(0).get("From Account"), payToInfo.get(0).get("Payment Type"), payToInfo.get(0).get("PayNow Type"), payToInfo.get(0).get("PayNow Content"));
    }


    @Then("^I verify the information on the next page$")
    public void iVerifyTheInformationOnTheNextPage() {
        paymentService_step.checkCollectionName();
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
        paymentService_step.rollOutDate(payToInfo.get(0).get("selectDate"), payToInfo.get(0).get("trasferOutDate"));
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
        paymentService_step.otherDomesticTransfer(payToInfo.get(0).get("bank name"), payToInfo.get(0).get("account name"), payToInfo.get(0).get("receiving account"), payToInfo.get(0).get("transfer purpose"), payToInfo.get(0).get("payment information"));
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
        paymentService_step.selectPaymentAccount(payToInfo.get(0).get("Account Number"), payToInfo.get(0).get("Currency"));
//        List<Map<String, String>> payToInfoN = payDetail.asMaps(String.class, String.class);
//        paymentService_step.clickCurrency(payToInfoN.get(0).get("payeeCurrency"));
        List<Map<String, String>> payToInfoU = payDetail.asMaps(String.class, String.class);
        paymentService_step.enterAmount();
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.expense(payToI.get(0).get("Payment Mode for Charges"));
    }


    @When("^I select the payment account, enter the payment currency and the payment amount and the cost commitmentEUR$")
    public void iSelectThePaymentAccountEnterThePaymentCurrencyAndThePaymentAmountAndTheCostCommitmentEUR(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.selectPaymentAccountEUR(payToInfo.get(0).get("Account Number"), payToInfo.get(0).get("Currency"));
//        List<Map<String, String>> payToInfoN = payDetail.asMaps(String.class, String.class);
//        paymentService_step.clickCurrency(payToInfoN.get(0).get("payeeCurrency"));
        List<Map<String, String>> payToInfoU = payDetail.asMaps(String.class, String.class);
        paymentService_step.enterAmount();
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.expense(payToI.get(0).get("Payment Mode for Charges"));

    }



    @When("^I select the payment account, enter the payment currency and the payment amount and the cost commitmentCNY$")
    public void iSelectThePaymentAccountEnterThePaymentCurrencyAndThePaymentAmountAndTheCostCommitmentCNY(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.selectPaymentAccountCNY(payToInfo.get(0).get("Account Number"), payToInfo.get(0).get("Currency"));
//        List<Map<String, String>> payToInfoN = payDetail.asMaps(String.class, String.class);
//        paymentService_step.clickCurrency(payToInfoN.get(0).get("payeeCurrency"));
        List<Map<String, String>> payToInfoU = payDetail.asMaps(String.class, String.class);
        paymentService_step.enterAmount();
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.expense(payToI.get(0).get("Payment Mode for Charges"));
    }



    @When("^I select the payment account, enter the payment currency and the payment amount and the cost commitmentHKD$")
    public void iSelectThePaymentAccountEnterThePaymentCurrencyAndThePaymentAmountAndTheCostCommitmentHKD(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.selectPaymentAccountHKD(payToInfo.get(0).get("Account Number"), payToInfo.get(0).get("Currency"));
//        List<Map<String, String>> payToInfoN = payDetail.asMaps(String.class, String.class);
//        paymentService_step.clickCurrency(payToInfoN.get(0).get("payeeCurrency"));
        List<Map<String, String>> payToInfoU = payDetail.asMaps(String.class, String.class);
        paymentService_step.enterAmount();
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.expense(payToI.get(0).get("Payment Mode for Charges"));
    }


    @And("^I choose the payment currency$")
    public void iChooseThePaymentCurrency(DataTable payDetail) {
        List<Map<String, String>> payToInfoE = payDetail.asMaps(String.class, String.class);
        paymentService_step.selectAccBth(payToInfoE.get(0).get("Currency"));
    }

    @When("^I enter the payee information$")
    public void iEnterThePayeeInformation(DataTable payDetail) {
        List<Map<String, String>> payToInfos = payDetail.asMaps(String.class, String.class);
        paymentService_step.sendPaymentAccount(payToInfos.get(0).get("Payee's Account Number"));
        List<Map<String, String>> payToInf = payDetail.asMaps(String.class, String.class);
        paymentService_step.namePayee(payToInf.get(0).get("Payee's Name"));
    }

    @When("^I click on the receiving bank drop down box$")
    public void iClickOnTheReceivingBankDropDownBox() {
        paymentService_step.collectingBox();
        bddUtil.sleep(2);
    }

    @When("^I choose the receiving bank$")
    public void iChooseTheReceivingBank(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.collectingBankBox(payToInfo.get(0).get("Beneficiary Bank"));


    }

    @When("^I choose the recipient country$")
    public void iChooseTheRecipientCountry(DataTable payDetail) {
        List<Map<String, String>> payToIn = payDetail.asMaps(String.class, String.class);
        paymentService_step.payeeAdd(payToIn.get(0).get("Payee's Address"));
        List<Map<String, String>> payToInq = payDetail.asMaps(String.class, String.class);
        paymentService_step.payeeCountriesEnCd(payToInq.get(0).get("Payee's Country"));
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.remittancePostscriptContent(payToI.get(0).get("Comments For Payee"));
    }

    @When("^I choose the nature of payment$")
    public void iChooseTheNatureOfPayment(DataTable payDetail) {
        List<Map<String, String>> payToIN = payDetail.asMaps(String.class, String.class);
        paymentService_step.paymentAttributeCd(payToIN.get(0).get("Purpose of Transfer"));
    }

    @When("^I choose to submit the transfer information$")
    public void iChooseToSubmitTheTransferInformation() {
        paymentService_step.clickNextBox();
        bddUtil.sleep(3);
//        paymentService_step.beginValidation();
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
        List<Map<String, String>> payToINo = payDetail.asMaps(String.class, String.class);
        paymentService_step.collectingBankBox(payToINo.get(0).get("collectingBank"));
    }

    @When("^I chose trade finance, the transportation route chose nautical$")
    public void iChoseTradeFinanceTheTransportationRouteChoseNautical(DataTable payDetail) {
        List<Map<String, String>> payToIN = payDetail.asMaps(String.class, String.class);
        paymentService_step.transportMethod(payToIN.get(0).get("transportMethod"));
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

    //收款账户为SGD时，收款银行需要固定银行，因为列表里有两个一样的，所以参数提取不可取。
    @When("^I click the recipient bank is Singapore$")
    public void iClickTheRecipientBankIsSingapore() {
        paymentService_step.SINGAPORE();
    }

    //    对应EUR--单币种账户
    @When("^I select the payment account, enter the payment amount and the cost commitment$")
    public void iSelectThePaymentAccountEnterThePaymentAmountAndTheCostCommitment(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.selectPaymentAccount(payToInfo.get(0).get("selectAccount"), payToInfo.get(0).get("Currency"));
        List<Map<String, String>> payToInfoU = payDetail.asMaps(String.class, String.class);
        paymentService_step.enterAmount();
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.expense(payToI.get(0).get("expense"));
    }

    @When("^Vkey authorization for Payment transactions in the SIT environment$")
    public void vkeyAuthorizationForPaymentTransactionsInTheSITEnvironment() {
        paymentService_step.vkeyAuthorizationSIT();
    }

    @Then("^I will compare all the data on FX Payment$")
    public void iWillCompareAllTheData(DataTable data) throws Exception {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.getFxPaymentDataOnChannelPage(payToInfo.get(0).get("WordPath"));
    }

    @Then("^I will compare all the data on FX Payment MX Message$")
    public void iWillCompareAllTheDataOnFXPaymentMxMessage(DataTable data) throws Exception {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.getFxPaymentMXDataOnChannelPage(payToInfo.get(0).get("WordPath"));
    }

    @Then("^I will compare all the data on same Currency Payment$")
    public void iWillCompareAllTheDataOnSameCurrencyPayment(DataTable payDetail) throws Exception {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.getInnerPaymentDataOnChannelPage(payToInfo.get(0).get("WordPath"));
    }

    @Then("^I will compare all the data on FX Payment Different Currency MX Message$")
    public void iWillCompareAllTheDataOnFXPaymentDifferentCurrencyMXMessage(DataTable data) throws Exception {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.getFxPaymentDataOnChannelPageDifferentCurrency(payToInfo.get(0).get("WordPath"));
    }

    @When("^I execute manage PayNow Profile transaction on the page$")
    public void iExecuteManagePayNowProfileTransactionOnThePage() throws AWTException {
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.managePayNowProfile();
    }

    @When("^I sign and cancel the transaction on the page$")
    public void iSignAndCancelTheTransactionOnThePage() {
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.singOff();
    }

    @When("^I carry out the signing and modification process on the page$")
    public void iCarryOutTheSigningAndModificationProcessOnThePage(DataTable data) throws Exception {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.singModify(payToInfo.get(0).get("AccountNum"));
    }

    @When("^I select a time period on the page$")
    public void iSelectATimePeriodOnThePage(DataTable data) throws Exception {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.timeAdjustment(payToInfo.get(0).get("date"), payToInfo.get(0).get("cycle"));
    }

    @When("^I signed on the page successfully$")
    public void iSignedOnThePageSuccessfully() {
        paymentService_step.singSuccess();
    }

    @Given("^Overseas transfer in the same currency and single currency SGD-SGD$")
    public void overseasTransferInTheSameCurrencyAndSingleCurrencySHASGDSGD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.SGD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Single_Currency_SGD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));

    }

    @Given("^Overseas transfer in the same currency and single currency USD-USD$")
    public void overseasTransferInTheSameCurrencyAndSingleCurrencySHAUSDUSD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Single_Currency_USD_USD_001(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @When("^I click the submit button on the page until I jump to the verification code acquisition page$")
    public void iClickTheSubmitButtonOnThePageUntilIJumpToTheVerificationCodeAcquisitionPage() {
        paymentService_step.clickSubmitBtnJumpToVerifyCode();
    }

    @Given("^Overseas transfer in the same currency and Multi currency SGD-SGD$")
    public void overseasTransferInTheSameCurrencyAndMultiCurrencySGDSGD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.SGD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_MultiCurrency_SGD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Multi_Currency_SGD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^Overseas transfer in the same currency and Multi currency USD-USD$")
    public void overseasTransferInTheSameCurrencyAndMultiCurrencyUSDUSD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_MultiCurrency_USD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Multi_Currency_USD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^Overseas transfer in the Different currency and Single currency SGD-USD$")
    public void overseasTransferInTheDifferentCurrencyAndSingleCurrencySGDUSD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.SGD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_SingleCurrency_SGD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Single_Currency_SGD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^Overseas transfer in the Different currency and Single currency USD-SGD$")
    public void overseasTransferInTheDifferentCurrencyAndSingleCurrencyUSDSGD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_SingleCurrency_USD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Single_Currency_USD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^Overseas transfer in the Different currency and Multi currency SGD-USD$")
    public void overseasTransferInTheDifferentCurrencyAndMultiCurrencySGDUSD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.SGD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_MultiCurrency_SGD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Multi_Currency_SGD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^Overseas transfer in the Different currency and Multi currency USD-SGD$")
    public void overseasTransferInTheDifferentCurrencyAndMultiCurrencyUSDSGD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_MultiCurrency_USD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Multi_Currency_USD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Then("^view meps account$")
    public void viewMepsAccount() {
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.checkAccountIsVisible();
    }

    @Then("^Domestic transfer Fast transfer succeeded and the transaction email was received$")
    public void domesticTransferFastTransferSucceededAndTheTransactionEmailWasReceived(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.inputFastInformation(payToInfo.get(0).get("from account"), payToInfo.get(0).get("to account"), payToInfo.get(0).get("date"), payToInfo.get(0).get("bank name"), payToInfo.get(0).get("transfer type"), payToInfo.get(0).get("PayNow Module"), payToInfo.get(0).get("PayNow Content"), payToInfo.get(0).get("recurring transfer"), payToInfo.get(0).get("date type"));
        paymentService_step.getPopWindowsTitle();
        paymentService_step.vkeyAuthorizationSIT();
    }

    @Then("^Check whether you can receive mail in the mailbox$")
    public void checkWhetherYouCanReceiveMailInTheMailbox(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.openEmailUrl(payToInfo.get(0).get("email name"));
    }

    @Then("^Domestic transfer MEPS transfer succeeded and the transaction email was received$")
    public void domesticTransferMEPSTransferSucceededAndTheTransactionEmailWasReceived(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.checkMEPSAccount(payToInfo.get(0).get("from account"));
    }

    @Then("^I check whether the INB page display is normal$")
    public void iCheckWhetherTheOnlineBankingInterfaceDisplayIsNormal() {
        paymentService_step.checkINBPage();
    }

    @Then("^check ISO page information$")
    public void checkISOPageInformation() {
        paymentService_step.checkMessage();
    }

    @Given("^In house fund transfer same & Single currency SGD-SGD$")
    public void inHouseFundTransferSameSingleCurrencySGDSGD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.SGD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.inHouse_Transfer_Single_Currency_USD_SGD(payToInfo.get(0).get("Transfer amount"), payToInfo.get(0).get("Transfer currency"));
    }

    @Given("^In house fund transfer same & Single currency USD-USD$")
    public void inHouseFundTransferSameSingleCurrencyUSDUSD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Single_Currency_USD_USD_002(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^In house fund transfer same & Single currency SGD-USD$")
    public void inHouseFundTransferSameSingleCurrencySGDUSD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.SGD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_SingleCurrency_SGD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Single_Currency_SGD_USD_001(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^In house fund transfer same & Single currency USD_SGD$")
    public void inHouseFundTransferSameSingleCurrencyUSD_SGD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Single_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_SingleCurrency_USD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Single_Currency_USD_SGD_001(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^In house fund transfer same & MCY currency SGD-SGD$")
    public void inHouseFundTransferSameMCYCurrencySGDSGD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.SGD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_MultiCurrency_SGD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Multi_Currency_SGD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^In house fund transfer same & MCY currency SGD-USD$")
    public void inHouseFundTransferSameMCYCurrencySGDUSD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.SGD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_MultiCurrency_SGD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Multi_Currency_SGD_USD_001(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^In house fund transfer same & MCY currency USD_SGD$")
    public void inHouseFundTransferSameMCYCurrencyUSD_SGD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_MultiCurrency_USD_SGD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Multi_Currency_USD_SGD_001(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Given("^In house fund transfer same & MCY currency USD_USD$")
    public void inHouseFundTransferSameMCYCurrencyUSD_USD(DataTable data) {
        List<Map<String, String>> payToInfo = data.asMaps(String.class, String.class);
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.USD_Multi_Currency_Charging(payToInfo.get(0).get("Deposit amount"), payToInfo.get(0).get("Charge Option"));
        paymentService_step.overseas_Transfer_Fees_Query_MultiCurrency_USD_USD(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
        paymentService_step.overseas_Transfer_Multi_Currency_USD_USD_001(payToInfo.get(0).get("Transfer out amount"), payToInfo.get(0).get("Charge Option"), payToInfo.get(0).get("Transfer in account currency"));
    }

    @Then("^I get transaction details on the page$")
    public void iGetTransactionDetailsOnThePage() throws Exception {
        paymentService_step.getTransactionDetails();
    }

    @When("^I fill in the transfer information on the page$")
    public void iFillInTheTransferInformationOnThePage(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.inputTransferInformation(payToInfo.get(0).get("From Account"), payToInfo.get(0).get("To Account"));
    }

    @Then("^I checked the transfer success in My transactions$")
    public void iCheckedTheTransferSuccessInMyTransactions() {
        paymentService_step.checkMyTransactionInformation();
    }

    @When("^Select Payments and click manage payments$")
    public void selectPaymentsAndClickManagePayments() {
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.clickManagePayees();
    }

    @When("^Add a new payee in Payees$")
    public void addANewPayeeInPayees(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.payeesAddNewPayee(payToInfo.get(0).get("payee bank"));
    }

    @Then("^Add successfully and click modify to modify successfully$")
    public void addSuccessfullyAndClickModifyToModifySuccessfully() {
        paymentService_step.checkDataAccountNum();
    }

    @When("^Delete new payees data$")
    public void deleteNewPayeesData() {
        paymentService_step.clickDeleteBtn();
    }

    @When("^Query of account list information succeeded$")
    public void queryOfAccountListInformationSucceeded() {
        paymentService_step.clickAccountsMenu();
        paymentService_step.checkLocalFundsTransfer();
    }

    @When("^Check account list Local fund transfer is available$")
    public void checkAccountListLocalFundTransferIsAvailable() {
        paymentService_step.clickAccountsMenu();
        paymentService_step.checkPlaceFixedDeposits();
    }

    @When("^Enter information on the transfer details page$")
    public void enterInformationOnTheTransferDetailsPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.payeeTransfer(payToInfo.get(0).get("Payee's Bank"), payToInfo.get(0).get("Payee's Account Number"), payToInfo.get(0).get("Purpose of Transfer"), payToInfo.get(0).get("From Account"), payToInfo.get(0).get("Payment Type"), payToInfo.get(0).get("PayNow Type"), payToInfo.get(0).get("PayNow Content"));
    }

    @When("^Click the transfer button on the page to jump to the transfer page$")
    public void clickTheTransferButtonOnThePageToJumpToTheTransferPage() {
        paymentService_step.modifyAndTransfer();
    }

    @When("^Click the Transfer button on the page$")
    public void clickTheTransferButtonOnThePage() {
        paymentService_step.Transfer();
    }

    @When("^I got PayNow Proxy ID in the signing details$")
    public void iGotPayNowProxyIDInTheSigningDetails() {
        paymentService_step.getPayNowProxyId();
    }

    @When("^Use the PayNow Proxy ID after successful signing to transfer Paynow$")
    public void useThePayNowProxyIDAfterSuccessfulSigningToTransferPaynow(DataTable payDetails) {
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.payNowTransfer(payToInfo.get(0).get("Purpose of Transfer"), payToInfo.get(0).get("From Account"), payToInfo.get(0).get("Payment Type"), payToInfo.get(0).get("PayNow Type"));
    }

    @When("^I edit manage PayNow Profile transaction on the page$")
    public void iEditManagePayNowProfileTransactionOnThePage() {
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.clickManagePayNowProfileEdit();
    }

    @When("^Appointment transfer/cycle transfer display succeeded$")
    public void appointmentTransferCycleTransferDisplaySucceeded(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.appointmentTransferCycleTransfer(payToInfo.get(0).get("account number"),payToInfo.get(0).get("Status of scheduled payments"));
    }

    @When("^Cancellation of verification transfer authority succeeded$")
    public void cancellationOfVerificationTransferAuthoritySucceeded(DataTable payDetails) {
        paymentService_step.clickFinishBtn();
        paymentService_step.transferAndRemittanceMenu();
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        paymentService_step.checkTransferFromAccount(payToInfo.get(0).get("From Account"));
    }

    @When("^Make a transfer transaction, and the transferred-out amount is greater than the account limit$")
    public void makeATransferTransactionAndTheTransferredOutAmountIsGreaterThanTheAccountLimit(DataTable payDetail) {
        List<Map<String, String>> payToInfo = payDetail.asMaps(String.class, String.class);
        paymentService_step.selectPaymentAccount(payToInfo.get(0).get("Account Number"), payToInfo.get(0).get("Currency"));
//        List<Map<String, String>> payToInfoN = payDetail.asMaps(String.class, String.class);
//        paymentService_step.clickCurrency(payToInfoN.get(0).get("payeeCurrency"));
        List<Map<String, String>> payToInfoU = payDetail.asMaps(String.class, String.class);
        paymentService_step.largeAmount();
        List<Map<String, String>> payToI = payDetail.asMaps(String.class, String.class);
        paymentService_step.expense(payToI.get(0).get("Payment Mode for Charges"));
    }

    @Then("^I check error information on the page$")
    public void pageErrorPromptAfterICheckTheAmountExceedsTheLimit() {
        paymentService_step.clickNextBox();
        paymentService_step.checkErrorInformation();
    }

    @When("^I input high-risk data$")
    public void iInputHighRiskData() {
        paymentService_step.inputHighRiskData();
    }

}


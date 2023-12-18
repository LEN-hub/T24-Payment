package com.glbank.com.sg.bdd.glue.T24.Payment;

import com.glbank.com.sg.bdd.steps.T24.Logon.T24_Logon_step;
import com.glbank.com.sg.bdd.steps.T24.Payment.t24_Payments_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import com.glbank.com.sg.bdd.utils.createXML;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class t24_Payments_glue {
    @Steps
    private t24_Payments_step t24_payments_step;
    public static String envTag;
    public BDDUtil bddUtil;

    @When("^I expand the User Menu menu on the page$")
    public void iExpandTheUserMenuMenuOnThePage() {
        t24_payments_step.clickUserMenu();
    }
    @When("^I expand the User Payments menu on the page$")
    public void iExpandTheUserPaymentsMenuOnThePage() {
        t24_payments_step.clickPaymentsMenu();
    }

    @When("^I type in the content and click the search button$")
    public void iTypeInTheContentAndClickTheSearchButton(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformation(content.get(0).get("WordPath"));
        t24_payments_step.switchToDefaultContent();
    }
    @When("^I type in the content and click the search button on Local Payment$")
    public void iTypeInTheContentAndClickTheSearchButtonOnLocalPayment(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformationOnLocalPayment(content.get(0).get("WordPath"));
        t24_payments_step.switchToDefaultContent();
    }

    @When("^I type in the content and click the search button on Mx Messages$")
    public void iTypeInTheContentAndClickTheSearchButtonAndMxMessages(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.checkFT();
        //t24_payments_step.serialNumberQueryingInformationMxMessage(content.get(0).get("WordPath"));
        //t24_payments_step.switchToDefaultContent();
    }

    @When("^I type in the content and click the search button on Mx Message$")
    public void iTypeInTheContentAndClickTheSearchButtonAndMxMessage(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformationMxMessage(content.get(0).get("WordPath"));
        t24_payments_step.switchToDefaultContent();
    }
    @When("^I type in the content and click the search button To Local Payment$")
    public void iTypeInTheContentAndClickTheSearchButtonToLocalPayment(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformationToLocalPayment(content.get(0).get("WordPath"));
        t24_payments_step.switchToDefaultContent();
    }

    @When("^I expand the Payment Hub menu on the page$")
    public void iExpandThePaymentHubMenuOnThePage() {
        t24_payments_step.clickPaymentHubMenu();
    }

    @When("^I expand the Payment Inquiries and Exceptions menu on the page$")
    public void iExpandThePaymentInquiriesAndExceptionsMenuOnThePage() {
        t24_payments_step.clickPaymentInquiriesMenu();
    }

    @When("^I expand the Payments Enquiry Transaction wise menu on the page$")
    public void iExpandThePaymentsEnquiryTransactionWiseMenuOnThePage() {
        t24_payments_step.clickPaymentTransactionWiseMenu();
    }

    @When("^I jump to a newly opened page$")
    public void iJumpToANewlyOpenedPage(DataTable data) {
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.findFileSendersReference();
        t24_payments_step.getFtNumber(title.get(0).get("WordPath"));
    }

    @When("^I jump to a newly opened page On Local Payment$")
    public void iJumpToANewlyOpenedPageOnLocalPayment(DataTable data) {
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.findFileSendersReference();
        t24_payments_step.getFtNumberOnLocalPayment(title.get(0).get("WordPath"));
    }

    @When("^I jump to a newly opened page on Mx Message$")
    public void iJumpToANewlyOpenedPageOnMxMessage(DataTable data) {
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.findFileSendersReference();
        t24_payments_step.getFtNumberOnMxMessage(title.get(0).get("WordPath"));
    }

    @When("^I jump to a newly opened page on Mx Message22$")
    public void iJumpToANewlyOpenedPageOnMxMessage22(DataTable data) {
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.findFileSendersReference();
        t24_payments_step.getFtNumberOnMxMessage22(title.get(0).get("WordPath"));
    }


    @When("^I compare the amount is normal$")
    public void iCompareTheAmountIsNormal(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkAccountingEntries(title.get(0).get("WordPath"));
    }
    @When("^I compare the amount is normal To Local Payment$")
    public void iCompareTheAmountIsNormalToLocalPayment(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkAccountingEntriesToLocalPayment(title.get(0).get("WordPath"));
    }

    @When("^I compare the amount is normal on Mx Message$")
    public void iCompareTheAmountIsNormalOnMxMessage(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkAccountingEntriesOnMxMessage(title.get(0).get("WordPath"));
    }

    @When("^I compare the data generated by Outgoing Message is correct$")
    public void iCompareTheDataGeneratedByOutgoingMessageIsCorrect(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkOutgoingMessage(title.get(0).get("WordPath"),title.get(0).get("Name"));
    }

    @When("^I compare the data generated by Outgoing Message is correct On Local Payment$")
    public void iCompareTheDataGeneratedByOutgoingMessageIsCorrectOnLocalPayment(DataTable dataTable) {
        List<Map<String, String>> title = dataTable.asMaps(String.class, String.class);
        t24_payments_step.checkOutgoingMessageOnLocalPayment(title.get(0).get("Name"));
    }

    @When("^I compare the data generated by Outgoing Message MX Message is correct$")
    public void iCompareTheDataGeneratedByOutgoingMessageMXMessageIsCorrect(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkOutgoingMessageOnMxMessage(title.get(0).get("WordPath"),title.get(0).get("Name"));
    }

    @When("^I type FOREX in the search box use to authorize the operation$")
    public void iTypeFOREXInTheSearchBox(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.forexAuthorize(title.get(0).get("search content"),title.get(0).get("user Authorize"),title.get(0).get("WordPath"));
    }
    @When("^I type FOREX in the search box use to authorize the operationToLocalPayment$")
    public void iTypeFOREXInTheSearchBoxToLocalPayment(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.forexAuthorizeToLocalPayment(title.get(0).get("search content"),title.get(0).get("user Authorize"),title.get(0).get("WordPath"));
    }
    @When("^I jump to the home page and enter FUNDS\\.TRANSFER for data mapping$")
    public void iJumpToTheHomePageAndEnterFUNDSTRANSFERForDataMapping(DataTable data) {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.fundsTransfer(title.get(0).get("search content"),title.get(0).get("WordPath"));
    }

    @Then("^I will map the page data$")
    public void iWillMapThePageData(DataTable data) {
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.iWillMapThePageData(content.get(0).get("WordPath"));
    }

    @Then("^I do field mapping for Channel and T24 in FX Payment$")
    public void iDoFieldMappingForChannelAndT(DataTable data) {
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.channelAndT24DataFieldMappingFxPayment(content.get(0).get("WordPath"));
    }

    @Then("^I do field mapping for Channel and T24 in same currency$")
    public void iDoFieldMappingForChannelAndTInSameCurrency(DataTable data) {
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.channelAndT24DataFieldMappingSameCurrency(content.get(0).get("WordPath"));
    }

    @Then("^I do field mapping for Channel and T24 in Own FX Payment$")
    public void iDoFieldMappingForChannelAndTInOwnFXPayment(DataTable data) {
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.channelAndT24DataFieldMappingOwnPayment(content.get(0).get("WordPath"));
    }

    @When("^I type in the content and click the search button on Different Currency$")
    public void iTypeInTheContentAndClickTheSearchButtonOnDifferentCurrency(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformationDifferentCurrency(content.get(0).get("WordPath"));
        t24_payments_step.switchToDefaultContent();
    }

    @When("^I jump to a newly opened page for Different Currency$")
    public void iJumpToANewlyOpenedPageForDifferentCurrency(DataTable data) throws Exception {
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.findFileSendersReference();
        t24_payments_step.getFtNumberDifferentCurrency(title.get(0).get("WordPath"));
    }

    @Then("^I do field mapping for Channel and T24 in FX Payment for Different Currency$")
    public void iDoFieldMappingForChannelAndTInFXPaymentForDifferentCurrency(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.channelAndT24DataFieldMappingFxPaymentDifferentCurrency(title.get(0).get("WordPath"));
    }

    @When("^I compare the amount is normal for Different Currency$")
    public void iCompareTheAmountIsNormalForDifferentCurrency(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkAccountingEntriesDifferentCurrency(title.get(0).get("WordPath"));
    }

    @When("^I compare the data generated by Outgoing Message is correct for Different Currency$")
    public void iCompareTheDataGeneratedByOutgoingMessageIsCorrectForDifferentCurrency(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkOutgoingMessageDifferentCurrency(title.get(0).get("WordPath"),title.get(0).get("Name"));

    }

    @When("^I type FOREX in the search box use to authorize the operation for Different Currency$")
    public void iTypeFOREXInTheSearchBoxUseToAuthorizeTheOperationForDifferentCurrency(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.forexAuthorizeDifferentCurrency(title.get(0).get("search content"),title.get(0).get("user Authorize"),title.get(0).get("WordPath"));
    }

    @When("^I expand the Products menu on the page$")
    public void iExpandTheProductsMenuOnThePage() {
        t24_payments_step.clickProductsMenu();
    }

    @When("^I expand the Find Account menu on the page$")
    public void iExpandTheFindAccountMenuOnThePage() {
        t24_payments_step.clickFindAccountMenu();
    }

    @When("^Verify of successful deduction of transfer-out account$")
    public void iJumpToANewlyOpenedPageForFindAccountMenu(DataTable data) {
        t24_payments_step.closeAllTabJumpToHomePage();
        t24_payments_step.clickProductsMenu();
        t24_payments_step.clickFindAccountMenu();
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.findInputArrangement();
    }

    @When("^Enter the verification page$")
    public void iQueryTheTransactionStatusInTheCore(DataTable data) {
        t24_payments_step.clickUserMenu();
        t24_payments_step.clickPaymentsMenu();
        t24_payments_step.clickPaymentHubMenu();
        t24_payments_step.clickPaymentInquiriesMenu();
        t24_payments_step.clickPaymentTransactionWiseMenu();
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.clickFindBtn();
    }

    @Then("^Verify the Charge Options field$")
    public void transactionDetailsCheck(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.transactionDetailsCheckUSD_USD(title.get(0).get("Charge Option"));
    }

    @When("^I close all tabs and jump to the home$")
    public void iCloseAllTabsAndJumpToTheHome() {
        t24_payments_step.closeAllTabJumpToHome();
    }

    @When("^I close all tabs and jump to the home page$")
    public void iCloseAllTabsAndJumpToTheHomePage() {
        t24_payments_step.closeAllTabJumpToHomePage();
    }


    @When("^I close all tabs and jump to the page$")
    public void iCloseAllTabsAndJumpToThePage() {
        t24_payments_step.closeAllTabJumpToPage();
    }
    @Then("^Verify Bene currency$")
    public void iCheckTheTransferOutCurrencyOnThePage() {
        t24_payments_step.checkCurrency();
    }

    @Then("^Verify transfer amount$")
    public void iCheckTransferAmountOnThePage() {
        t24_payments_step.checkAmount();
    }

    @Then("^I verify that the data in the API request message is consistent with the bit amount field on the page$")
    public void iCheckDebitAmountOnThePage(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkDebitAccountNum(title.get(0).get("envName"));
    }

    @Then("^Verify fees$")
    public void iCheckFeeOnThePage() {
        t24_payments_step.checkFee();
    }

    @Then("^Verify cut off time date$")
    public void iVerifyThatTheCutOffTimeDateIsCorrect() {
        t24_payments_step.iVerifyThatTheCutOffTimeDateIsCorrect();
    }

    @Then("^Verify T24 transaction status$")
    public void iVerifyThatTheTTransactionStatusIsConsistentWithTheExpectedResult() {
        t24_payments_step.interfaceReturnInformationQuery();
    }

    @Then("^Verify the actual deduction amount$")
    public void iVerifyThatTheExpectedResultOfTheActualDeductionAmountIsConsistent() {
        t24_payments_step.checkDeductionAmount();
    }

    @When("^I view the exchange rate in the Payment Order RFQ Rate Audit menu On Local Payment$")
    public void iViewTheExchangeRateInThePaymentOrderRFQRateAuditMenu(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkRateInternalTransfer(title.get(0).get("WordPath"));
    }

    @When("^I view the exchange rate in the Payment Order RFQ Rate Audit menu On Oversea Payment MT$")
    public void iViewTheExchangeRateInThePaymentOrderRFQRateAuditMenuOnOverseaPaymentMT(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkRateOverseaDifferentCurrencyMT(title.get(0).get("WordPath"));
    }

    @When("^I view the exchange rate in the Payment Order RFQ Rate Audit menu On Oversea Payment MX$")
    public void iViewTheExchangeRateInThePaymentOrderRFQRateAuditMenuOnOverseaPaymentMX(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.checkRateOverseaDifferentCurrencyMX(title.get(0).get("WordPath"));

    }

    @Then("^Verify of successful deduction of MYC transfer-out account$")
    public void verifyOfSuccessfulDeductionOfMYCTransferOutAccount(DataTable data) {
        t24_payments_step.closeAllTabJumpToHomePage();
        t24_payments_step.clickProductsMenu();
        t24_payments_step.clickFindMCY();
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.findMCYInputArrangement();
    }

    @When("^I check the deduction amount on the Find Account page On Local Payment$")
    public void iCheckTheDeductionAmountOnTheFindAccountPageOnLocalPayment(DataTable data) {
        t24_payments_step.closeTabJumpToHomePage();
        t24_payments_step.clickProductsMenu();
        t24_payments_step.clickFindAccountMenu();
//        t24_payments_step.clickFindMultiCurrencyS();
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.findInputArrangementPaymentUI(title.get(0).get("WordPath"));
    }

    @When("^I check the deduction amount on the Find Account page On Local Fund Payment$")
    public void iCheckTheDeductionAmountOnTheFindAccountPageOnLocalFundPayment(DataTable data) {
        bddUtil.switchToNewWindow();
        t24_payments_step.switchToSecondFrame();
        t24_payments_step.clickProductsMenu();
        t24_payments_step.clickFindAccountMenu();
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.findInputArrangementLocalFundPaymentUI(title.get(0).get("WordPath"));
    }

    @When("^I check the deduction amount on the Find Account page On overseas transfer Payment$")
    public void iCheckTheDeductionAmountOnTheFindAccountPageOnOverseasTransferPayment(DataTable data) {
        bddUtil.switchToNewWindow();
        t24_payments_step.switchToSecondFrame();
        t24_payments_step.clickProductsMenu();
//        t24_payments_step.clickFindAccountMenu();
        t24_payments_step.clickFindMultiCurrencyS();
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.findInputArrangementOverseasPaymentUI(title.get(0).get("WordPath"));
    }

    @Then("^Verify trade information$")
    public void verifyTradeInformation() {
        t24_payments_step.clickViewAndCheckInformation();
    }

    @When("^I check the deduction amount on the Find Account page On smock test$")
    public void iCheckTheDeductionAmountOnTheFindAccountPageOnSmockTest(DataTable data) {
        t24_payments_step.switchToDefaultContent();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        t24_payments_step.switchToSecondFrame();
        t24_payments_step.clickProductsMenu();
        t24_payments_step.clickFindAccountMenu();
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.findInputArrangementLocalFundPaymentUI(title.get(0).get("WordPath"));
    }

//    在T24查询SCF建档客户信息。
    @When("^I input customerID on T24 SIT$")
    public void iInputCustomerIDOnTSIT24() {
        t24_payments_step.inputCustomerID();
    }

//    校验T24的Customer Type状态
    @Then("^I check the status$")
    public void iCheckTheStatus() throws Exception{
        t24_payments_step.checkCustomerType();
    }

//  进入Customer Details页面
    @Then("^Enter the Customer Details Page$")
    public void enterTheCustomerDetailsPage() {
        t24_payments_step.EnterCustomerTails();
    }

//    校验放款的金额
    @And("^check Loan Amount$")
    public void checkLoanAmount() throws Exception{
        t24_payments_step.checkLoanAmount();
    }

//    进入到DrillDown页面
    @When("^Enter the Drilldown Page$")
    public void enterTheDrilldownPage() {
        t24_payments_step.enterDrillDown();
    }

//    校验还款
    @And("^check Repayment status$")
    public void checkRepaymentStatus() throws Exception{
        t24_payments_step.checkRepaymentStatus();
    }

//    进入Outgoing ISO Customer Transfer页面
    @When("^I click Outgoing ISO Customer Transfer$")
    public void iClickOutgoingISOCustomerTransfer() {
        t24_payments_step.clickISOCustomerTransfer();
    }

    @Then("^I Assertion enter Outgoing ISO Customer Transfer Page$")
    public void iAssertionEnterOutgoingISOCustomerTransferPage() {
        t24_payments_step.AssertionEnterISOCustomerTransferPage();
    }

    @Then("^I enter Outgoing Customer Transfer Page$")
    public void iEnterOutgoingCustomerTransferPage() {
        t24_payments_step.enterCustomerTransferPage();
    }

    @When("^I Input incomplete information on ISO Customer Transfer Page$")
    public void iInputIncompleteInformationOnISOCustomerTransferPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputInformationOnCustomerTransferPage(maps.get(0).get("Instructed Agent Bic"),maps.get(0).get("Transaction Currency"),maps.get(0).get("Transaction Amount"),maps.get(0).get("Debit Account Number"),maps.get(0).get("Debit Account Currency"),maps.get(0).get("Creditor Account"),maps.get(0).get("Creditor Name"),maps.get(0).get("Charge Option"));

    }

    @Then("^I click pre-submit button$")
    public void iClickPreSubmitButton() {
        t24_payments_step.clickPreSubmit();
    }

    @When("^I entered the Pending Authorise Payments page$")
    public void iEnteredThePendingAuthorisePaymentsPage() {
        t24_payments_step.enterPendingAuthorise();
    }

    @Then("^I input OE Number and click Find Authorise$")
    public void iInputOENumberAndClickFindAuthorise() {
        t24_payments_step.inputOEbitAccNumber();
    }

    @When("^I enter the Payments Enquiry - Transaction wise page$")
    public void iEnterThePaymentsEnquiryTransactionWisePage() {
        t24_payments_step.enterPaymentsEnquiryTransactionWisePage();
    }

    @Then("^I input FTNumber and click Find$")
    public void iInputFTNumberAndClickFind() {
        t24_payments_step.inputFTNumberClickFind();
    }

    @Then("^I input FTNumber and click Find On Incoming$")
    public void iInputFTNumberAndClickFindOnIncoming(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputFTNumberClickFindOnIncoming(maps.get(0).get("FTNumber"));

    }

    @Then("^I input FTNumber and click Find Authorise$")
    public void iInputFTNumberAndClickFindAuthorise() {
        t24_payments_step.inputFTNumberAuthorise();
    }

    @When("^I Assert enter View Page NFee$")
    public void iAssertEnterViewPageNFee() throws Exception{
        t24_payments_step.enterView();
//        断言是否进入EnterViewPage
        t24_payments_step.assertEnterViewPage();
//        查看各个页面的数据
 //       t24_payments_step.clickChargeInformation2();
//        t24_payments_step.clickRoutingformation();
//        t24_payments_step.clickAdditionalInfo();
 //       t24_payments_step.clickErrorInformation();
//        t24_payments_step.clickExtendedDebtorInfo();
//        t24_payments_step.clickExtendedCreditorInfo();
//        t24_payments_step.clickUltimateDebtorInfo();
//        t24_payments_step.clickUltimateCreditorInfo();
//        t24_payments_step.clickRegulatoryReporting();
//        t24_payments_step.clickStructuredRemittanceInfo();
//        t24_payments_step.clickPrevInstrAgents();
//        t24_payments_step.clickChangedFields();
        t24_payments_step.clickAudit();
//        查看完详细信息关闭当前窗口
        bddUtil.closeWindow();
        bddUtil.sleep(1);
    }

    @When("^I Assert enter View Page$")
    public void iAssertEnterViewPage() throws Exception{
        t24_payments_step.enterView();
//        断言是否进入EnterViewPage
        t24_payments_step.assertEnterViewPage();
//        查看各个页面的数据
        t24_payments_step.clickChargeInformation2();
//        t24_payments_step.clickRoutingformation();
//        t24_payments_step.clickAdditionalInfo();
        //       t24_payments_step.clickErrorInformation();
//        t24_payments_step.clickExtendedDebtorInfo();
//        t24_payments_step.clickExtendedCreditorInfo();
//        t24_payments_step.clickUltimateDebtorInfo();
//        t24_payments_step.clickUltimateCreditorInfo();
//        t24_payments_step.clickRegulatoryReporting();
//        t24_payments_step.clickStructuredRemittanceInfo();
//        t24_payments_step.clickPrevInstrAgents();
//        t24_payments_step.clickChangedFields();
        t24_payments_step.clickAudit();
//        查看完详细信息关闭当前窗口
        bddUtil.closeWindow();
        bddUtil.sleep(1);
    }




//    进入放大镜页面
    @Then("^I Assert enter View Details Page$")
    public void iAssertEnterViewDetailsPage() throws IOException {
        t24_payments_step.clickViewDetail();
        t24_payments_step.switchToFirstFrame();
//       断言是否View Details Page进入页面
        t24_payments_step.AssertEnterViewDetailsPage();
//        查看Audit Trail页面
        t24_payments_step.selectAuditTrail();
//        查看进入Posting Lines页面
        t24_payments_step.selectPostingLines();
//        查看进入AccountingEntries页面
        t24_payments_step.selectAccountingEntries();
//        查看进入Received Message页面
        t24_payments_step.selectReceivedMessage();
//        查看进入OutgoingMessage页面
        t24_payments_step.selectOutgoingMessage();
//        将XML报文 提取出来
//        先调用 创建 XML文件的方法
        createXML createXML = new createXML();
        createXML.createPayment_XML();
//      通过下面的方法将XML报文写入Payment_XML文件
        t24_payments_step.writeXML();
        bddUtil.sleep(1);
//        查看进入FeesApplied页面
        t24_payments_step.selectFeesApplied();
        bddUtil.sleep(1);
        bddUtil.closeWindow();
        bddUtil.sleep(1);
    }

    @When("^I click Accept Overrides$")
    public void iClickAcceptOverrides() {
        t24_payments_step.clickAcceptOver();
    }

    @Then("^I input Street Name on the ISO Customer Transfer Page$")
    public void iInputStreetNameOnTheISOCustomerTransferPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.clickDetails();
        t24_payments_step.inputStreetName(maps.get(0).get("Street Name"),maps.get(0).get("Town Name"),maps.get(0).get("Creditor Country"),maps.get(0).get("Post Code"),maps.get(0).get("Debit Account Number1"),maps.get(0).get("Debit Name"),maps.get(0).get("Street Name1"),maps.get(0).get("Post Code1"),maps.get(0).get("Town Name1"),maps.get(0).get("Debtor Country"));
    }

    @When("^I click Outgoing Customer Transfer$")
    public void iClickOutgoingCustomerTransfer() {
        t24_payments_step.clickOutGoingCustomerTransfer();
    }

    @When("^I Input incomplete information on Outgoing Customer Transfer Page$")
    public void iInputIncompleteInformationOnOutgoingCustomerTransferPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputInformationOnOutgoingCustomerTransferPage(maps.get(0).get("Debit Account Number"),maps.get(0).get("Receiver Institution BIC"),maps.get(0).get("Debit Account Currency"),maps.get(0).get("Transaction Currency"),maps.get(0).get("Transaction Amount"),maps.get(0).get("Beneficiary Account"),maps.get(0).get("Beneficiary Name"),maps.get(0).get("Charge Option"));
    }

    @When("^I Assert enter View Page to USD$")
    public void iAssertEnterViewPageToUSD() throws Exception{
        t24_payments_step.enterView();
        //       断言是否进入EnterViewPage
       t24_payments_step.assertEnterViewPage();
//        查看各个页面的数据
        t24_payments_step.clickChargeInformation2();
//        t24_payments_step.clickRoutingformation();
//        t24_payments_step.clickAdditionalInfoUSD();
//        t24_payments_step.clickErrorInformation();
//        t24_payments_step.clickChangedFields();
        t24_payments_step.clickAudit();
//        查看完详细信息关闭当前窗口
        bddUtil.closeWindow();
        bddUtil.sleep(1);
    }

    @When("^I Assert enter View Page to USD Loan$")
    public void iAssertEnterViewPageToUSDLoan() throws Exception{
        t24_payments_step.enterView();
        //        断言是否进入EnterViewPage
//        t24_payments_step.assertLoanEnterViewPage();
//        查看各个页面的数据
        t24_payments_step.clickChargeInformation2();
//        t24_payments_step.clickRoutingformation();
//        t24_payments_step.clickAdditionalInfoUSD();
//        t24_payments_step.clickErrorInformation();
//        t24_payments_step.clickChangedFieldsLoan();
        t24_payments_step.clickAuditLoan();
//        查看完详细信息关闭当前窗口
        bddUtil.closeWindow();
        bddUtil.sleep(1);
    }

//    查看SGMEPS的  详情页面信息
    @When("^I Assert enter View Page to USD Loan SGMEPS$")
    public void iAssertEnterViewPageToUSDLoanSGMEPS() throws Exception{
        t24_payments_step.enterView();
        //        断言是否进入EnterViewPage
        t24_payments_step.assertEnterViewPage();
//        查看各个页面的数据
        t24_payments_step.clickChargeInformation();
        t24_payments_step.clickRoutingformation();
        t24_payments_step.clickAdditionalInfoSGMEPS();
        t24_payments_step.clickErrorInformation();
        t24_payments_step.clickExtendedDebtorInfo();
        t24_payments_step.clickExtendedCreditorInfo();
        t24_payments_step.clickUltimateDebtorInfo();
        t24_payments_step.clickUltimateCreditorInfo();
        t24_payments_step.clickRegulatoryReportingSGMEPS();
        t24_payments_step.clickStructuredRemittanceInfoSGMEPS();
        t24_payments_step.clickPrevInstrAgentsSGMEPS();
        t24_payments_step.clickChangedFieldsSGMEPS();
        t24_payments_step.clickAuditSGMEPS();
//        查看完详细信息关闭当前窗口
        bddUtil.closeWindow();
        bddUtil.sleep(1);

    }

    //    Internal  详情页面信息
    @When("^I Assert enter View Page to USD Loan Internal$")
    public void iAssertEnterViewPageToUSDLoanInternal() throws Exception{
        t24_payments_step.enterView();
        //        断言是否进入EnterViewPage
        t24_payments_step.assertLoanEnterViewPage();
//        查看各个页面的数据
//        t24_payments_step.clickErrorInformation();
//        t24_payments_step.clickChargeInformation();
//        t24_payments_step.clickRoutingformation();
//        t24_payments_step.clickAdditionalInfoUSD();
        t24_payments_step.clickAuditLoan();
        t24_payments_step.clickChangedFieldsLoan();
//        查看完详细信息关闭当前窗口
        bddUtil.closeWindow();
        bddUtil.sleep(1);
    }

    @When("^I Assert enter View Page to OE Outgoing_Bank_Transfer$")
    public void iAssertEnterViewPageToOEOutgoing_Bank_Transfer() throws Exception{
        t24_payments_step.enterView();
//              //  断言是否进入EnterViewPage
//        t24_payments_step.assertEnterViewPage();
//       // 查看各个页面的数据
//        t24_payments_step.clickRoutingformation();
//        t24_payments_step.clickAdditionalInfoUSD();
//        t24_payments_step.clickErrorInformation();
//        t24_payments_step.clickExtendedDebtorInfo();
//        t24_payments_step.clickExtendedCreditorInfo();
//        t24_payments_step.clickPrevInstrAgentsOEBank();
//        t24_payments_step.clickChangedFieldsOEBank();
        t24_payments_step.clickAuditOEBank();
    }


    @When("^I click Outgoing ISO Bank Transfer$")
    public void iClickOutgoingISOBankTransfer() {
        t24_payments_step.clickOutgoingISOTransfer();
    }

    @Then("^I enter Outgoing ISO Bank Transfer Page$")
    public void iEnterOutgoingISOBankTransferPage() {
        t24_payments_step.enterISOBankTransferPage();
    }

    @When("^I Input incomplete information on Outgoing ISO Bank Transfer Page$")
    public void iInputIncompleteInformationOnOutgoingISOBankTransferPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputInformationOnOutgoingISOBankTransfer(maps.get(0).get("Instructed Agent BIC"),maps.get(0).get("Transaction Currency"),maps.get(0).get("Transaction Amount"),maps.get(0).get("Debit Account Number"),maps.get(0).get("Creditor Account"),maps.get(0).get("Creditor Bic"),maps.get(0).get("Creditor Name"));
    }

    @When("^I Input Sender's Reference on Outgoing ISO Bank Transfer Page$")
    public void iInputSenderSReferenceOnOutgoingISOBankTransferPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputSendersReference(maps.get(0).get("Street Name2"),maps.get(0).get("Post Code2"),maps.get(0).get("Town Name3"),maps.get(0).get("Creditor Country3"),maps.get(0).get("Sender Reference"),maps.get(0).get("End To End Identification"));
    }

    @Then("^I get OENumber$")
    public void iGetOENumber() {
        t24_payments_step.getOENumber();
    }



//    点击核心的Products按钮，然后点击Loan Transactions按钮
    @When("^I click Loan Transactions Button$")
    public void iClickLoanTransactionsButton() {
        t24_payments_step.clickProductsLoanTransactionsBtn();

    }
//   选择AA Disbursement External 按钮
    @Then("^I click AA Disbursement External Button$")
    public void iClickAADisbursementExternalButton() {
        t24_payments_step.clickDisbursementExternal();
    }

    @Then("^I enter input the Disbursement External Page$")
    public void iEnterInputTheDisbursementExternalPage() {
        t24_payments_step.enterDisbursementExternalPage();
    }

    @When("^I input information on the Loan Disbursement External Page$")
    public void iInputInformationOnTheLoanDisbursementExternalPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputLoanDisbursementExternal(maps.get(0).get("Debit Account Number"),maps.get(0).get("Debit Currency"),maps.get(0).get("Payment Currency"),maps.get(0).get("Payment Amount"),maps.get(0).get("Beneficiary Country Code"));

    }

    @Then("^I input information on the Beneficiary Details Page$")
    public void iInputInformationOnTheBeneficiaryDetailsPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputBeneficiaryDetailsPage(maps.get(0).get("Beneficiary Account No"),maps.get(0).get("Beneficiary Name"));
    }

    @When("^I enter Routing Details Page and added information$")
    public void iEnterRoutingDetailsPageAndAddedInformation(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.clickRoutingDetails();
        t24_payments_step.inputInformationOnRoutingDetail(maps.get(0).get("Account with Bank BIC"),maps.get(0).get("Account With Town Name"),maps.get(0).get("Account with Bank Country"));
    }

    @Then("^I get LoanPINumber$")
    public void iGetLoanPINumber() {
        t24_payments_step.getLoanPINumber();
    }

    @Then("^I click Authorise/Delete Arrangements \\(PO\\) Button$")
    public void iClickAuthoriseDeleteArrangementsPOButton() {
        t24_payments_step.clickAuthoriseArrangements();
    }

    @Then("^I input PI Number and click Find$")
    public void iInputPINumberAndClickFind() {
        t24_payments_step.inputPINumber();
    }

    @Then("^I input LoanPINumber and click Find$")
    public void iInputLoanPINumberAndClickFind() {
        t24_payments_step.inputLoanPINumberClickFind();
    }

    @When("^I Input incomplete information USD on Outgoing ISO Bank Transfer Page$")
    public void iInputIncompleteInformationUSDOnOutgoingISOBankTransferPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputInformationOnOutgoingISOBankTransferUSD(maps.get(0).get("Instructed Agent BIC"),maps.get(0).get("Transaction Currency"),maps.get(0).get("Transaction Amount"),maps.get(0).get("Debit Account Number"),maps.get(0).get("Creditor Bic"));
    }

    @Then("^I click AA AA Disbursement \\(SGMEPS\\) Button$")
    public void iClickAAAADisbursementSGMEPSButton() {
        t24_payments_step.clickDisbursementSGMEPS();
    }

    @Then("^I enter input the Disbursement SGMEPS Page$")
    public void iEnterInputTheDisbursementSGMEPSPage() {
        t24_payments_step.enterDisbursementSGMEPSPage();
    }

    @When("^I input information on the Loan Disbursement SGMEPS Page$")
    public void iInputInformationOnTheLoanDisbursementSGMEPSPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputLoanDisbursementSGMEPS(maps.get(0).get("Debit Account Number"),maps.get(0).get("Debit Currency"),maps.get(0).get("Payment Currency"),maps.get(0).get("Payment Amount"),maps.get(0).get("Beneficiary Account No"),maps.get(0).get("Beneficiary Bank BIC"),maps.get(0).get("Beneficiary Name"));
    }

    @Then("^I input information on the SGMEPS Beneficiary Details Page$")
    public void iInputInformationOnTheSGMEPSBeneficiaryDetailsPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputBeneficiaryDetailsOnSGMEPS(maps.get(0).get("Beneficiary Street Name"),maps.get(0).get("Beneficiary Post Code"),maps.get(0).get("Beneficiary Town Name"),maps.get(0).get("Beneficiary Country"),maps.get(0).get("Beneficiary Residence Country"));
    }


    @When("^I change status code SGD$")
    public void iChangeStatusCodeSGD() {
        t24_payments_step.changeStatusCodeSGD();
    }


    @When("^I change status code USD$")
    public void iChangeStatusCodeUSD() {
        t24_payments_step.changeStatusCodeUSD();
    }


    @When("^I click Loan Transactions$")
    public void iClickLoanTransactions() {
        t24_payments_step.ClickLoanTransactions();
    }


    @When("^I Input incomplete information on AA Disbursement Internal page$")
    public void iInputIncompleteInformationOnAADisbursementInternalPage(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputInformationOnAADisbursementInternalPage(maps.get(0).get("Debit Account Number"),maps.get(0).get("Debit Currency"),maps.get(0).get("Payment Amount"),maps.get(0).get("Payment Currency"),maps.get(0).get("Creditor Account"));
    }


    @Then("^I Input Beneficiary Address and Beneficiary Town$")
    public void iInputBeneficiaryAddressAndBeneficiaryTown(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputBeneficiaryAddress(maps.get(0).get("Beneficiary Address"),maps.get(0).get("Beneficiary Town"));
    }

    @When("^I click find account$")
    public void iClickFindAccount() {
        t24_payments_step.ClickFindAccount();
    }

    @When("^I input Arrangement$")
    public void iInputArrangement(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputArrangement(maps.get(0).get("Arrangement"));
    }

    @When("^I click Find Butt$")
    public void iClickFindButt() {
        t24_payments_step.ClickFindButt();
    }


    @Then("^I click Find Multi Currency$")
    public void iClickFindMultiCurrency() {
        t24_payments_step.clickFindMultiCurrency();
    }

    @Then("^I click USD Overview$")
    public void iClickUSDOverview() {
        t24_payments_step.clickUSDOverView();
    }

    @Then("^I click SGD Overview$")
    public void iClickSGDOverview() {
        t24_payments_step.clickSGDOverView();
    }

    @Then("^Assert Result whether Successful$")
    public void assertResultWhetherSuccessful() {
        t24_payments_step.assertResultSuccessful();
    }

    @Then("^Assert enter Disbursement External Page$")
    public void assertEnterDisbursementExternalPage() {
        t24_payments_step.AssertEnterLoanDisbursementPage();
    }

    @Then("^Assert enter Account Details Page$")
    public void assertEnterAccountDetailsPage() {
        t24_payments_step.AssertEnterAccountDetailsPage();
    }

    @Then("^Close the current$")
    public void closeTheCurrent() {
        t24_payments_step.closetheCurrent();
    }

    @When("^I click User Menu$")
    public void iClickUserMenu() {t24_payments_step.clickUserMenu();
    }

    @Then("^I click payments$")
    public void iClickPayments() {t24_payments_step.clickPaymentsMenu();
    }

    @When("^I click payment hup$")
    public void iClickPaymentHup() {t24_payments_step.clickPaymentHubMenu();
    }

    @Then("^I click Account Transfer$")
    public void iClickAccountTransfer() {t24_payments_step.clickAccountTransfer();
    }

    @When("^I Input Transfer Information$")
    public void iInputTransferInformation(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputTransferInformation(maps.get(0).get("Debit Account"),maps.get(0).get("Debit Amount"),maps.get(0).get("Debit Currency"),maps.get(0).get("Credit Account"),maps.get(0).get("Credit Currency"),maps.get(0).get("Ordering Bank"));
    }

    @Then("^I click Authorise/Delete FT transactions$")
    public void iClickAuthoriseDeleteFTTransactions() {
        t24_payments_step.clickAuthoriseDeleteFTTransactions();
    }

    @Then("^I click search but$")
    public void iClickSearchBut() {t24_payments_step.clickSearchBut();
    }

    @Then("^I input Credit Account No$")
    public void iInputCreditAccountNo(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputCreditAccountNo(maps.get(0).get("Credit Account No"));
    }

    @When("^I click find$")
    public void iClickFind() {t24_payments_step.clickFind();
    }

    @Then("^I click Authorize But$")
    public void iClickAuthorizeBut1() {t24_payments_step.clickAuthorizeBut1();
    }

    @Then("^I click Risk Management$")
    public void iClickRiskManagement() {
        t24_payments_step.ClickRiskManagement();
    }

    @Then("^I click Limits$")
    public void iClickLimits() {
        t24_payments_step.clickLimits();
    }

    @Then("^I click Limit Menu$")
    public void iClickLimitMenu() {t24_payments_step.ClickLimitMenu();
    }

    @Then("^I click Create Unsecured Limit$")
    public void iClickCreateUnsecuredLimit() {t24_payments_step.ClickCreateUnsecuredLimit();
    }

    @When("^I click New Deal$")
    public void iClickNewDeal() {t24_payments_step.ClickNewDeal();
    }

    @Then("^I input Limit Details$")
    public void iInputLimitDetails(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputLimitDetails(maps.get(0).get("customer_number"),maps.get(0).get("limit_product"),maps.get(0).get("serial_no"),maps.get(0).get("currency"),maps.get(0).get("internal_amount"));
    }

    @Then("^I click Other Details$")
    public void iClickOtherDetails() {t24_payments_step.ClickOtherDetails();
    }

    @Then("^I input Other Details$")
    public void iInputOtherDetails(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.iInputOtherDetails(maps.get(0).get("AllowedCcy"));
    }

    @When("^I click Loan Details$")
    public void iClickLoanDetails(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.iClickLoanDetails(maps.get(0).get("Loan_Interest_Rate"),maps.get(0).get("Loan_Tenor"),maps.get(0).get("Settlement_Account"));
    }

    @Then("^I click Authorise/Delete/Reject Limit$")
    public void iClickAuthoriseDeleteRejectLimit() {
        t24_payments_step.ClickAuthoriseDeleteRejectLimit();
    }



    @Then("^I get LimitID$")
    public void iGetLimitID() {
        t24_payments_step.GetLimitID();
    }

    @Then("^I input LimitID And click Find$")
    public void iInputLimitIDAndClickFind() {
        t24_payments_step.InputLimitIDAndClickFind();
    }

    @Then("^I click Authorize Butt$")
    public void iClickAuthorizeButt() {t24_payments_step.ClickAuthorizeButt();

    }

    @Then("^I click search butt$")
    public void iClickSearchButt() {
        t24_payments_step.ClickSearchButt();
    }

    @Then("^I Click Product Catalog$")
    public void iClickProductCatalog() {
        t24_payments_step.ClickProductCatalog();
    }

    @Then("^I click products$")
    public void iClickProducts() {
        t24_payments_step.ClickProducts();
    }

    @When("^I Click Lending$")
    public void iClickLending() {
        t24_payments_step.ClickLending();
    }

    @Then("^I click Syndicated Loans$")
    public void iClickSyndicatedLoans() {
        t24_payments_step.ClickSyndicatedLoans();
    }

    @Then("^I click New Arrangement$")
    public void iClickNewArrangement() {
        t24_payments_step.ClickNewArrangement();
    }

    @When("^I input Customer and Currency$")
    public void iInputCustomerAndCurrency(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.iInputCustomerAndCurrency(maps.get(0).get("Customer"),maps.get(0).get("Currency1"));
    }

    @Then("^I click Submit(\\d+)$")
    public void iClickSubmit(int arg0) {
        t24_payments_step.ClickSubmit();
    }

    @Then("^I input limit$")
    public void iInputLimit(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.iInputLimit(maps.get(0).get("Limit_Id"));
    }

    @Then("^I input Commitment$")
    public void iInputCommitment(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.iInputCommitment(maps.get(0).get("Amount1"),maps.get(0).get("Term"),maps.get(0).get("Maturity_Date"));
    }

    @When("^I input Principal Interest$")
    public void iInputPrincipalInterest(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputPrincipalInterest(maps.get(0).get("Fixed"),maps.get(0).get("MinMaxRate"));
    }

    @Then("^I get Arrangement$")
    public void iGetArrangement() {
        t24_payments_step.GetArrangement();
    }

    @Then("^I clcik CCY Reference and input$")
    public void iClcikCCYReferenceAndInput(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.ClcikCCYReferenceAndInput(maps.get(0).get("Currency2"),maps.get(0).get("FixedFloating"),maps.get(0).get("RateIndex"));
    }

    @Then("^I input Penalty Interest$")
    public void iInputPenaltyInterest(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputPenaltyInterest(maps.get(0).get("MinMaxRate"),maps.get(0).get("Currency3"),maps.get(0).get("FixedFloating3"),maps.get(0).get("RateIndex3"));
    }

    @Then("^I input Settlement Instructions$")
    public void iInputSettlementInstructions(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputSettlementInstructions(maps.get(0).get("Settlement1"),maps.get(0).get("Settlement2"),maps.get(0).get("Active1"),maps.get(0).get("Active2"));
    }

    @Then("^I click Unauthorized AAA records$")
    public void iClickUnauthorizedAAARecords() {
        t24_payments_step.ClickUnauthorizedAAARecords();
    }

    @Then("^I input Arrangement and Find$")
    public void iInputArrangementAndFind() {
        t24_payments_step.InputArrangementAndFind();
    }

    @Then("^I click improve butt$")
    public void iClickImproveButt() {
        t24_payments_step.ClickImproveButt();
    }

    @Then("^I get Active$")
    public void iGetActive() {
        t24_payments_step.GetActive();
    }

    @Then("^I input Facility Fees Amortised and STF Participation Fee$")
    public void iInputFacilityFeesAmortisedAndSTFParticipationFee(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputFacilityFeesAmortisedAndSTFParticipationFee(maps.get(0).get("rate"),maps.get(0).get("FixedAmount"));
    }

    @Then("^I input Schedule$")
    public void iInputSchedule(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.iInputSchedule(maps.get(0).get("StartTime"),maps.get(0).get("EndTime"));
    }


    @Then("^I click Find Loan$")
    public void iClickFindLoan() {
        t24_payments_step.ClickFindLoan();
    }

    @Then("^I input Arrangementl and Find$")
    public void iInputArrangementlAndFind() {
        t24_payments_step.InputArrangement2AndFind();
    }

    @Then("^I click Find Loan Overview$")
    public void iClickFindLoanOverview() {
        t24_payments_step.ClickFindLoanOverview();
    }

    @Then("^I click Account$")
    public void iClickAccount() {
        t24_payments_step.ClickAccount();
    }

    @Then("^I input Account and Find$")
    public void iInputAccountAndFind(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.InputAccountAndFind(maps.get(0).get("AccountNo"));
    }

    @Then("^I input LIMIT and find$")
    public void iInputLIMITAndFind() {
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.InputLIMITAndFind();
    }

    @Then("^I FIND$")
    public void iFIND() {
        t24_payments_step.FIND();
    }


    @Then("^I wait a mount$")
    public void iWaitAMount() {
        t24_payments_step.WaitAMount();
    }

    @When("^I enter the account ID$")
    public void iEnterTheAccountID() {
        t24_payments_step.accountID();
    }


    @When("^I enter the Currency Rates List$")
    public void iEnterTheCurrencyRatesList() {
        t24_payments_step.CurrencyRatesList();
    }



    @When("^I enter the account IDCA$")
    public void iEnterTheAccountIDCA() {
        t24_payments_step.accountIDCA();
    }


    @Then("^I find account$")
    public void iFindAccount(DataTable dataTable) {
        //t24_payments_step.inputaccountclickfind();
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputaccountclickfind(maps.get(0).get("Arrangement"));
    }

    @Then("^I find account CASGD$")
    public void iFindAccountCASGD(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        t24_payments_step.inputaccountclickfindSGD(maps.get(0).get("Arrangement"),maps.get(0).get("Currency"));
    }

    }


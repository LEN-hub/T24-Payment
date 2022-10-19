package com.glbank.com.sg.bdd.glue.T24.Payment;

import com.glbank.com.sg.bdd.steps.T24.Logon.T24_Logon_step;
import com.glbank.com.sg.bdd.steps.T24.Payment.t24_Payments_step;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class t24_Payments_glue {
    @Steps
    private t24_Payments_step t24_payments_step;
    public static String envTag;

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
        t24_payments_step.serialNumberQueryingInformation();
        t24_payments_step.switchToDefaultContent();
    }
    @When("^I type in the content and click the search button on Local Payment$")
    public void iTypeInTheContentAndClickTheSearchButtonOnLocalPayment(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformationOnLocalPayment();
        t24_payments_step.switchToDefaultContent();
    }

    @When("^I type in the content and click the search button on Mx Message$")
    public void iTypeInTheContentAndClickTheSearchButtonAndMxMessage(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformationMxMessage();
        t24_payments_step.switchToDefaultContent();
    }
    @When("^I type in the content and click the search button To Local Payment$")
    public void iTypeInTheContentAndClickTheSearchButtonToLocalPayment(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformationToLocalPayment();
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
        t24_payments_step.getFtNumber();
    }

    @When("^I jump to a newly opened page On Local Payment$")
    public void iJumpToANewlyOpenedPageOnLocalPayment(DataTable data) {
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.findFileSendersReference();
        t24_payments_step.getFtNumberOnLocalPayment();
    }

    @When("^I jump to a newly opened page on Mx Message$")
    public void iJumpToANewlyOpenedPageOnMxMessage(DataTable data) {
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.findFileSendersReference();
        t24_payments_step.getFtNumberOnMxMessage();
    }

    @When("^I compare the amount is normal$")
    public void iCompareTheAmountIsNormal() {
        t24_payments_step.checkAccountingEntries();
    }
    @When("^I compare the amount is normal To Local Payment$")
    public void iCompareTheAmountIsNormalToLocalPayment() {
        t24_payments_step.checkAccountingEntriesToLocalPayment();
    }

    @When("^I compare the amount is normal on Mx Message$")
    public void iCompareTheAmountIsNormalOnMxMessage() {
        t24_payments_step.checkAccountingEntriesOnMxMessage();
    }

    @When("^I compare the data generated by Outgoing Message is correct$")
    public void iCompareTheDataGeneratedByOutgoingMessageIsCorrect() {
        t24_payments_step.checkOutgoingMessage();
    }

    @When("^I compare the data generated by Outgoing Message is correct On Local Payment$")
    public void iCompareTheDataGeneratedByOutgoingMessageIsCorrectOnLocalPayment() {
        t24_payments_step.checkOutgoingMessageOnLocalPayment();
    }

    @When("^I compare the data generated by Outgoing Message MX Message is correct$")
    public void iCompareTheDataGeneratedByOutgoingMessageMXMessageIsCorrect() {
        t24_payments_step.checkOutgoingMessageOnMxMessage();
    }

    @When("^I type FOREX in the search box use to authorize the operation$")
    public void iTypeFOREXInTheSearchBox(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.forexAuthorize(title.get(0).get("search content"),title.get(0).get("user Authorize"));
    }
    @When("^I type FOREX in the search box use to authorize the operationToLocalPayment$")
    public void iTypeFOREXInTheSearchBoxToLocalPayment(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.forexAuthorizeToLocalPayment(title.get(0).get("search content"),title.get(0).get("user Authorize"));
    }
    @When("^I jump to the home page and enter FUNDS\\.TRANSFER for data mapping$")
    public void iJumpToTheHomePageAndEnterFUNDSTRANSFERForDataMapping(DataTable data) {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.fundsTransfer(title.get(0).get("search content"));
    }

    @Then("^I will map the page data$")
    public void iWillMapThePageData() {
        t24_payments_step.iWillMapThePageData();
    }

    @Then("^I do field mapping for Channel and T24 in FX Payment$")
    public void iDoFieldMappingForChannelAndT() {
        t24_payments_step.channelAndT24DataFieldMappingFxPayment();
    }

    @Then("^I do field mapping for Channel and T24 in same currency$")
    public void iDoFieldMappingForChannelAndTInSameCurrency() {
        t24_payments_step.channelAndT24DataFieldMappingSameCurrency();
    }

    @Then("^I do field mapping for Channel and T24 in Own FX Payment$")
    public void iDoFieldMappingForChannelAndTInOwnFXPayment() {
        t24_payments_step.channelAndT24DataFieldMappingOwnPayment();
    }

    @When("^I type in the content and click the search button on Different Currency$")
    public void iTypeInTheContentAndClickTheSearchButtonOnDifferentCurrency(DataTable data) throws Exception {
        t24_payments_step.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        t24_payments_step.inputBox(content.get(0).get("search content"));
        t24_payments_step.jumpNewWindows(content.get(0).get("windows Title"));
        t24_payments_step.serialNumberQueryingInformationDifferentCurrency();
        t24_payments_step.switchToDefaultContent();
    }

    @When("^I jump to a newly opened page for Different Currency$")
    public void iJumpToANewlyOpenedPageForDifferentCurrency(DataTable data) throws Exception {
        t24_payments_step.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.jumpNewWindows(title.get(0).get("windows Title"));
        t24_payments_step.switchToFirstFrame();
        t24_payments_step.findFileSendersReference();
        t24_payments_step.getFtNumberDifferentCurrency();
    }

    @Then("^I do field mapping for Channel and T24 in FX Payment for Different Currency$")
    public void iDoFieldMappingForChannelAndTInFXPaymentForDifferentCurrency() {
        t24_payments_step.channelAndT24DataFieldMappingFxPaymentDifferentCurrency();
    }

    @When("^I compare the amount is normal for Different Currency$")
    public void iCompareTheAmountIsNormalForDifferentCurrency() {
        t24_payments_step.checkAccountingEntriesDifferentCurrency();
    }

    @When("^I compare the data generated by Outgoing Message is correct for Different Currency$")
    public void iCompareTheDataGeneratedByOutgoingMessageIsCorrectForDifferentCurrency() {
        t24_payments_step.checkOutgoingMessageDifferentCurrency();
    }

    @When("^I type FOREX in the search box use to authorize the operation for Different Currency$")
    public void iTypeFOREXInTheSearchBoxUseToAuthorizeTheOperationForDifferentCurrency(DataTable data) {
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        t24_payments_step.forexAuthorizeDifferentCurrency(title.get(0).get("search content"),title.get(0).get("user Authorize"));
    }

}

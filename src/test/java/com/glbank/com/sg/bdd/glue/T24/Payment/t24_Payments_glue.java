package com.glbank.com.sg.bdd.glue.T24.Payment;

import com.glbank.com.sg.bdd.steps.T24.Payment.t24_Payments_step;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class t24_Payments_glue {
    @Steps
    private t24_Payments_step logon_steps;

    @When("^I expand the User Menu menu on the page$")
    public void iExpandTheUserMenuMenuOnThePage() {
        logon_steps.clickUserMenu();
    }
    @When("^I expand the User Payments menu on the page$")
    public void iExpandTheUserPaymentsMenuOnThePage() {
        logon_steps.clickPaymentsMenu();
    }

    @When("^I type in the content and click the search button$")
    public void iTypeInTheContentAndClickTheSearchButton(DataTable data) throws Exception {
        logon_steps.switchToFirstFrame();
        List<Map<String, String>> content = data.asMaps(String.class, String.class);
        logon_steps.inputBox(content.get(0).get("search content"));
        logon_steps.jumpNewWindows(content.get(0).get("windows Title"));
        logon_steps.serialNumberQueryingInformation();
        logon_steps.switchToDefaultContent();
    }

    @When("^I expand the Payment Hub menu on the page$")
    public void iExpandThePaymentHubMenuOnThePage() {
        logon_steps.clickPaymentHubMenu();
    }

    @When("^I expand the Payment Inquiries and Exceptions menu on the page$")
    public void iExpandThePaymentInquiriesAndExceptionsMenuOnThePage() {
        logon_steps.clickPaymentInquiriesMenu();
    }

    @When("^I expand the Payments Enquiry Transaction wise menu on the page$")
    public void iExpandThePaymentsEnquiryTransactionWiseMenuOnThePage() {
        logon_steps.clickPaymentTransactionWiseMenu();
    }

    @When("^I jump to a newly opened page$")
    public void iJumpToANewlyOpenedPage(DataTable data) {
        logon_steps.switchToDefaultContent();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        logon_steps.jumpNewWindows(title.get(0).get("windows Title"));
        logon_steps.switchToFirstFrame();
        logon_steps.findFileSendersReference();
        logon_steps.getFtNumber();
    }

    @When("^I compare the amount is normal$")
    public void iCompareTheAmountIsNormal() {
        logon_steps.checkAccountingEntries();
    }

    @When("^I compare the data generated by Outgoing Message is correct$")
    public void iCompareTheDataGeneratedByOutgoingMessageIsCorrect() {
        logon_steps.checkOutgoingMessage();
    }

    @When("^I type FOREX in the search box$")
    public void iTypeFOREXInTheSearchBox(DataTable data) {
        logon_steps.switchToFirstFrame();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        logon_steps.searchForex(title.get(0).get("search content"));
    }

    @When("^I enter the Unauthorized Forex Deals Menu page to authorize the operation$")
    public void iEnterTheUnauthorizedForexDealsMenuPageToAuthorizeTheOperation() {
        logon_steps.selectUnauthorizedForexDealsMenu();
    }

    @When("^I jump to the home page and enter FUNDS\\.TRANSFER for data mapping$")
    public void iJumpToTheHomePageAndEnterFUNDSTRANSFERForDataMapping(DataTable data) {
        logon_steps.switchToFirstFrame();
        List<Map<String, String>> title = data.asMaps(String.class, String.class);
        logon_steps.fundsTransfer(title.get(0).get("search content"));
    }

    @Then("^I will map the page data$")
    public void iWillMapThePageData() {
        logon_steps.iWillMapThePageData();
    }

    @Then("^I do field mapping for Channel and T24 in FX Payment$")
    public void iDoFieldMappingForChannelAndT() {
        logon_steps.channelAndT24DataFieldMappingFxPayment();
    }

    @Then("^I do field mapping for Channel and T24 in same currency$")
    public void iDoFieldMappingForChannelAndTInSameCurrency() {
        logon_steps.channelAndT24DataFieldMappingSameCurrency();
    }

    @Then("^I do field mapping for Channel and T24 in Own FX Payment$")
    public void iDoFieldMappingForChannelAndTInOwnFXPayment() {
        logon_steps.channelAndT24DataFieldMappingOwnPayment();
    }
}

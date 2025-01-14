package com.glbank.com.sg.bdd.glue.supplyChains.creditLimit;

import com.glbank.com.sg.bdd.steps.supplyChains.creditLimit.creditLimit_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.util.List;
import java.util.Map;

public class creditLimit_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private creditLimit_step creditLimit_step;
    public static String envTag;
    private BDDUtil bddUtil;


    @When("^I click UnderWriting and UnderWriting Approval$")
    public void iClickUnderWritingAndUnderWritingApproval() {
        creditLimit_step.clickUnderWritingAndApproval();
    }


    @Then("^I should direct to the UnderWriting Approval page$")
    public void iShouldDirectToTheUnderWritingApprovalPage() {
        creditLimit_step.seeUnderWritingAndApprovalText();
    }

    @When("^I click buyer Assign to Me button on UnderWriting Approval page$")
    public void iClickBuyerAssignToMeButtonOnUnderWritingApprovalPage() {
        creditLimit_step.clickBuyerAssignBtn();
    }

    @When("^I click Assign to ME title on the on UnderWriting Approval page$")
    public void iClickAssignToMETitleOnTheOnUnderWritingApprovalPage() {
        creditLimit_step.clickTopAssignBtn();
    }

    @Then("^I should see Proceed Button on the UnderWriting Approval page$")
    public void iShouldSeeProceedButtonOnTheUnderWritingApprovalPage() {
        creditLimit_step.clickProceedBtn();
    }

    @When("^I click Completed Button on the UnderWriting Approval page$")
    public void iClickCompletedButtonOnTheUnderWritingApprovalPage() {
        creditLimit_step.clickCompletedBtn();
        bddUtil.sleep(3);
    }

    @When("^I click Result button on the UnderWriting Approval page$")
    public void iClickResultButtonOnTheUnderWritingApprovalPage() {
        creditLimit_step.clickResultBtn();
    }


    @And("^I click Approve button and click Submit button on the page$")
    public void iClickApproveButtonAndClickSubmitButtonOnThePage() {
        creditLimit_step.clickApproveBtn();
        bddUtil.sleep(1);
    }

    @When("^I click UnderWriting List button on the page$")
    public void iClickUnderWritingListButtonOnThePage() {
        creditLimit_step.clickUnderWritingListBtn();
    }

    @And("^I click Approve and click Submit button on the page$")
    public void iClickApproveAndClickSubmitButtonOnThePage() {
        creditLimit_step.clickApproveBtn();
        bddUtil.sleep(1);
    }

    @When("^I the second click Completed Button on the UnderWriting Approval page$")
    public void iTheSecondClickCompletedButtonOnTheUnderWritingApprovalPage() {
        creditLimit_step.clickCompletedBtn();
        bddUtil.sleep(1);
    }

    @When("^I click Supplier Assign to Me button on UnderWriting Approval page$")
    public void iClickSupplierAssignToMeButtonOnUnderWritingApprovalPage() {
        creditLimit_step.clickSupplierAssignBtn();
    }


    @When("^I should see Supplier Proceed Button and click on the UnderWriting Approval page$")
    public void iShouldSeeSupplierProceedButtonAndClickOnTheUnderWritingApprovalPage() {
        creditLimit_step.clickSupplierProceedBtn();
    }

    @When("^I click buyer Test Data Assign to Me button on UnderWriting Approval page$")
    public void iClickBuyerTestDataAssignToMeButtonOnUnderWritingApprovalPage() {
        creditLimit_step.clickBuyerTestDataAssignBtn();
    }

    @When("^I click Supplier Test Data Assign to Me button on UnderWriting Approval page$")
    public void iClickSupplierTestDataAssignToMeButtonOnUnderWritingApprovalPage() {
        creditLimit_step.clickSupplierTestDataAssignBtn();
    }

    @Given("^Open Supplier Portal URL UAT$")
    public void openSupplierPortalURLUAT() {
        creditLimit_step.openToSupplierPortalUat();
    }

    @Given("^Open Supplier Portal URL SIT$")
    public void openSupplierPortalURLSIT() {
        creditLimit_step.openToSupplierPortalSit();
    }

    @When("^I input login data and click on the Login Supplier Portal URL$")
    public void iInputLoginDataAndClickOnTheLoginSupplierPortalURL(DataTable otherData) {
//        creditLimit_step.inputEmailUrlTest();
        List<Map<String, String>> Data = otherData.asMaps(String.class,String.class);
        creditLimit_step.inputOtherData(Data.get(0).get("pass word"),Data.get(0).get("Company ID"));
    }

    @When("^I click Pending Signature button$")
    public void iClickPendingSignatureButton() {
        creditLimit_step.clickPendingSignatureBtn();
        bddUtil.sleep(3);
    }

    @And("^I click confirm Button$")
    public void iClickConfirmButton() {
        creditLimit_step.clickConfirmBtn();
        bddUtil.sleep(2);
    }

    @When("^I login email URL$")
    public void iLoginEmailURL() {
//        creditLimit_step.clickEmail();
        creditLimit_step.ToggleOneEmail();
        creditLimit_step.signTheOneBR();
        bddUtil.sleep(3);
    }

    @When("^I click Refresh Button$")
    public void iClickRefreshButton() {
        creditLimit_step.clickRefreshBtn();
    }

    @And("^I click first email$")
    public void iClickFirstEmail() {
        creditLimit_step.clickFirstEmail();
    }

    @And("^I input token$")
    public void iInputToken() {
        creditLimit_step.storeToken();
    }

    @When("^I changed Rating is BB$")
    public void iChangedRatingIsBB() {
        creditLimit_step.changeRating();
    }

    @When("^I to sign one$")
    public void iToSignOne() {
        creditLimit_step.toSign();
    }

    @Then("^I to sign Two$")
    public void iToSignTwo() {
        creditLimit_step.toSignTwoEmail();
    }

    @When("^I update Limit for THIS Product$")
    public void iUpdateLimitForTHISProduct() {
        creditLimit_step.updateLimit();
    }

    @When("^I login two email URL$")
    public void iLoginTwoEmailURL() {
        creditLimit_step.ToggleSecondEmail();
        creditLimit_step.signTheSecondBR();
        creditLimit_step.toSign();
    }

    @When("^I open email URL$")
    public void iOpenEmailURL() {
        creditLimit_step.loginEmailUrlTest();
    }

    @And("^I click docs List button$")
    public void iClickDocsListButton() {
        creditLimit_step.clickDocsListBtn();
    }

    @When("^I upload Historical Documents$")
    public void iUploadHistoricalDocuments() {
        creditLimit_step.uploadHistoricalDocuments();
    }

    @Then("^I should see the uploaded historical documents$")
    public void iShouldSeeTheUploadedHistoricalDocuments() throws Exception{
        creditLimit_step.assertUploadExcel();
    }


}

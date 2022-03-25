package com.glbank.com.sg.bdd.glue.supplyChains.BundledPayments;

import com.glbank.com.sg.bdd.steps.supplyChains.BundledPayments.payments_steps;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class payments_glue {

    @ManagedPages
    public Pages pages;

    @Steps
    private payments_steps paymentsStep;
    private BDDUtil bddUtil;
    public static String envTag;


    @When("^When I hit Operations$")
    public void whenIHitOperations() {
        paymentsStep.clickOperations();
    }

    @And("^click Request for Disbursement$")
    public void clickRequestForDisbursement() {
        paymentsStep.clickRequestDisbursement();
        paymentsStep.clickEditGroup();
        paymentsStep.clickConfirm();
        paymentsStep.clickRequesterOne();
        paymentsStep.clickAssignToMe();

    }

    @When("^I click on Assign To Me$")
    public void iClickOnAssignToMe() {
        paymentsStep.clickAssignToMeS();
        paymentsStep.clickRequesterTwo();
        paymentsStep.clickProceed();
        paymentsStep.clickRemittanceFeePaidBy();
        paymentsStep.clickSupplierBank();
        paymentsStep.clickAccountNo();

    }

    @Then("^I click Submit$")
    public void iClickSubmit() {
        paymentsStep.clickSubmit();
        paymentsStep.complete();
        paymentsStep.requesterValidation();
    }

    @When("^I click on Review Disbursement$")
    public void iClickOnReviewDisbursement() {
        paymentsStep.clickOperations();
        paymentsStep.clickReviewDisbursement();
        paymentsStep.clickRequester3();
        paymentsStep.assignToMe2();

    }

    @And("^click proceed$")
    public void clickProceed() {
        paymentsStep.clickAssignToMeS();
        paymentsStep.Requester5();
        paymentsStep.clickProceed();}


    @Then("^Click on the submit APPROVE$")
    public void clickOnTheSubmitAPPROVE() {
        paymentsStep.clickAPPROVE();
        paymentsStep.complete();
        paymentsStep.validation();
        //差个验证
    }

    @When("^Confirm Disbursement page$")
    public void confirmDisbursementPage() {
        paymentsStep.clickOperations();
        paymentsStep.clickConfirmDisbursement();
    }



    @When("^I click Operations button$")
    public void iClickOperationsButton() {
        paymentsStep.clickOperations();
    }

    @When("^I click Repayment button$")
    public void iClickRepaymentButton() {
        paymentsStep.clickBatchRepaymentBtn();
        bddUtil.sleep(2);
    }

    @Then("^I should direct to the Repayment Management page$")
    public void iShouldDirectToTheRepaymentManagementPage() {
        paymentsStep.onTheBatchRepaymentPage();
    }

    @When("^I click the Assign to me button of the repayment data$")
    public void iClickTheAssignToMeButtonOfTheRepaymentData() {
        paymentsStep.clickDataAssignToMe();
    }

    @When("^I click Assign to ME title on the on Repayment Management page$")
    public void iClickAssignToMETitleOnTheOnRepaymentManagementPage() {
        paymentsStep.clickAssignToMeS();
        bddUtil.sleep(2);
    }

    @When("^I click Proceed Button on the Repayment Management Page$")
    public void iClickProceedButtonOnTheRepaymentManagementPage() {
        paymentsStep.clickProceedBtn();
    }

    @Then("^I should direct to the Repayment Detail page$")
    public void iShouldDirectToTheRepaymentDetailPage() {
        paymentsStep.seeRepaymentDetail();
    }

    @When("^I select Repayment Account No on the page$")
    public void iSelectRepaymentAccountNoOnThePage() {
        paymentsStep.selectAccount();
    }

    @And("^I enter other parameters in the current page$")
    public void iEnterOtherParametersInTheCurrentPage() {

    }
}
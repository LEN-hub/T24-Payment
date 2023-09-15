package com.glbank.com.sg.bdd.glue.supplyChains.BundledPayments;

import com.glbank.com.sg.bdd.steps.supplyChains.BundledPayments.payments_steps;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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
//        捆绑组非必须流程。
//        paymentsStep.clickEditGroup();
//        paymentsStep.clickConfirm();
        paymentsStep.clickRequesterOne();
        paymentsStep.clickAssignToMe();

    }

    @When("^I click on Assign To Me$")
    public void iClickOnAssignToMe() {
        paymentsStep.clickAssignToMeS();
        paymentsStep.clickRequesterTwo();
        paymentsStep.clickProceed();
        paymentsStep.clickRemittanceFeePaidBy();
//        paymentsStep.clickSupplierBank();         //SCF新流程 变化，SupplierBank字段默认有值且不能更改。
//        paymentsStep.clickAccountNo();
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
        paymentsStep.clickProceed2();
        paymentsStep.clickAPPROVE();
        bddUtil.sleep(10);
    }

    @Then("^Click on the submit APPROVE$")
    public void clickOnTheSubmitAPPROVE() {
        paymentsStep.complete();
        paymentsStep.validation();
    }


    @When("^Confirm Disbursement page$")
    public void confirmDisbursementPage() {
        paymentsStep.clickOperations();
        paymentsStep.clickConfirmDisbursement();
        paymentsStep.verifySuccess();
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
        paymentsStep.clickAssToMe();
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
        paymentsStep.inputOtherParameter();
    }


    @And("^I enter other parameters in the current pageTwo$")
    public void iEnterOtherParametersInTheCurrentPageTwo() {
        paymentsStep.inputOtherParameter2();
    }

    @And("^I enter other parameters in the current pageThree$")
    public void iEnterOtherParametersInTheCurrentPageThree() {
        paymentsStep.inputOtherParameter3();
    }

    @When("^I input Adjustment Amout$")
    public void iInputAdjustmentAmout() {
        paymentsStep.inputAmout();
    }

    @When("^I click ParRepayMent button$")
    public void iClickParRepayMentButton() {
        paymentsStep.clickparRepayMent();
    }

    @Then("^I should dirent to the ParRePayMent page$")
    public void iShouldDirentToTheParRePayMentPage() {
        paymentsStep.onTheParRePayMentPage();
    }

    @When("^I click Assign to ME title on the on ParRePayMent Management page$")
    public void iClickAssignToMETitleOnTheOnParRePayMentManagementPage() {
        paymentsStep.clickAssToMeParPay();
        paymentsStep.parClickAssignToMeS();
        bddUtil.sleep(2);
    }

    @When("^I click Proceed Button on the ParRepayment Management Page$")
    public void iClickProceedButtonOnTheParRepaymentManagementPage() {
        paymentsStep.clickParProceedBtn();
    }

    @Then("^I should direct to the ParRepayment Detail page$")
    public void iShouldDirectToTheParRepaymentDetailPage() {
        paymentsStep.seeParRepaymentDetail();
    }

    @And("^I enter other parRemeters in the current pageThree$")
    public void iEnterOtherParRemetersInTheCurrentPageThree() {
        paymentsStep.inputOtherParameter4();
    }

    @When("^I click Financing Reports$")
    public void iClickFinancingReports() {
        paymentsStep.clickFinReport();
    }

}
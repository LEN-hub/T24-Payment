package com.hsbc.cmb.hk.dbb.glue.BundledPayments;

import com.hsbc.cmb.hk.dbb.steps.BundledPayments.payments_steps;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
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
//        paymentsStep.clickBuyers();
        paymentsStep.clickAssignToMe();

    }

    @When("^I click on Assign To Me$")
    public void iClickOnAssignToMe() {
        paymentsStep.clickAssignToMeS();
        //        paymentsStep.clickBuyers();
        paymentsStep.clickProceed();
        paymentsStep.clickRemittanceFeePaidBy();
        paymentsStep.clickSupplierBank();
        paymentsStep.clickAccountNo();

    }

    @Then("^I click Submit$")
    public void iClickSubmit() {
        paymentsStep.clickSubmit();
        //        paymentsStep.clickBuyers();
    }




    @When("^I click on Review Disbursement$")
    public void iClickOnReviewDisbursement() {
        paymentsStep.clickOperations();
        paymentsStep.clickReviewDisbursement();
        paymentsStep.clickAssignToMeS();

    }

    @And("^click proceed$")
    public void clickProceed() {paymentsStep.clickPROCEEDS();}


    @Then("^Click on the submit APPROVE$")
    public void clickOnTheSubmitAPPROVE() {paymentsStep.clickAPPROVE();}


    @When("^Confirm Disbursement page$")
    public void confirmDisbursementPage() {
        paymentsStep.clickOperations();
        paymentsStep.clickConfirmDisbursement();
    }
}
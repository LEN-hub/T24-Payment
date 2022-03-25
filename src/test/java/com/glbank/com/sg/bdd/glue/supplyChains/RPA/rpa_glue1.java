package com.glbank.com.sg.bdd.glue.supplyChains.RPA;

import com.glbank.com.sg.bdd.steps.supplyChains.RPA.rpa_steps;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class rpa_glue1 {
    @ManagedPages
    public Pages pages;

    @Steps
    private rpa_steps rpaStep;
    private BDDUtil bddUtil;
    public static String envTag;


    @When("^I click on the first Customers$")
    public void iClickOnTheFirstCustomers() {rpaStep.clickCustomers();}

    @And("^click ContractManagement$")
    public void clickContractManagement() {rpaStep.clickContractManagement();}


    @Then("^Enter the name of the supplier to filter$")
    public void enterTheNameOfTheSupplierToFilter() {
        rpaStep.clickCompanyName();
        rpaStep.clickCompanyNameClickReset();
    }

    @When("^Upload a file$")
    public void uploadAFile() {
        rpaStep.clickUpload();
        rpaStep.clickBrowse();
        rpaStep.clickData();
        rpaStep.clickConfirms();
    }

    @Then("^Jump to the supplier portal to check the RPA$")
    public void jumpToTheSupplierPortalToCheckTheRPA() {
        rpaStep.jumpToSupplierPortal();
        rpaStep.openEmailUrlTest();
        rpaStep.loginServiceAgreementWindow();
    }
}

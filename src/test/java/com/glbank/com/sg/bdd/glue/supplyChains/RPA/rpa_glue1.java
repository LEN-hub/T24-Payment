package com.glbank.com.sg.bdd.glue.supplyChains.RPA;
import cucumber.api.DataTable;
import com.glbank.com.sg.bdd.steps.supplyChains.RPA.rpa_steps;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.util.List;
import java.util.Map;

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
//        rpaStep.clickBrowse();
        rpaStep.clickData();
        rpaStep.clickConfirms();
    }

    @Then("^Jump to the supplier portal to check the RPA$")
    public void jumpToTheSupplierPortalToCheckTheRPA() {
        rpaStep.jumpToSupplierPortal();
        rpaStep.openEmailUrlTest();
        rpaStep.errorEmailLink();
        bddUtil.switchToWindows();
        rpaStep.loginServiceAgreementWindow();
    }

    @When("^I click report button$")
    public void iClickReportButton() {
        rpaStep.clickReport();
        bddUtil.sleep(5);
    }

    @When("^I enter login information$")
    public void iEnterLoginInformation() {
        rpaStep.jumpToSupplierPortal();
        rpaStep.inputLogin();
    }

    @When("^I input login information$")
    public void iInputLoginInformation() {
        rpaStep.inputLogin();
    }

    @When("^I click create user button$")
    public void iClickCreateUserButton(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        rpaStep.clickCreateUser(maps.get(0).get("first_new_password"),maps.get(0).get("second_new_password"));
    }
}

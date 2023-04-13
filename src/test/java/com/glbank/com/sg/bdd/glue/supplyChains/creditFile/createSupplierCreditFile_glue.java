package com.glbank.com.sg.bdd.glue.supplyChains.creditFile;

import com.glbank.com.sg.bdd.steps.supplyChains.creditFile.createSupplierCreditFile_step;
import com.glbank.com.sg.bdd.steps.supplyChains.tubeByInputting.creatCustomers_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.E;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class createSupplierCreditFile_glue {

    @ManagedPages
    public Pages pages;
    @Steps
    private creatCustomers_step customers_step;
    @Steps
    private createSupplierCreditFile_step createSupplierCreditFile_step;
    private BDDUtil bddUtil;

    public String  companyName = FileUtils.LastReadFileInput3("companyData");
    public String  buyerName = FileUtils.LastReadFileInput3("buyer");


    @When("^login successfully and click the SCF link to createSupplierCreditFile$")
    public void loginSuccessfullyAndClickTheSCFLinkToCreateSupplierCreditFile(){
        customers_step.getClickCustomersMenu();
        createSupplierCreditFile_step.clickSupplierCreditProfileList();
        createSupplierCreditFile_step.clickCreateNewUnderwriting();
        createSupplierCreditFile_step.createCreateNewUnderwriting(companyName,buyerName);
        bddUtil.sleep(3);
    }

    @And("^edit Supplier Credit Profile$")
    public void editSupplierCreditProfile() {
        createSupplierCreditFile_step.editSupplierCreditFile(companyName);
        createSupplierCreditFile_step.toEditSupplierCreditFile();
    }

    @Then("^submit Supplier Credit Profile$")
    public void  submitSupplierCreditProfile(){
        createSupplierCreditFile_step.submitSupplierCreditProfile(companyName);
    }

    @And("^to Supplier Credit Profile Review Page$")
    public void toSupplierCreditProfileReviewPage(){
        customers_step.getClickCustomersMenu();
        createSupplierCreditFile_step.clickToSupplierCreditProfileReviewPage();
    }
    @Then("^Supplier Credit Profile L1 Review$")
    public void supplierCreditProfileL1Review(){
        bddUtil.sleep(2);
        createSupplierCreditFile_step.supplierCreditFileL1Review(companyName);
        createSupplierCreditFile_step.clickToAssignToMePage();
        bddUtil.sleep(2);
        createSupplierCreditFile_step.clickProceed(companyName);
        createSupplierCreditFile_step.clickSubmit();
    }
    @And("^use User L2 to Supplier Review$")
    public void useUserL2ToSupplierReview(){
        customers_step.getClickCustomersMenu();
        createSupplierCreditFile_step.clickToSupplierCreditProfileReviewPage();
        bddUtil.sleep(2);
        createSupplierCreditFile_step.supplierCreditFileL1Review(companyName);
        createSupplierCreditFile_step.clickToAssignToMePage();
        bddUtil.sleep(2);
        createSupplierCreditFile_step.clickProceed(companyName);
        createSupplierCreditFile_step.clickSubmit();
        customers_step.getClickCustomersMenu();
        createSupplierCreditFile_step.clickToSupplierCreditProfileReviewPage();
        bddUtil.sleep(5);
    }

    @When("^I check the Credit Supplier status$")
    public void iCheckTheCreditSupplierStatus() throws Exception {
        customers_step.getClickCustomersMenu();
        createSupplierCreditFile_step.checkDataStatus();
    }

    @Then("^I check Underwriting status$")
    public void iCheckUnderwritingStatus() throws Exception{
        createSupplierCreditFile_step.checkUnderWritingStatus();
    }
    @Then("^I check Underwriting status on buyer$")
    public void iCheckUnderwritingStatusOnBuyer() throws Exception{
        createSupplierCreditFile_step.checkUnderWritingStatusOnBuyer();
    }
}

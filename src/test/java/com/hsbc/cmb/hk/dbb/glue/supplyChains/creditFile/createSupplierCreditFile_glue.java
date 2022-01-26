package com.hsbc.cmb.hk.dbb.glue.supplyChains.creditFile;

import com.hsbc.cmb.hk.dbb.steps.supplyChains.creditFile.createBuyerCreditFile_step;
import com.hsbc.cmb.hk.dbb.steps.supplyChains.creditFile.createSupplierCreditFile_step;
import com.hsbc.cmb.hk.dbb.steps.supplyChains.tubeByInputting.creatCustomers_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @When("^login successfully and click the SCF link to createSupplierCreditFile$")
    public void loginSuccessfullyAndClickTheSCFLinkToCreateSupplierCreditFile(){
        customers_step.getClickCustomersMenu();
        createSupplierCreditFile_step.clickSupplierCreditProfileList();
        createSupplierCreditFile_step.clickCreateNewUnderwriting();
        createSupplierCreditFile_step.createCreateNewUnderwriting();
        bddUtil.sleep(3);
    }

    @And("^edit Supplier Credit Profile$")
    public void editSupplierCreditProfile() {
        createSupplierCreditFile_step.editSupplierCreditFile();
        createSupplierCreditFile_step.toEditSupplierCreditFile();
    }

    @Then("^submit Supplier Credit Profile$")
    public void  submitSupplierCreditProfile(){
        createSupplierCreditFile_step.submitSupplierCreditProfile();
    }

    @And("^to Supplier Credit Profile Review Page$")
    public void toSupplierCreditProfileReviewPage(){

    }
}

package com.glbank.com.sg.bdd.glue.supplyChains.bingdingRelationship;

import com.glbank.com.sg.bdd.steps.supplyChains.bingdingRelationship.relationship_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class relationship_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private relationship_step relationship_step;
    public static String envTag;
    private BDDUtil bddUtil;

    @When("^I click Customers and select Customers Mapping$")
    public void iClickCustomersAndSelectCustomersMapping() {
        relationship_step.getClickCustomersMenu();
        relationship_step.clickCustomerMapping_btn();
    }


    @Then("^I should direct to the Customers Mapping page$")
    public void iShouldDirectToTheCustomersMappingPage() {
        relationship_step.CustomerMappingPage();
    }

    @When("^I click Search company box on the Customers Mapping page$")
    public void iClickSearchCompanyBoxOnTheCustomersMappingPage() {
        relationship_step.clickSearchCompanyBox();
    }

    @And("^I input \"([^\"]*)\" in the Search company box$")
    public void iInputInTheSearchCompanyBox(String value){
        relationship_step.getSearchCompanyInput("b1");
    }

    @When("^I click Edit button on the page$")
    public void iClickEditButtonOnThePage() {
        relationship_step.contentList();
    }

    @Then("^I should direct to the create new counterparty page$")
    public void iShouldDirectToTheCreateNewCounterpartyPage() {
        relationship_step.createNewCounterPage();
    }

    @When("^I click delete on the Downstream Company page$")
    public void iClickDeleteOnTheDownstreamCompanyPage() {
        relationship_step.deleteCompany();
    }

    @When("^I click Create New Counter button on the page$")
    public void iClickCreateNewCounterButtonOnThePage() {
        relationship_step.clickCreateNewCounterButton();
    }

    @Then("^I should see Counter Windows$")
    public void iShouldSeeCounterWindows() {
        relationship_step.counterWindows();
    }

    @When("^I click Email in the Counter Name box$")
    public void iInputInTheCounterNameBox() {
//       relationship_step.inputCounterNameBox("s4@qq.com");
        relationship_step.inputCounterNameBox();
    }

    @When("^I click Downstream Company Button on the Counter Name box$")
    public void iClickDownstreamCompanyButtonOnTheCounterNameBox() {
        relationship_step.clickDownstreamCompanyButton();
    }

    @And("^I click Confirm Button on the Counter Name box$")
    public void iClickConfirmButtonOnTheCounterNameBox() {
        relationship_step.clickConfirmButton();
    }

    @When("^I click Counter Name BOX on the Counter Windows page$")
    public void iClickCounterNameBOXOnTheCounterWindowsPage() {
        relationship_step.clickCounterNameBox();
    }

    @When("^I click Edit Supplier button on the page$")
    public void iClickEditSupplierButtonOnThePage() {
        relationship_step.supplierList();
    }

    @When("^I click delete on the Downstream Company Supplier page$")
    public void iClickDeleteOnTheDownstreamCompanySupplierPage() {
        relationship_step.deleteCompanyOnSupplier();
    }

    @When("^I click the Create New Supplier Relationship button and Create a New Relationship$")
    public void iClickTheCreateNewSupplierRelationshipButtonAndCreateANewRelationship() {
        relationship_step.createNewSupplierRelationShip();
    }

    @And("^I should bind a buyer information in his downstream$")
    public void iShouldBindABuyerInformationInHisDownstream() {
        relationship_step.insertBuyerInformation();
    }

    @When("^I click the Create New Buyer Relationship button and Create a New Relationship$")
    public void iClickTheCreateNewBuyerRelationshipButtonAndCreateANewRelationship() {
        relationship_step.createNewBuyerRelationShip();
    }

    @And("^I should bind a Supplier information in his upstream$")
    public void iShouldBindASupplierInformationInHisUpstream() {
        relationship_step.insertSupplierInformation();
    }
}

package com.glbank.com.sg.bdd.glue.supplyChains.financingRequest;

import com.glbank.com.sg.bdd.steps.supplyChains.financingRequest.financingRequest_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class financingRequest_glue {

    @Steps
    private financingRequest_step financingRequest_step;
    private BDDUtil bddUtil;

    public static String envTag;
    public static String email = FileUtils.LastReadFileInput3("emailData"),password = "P@ssw0rd_123",code = "1234",companyId = "1";
    public static String companyName = FileUtils.LastReadFileInput3("companyData");

    @Given("^login \"([^\"]*)\" To RequestFinancing$")
    public void loginGLDBToRequestFinancing(String envName){
        envTag = envName;
        financingRequest_step.openGLDBLoginPage(envName);
        financingRequest_step.enterLoginDateToBox(email,password,companyId,code);
    }

    @When("^login successfully and click RequestFinancing$")
    public void loginSuccessfullyAndClickRequestFinancing(){
        financingRequest_step.clickRequestFinancing();
    }

    @Then("^upload RequestFinancing File$")
    public void uploadRequestFinancingFile(){
        financingRequest_step.uploadRequestFinancing();
    }

    @Then("^click Operations to Review$")
    public void clickOperationsToL1Review(){
        financingRequest_step.clickOperationsToL1Review(companyName);
    }

    @Then("^Financing application for approval$")
    public void financingApplicationForApproval() throws Exception{
        financingRequest_step.health_checkApproval();
    }

    @Then("^Financing application for approval Return$")
    public void financingApplicationForApprovalReturn() throws Exception{
        financingRequest_step.health_checkApprovalReturn();
    }

    @And("^click Financing Status$")
    public void clickFinancingStatus(){
        financingRequest_step.clickFinancingStatus();
        bddUtil.sleep(10);
    }

    @When("^I click more button$")
    public void iClickMoreButton() {
        financingRequest_step.clickMoreBtn();
    }

    @When("^I should see Quota occupancy$")
    public void iShouldSeeQuotaOccupancy() {
        financingRequest_step.seeQuotaOccupancy(companyName);
    }

    @Then("^upload RequestFinancing File in health check$")
    public void uploadRequestFinancingFileInHealthCheck() {
        financingRequest_step.uploadRequestFinancingHealthCheck();
    }


}

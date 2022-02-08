package com.hsbc.cmb.hk.dbb.glue.supplyChains.financingRequest;

import com.hsbc.cmb.hk.dbb.steps.supplyChains.financingRequest.financingRequest_step;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.hsbc.cmb.hk.dbb.steps.supplyChains.financingRequest.financingRequest_step;

public class financingRequest_glue {

    @Steps
    private financingRequest_step financingRequest_step;

    public static String envTag;
    public static String email = "7SA7B1ok@MailTemp.top",password = "Gl123456-",code = "1234",companyId = "1";

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
}

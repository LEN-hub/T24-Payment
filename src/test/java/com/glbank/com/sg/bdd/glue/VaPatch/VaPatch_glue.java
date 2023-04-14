package com.glbank.com.sg.bdd.glue.VaPatch;

import com.glbank.com.sg.bdd.steps.VaPatch.VaPatch_step;
import com.glbank.com.sg.bdd.steps.supplyChains.bingdingRelationship.relationship_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class VaPatch_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private VaPatch_step vaPatch_step;
    public static String envTag;
    private BDDUtil bddUtil;


    @When("^enter the CNP$")
    public void enterTheCNP() throws Exception{
        vaPatch_step.clickCNPSystem();
    }

    @When("^enter the CPS$")
    public void enterTheCPS() throws Exception{
        vaPatch_step.clickCPSSystem();
    }

    @When("^enter the DFT$")
    public void enterTheDFT() throws Exception{
        vaPatch_step.clickDFTSystem();
    }

    @When("^enter the EBK$")
    public void enterTheEBK() throws Exception {
        vaPatch_step.clickEBKSystem();
    }

    @When("^enter the ESC$")
    public void enterTheESC() throws Exception{
        vaPatch_step.clickESCSystem();
    }

    @When("^enter the EST$")
    public void enterTheEST() throws Exception {
        vaPatch_step.clickESTSystem();
    }

    @When("^enter the IMS$")
    public void enterTheIMS() throws Exception {
        vaPatch_step.clickIMSSystem();
    }

    @When("^enter the SCF$")
    public void enterTheSCF() throws Exception {
        vaPatch_step.clickSCFSystem();
    }

    @When("^enter the SCF-JOB$")
    public void enterTheSCFJOB() throws Exception {
        vaPatch_step.clickSCF_JOBSystem();
    }

    @When("^enter the SmartBI$")
    public void enterTheSmartBI()throws Exception {
        vaPatch_step.clickSmartBISystem();
    }

    @When("^check ISO$")
    public void checkISO()throws Exception {
        vaPatch_step.checkISO();
    }

    @When("^logout ISO$")
    public void logoutISO()throws Exception {
        vaPatch_step.checkISOLogOUT();
    }

//    进入AllFile页面
    @When("^Enter the AllFiles Page$")
    public void enterTheAllFilesPage() {
        vaPatch_step.enterAllFilesPage();
    }

    @Then("^check AllFiles Data$")
    public void checkAllFilesData() throws Exception{
        vaPatch_step.CheckESCSystem();
    }

    @Then("^check To Be Signed Page$")
    public void checkToBeSignedPage() throws Exception {
        vaPatch_step.CheckESC_ToBeSigned();
    }

    @Then("^check the Signing In Progress Page$")
    public void checkTheSigningInProgressPage() throws Exception {
        vaPatch_step.CheckESC_SigningInProgress();
    }

    @Then("^check the Signing Completed Page$")
    public void checkTheSigningCompletedPage() throws Exception {
        vaPatch_step.CheckESC_SigningCompleted();
    }

    @Then("^check the Signing Failed Page$")
    public void checkTheSigningFailedPage() throws Exception {
        vaPatch_step.CheckESC_SigningFailed();
    }

    @Then("^check the Template Management Page$")
    public void checkTheTemplateManagementPage() throws Exception {
        vaPatch_step.CheckESC_TemplateManagement();
    }

    @Then("^check see button$")
    public void checkSeeButton() throws Exception {
        vaPatch_step.CheckESC_AllFilesSeeBtn();
    }

    @Then("^check Download button$")
    public void checkDownloadButton() throws Exception {
        vaPatch_step.CheckESC_AllFilesDownloadBtn();
    }

    @Then("^check Search button$")
    public void checkSearchButton() throws Exception {
        vaPatch_step.CheckESC_AllFilesSearchBtn();
    }

    @Then("^check Reset button$")
    public void checkResetButton() throws Exception {
        vaPatch_step.CheckESC_AllFilesResetBtn();
    }

    @Then("^check batch Download button$")
    public void checkBatchDownloadButton() throws Exception {
        vaPatch_step.CheckESC_AllFilesBatchDownloadBtn();
    }

    @Then("^check see button the To Be Sign Page$")
    public void checkSeeButtonTheToBeSignPage() throws Exception {
        vaPatch_step.CheckESC_ToBeSignedSeeBtn();
    }

    @Then("^check Download button the To Be Sign Page$")
    public void checkDownloadButtonTheToBeSignPage() throws Exception {
        vaPatch_step.CheckESC_ToBeSignedDownloadBtn();
    }

    @Then("^check Search button the To Be Sign Page$")
    public void checkSearchButtonTheToBeSignPage() throws Exception {
        vaPatch_step.CheckESC_ToBeSignSearchBtn();
    }

    @Then("^check Reset button the To Be Sign Page$")
    public void checkResetButtonTheToBeSignPage() throws Exception {
        vaPatch_step.CheckESC_ToBeSignResetBtn();
    }

    @Then("^check batch Download button the To Be Sign Page$")
    public void checkBatchDownloadButtonTheToBeSignPage() throws Exception {
        vaPatch_step.CheckESC_ToBeSignBatchDownloadBtn();
    }

    @Then("^check see button the Signing In Progress Page$")
    public void checkSeeButtonTheSigningInProgressPage() throws Exception {
        vaPatch_step.CheckESC_SigningInProgressSeeBtn();
    }

    @Then("^check Download button the Signing In Progress Page$")
    public void checkDownloadButtonTheSigningInProgressPage() throws Exception {
        vaPatch_step.CheckESC_SigningInProgressDownloadBtn();
    }

    @Then("^check Search button the Signing In Progress Page$")
    public void checkSearchButtonTheSigningInProgressPage() throws Exception {
        vaPatch_step.CheckESC_SigningInProgressSearchBtn();
    }

    @Then("^check Reset button the Signing In Progress Page$")
    public void checkResetButtonTheSigningInProgressPage() throws Exception {
        vaPatch_step.CheckESC_SigningInProgressResetBtn();
    }

    @Then("^check batch Download button the Signing In Progress Page$")
    public void checkBatchDownloadButtonTheSigningInProgressPage() throws Exception {
        vaPatch_step.CheckESC_SigningInProgressBatchDownloadBtn();
    }
}

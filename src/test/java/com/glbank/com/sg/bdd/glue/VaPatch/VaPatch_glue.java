package com.glbank.com.sg.bdd.glue.VaPatch;

import com.glbank.com.sg.bdd.steps.VaPatch.VaPatch_step;
import com.glbank.com.sg.bdd.steps.supplyChains.bingdingRelationship.relationship_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.java.en.Given;
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
}

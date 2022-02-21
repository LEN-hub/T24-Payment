package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.loanApplication_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class loanApplication_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private loanApplication_step loanApplication_step;
    private BDDUtil bddUtil;

    @When("^I hover over the loan business$")
    public void iHoverOverTheLoanBusiness() {
        loanApplication_step.FloatingLoanButton();
    }

    @When("^I continue to fill in the information$")
    public void iContinueToFillInTheInformation(DataTable amount) {
        List<Map<String, String>> loanAmount = amount.asMaps(String.class,String.class);
        loanApplication_step.sendInformation(loanAmount.get(0).get("amount"));
    }

    @Then("^I should direct to the Loan information entry page$")
    public void iShouldDirectToTheLoanInformationEntryPage() {
        loanApplication_step.seeLoanInformationEntryTitle();
    }
}

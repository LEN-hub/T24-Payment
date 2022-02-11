package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.Logon_step;
import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.accountService_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.awt.*;
import java.net.MalformedURLException;

public class accountService_glue {

    @ManagedPages
    public Pages pages;

    @Steps
    private accountService_step accountService_step;
    private BDDUtil bddUtil;


    @When("^click the Account Details menu in the account$")
    public void clickTheAccountDetailsMenuInTheAccount() {
        accountService_step.selectAccountDetails();
        accountService_step.accountInformationQuery();
        accountService_step.detailsList();
        accountService_step.accountDetails();
    }
}

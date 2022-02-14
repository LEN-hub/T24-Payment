package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.accountService_step;
import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.paymentService_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class paymentService_glue {

    @ManagedPages
    public Pages pages;

    private BDDUtil bddUtil;
    private paymentService_step paymentService_step;

    @When("^I will exchange information to fill in$")
    public void iWillExchangeInformationToFillIn() {
        paymentService_step.transferAndRemittanceMenu();
        paymentService_step.transferMoney();
    }
}

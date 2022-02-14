package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.receiptAndPaymentService_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class receiptAndPaymentService_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private BDDUtil bddUtil;
    private receiptAndPaymentService_step receiptAndPaymentServiceStep;

    @When("^I will exchange information to fill in$")
    public void iWillExchangeInformationToFillIn() {

    }
}

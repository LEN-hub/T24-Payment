package com.glbank.com.sg.bdd.glue.enterpriseNetSilver.fixedDeposits;

import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.fixedDeposits.fixedDeposit_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class fixedDeposit_glue {

    @Steps
    private fixedDeposit_step fixedDeposit_step;
    private BDDUtil bddUtil;

    @When("^click Fixed Deposits menu$")
    public void clickFixedDepositsMenu(){
        fixedDeposit_step.clickFixedDepositsMenu();
    }

    @Then("^I fill in the information about the SGD transfer on the time deposit page$")
    public void iFillInTheInformationAboutTheSGDTransferOnTheTimeDepositPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        fixedDeposit_step.createFixedDeposit(payToInfo.get(0).get("Transfer accounts"),payToInfo.get(0).get("Into account"),payToInfo.get(0).get("Amount"),payToInfo.get(0).get("Period"),payToInfo.get(0).get("Transfer accounts way"));
    }

    @Then("^I fill in the information about the USD transfer on the time deposit page$")
    public void iFillInTheInformationAboutTheUSDTransferOnTheTimeDepositPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        fixedDeposit_step.createFixedDeposit(payToInfo.get(0).get("Transfer accounts"),payToInfo.get(0).get("Into account"),payToInfo.get(0).get("Amount"),payToInfo.get(0).get("Period"),payToInfo.get(0).get("Transfer accounts way"));
    }

    @When("^Click My Task to find data for authorization$")
    public void clickMyTaskToFindDataForAuthorization() {
        fixedDeposit_step.fixedDepositAuthorize();
    }


    @When("^click Fixed Deposits View menu$")
    public void clickFixedDepositsViewMenu() {
        fixedDeposit_step.clickFixedDepositOverview();
    }

    @When("^The operator has an unexpired regular purchase$")
    public void theOperatorHasAnUnexpiredRegularPurchase() {
        fixedDeposit_step.theOperatorHasAnUnexpiredRegularPurchase();
    }
}

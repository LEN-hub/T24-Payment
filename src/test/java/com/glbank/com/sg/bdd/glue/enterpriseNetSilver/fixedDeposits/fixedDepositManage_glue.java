package com.glbank.com.sg.bdd.glue.enterpriseNetSilver.fixedDeposits;

import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.fixedDeposits.fixedDepositManage_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;

public class fixedDepositManage_glue {

    @Steps
    private fixedDepositManage_step fixedDepositManage_step;
    private BDDUtil bddUtil;

    @Then("^I operate on the current page data information$")
    public void ToWithdrawFD(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class, String.class);
        fixedDepositManage_step.clickToWithdrawFD(payToInfo.get(0).get("fdAccountNumber"));
        fixedDepositManage_step.clickSubmit();
        bddUtil.sleep(5);
    }

    @When("^click Fixed Deposits First menu$")
    public void clickFixedDepositsFirstMenu() {
        fixedDepositManage_step.clickFixedDepositsFirstMenu();
    }
}

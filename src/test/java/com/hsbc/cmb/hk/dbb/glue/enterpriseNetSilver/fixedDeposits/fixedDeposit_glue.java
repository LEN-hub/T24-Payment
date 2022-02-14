package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver.fixedDeposits;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.fixedDeposits.fixedDeposit_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class fixedDeposit_glue {

    @Steps
    private fixedDeposit_step fixedDeposit_step;
    private BDDUtil bddUtil;

    public static String fromAccount = "11010001590/Red Bull Dairy Co. LTD"; //付款账户
    public static String accountCurrency = "SGD"; //付款币种
    public static String placementDuration = "1"; //存期：1：对公整存整取六个月存款；2：对公整存整取九个月存款；3：对公整存整取十二个月存款；4：对公整存整取十八个月存款；
    public static String autTraSavFlag = "1"; //转存方式：1：不转存；2：本金续存；3：本息续存；

    @When("^click Fixed Deposits menu$")
    public void clickFixedDepositsMenu(){
        fixedDeposit_step.clickFixedDepositsMenu();
    }

    @Then("^To create fixedDeposit$")
    public void toCreateFixedDeposit(){
        fixedDeposit_step.createFixedDeposit(fromAccount);
        fixedDeposit_step.isDisabledMultiCurrency(accountCurrency);
        fixedDeposit_step.choicePlacementDuration(placementDuration);
        fixedDeposit_step.choiceAutTraSavFlag(autTraSavFlag);
        bddUtil.sleep(2);
        fixedDeposit_step.submitFixedDepositDate();
        bddUtil.sleep(10);
    }
    @And("View details of fixedDeposit")
    public void viewDetailsOfFixedDeposit(){
        fixedDeposit_step.clickDetails();
        fixedDeposit_step.clickFixedDepositsMenu();
    }
}

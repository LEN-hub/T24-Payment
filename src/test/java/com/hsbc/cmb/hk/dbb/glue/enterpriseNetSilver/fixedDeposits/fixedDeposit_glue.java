package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver.fixedDeposits;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.fixedDeposits.fixedDeposit_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
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

    public static String fromAccount; //付款账户
    public static String accountCurrency; //付款币种
    public static String placementDuration; //存期：1：对公整存整取六个月存款；2：对公整存整取九个月存款；3：对公整存整取十二个月存款；4：对公整存整取十八个月存款；
    public static String autTraSavFlag; //转存方式：1：不转存；2：本金续存；3：本息续存；

    @When("^click Fixed Deposits menu$")
    public void clickFixedDepositsMenu(){
        fixedDeposit_step.clickFixedDepositsMenu();
    }

    @Then("^Use \"([^\"]*)\" To create fixedDeposit About SGD SixMonth DoNotRenewOrWithdrawAutomatically$")
    public void toCreateFixedDepositAboutSGDSixMonthDoNotRenewOrWithdrawAutomatically(String envName){
        fromAccount = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fromAccount_SGD");
        accountCurrency = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountCurrency_SGD");
        placementDuration = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".placementDuration_SixMonth");
        autTraSavFlag = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".autTraSavFlag_DoNotRenewOrWithdrawAutomatically");
        fixedDeposit_step.createFixedDeposit(fromAccount);
        fixedDeposit_step.isDisabledMultiCurrency(accountCurrency);
        fixedDeposit_step.choicePlacementDuration(placementDuration);
        fixedDeposit_step.choiceAutTraSavFlag(autTraSavFlag);
        bddUtil.sleep(2);
        fixedDeposit_step.submitFixedDepositDate();
        bddUtil.sleep(10);
    }

    @Then("^Use \"([^\"]*)\" To create fixedDeposit About USD SixMonth DoNotRenewOrWithdrawAutomatically$")
    public void toCreateFixedDepositAboutUSDSixMonthDoNotRenewOrWithdrawAutomatically(String envName){
        fromAccount = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fromAccount_USD");
        accountCurrency = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountCurrency_USD");
        placementDuration = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".placementDuration_SixMonth");
        autTraSavFlag = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".autTraSavFlag_DoNotRenewOrWithdrawAutomatically");
        fixedDeposit_step.createFixedDeposit(fromAccount);
        fixedDeposit_step.isDisabledMultiCurrency(accountCurrency);
        fixedDeposit_step.choicePlacementDuration(placementDuration);
        fixedDeposit_step.choiceAutTraSavFlag(autTraSavFlag);
        bddUtil.sleep(2);
        fixedDeposit_step.submitFixedDepositDate();
        bddUtil.sleep(10);
    }

    @Then("^Use \"([^\"]*)\" To create fixedDeposit About SGD SixMonth RenewPrincipalAmountAndWithdrawInterest$")
    public void toCreateFixedDepositAboutSGDSixMonthRenewPrincipalAmountAndWithdrawInterest(String envName){
        fromAccount = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fromAccount_SGD");
        accountCurrency = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountCurrency_SGD");
        placementDuration = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".placementDuration_SixMonth");
        autTraSavFlag = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".autTraSavFlag_RenewPrincipalAmountAndWithdrawInterest");
        fixedDeposit_step.createFixedDeposit(fromAccount);
        fixedDeposit_step.isDisabledMultiCurrency(accountCurrency);
        fixedDeposit_step.choicePlacementDuration(placementDuration);
        fixedDeposit_step.choiceAutTraSavFlag(autTraSavFlag);
        bddUtil.sleep(2);
        fixedDeposit_step.submitFixedDepositDate();
        bddUtil.sleep(10);
    }

    @Then("^Use \"([^\"]*)\" To create fixedDeposit About USD SixMonth RenewPrincipalAmountAndWithdrawInterest$")
    public void toCreateFixedDepositAboutUSDSixMonthRenewPrincipalAmountAndWithdrawInterest(String envName){
        fromAccount = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fromAccount_USD");
        accountCurrency = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountCurrency_USD");
        placementDuration = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".placementDuration_SixMonth");
        autTraSavFlag = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".autTraSavFlag_RenewPrincipalAmountAndWithdrawInterest");
        fixedDeposit_step.createFixedDeposit(fromAccount);
        fixedDeposit_step.isDisabledMultiCurrency(accountCurrency);
        fixedDeposit_step.choicePlacementDuration(placementDuration);
        fixedDeposit_step.choiceAutTraSavFlag(autTraSavFlag);
        bddUtil.sleep(2);
        fixedDeposit_step.submitFixedDepositDate();
        bddUtil.sleep(10);
    }

    @Then("^Use \"([^\"]*)\" To create fixedDeposit About SGD SixMonth RenewPrincipalAmountAndInterest$")
    public void toCreateFixedDepositAboutSGDSixMonthRenewPrincipalAmountAndInterest(String envName){
        fromAccount = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fromAccount_SGD");
        accountCurrency = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountCurrency_SGD");
        placementDuration = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".placementDuration_SixMonth");
        autTraSavFlag = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".autTraSavFlag_RenewPrincipalAmountAndInterest");
        fixedDeposit_step.createFixedDeposit(fromAccount);
        fixedDeposit_step.isDisabledMultiCurrency(accountCurrency);
        fixedDeposit_step.choicePlacementDuration(placementDuration);
        fixedDeposit_step.choiceAutTraSavFlag(autTraSavFlag);
        bddUtil.sleep(2);
        fixedDeposit_step.submitFixedDepositDate();
        bddUtil.sleep(10);
    }

    @Then("^Use \"([^\"]*)\" To create fixedDeposit About USD SixMonth RenewPrincipalAmountAndInterest$")
    public void toCreateFixedDepositAboutUSDSixMonthRenewPrincipalAmountAndInterest(String envName){
        fromAccount = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fromAccount_USD");
        accountCurrency = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountCurrency_USD");
        placementDuration = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".placementDuration_SixMonth");
        autTraSavFlag = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".autTraSavFlag_RenewPrincipalAmountAndInterest");
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
        //fixedDeposit_step.clickDetails();
        fixedDeposit_step.clickFixedDepositsMenu();
    }
}

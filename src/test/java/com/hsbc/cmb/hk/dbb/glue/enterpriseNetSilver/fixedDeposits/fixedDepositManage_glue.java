package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver.fixedDeposits;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.fixedDeposits.fixedDepositManage_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class fixedDepositManage_glue {

    @Steps
    private fixedDepositManage_step fixedDepositManage_step;
    private BDDUtil bddUtil;

    public static String fdAccountNumber;

    @Then("^Use \"([^\"]*)\" To WithdrawFD About SGD SixMonth DoNotRenewOrWithdrawAutomatically$")
    public void ToWithdrawFDAboutSGDSixMonthDoNotRenewOrWithdrawAutomatically(String envName){
        fdAccountNumber = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fdAccountNumber_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically");
        fixedDepositManage_step.clickToWithdrawFD(fdAccountNumber);
        fixedDepositManage_step.clickSubmit();
        bddUtil.sleep(5);
    }

    @Then("^Use \"([^\"]*)\" To WithdrawFD About USD SixMonth DoNotRenewOrWithdrawAutomatically$")
    public void ToWithdrawFDAboutUSDSixMonthDoNotRenewOrWithdrawAutomatically(String envName){
        fdAccountNumber = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fdAccountNumber_USD_SixMonth_DoNotRenewOrWithdrawAutomatically");
        fixedDepositManage_step.clickToWithdrawFD(fdAccountNumber);
        fixedDepositManage_step.clickSubmit();
        bddUtil.sleep(5);
    }

    @Then("^Use \"([^\"]*)\" To WithdrawFD About SGD SixMonth RenewPrincipalAmountAndWithdrawInterest$")
    public void ToWithdrawFDAboutSGDSixMonthRenewPrincipalAmountAndWithdrawInterest(String envName){
        fdAccountNumber = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fdAccountNumber_USD_SixMonth_DoNotRenewOrWithdrawAutomatically");
        fixedDepositManage_step.clickToWithdrawFD(fdAccountNumber);
        fixedDepositManage_step.clickSubmit();
        bddUtil.sleep(5);
    }

    @Then("^Use \"([^\"]*)\" To WithdrawFD About USD SixMonth RenewPrincipalAmountAndWithdrawInterest$")
    public void ToWithdrawFDAboutUSDSixMonthRenewPrincipalAmountAndWithdrawInterest(String envName){
        fdAccountNumber = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fdAccountNumber_USD_SixMonth_DoNotRenewOrWithdrawAutomatically");
        fixedDepositManage_step.clickToWithdrawFD(fdAccountNumber);
        fixedDepositManage_step.clickSubmit();
        bddUtil.sleep(5);
    }

    @Then("^Use \"([^\"]*)\" To WithdrawFD About SGD SixMonth RenewPrincipalAmountAndInterest$")
    public void ToWithdrawFDAboutSGDSixMonthRenewPrincipalAmountAndInterest(String envName){
        fdAccountNumber = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fdAccountNumber_USD_SixMonth_DoNotRenewOrWithdrawAutomatically");
        fixedDepositManage_step.clickToWithdrawFD(fdAccountNumber);
        fixedDepositManage_step.clickSubmit();
        bddUtil.sleep(5);
    }

    @Then("^Use \"([^\"]*)\" To WithdrawFD About USD SixMonth RenewPrincipalAmountAndInterest$")
    public void ToWithdrawFDAboutUSDSixMonthRenewPrincipalAmountAndInterest(String envName){
        fdAccountNumber = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".fdAccountNumber_USD_SixMonth_DoNotRenewOrWithdrawAutomatically");
        fixedDepositManage_step.clickToWithdrawFD(fdAccountNumber);
        fixedDepositManage_step.clickSubmit();
        bddUtil.sleep(5);
    }
}

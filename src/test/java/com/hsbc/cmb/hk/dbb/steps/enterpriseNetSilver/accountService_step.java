package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.accountService_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

public class accountService_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private accountService_page accountService_page;

    public void selectAccountDetails(){
        Actions action=new Actions(getDriver());
        action.moveToElement(accountService_page.accountList).perform();
    }

    public void accountInformationQuery(){
        accountService_page.accountInformationQuery.click();
    }

    public void accountDetailsQuery(){
        accountService_page.accountDetailsQuery.click();
    }

    @Step
    public void payerAccount(){
        accountService_page.payerAccount.click();
    }

    @Step
    public void getAccountList(){
        accountService_page.AccountList.isVisible();
    }

    @Step
    public void detailsList(){
        Actions action=new Actions(getDriver());
        action.moveToElement(accountService_page.detailsList).perform();
    }

    @Step
    public void accountDetails(){
        accountService_page.accountDetails.click();
    }
}

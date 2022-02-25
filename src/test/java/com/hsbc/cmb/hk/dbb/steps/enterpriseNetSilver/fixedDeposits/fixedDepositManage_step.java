package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.fixedDeposits;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.fixedDeposits.fixedDepositManage_page;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class fixedDepositManage_step extends ScenarioSteps {

    private fixedDepositManage_page fixedDepositManage_page;

    public void clickToWithdrawFD(String fdAccountNumber){
        List<WebElementFacade> fdAccountNumberList = fixedDepositManage_page.fdAccountNumberList;
        List<WebElementFacade> moreMenuList = fixedDepositManage_page.moreMenuList;
        String withdrawFD = "Withdraw FD";
        for(int i = 0;i < fdAccountNumberList.size();i++)
            if(fdAccountNumber.equals(fdAccountNumberList.get(i).getText())) {
                Actions action=new Actions(getDriver());
                action.moveToElement(moreMenuList.get(i)).perform();
                if (fixedDepositManage_page.clickWithdrawFD.getText().equals(withdrawFD)) {
                    JavascriptExecutor webdriver = (JavascriptExecutor) getDriver();
                    webdriver.executeScript("arguments[0].click();", fixedDepositManage_page.clickWithdrawFD);
                    break;
                }
                else {
                    JavascriptExecutor webdriver = (JavascriptExecutor) getDriver();
                    webdriver.executeScript("arguments[0].click();", fixedDepositManage_page.clickWithdrawFDCN);
                    break;
                }
            }
            else if (i==9){
                fixedDepositManage_page.clickNext.click();
                i=0;
            }
    }

    public void clickSubmit(){
        fixedDepositManage_page.clickSubmit.click();
    }
}

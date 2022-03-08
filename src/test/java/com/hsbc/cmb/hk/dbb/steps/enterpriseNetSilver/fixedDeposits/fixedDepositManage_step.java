package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.fixedDeposits;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.fixedDeposits.fixedDepositManage_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class fixedDepositManage_step extends ScenarioSteps {

    private fixedDepositManage_page fixedDepositManage_page;
    private BDDUtil bddUtil;

    public void clickToWithdrawFD(String fdAccountNumber){
        fixedDepositManage_page.click11.click();
        List<WebElementFacade> fdAccountNumberList = fixedDepositManage_page.fdAccountNumberList;
        List<WebElementFacade> moreMenuList = fixedDepositManage_page.moreMenuList;
        for(int i = 0;i < fdAccountNumberList.size();i++) {
            if (fdAccountNumber.equals(fdAccountNumberList.get(i).getText())) {
                bddUtil.sleep(1);
                Actions action = new Actions(getDriver());
                action.moveToElement(moreMenuList.get(i)).perform();
                bddUtil.sleep(2);
                fixedDepositManage_page.clickWithdrawFD.click();
                break;
            } else if (i == 9) {
                fixedDepositManage_page.clickNext.click();
                i = 0;
            }
        }
    }

    public void clickSubmit(){
        bddUtil.sleep(5);
        fixedDepositManage_page.clickSubmit.click();
    }
}

package com.glbank.com.sg.bdd.steps.enterpriseNetSilver.fixedDeposits;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.fixedDeposits.fixedDepositManage_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class fixedDepositManage_step extends ScenarioSteps {

    private fixedDepositManage_page fixedDepositManage_page;
    private BDDUtil bddUtil;

    public void clickFixedDepositsFirstMenu(){
        Actions action=new Actions(getDriver());
        action.moveToElement( fixedDepositManage_page.clickFixedDeposit).perform();
        fixedDepositManage_page.selectFirstMenu.click();
    }

    public void clickToWithdrawFDAndClickSubmitBtn(){
        fixedDepositManage_page.click11.click();
        List<WebElementFacade> fdAccountNumberList = fixedDepositManage_page.fdAccountNumberList;
        List<WebElementFacade> moreMenuList = fixedDepositManage_page.moreMenuList;
//        for(int i = 0;i < fdAccountNumberList.size();i++) {
//            if (fdAccountNumberList.size() != 0) {
        while (fdAccountNumberList.size() != 0){
                bddUtil.sleep(1);
                Actions action = new Actions(getDriver());
                action.moveToElement(moreMenuList.get(0)).perform();
                bddUtil.sleep(2);
                fixedDepositManage_page.clickWithdrawFD.click();
                fixedDepositManage_page.clickSubmit.click();
                bddUtil.sleep(8);
                fixedDepositManage_page.clickReturnBtn.click();
        }
    }

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

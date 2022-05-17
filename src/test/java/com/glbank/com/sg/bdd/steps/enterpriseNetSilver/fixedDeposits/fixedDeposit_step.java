package com.glbank.com.sg.bdd.steps.enterpriseNetSilver.fixedDeposits;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.fixedDeposits.fixedDeposit_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class fixedDeposit_step extends ScenarioSteps {

    private fixedDeposit_page fixedDeposit_page;
    private BDDUtil bddUtil;

    public void clickFixedDepositsMenu(){
        if(fixedDeposit_page.checkPopup.isVisible()){
            fixedDeposit_page.clickOk.click();
        }
        Actions action=new Actions(getDriver());
        action.moveToElement( fixedDeposit_page.clickFixedDeposit).perform();
        fixedDeposit_page.selectSecondMenu.click();
    }

    public void createFixedDeposit(String transferAccount,String intoAccount,String amount,String period,String transferAccountsWay){
        fixedDeposit_page.clickPopwindows.click();
        List<WebElementFacade> selectTransferAccount = fixedDeposit_page.selectAccountValue;
        for (int i = 0; i <= selectTransferAccount.size();i++){
            if (transferAccount.equals(selectTransferAccount.get(i).getText().substring(0,13))){
                selectTransferAccount.get(i).click();
                break;
            }
        }
        fixedDeposit_page.intoAccountPopwindows.click();
        List<WebElementFacade> selectIntoAccount = fixedDeposit_page.selectAccountValue;
        for (int j = 0; j <= selectIntoAccount.size();j++){
            if (intoAccount.equals(selectIntoAccount.get(j).getText().substring(0,11))){
                selectIntoAccount.get(j).click();
                break;
            }
        }
        fixedDeposit_page.getPlacementAmount.clear();
        fixedDeposit_page.getPlacementAmount.sendKeys(amount);
        bddUtil.sleep(2);
        fixedDeposit_page.periodDate.click();
        List<WebElementFacade> periodValue = fixedDeposit_page.selectAccountValue;
        for (int k = 0; k <= periodValue.size();k++){
            if (period.equals(periodValue.get(k).getText())){
                periodValue.get(k).click();
                break;
            }
        }
        fixedDeposit_page.find(By.xpath("//label[@for=\"autTraSavFlag\"]/following-sibling::div//label["+transferAccountsWay+"]//span[@class='el-radio__inner']")).click();
        fixedDeposit_page.clickNext.click();
        bddUtil.sleep(2);
        if (fixedDeposit_page.clickCheck.isVisible()){
            fixedDeposit_page.clickCheck.click();
        }
        fixedDeposit_page.clickSubmit.click();
    }
}

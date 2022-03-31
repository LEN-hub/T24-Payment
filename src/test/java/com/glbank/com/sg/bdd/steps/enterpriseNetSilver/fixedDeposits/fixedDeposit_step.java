package com.glbank.com.sg.bdd.steps.enterpriseNetSilver.fixedDeposits;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.fixedDeposits.fixedDeposit_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

public class fixedDeposit_step extends ScenarioSteps {

    private fixedDeposit_page fixedDeposit_page;
    private BDDUtil bddUtil;

    public void clickFixedDepositsMenu(){
//        if(fixedDeposit_page.checkPopup.isVisible()){
//            fixedDeposit_page.clickOk.click();
//        }
        fixedDeposit_page.clickFixedDeposit.click();
    }

    public void createFixedDeposit(String fromAccount){
        fixedDeposit_page.clickPlaceFixedDeposit.click();
        fixedDeposit_page.clickFromAccount.click();
        bddUtil.scrollWindowToElement(fixedDeposit_page.find(By.xpath("//div[@class=\"el-select-dropdown el-popper selectClass\"]//span[text()='"+ fromAccount +"']"))).click();
    }
    public void isDisabledMultiCurrency(String accountCurrency){
        //判断是否多币种账户
        if (fixedDeposit_page.clickAccountCurrency.isVisible()){
            System.out.println("为多币种账户，选择币种");
            fixedDeposit_page.clickAccountCurrency.click();
            bddUtil.scrollWindowToElement(fixedDeposit_page.find(By.xpath("//div[@class=\"el-scrollbar\"]//div/ul/li/span[text()='"+ accountCurrency +"']"))).click();
        }
        fixedDeposit_page.getPlacementAmount.sendKeys("250000");
    }
    public void choicePlacementDuration(String placementDuration){
        fixedDeposit_page.clickPlacementDuration.click();
        bddUtil.scrollWindowToElement(fixedDeposit_page.find(By.xpath("//iframe/following-sibling::div[@class=\"el-select-dropdown el-popper\"]//li["+ placementDuration +"]"))).click();
    }

    public void choiceAutTraSavFlag(String autTraSavFlag){
        bddUtil.scrollWindowToElement(fixedDeposit_page.find(By.xpath("//label[@for=\"autTraSavFlag\"]/following-sibling::div//label["+ autTraSavFlag +"]//span[@class=\"el-radio__inner\"]"))).click();
    }

    public void submitFixedDepositDate(){
        fixedDeposit_page.clickNext.click();
        fixedDeposit_page.clickCheck.click();
        fixedDeposit_page.clickSubmit.click();
    }
    public void clickDetails(){
        fixedDeposit_page.clickDetails.click();
    }
}

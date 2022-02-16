package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.paymentService_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.JRandomNameTool;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class paymentService_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private paymentService_page paymentService_page;

    @Step
    public void transferAndRemittanceMenu(){
        if (paymentService_page.popWindowsTitle.isVisible()){
            paymentService_page.popWindowsOk.click();
        }
        Actions action=new Actions(getDriver());
        action.moveToElement(paymentService_page.transferAndRemittanceMenu).perform();
    }

    @Step
    public void transferMoney(){
        paymentService_page.transferMoney.click();
        String text = paymentService_page.rollOutCurrency.getText();
        System.out.println(text);
        paymentService_page.rollOutCurrencySelectWindows.click();
    }
}
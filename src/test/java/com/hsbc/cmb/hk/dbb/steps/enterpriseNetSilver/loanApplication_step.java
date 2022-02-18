package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.loanApplication_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

import static com.hsbc.cmb.hk.dbb.utils.AssertLocal.assertEquals;

public class loanApplication_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private loanApplication_page loanApplication_page;

    //鼠标悬浮在贷款业务上。
    public void FloatingLoanButton(){
//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(loanApplication_page.loan).perform();
        loanApplication_page.loan.click();
        loanApplication_page.loanApplicationBtn.click();
        bddUtil.sleep(1);
    }

    //在输入信息页面，输入相对应的信息。
    public void sendInformation(){
        loanApplication_page.microDemandOverdraft.click();
        bddUtil.scrollWindowToElement(loanApplication_page.inputLoanAmount).sendKeys("10000");
        bddUtil.scrollWindowToElement(loanApplication_page.submitBtn).click();
        bddUtil.sleep(2);
    }

    public void seeLoanInformationEntryTitle(){
        assertEquals("贷款信息录入",loanApplication_page.LoanInformationEntry.getText());
    }
}

package com.hsbc.cmb.hk.dbb.steps.BundledPayments;

import com.hsbc.cmb.hk.dbb.pages.BundledPayments.payments_page;
import com.hsbc.cmb.hk.dbb.pages.ProductSettings.product_page;
import com.hsbc.cmb.hk.dbb.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static com.hsbc.cmb.hk.dbb.utils.FileUtils.FileInput3;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class payments_steps extends ScenarioSteps {
    private BDDUtil bddUtil;
    private payments_page paymentsPage;

    public static String content = JRandomNameTool.getStringRandom(6);

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        paymentsPage.openUrl(logonUrl);
    }

    @Step
    public void clickOperations() {paymentsPage.operationsList.click();}

    @Step
    public void clickRequestDisbursement() {paymentsPage.requestDisbursement.click();}

    @Step
    public void clickEditGroup() {paymentsPage.editGroup.click();}

    @Step
    public void clickConfirm() {paymentsPage.Confirm.click();}

   @Step     //通过买家/供应商筛选值,点击刷新
   public void clickBuyers() {
        paymentsPage.buyerS.sendKeys(FileUtils.LastReadFileInput3("buyer"));
        paymentsPage.Reset.click();
    }

    @Step
    public void clickAssignToMe() {paymentsPage.assignToMe.click();}

//点击分配给我
    @Step
    public void clickAssignToMeS() {paymentsPage.AssignToMeS.click();}


    //    @Step
//    public void clickBuyers() { paymentsPage.buyerS.click();} //通过买家筛选值

    @Step
    public void clickProceed() {paymentsPage.Proceed.click();}

    @Step
    public void clickRemittanceFeePaidBy() {
        paymentsPage.remittanceFeePaidby.click();
        paymentsPage.SHA.click();
    }

    @Step
    public void clickSupplierBank(){
        paymentsPage.SupplierBank.click();
        paymentsPage.GLDB.click();
    }

    @Step
    public void clickAccountNo(){
        paymentsPage.AccountNo.click();
        paymentsPage.NUMBER.click();

    }
    @Step
    public void clickSubmit(){paymentsPage.Submit.click();}

    //第二个
    @Step
    public void clickReviewDisbursement(){paymentsPage.ReviewDisbursement.click();}

    //通过买家筛选值

    @Step
    public void clickPROCEEDS(){paymentsPage.PROCEEDS.click();}

    @Step
    public void clickAPPROVE(){paymentsPage.APPROVE.click();}

//第三个
    @Step
    public void clickConfirmDisbursement(){paymentsPage.ConfirmDisbursement.click();}

    //通过买家筛选值


}
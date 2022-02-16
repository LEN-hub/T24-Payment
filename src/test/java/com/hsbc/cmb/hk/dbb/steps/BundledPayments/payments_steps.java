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
    public void clickEditGroup() {
        paymentsPage.editGroup.click();
        bddUtil.sleep(5);}

    @Step
    public void clickConfirm() {
        paymentsPage.Confirm.click();
        bddUtil.sleep(5);}

   @Step     //通过买家/供应商筛选值,点击刷新
   public void clickRequesterOne() {
        paymentsPage.RequesterOne.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        bddUtil.sleep(3);
        paymentsPage.Reset.click();
    }

    @Step
    public void clickAssignToMe() {paymentsPage.assignToMe.click();}

//点击分配给我
    @Step
    public void clickAssignToMeS() {paymentsPage.AssignToMeS.click();}


    @Step     //通过买家/供应商筛选值,点击刷新
    public void clickRequesterTwo() {
        paymentsPage.RequesterTwo.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
    }

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

    @Step     //通过买家/供应商筛选值,点击刷新
    public void clickRequester3() {
        paymentsPage.Requester3.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
    }

    @Step
    public void clickPROCEEDS(){paymentsPage.PROCEEDS.click();}

    @Step
    public void clickAPPROVE(){paymentsPage.APPROVE.click();}

//第三个
    @Step
    public void clickConfirmDisbursement(){paymentsPage.ConfirmDisbursement.click();}

    //通过买家筛选值
<<<<<<< HEAD

    @Step
    public void clickBatchRepaymentBtn(){
        paymentsPage.batchRepaymentBtn.click();
    }

    @Step
    public void onTheBatchRepaymentPage(){
        assertEquals("Repayment Management",paymentsPage.repaymentTitle.getText());
        bddUtil.sleep(2);
    }

    @Step
    public void clickDataAssignToMe(){
        List<WebElementFacade> requester = paymentsPage.requesterList;
        List<WebElementFacade> Action = paymentsPage.assignToMeList;
        for (int i = 0; i <requester.size() ; i++) {
            if (FileUtils.LastReadFileInput3("companyData").equals(requester.get(i).getText())){
                bddUtil.scrollWindowToElement(requester.get(i)).click();
                Action.get(i).click();
                break;
            }
        }
        bddUtil.sleep(2);
    }

    @Step
    public void clickProceedBtn(){
        List<WebElementFacade> request = paymentsPage.RequestList;
        List<WebElementFacade> proceed = paymentsPage.proceedList;
        for (int i = 0; i <request.size() ; i++) {
            if (FileUtils.LastReadFileInput3("compayn").equals(request.get(i).getText())){
                bddUtil.scrollWindowToElement(request.get(i)).click();
                proceed.get(i).click();
                break;
            }
        }
    }

    @Step
    public void seeRepaymentDetail(){
        assertEquals("Repayment Detail",paymentsPage.repaymentDetail.getText());
        bddUtil.sleep(1);
    }

    @Step
    public void selectAccount(){
        paymentsPage.selectLabel.click();
        bddUtil.sleep(1);
        paymentsPage.accountLabel.click();
    }

    @Step
    public void inputOtherParameter(){
        paymentsPage.repaymentAmount.sendKeys("10");
        bddUtil.sleep(1);
        paymentsPage.commission.click();
        paymentsPage.repaymentData.sendKeys(bddUtil.dateFormate());
        paymentsPage.commission.click();
        paymentsPage.submitBtn.click();

=======
    @Step     //通过买家/供应商筛选值,点击刷新
    public void clickRequester4() {
        paymentsPage.Requester4.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
>>>>>>> 8db4dfed7795dd83dabc0f964abcb3c6be55a39f
    }

}
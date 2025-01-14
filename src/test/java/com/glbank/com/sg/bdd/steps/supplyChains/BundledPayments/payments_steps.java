package com.glbank.com.sg.bdd.steps.supplyChains.BundledPayments;

import com.glbank.com.sg.bdd.pages.supplyChains.BundledPayments.payments_page;
import com.glbank.com.sg.bdd.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

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
    public void clickOperations() {
        bddUtil.sleep(5);
        paymentsPage.operationsList.click();
    }

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

   @Step
   public void clickRequesterOne() {
        paymentsPage.RequesterOne.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        bddUtil.sleep(3);
        paymentsPage.Reset.click();
        bddUtil.sleep(3);
    }

    @Step
    public void clickAssignToMe() {paymentsPage.assignToMe.click();}

    @Step
    public void clickAssignToMeS() {
        paymentsPage.AssignToMeS.click();
    }

    @Step
    public void parClickAssignToMeS() {
        paymentsPage.AssignToMeS.click();
    }

    @Step
    public void clickAssToMe(){
        paymentsPage.repaymentRequest.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        bddUtil.sleep(3);
        paymentsPage.Reset.click();
        bddUtil.sleep(3);
        paymentsPage.assignToMeList.get(1).click();
        bddUtil.sleep(1);
    }

    @Step
    public void clickAssToMeParPay(){
        paymentsPage.parRepaymentRequest.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        bddUtil.sleep(3);
        paymentsPage.Reset.click();
        bddUtil.sleep(3);
        paymentsPage.parAssignToMeList.get(0).click();
        bddUtil.sleep(1);
    }

    @Step
    public void clickRequesterTwo() {
        paymentsPage.RequesterTwo.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
        CommonUtil.waiting(3000);}

    @Step
    public void clickProceed() {
        paymentsPage.proceedNew.click();
        bddUtil.sleep(3);
    }

    @Step
    public void clickProceed2() {
        paymentsPage.proceedNew1.click();
        bddUtil.sleep(3);
    }

    @Step
    public void clickRemittanceFeePaidBy() {
        bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//label[@for='sellerName']")));
        paymentsPage.remittanceFeePaidby.click();
        paymentsPage.SHA.click();
        CommonUtil.waiting(4000);}

    @Step
    public void clickSupplierBank(){
        paymentsPage.SupplierBank.click();
        CommonUtil.waiting(3000);
        paymentsPage.GLDB.click();
        CommonUtil.waiting(3000);}

    @Step
    public void clickAccountNo(){
        paymentsPage.AccountNo.click();
        CommonUtil.waiting(3000);
        paymentsPage.NUMBER.click();
        CommonUtil.waiting(3000);}

    @Step
    public void clickSubmit(){paymentsPage.Submit.click();}

    @Step
    public void complete(){
        paymentsPage.complete.click();
    }

    @Step
    public void requesterValidation(){
        paymentsPage.Requester1.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
        CommonUtil.waiting(3000);
//        assertEquals("Approve", paymentsPage.find(By.xpath("//td[@data-key='f109ru23']")).getText());
    }

    //第二个
    @Step
    public void clickReviewDisbursement(){paymentsPage.ReviewDisbursement.click();}

    @Step
    public void clickRequester3() {
        paymentsPage.Requester3.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();}

    @Step
    public void assignToMe2(){paymentsPage.assignToMe2.click();}

    @Step
    public void Requester5(){
        paymentsPage.Requester5.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
        bddUtil.sleep(2);
    }

    @Step
    public void clickAPPROVE(){
        // 把放款金额存到TXT文本
        String  LoanDisbursementAmount = bddUtil.scrollWindowToElement(getDriver().findElement(By.xpath("//div[@data-key='f0jf04hv']/div//input"))).getAttribute("value");
        FileUtils.FileString4("LoanAmount",LoanDisbursementAmount);
        paymentsPage.APPROVE.click();
    }

    @Step
    public void validation() {
        paymentsPage.Requester6.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
        CommonUtil.waiting(3000);
//        assertEquals("Approve", paymentsPage.find(By.xpath("//td[@data-key='f1b59fkq']")).getText());
        }
//第三个
    @Step
    public void clickConfirmDisbursement(){paymentsPage.ConfirmDisbursement.click();}

    @Step
    public void verifySuccess(){
        bddUtil.sleep(2);
        paymentsPage.completed.click();
        bddUtil.sleep(1);
        paymentsPage.Requester12.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
        CommonUtil.waiting(3000);
//        assertEquals("   No Data", paymentsPage.find(By.xpath("//div[@class='tableNorecord']")).getText());


}
    @Step
    public void clickBatchRepaymentBtn(){
        paymentsPage.batchRepaymentBtn.click();
    }

    @Step
    public void clickparRepayMent(){
        paymentsPage.parRepayMent.click();
    }

    @Step
    public void onTheBatchRepaymentPage(){
        assertEquals("Repayment Management",paymentsPage.repaymentTitle.getText());
        bddUtil.sleep(2);
    }

    @Step
    public void onTheParRePayMentPage(){
        assertEquals("Partial Repayment Management",getDriver().findElement(By.xpath("//div[@data-key='f0qi979f']//span[text()='Partial Repayment Management']")).getText());
        bddUtil.sleep(2);
    }

    @Step
    public void clickDataAssignToMe(){
        List<WebElementFacade> requester = paymentsPage.requesterList;
        List<WebElementFacade> Action = paymentsPage.assignToMeList;
        for (int i = 0; i <requester.size() ; i++) {
            if (FileUtils.LastReadFileInput3("companyData").equals(requester.get(i).getText())) {
                bddUtil.scrollWindowToElement(requester.get(i)).click();
                Action.get(i).click();
                break;
            } else {
                bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//label[text()='Estimated Loan Maturity Date']")));
                paymentsPage.find(By.xpath("//button[@class='btn-next']")).click();
                break;
            }

        }
        for (int i = 0; i < requester.size(); i++) {
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
//        List<WebElementFacade> request = paymentsPage.RequestList;
//        List<WebElementFacade> proceed = paymentsPage.proceedList;
//        for (int i = 0; i <request.size() ; i++) {
//            if (FileUtils.LastReadFileInput3("companyData").equals(request.get(i).getText())){
//                bddUtil.scrollWindowToElement(request.get(i)).click();
//                proceed.get(i).click();
//                break;
//            }else {
//                bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//label[text()='Estimated Loan Maturity Date']")));
//                paymentsPage.find(By.xpath("//button[@class='btn-next']")).click();
//                break;
//            }
//        }
//        for (int i = 0; i < request.size(); i++) {
//            if (FileUtils.LastReadFileInput3("companyData").equals(request.get(i).getText())){
//                bddUtil.scrollWindowToElement(request.get(i)).click();
//                proceed.get(i).click();
//                bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//td[1]//div[@class='lls-design-table-btn-wrapper']//span[@data-key='f3tpnu1h']//span"))).click();
//
//                break;
//            }
//        }
        paymentsPage.requestTian.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//td[1]//div[@class='lls-design-table-btn-wrapper']//span[@data-key='f2l5n356']//span"))).click();
        bddUtil.sleep(2);
    }

    @Step
    public void clickParProceedBtn(){
        paymentsPage.requestParTian.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//span[@data-key='f0dcq5ne']//span"))).click();
        bddUtil.sleep(2);
    }

    @Step
    public void seeRepaymentDetail(){
        assertEquals("Repayment Detail",paymentsPage.repaymentDetail.getText());
        bddUtil.sleep(1);
    }

    @Step
    public void seeParRepaymentDetail(){
        assertEquals("Repayment Confirmation",paymentsPage.repaymentDetail.getText());
        bddUtil.sleep(1);
    }

    @Step
    public void selectAccount(){
        paymentsPage.selectLabel.click();
        bddUtil.sleep(1);
        paymentsPage.accountLabel.click();
    }

    @Step
    public void inputOtherParameter() {
        bddUtil.sleep(2);
        paymentsPage.repaymentAmount.click();
        paymentsPage.repaymentAmount.clear();
        paymentsPage.repaymentAmount.sendKeys("3500");
        bddUtil.sleep(1);
        paymentsPage.repaymentData.sendKeys(bddUtil.dateFormate());
        paymentsPage.commission.click();
        paymentsPage.submitBtn.click();
        bddUtil.sleep(24);
    }

    @Step
    public void inputOtherParameter2() {
        bddUtil.sleep(2);
        paymentsPage.repaymentAmount.click();
        paymentsPage.repaymentAmount.clear();
        paymentsPage.repaymentAmount.sendKeys("5000");
        bddUtil.sleep(1);
        paymentsPage.repaymentData.sendKeys(bddUtil.dateFormate());
        paymentsPage.commission.click();
        paymentsPage.submitBtn.click();
        bddUtil.sleep(10);
    }

    public void inputOtherParameter3() {
        bddUtil.sleep(2);
        paymentsPage.repaymentAmount.click();
        paymentsPage.repaymentAmount.clear();
        paymentsPage.repaymentAmount.sendKeys("6000");
        bddUtil.sleep(1);
        paymentsPage.repaymentData.sendKeys(bddUtil.dateFormate());
        paymentsPage.commission.click();
        paymentsPage.submitBtn.click();
        bddUtil.sleep(10);
    }

    public void inputOtherParameter4() {
        bddUtil.sleep(2);
        paymentsPage.repaymentAmount.click();
        paymentsPage.repaymentAmount.clear();
        paymentsPage.repaymentAmount.sendKeys("200");
        bddUtil.sleep(1);
        paymentsPage.repaymentData.sendKeys(bddUtil.dateFormate());
        //部分还款无佣金。
//        paymentsPage.commission.click();
        paymentsPage.submitBtn.click();
        bddUtil.sleep(3);
        if (paymentsPage.submitBtn.isDisabled()){
            bddUtil.sleep(2);
            paymentsPage.submitBtn.click();
        }
        bddUtil.sleep(10);
    }

    @Step     //通过买家/供应商筛选值,点击刷新
    public void clickRequester4() {
        paymentsPage.Requester4.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        paymentsPage.Reset.click();
    }

    @Step
    public void inputAmout(){
        bddUtil.sleep(1);
        bddUtil.scrollWindowToElement(paymentsPage.AdjustAmout.get(0));
        bddUtil.scrollWindowToElement(paymentsPage.AdjustAmout.get(0)).sendKeys("0.01");
        bddUtil.sleep(3);
    }

//    去FinReport查找去核心查询的编号
    @Step
    public void clickFinReport(){
        paymentsPage.operationsList.click();
        bddUtil.sleep(1);
        paymentsPage.FinReport.click();
        bddUtil.sleep(2);
        paymentsPage.FinIDInput.sendKeys(FileUtils.LastReadFileInput3("FinNo"));
        paymentsPage.reportBtn.click();
        bddUtil.sleep(2);
//        拿到ReferenceId,存入 ReferenceID文件
        String ReferenceID = paymentsPage.PaymentReferenceID.getText();
        FileUtils.FileString4("ReferenceID",ReferenceID);
    }

}
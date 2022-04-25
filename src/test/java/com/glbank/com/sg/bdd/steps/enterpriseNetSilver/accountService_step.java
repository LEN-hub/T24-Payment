package com.glbank.com.sg.bdd.steps.enterpriseNetSilver;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.accountService_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.JRandomNameTool;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class accountService_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private accountService_page accountService_page;
    public static String aliasText = JRandomNameTool.getStringRandom(8);
    public static String tcCode;

    @Step
    public void selectAccountDetails(){
        if (accountService_page.popWindowsTitle.isVisible()){
            accountService_page.popWindowsOk.click();
        }
        Actions action=new Actions(getDriver());
        action.moveToElement(accountService_page.accountList).perform();
    }
    @Step
    public void accountInformationQuery(){
        accountService_page.accountInformationQuery.click();
    }
    @Step
    public void accountDetailsQuery(){
        accountService_page.accountDetailsQuery.click();
    }

    @Step
    public void payerAccount(){
        accountService_page.payerAccount.click();
    }

    @Step
    public void getAccountList(){
        accountService_page.AccountList.isVisible();
    }

    @Step
    public void detailsList(){
        Actions action=new Actions(getDriver());
        action.moveToElement(accountService_page.detailsList).perform();
    }

    @Step
    public void accountDetails(){
        accountService_page.accountDetails.click();
    }

    @Step
    public void accountInformationDetails(){
        accountService_page.accountInformationDetails.isDisplayed();
        accountService_page.basicInformation.isDisplayed();
        accountService_page.backBtn.isDisplayed();
        accountService_page.detailsQuery.isDisplayed();
        accountService_page.domesticTransferBtn.isDisplayed();
        accountService_page.regularBasisBtn.isDisplayed();
    }

    @Step
    public void accountAndCurrency(){
        accountService_page.accountAndCurrency.isDisplayed();
        accountService_page.accountAlias.isDisplayed();
        accountService_page.balance.isDisplayed();
        accountService_page.balanceSecond.isDisplayed();
        Actions action=new Actions(getDriver());
        action.moveToElement(accountService_page.detailsList).perform();
        accountService_page.detailedQuery.isDisplayed();
        accountService_page.domesticTransfer.isDisplayed();
        accountService_page.regularBasis.isDisplayed();
        accountService_page.accountDetails.isDisplayed();
    }

    @Step
    public void accountTitle(){
        accountService_page.accountTitle.isDisplayed();
        accountService_page.currencyTitle.isDisplayed();
        accountService_page.selectDataTitle.isDisplayed();
        accountService_page.resetBtn.isDisplayed();
        accountService_page.queryButton.isDisplayed();
    }

    @Step
    public void queryButton(){
        accountService_page.queryButton.click();
    }

    @Step
    public void clickEditAlias(){
        accountService_page.clickEditAlias.click();
    }

    @Step
    public void inputAlias(){
        accountService_page.inputAlias.clear();
        accountService_page.inputAlias.sendKeys(aliasText);
        accountService_page.saveBtn.click();
    }

    @Step
    public void aliasTextCheck(){
        Assert.assertEquals(aliasText,accountService_page.find(By.xpath("//span[text()='"+aliasText+"']")).getText());
    }

    @Step
    public void clickDownloadBtn(){
        if (accountService_page.popWindowsTitle.isVisible()){
            accountService_page.popWindowsOk.click();
        }
        Actions action=new Actions(getDriver());
        action.moveToElement(accountService_page.clickDownloadBtn).perform();
        accountService_page.clickMyDownloads.click();
        accountService_page.downloadTemplate.click();
        accountService_page.downloadBtn.click();
    }

    @Step
    public void viewEstatements(){
        if (accountService_page.popWindowsTitle.isVisible()){
            accountService_page.popWindowsOk.click();
        }
        Actions action=new Actions(getDriver());
        action.moveToElement(accountService_page.clickDownloadBtn).perform();
        accountService_page.viewEadvices.click();
        accountService_page.clickSelectBtn.click();
        if (accountService_page.clickViewEstatementsDownloadBtn.isVisible()){
            accountService_page.clickViewEstatementsDownloadBtn.click();
        }
    }

    @Step
    public void mySetting(){
        if (accountService_page.popWindowsTitle.isVisible()){
            accountService_page.popWindowsOk.click();
        }
        Actions action = new Actions(getDriver());
        action.moveToElement(accountService_page.mySetting).perform();
        accountService_page.managerMyProfile.click();
        accountService_page.editProfile.click();
        accountService_page.enterProfile.clear();
        accountService_page.enterProfile.sendKeys(aliasText);
        accountService_page.clickSaveBtn.click();
    }

    @Step
    public void checkEditProfile(){
        Assert.assertEquals(aliasText,accountService_page.checkEditProfile.getText());
    }

    @Step
    public void enterpriseManagementDesk(){
        if (accountService_page.popWindowsTitle.isVisible()){
            accountService_page.popWindowsOk.click();
        }
        Actions action = new Actions(getDriver());
        action.moveToElement(accountService_page.enterpriseManagementDesk).perform();
        accountService_page.operationLogQuery.click();
        accountService_page.queryBtn.click();
    }
    @Step
    public void querySuccess(){
        accountService_page.transactionType.isDisplayed();
        accountService_page.operator.isDisplayed();
        accountService_page.selectDate.isDisplayed();
        accountService_page.querySuccess.isDisplayed();
        List<WebElementFacade> filed = accountService_page.fieldList;
        for (int i = 0; i < filed.size();i++){
            filed.get(i).isDisplayed();
        }
    }

    @Step
    public void myTransactions(){
        if (accountService_page.popWindowsTitle.isVisible()){
            accountService_page.popWindowsOk.click();
        }
//        Actions action = new Actions(getDriver());
//        action.moveToElement( accountService_page.myTransactions).perform();
        accountService_page.myTransactions.click();
        accountService_page.moreBtn.click();
        List<WebElementFacade> transactionFiled = accountService_page.transactionField;
        for (int i = 0; i < transactionFiled.size(); i++){
            transactionFiled.get(i).isDisplayed();
        }
        accountService_page.queryBtn.click();
    }

    @Step
    public void selectSevenDay(){
        if (accountService_page.popWindowsTitle.isVisible()){
            accountService_page.popWindowsOk.click();
        }
//        Actions action = new Actions(getDriver());
//        action.moveToElement( accountService_page.myTransactions).perform();
        accountService_page.myTransactions.click();
        accountService_page.selectSevenDay.click();
        accountService_page.queryBtn.click();
    }

    @Step
    public void clickMyTaskBtn(){
        accountService_page.myTaskBtn.click();
    }

    @Step
    public void seeApprovalTitle(){
        if (accountService_page.PendingApprovalTitle.getText().equals("等待授权")){
            assertEquals("等待授权",accountService_page.PendingApprovalTitle.getText());
        }else {
            assertEquals("Pending Authorization",accountService_page.PendingApprovalTitle.getText());
        }
    }

    @Step
    public void clickFirstAuthorizeBtn(){
        accountService_page.firstAuthorizeBtn.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(accountService_page.passThroughBtn).click();
        bddUtil.sleep(1);
        accountService_page.submitBtn.click();
        bddUtil.sleep(1);
        accountService_page.nextBtn.click();
        bddUtil.sleep(2);
    }


    @Step
    public void clickNextBtn(){
        accountService_page.nextBtn.click();
    }

    @Step
    public void clickTransferMoneyBtn(){
        accountService_page.transferMoneyBtn.click();
        accountService_page.rosterManagementBtn.click();
    }

    @Step
    public void clickAddPayeeBtn(){
        accountService_page.addPayeeBtn.click();
        bddUtil.sleep(1);
    }

    @Step
    public void inputOtherInformation(){
        String a = JRandomNameTool.getStringRandom(6);
        accountService_page.inputReceivingAccount.sendKeys(a);
        accountService_page.inputPayeeAccountName.sendKeys(a);
        accountService_page.selectBankInfo.click();
        List<WebElementFacade> bankList = accountService_page.bankList;
        for (int i = 0; i < bankList.size(); i++) {
            if (bankList.get(i).getText().equals("BANK OF CHINA")){
                bankList.get(i).click();
                break;
            }
        }
        accountService_page.createSaveBtn.click();
    }
}

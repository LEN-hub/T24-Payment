package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.accountService_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.JRandomNameTool;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class accountService_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private accountService_page accountService_page;
    public static String aliasText = JRandomNameTool.getStringRandom(8);

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
        Assert.assertEquals(aliasText,accountService_page.aliasTextCheck.getText());
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
        accountService_page.selectData.isDisplayed();
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
        Actions action = new Actions(getDriver());
        action.moveToElement( accountService_page.myTransactions).perform();
        accountService_page.manageTransactions.click();
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
        Actions action = new Actions(getDriver());
        action.moveToElement( accountService_page.myTransactions).perform();
        accountService_page.manageTransactions.click();
        accountService_page.selectSevenDay.click();
        accountService_page.queryBtn.click();
    }
}

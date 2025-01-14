package com.glbank.com.sg.bdd.steps.enterpriseNetSilver;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.eStatement_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import com.glbank.com.sg.bdd.utils.RandomPhoneNumber;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class eStatement_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private eStatement_page eStatement_page;

    public void clickDownloadsBtn(){
        eStatement_page.myDownloadsBtn.click();
        bddUtil.sleep(1);
    }

    public void clickViewEStatementsBtn(){
        eStatement_page.viewEStatementsBtn.click();
        bddUtil.sleep(1);
    }

    public void eStatementTitle(){
        if (eStatement_page.eStatementsOverview.getText().equals("Underwriting Approval")){
            assertEquals("Underwriting Approval",eStatement_page.eStatementsOverview.getText());
        }else {
            assertEquals("电子结单概况",eStatement_page.eStatementSOverviewChina.getText());
        }

    }

    public void clickSelectBox(){
        bddUtil.sleep(2);
        eStatement_page.selectBox.click();
    }

    public void selectData(String select){
        List<WebElementFacade> role = eStatement_page.dataList;
        for (int i = 0; i < role.size(); i++) {
            if (role.get(i).getText().equals(select)){
                role.get(i).click();
                break;
            }

        }
        bddUtil.sleep(2);
    }

    public void clickSearchBtn(){
        bddUtil.sleep(2);
        eStatement_page.SearchBtn.click();
        bddUtil.sleep(3);
    }

    public void seeViewLabel(){
        if (eStatement_page.viewLabel.getText().equals("View 10 per page")){
            assertEquals("View 10 per page",eStatement_page.viewLabel.getText());
        }else {
            assertEquals("浏览 10 条每页",eStatement_page.viewLabel.getText());
        }
    }

    public void clickFirstData(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(eStatement_page.firstThreePoint).perform();
//        List<WebElementFacade> role = eStatement_page.threePoint;
//        for (int i = 0; i <role.size() ; i++) {
//            if (i==1){
//                Actions actions = new Actions(getDriver());
//                actions.moveToElement(role.get(i)).perform();
//            }
//            break;
//        }
        eStatement_page.downloadPdf.click();
        bddUtil.sleep(1);
        eStatement_page.submitBtn.click();
        bddUtil.sleep(10);
        eStatement_page.downloadFirstBtn.click();
        bddUtil.sleep(5);
    }

    public void seeMyDownloadsList(){
        eStatement_page.seeMyDownloads.click();
    }

    public void clickPastData(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(eStatement_page.pastThreePoint).perform();
        eStatement_page.pastDownloads.click();
        bddUtil.sleep(1);
        eStatement_page.submitBtn.click();
        bddUtil.sleep(2);
        eStatement_page.downloadFirstBtn.click();
        bddUtil.sleep(5);
    }

    public void clickViewEAdvicesBtn(){
        eStatement_page.ViewEAdvicesBtn.click();
    }

    public void clickDownLoadBtn(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(eStatement_page.downLoadBtn).perform();
//        eStatement_page.downLoadBtn.click();
        eStatement_page.downloadNotice.click();
        bddUtil.sleep(1);
        eStatement_page.submitBtn.click();
        bddUtil.sleep(5);
        eStatement_page.downloadFirstBtn.click();
        bddUtil.sleep(5);
    }

    public void clickMyTransactions(){
        eStatement_page.clickMyTransactions.click();
        eStatement_page.clickSearchBtn.click();
        eStatement_page.getRecordInformation.isVisible();
    }

    public void checkMyAlertsAndNotifications(){
        eStatement_page.clickMySettingsMenu.click();
        eStatement_page.clickNotifications.click();
        eStatement_page.clickSearchButton.click();
        eStatement_page.getRecordInformation.isVisible();
        eStatement_page.clickBankAnnouncement.click();
    }

    public void checkViewExports(){
        eStatement_page.clickViewExportsMenu.click();
        eStatement_page.clickDownloadTemplateMenu.click();
        eStatement_page.clickFirstDownloadBtn.click();
    }

    @Step
    public void changePassword(){
        String randomPassword = "Ps@"+RandomPhoneNumber.randomPhoneNum();
        eStatement_page.clickMySettingsMenu.click();
        eStatement_page.clickMangeMySecurityMenu.click();
        eStatement_page.inputOriPassword.sendKeys(FileUtils.LastReadFileInput3("changePassword"));
        eStatement_page.inputNewPassword.sendKeys(randomPassword);
        FileUtils.FileString4("changePassword",randomPassword);
        eStatement_page.inputNewSecondPassword.sendKeys(randomPassword);
        eStatement_page.clickConfirmBtn.click();
    }

    @Step
    public void changePasswordConfirmBtn(){
        bddUtil.sleep(2);
        eStatement_page.clickOkButton.click();
        eStatement_page.clickConfirmBtn.click();
    }

    @Step
    public void checkStatus(){
        bddUtil.sleep(3);
        Assert.assertEquals(eStatement_page.checkStatus.getText(),"Successful");
    }
}

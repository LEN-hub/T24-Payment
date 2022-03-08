package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.eStatement_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
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
        bddUtil.sleep(2);
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
        bddUtil.sleep(2);
        eStatement_page.downloadFirstBtn.click();
        bddUtil.sleep(5);
    }
}

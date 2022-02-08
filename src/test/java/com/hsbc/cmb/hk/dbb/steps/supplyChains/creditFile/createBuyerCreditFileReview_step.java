package com.hsbc.cmb.hk.dbb.steps.supplyChains.creditFile;

import com.hsbc.cmb.hk.dbb.pages.supplyChains.creditFile.createBuyerCreditFileReview_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class createBuyerCreditFileReview_step extends ScenarioSteps {

    private createBuyerCreditFileReview_page createBuyerCreditFileReview_page;
    private BDDUtil bddUtil;

    @Step
    public void clickBuyerCreditFileReview(){
        createBuyerCreditFileReview_page.clickBuyerCreditProfileReview.click();
    }

    @Step
    public void buyerCreditFileL1Review(String companyName){
        bddUtil.sleep(2);
        List<WebElementFacade> companyNameList = createBuyerCreditFileReview_page.companyNameList;
        List<WebElementFacade> assignToMeList = createBuyerCreditFileReview_page.assignToMeList;
        for (int i = 0;i < companyNameList.size();i++){
            if(companyName.equals(companyNameList.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", assignToMeList.get(i));
                break;
            }
        }
        createBuyerCreditFileReview_page.clickAssignToMePage.click();
        bddUtil.sleep(2);
        List<WebElementFacade> assignToMePageCompanyNameList = createBuyerCreditFileReview_page.assignToMePageCompanyNameList;
        List<WebElementFacade> proceedList = createBuyerCreditFileReview_page.proceedList;
        for (int j = 0;j < assignToMePageCompanyNameList.size();j++){
            if(companyName.equals(assignToMePageCompanyNameList.get(j).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", proceedList.get(j));
                break;
            }
        }
        bddUtil.sleep(2);
        createBuyerCreditFileReview_page.getL1Result.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(createBuyerCreditFileReview_page.getL1Approve).click();
        createBuyerCreditFileReview_page.getL1Comments.sendKeys("PASS");
        createBuyerCreditFileReview_page.clickSubmitToL2.click();
        bddUtil.sleep(3);
    }
    @Step
    public void changeUserToL2Review(){
        createBuyerCreditFileReview_page.clickUserToLogOut.click();
        createBuyerCreditFileReview_page.clickLogOutToChangeUser.click();
        createBuyerCreditFileReview_page.clickCancel.click();
        createBuyerCreditFileReview_page.clickGoOn.click();
    }
}

package com.glbank.com.sg.bdd.steps.supplyChains.creditFile;

import com.glbank.com.sg.bdd.pages.supplyChains.creditFile.createBuyerCreditFileReview_page;
import com.glbank.com.sg.bdd.pages.supplyChains.systemManager.logon_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class createBuyerCreditFileReview_step extends ScenarioSteps {

    private createBuyerCreditFileReview_page createBuyerCreditFileReview_page;
    private BDDUtil bddUtil;
    private logon_page login__page;

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
//                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
//                webdriver.executeScript("arguments[0].click();", proceedList.get(j));
                bddUtil.clickByJS(createBuyerCreditFileReview_page.proceedList.get(j));
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
        bddUtil.sleep(10);
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.26.9.74:8080/usoserver/\");");
        bddUtil.switchToNewWindow();

//        createBuyerCreditFileReview_page.clickUserToLogOut.click();
//        bddUtil.clickByJS(createBuyerCreditFileReview_page.clickLogOutToChangeUser);
//        createBuyerCreditFileReview_page.clickLogOutToChangeUser.click();
        createBuyerCreditFileReview_page.clickCancel.click();
        createBuyerCreditFileReview_page.clickGoOn.click();
    }
}

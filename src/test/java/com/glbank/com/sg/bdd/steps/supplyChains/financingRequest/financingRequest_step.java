package com.glbank.com.sg.bdd.steps.supplyChains.financingRequest;

import com.glbank.com.sg.bdd.pages.supplyChains.financingRequest.financingRequest_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class financingRequest_step extends ScenarioSteps {

    private financingRequest_page financingRequest_page;
    private BDDUtil bddUtil;

    @Step
    public void openGLDBLoginPage(String envName){
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        financingRequest_page.openUrl(logonUrl);
    }
    public void enterLoginDateToBox(String email,String password,String companyId,String code){
        financingRequest_page.enterEmailToBox.sendKeys(email);
        financingRequest_page.enterPasswordToBox.sendKeys(password);
        financingRequest_page.enterCompanyIdToBox.sendKeys(companyId);
        financingRequest_page.enterCodeToBox.sendKeys(code);
        financingRequest_page.clickLogin.click();
    }
    public void clickRequestFinancing(){
        financingRequest_page.clickRequestFinancing.click();
    }
    public void uploadRequestFinancing(){
        financingRequest_page.clickUpload.click();
        financingRequest_page.clickOfUploadFile.click();
        bddUtil.sleep(2);
        bddUtil.requestFinancingFileUpload();
        bddUtil.sleep(5);
        financingRequest_page.clickConfirmOfUpload.click();
        bddUtil.sleep(3);
        financingRequest_page.clickAllRequest.click();
        financingRequest_page.clickApplyInBatch.click();
        bddUtil.sleep(2);
    }
    public void clickOperationsToL1Review(String companyName){
        financingRequest_page.clickOperations.click();
        financingRequest_page.clickFrReview.click();
        List<WebElementFacade> requestName = financingRequest_page.requesterName;
        List<WebElementFacade> requestFinancingAssignToMe = financingRequest_page.requestFinancingAssignToMe;
        for(int i = 0;i< requestName.size();i++){
            if(companyName.equals(requestName.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", requestFinancingAssignToMe.get(i));
                break;
            }
        }
        financingRequest_page.clickAssignedToMe.click();
        List<WebElementFacade> getRequesterName = financingRequest_page.getRequesterName;
        List<WebElementFacade> getProceed = financingRequest_page.getProceed;
        for(int i = 0;i< getRequesterName.size();i++){
            if(companyName.equals(getRequesterName.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", getProceed.get(i));
                break;
            }
        }
        financingRequest_page.clickResult.click();
        bddUtil.scrollWindowToElement(financingRequest_page.getApprove).click();
        financingRequest_page.getComments.sendKeys("PASS");
        financingRequest_page.clickSubmit.click();

    }

    public void clickFinancingStatus(){
        financingRequest_page.clickFinancingStatus.click();
        financingRequest_page.clickPaymentInProgress.click();
    }
}

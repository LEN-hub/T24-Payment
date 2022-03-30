package com.glbank.com.sg.bdd.steps.supplyChains.financingRequest;

import com.glbank.com.sg.bdd.pages.supplyChains.financingRequest.financingRequest_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

import static com.glbank.com.sg.bdd.utils.MobileConfig.driver;

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
        getDriver().findElement(By.xpath("//div[@class='upload-widget']//input")).sendKeys("C:\\Users\\ASUS\\Desktop\\testAuto.xlsx");
        bddUtil.sleep(5);
        financingRequest_page.clickConfirmOfUpload.click();
        bddUtil.sleep(3);
        getDriver().findElement(By.xpath("//div[@class='lowcode-table-base']//tbody/tr//div[@class='lls-cb-indot lls-cb-indot-act2']")).click();
//        financingRequest_page.clickAllRequest.click();
        financingRequest_page.clickApplyInBatch.click();
        bddUtil.sleep(2);
        financingRequest_page.SubmitBtn.click();
        bddUtil.sleep(3);
    }
    public void clickOperationsToL1Review(String companyName){
        financingRequest_page.clickOperations.click();
        financingRequest_page.clickFrReview.click();
        List<WebElementFacade> requestName = financingRequest_page.requesterName;
        List<WebElementFacade> requestFinancingAssignToMe = financingRequest_page.requestFinancingAssignToMe;
        for(int i = 0;i< requestName.size();i++){
            if(requestName.get(i).getText().equals(companyName)){
                bddUtil.clickByJS(financingRequest_page.find(By.xpath("//div[@class='finance']//div[@class='lls-tabs__content'][1]//div[@class='lls-tab-pane'][1]//section[@class='query-table'][1]/div[1]/div[3]//tr["+i+"]//span[contains(text(),'Assign to Me')]")));
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

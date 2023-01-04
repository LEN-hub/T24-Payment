package com.glbank.com.sg.bdd.steps.supplyChains.financingRequest;

import com.glbank.com.sg.bdd.pages.supplyChains.financingRequest.financingRequest_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import com.glbank.com.sg.bdd.utils.ModifyExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.Map;

import static com.glbank.com.sg.bdd.utils.HaveOrNo.updateAml;
import static com.glbank.com.sg.bdd.utils.MobileConfig.driver;

public class financingRequest_step extends ScenarioSteps {

    private financingRequest_page financingRequest_page;
    private BDDUtil bddUtil;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/BR.jpg";
    String upExcel = systemPath + "/src/test/resources/testData/excel/testAuto.xlsx";
    public String FinancingNo;

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
        ModifyExcel modifyExcel = new ModifyExcel();
        modifyExcel.excelPOI("testAuto");
        financingRequest_page.clickUpload.click();
        getDriver().findElement(By.xpath("//div[@class='upload-widget']//input")).sendKeys(upExcel);
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
        FinancingNo = financingRequest_page.find(By.xpath("//div[@class='finance']//div[@class='lls-tabs__content']/div[1]/section/div[1]/div[3]//tr[1]/td[3]//span")).getText();
        Map<String, Object> map1 = updateAml(FinancingNo);
        List<WebElementFacade> requestName = financingRequest_page.requesterName;
        for(int i = 0;i< requestName.size();i++){
            if(requestName.get(i).getText().equals(companyName)){
                int j = i + 1;
                bddUtil.clickByJS(financingRequest_page.find(By.xpath("//div[@class='finance']//div[@class='lls-tabs__content'][1]//div[@class='lls-tab-pane'][1]//section[@class='query-table'][1]/div[1]/div[3]//tr["+j+"]//span[contains(text(),'Assign to Me')]")));
                break;
            }
        }
        financingRequest_page.clickAssignedToMe.click();
        List<WebElementFacade> getRequesterName = financingRequest_page.getRequesterName;
        for(int i = 0;i< getRequesterName.size();i++){
            if(companyName.equals(getRequesterName.get(i).getText())){
                int j = i + 1;
                bddUtil.scrollWindowToElement(financingRequest_page.find(By.xpath("//div[@class='finance']//div[@class='lls-tabs__content'][1]//div[@class='lls-tab-pane'][2]//section[@class='query-table'][1]/div[1]/div[3]//tr["+j+"]//span[contains(text(),'Proceed')]")));
                bddUtil.clickByJS(financingRequest_page.find(By.xpath("//div[@class='finance']//div[@class='lls-tabs__content'][1]//div[@class='lls-tab-pane'][2]//section[@class='query-table'][1]/div[1]/div[3]//tr["+j+"]//span[contains(text(),'Proceed')]")));
                bddUtil.sleep(1);
                break;
            }
        }
        financingRequest_page.clickResult.click();
        bddUtil.scrollWindowToElement(financingRequest_page.getApprove).click();
        financingRequest_page.getComments.sendKeys("PASS");
        financingRequest_page.clickSubmit.click();
        Map<String, Object> map = updateAml(FinancingNo);
        int status = (int)map.get("status");
        if(status == 1){
            System.out.println("status success");
            String responseData = (String)map.get("data");
            System.out.println("responseData: " + responseData);
        }else {
            System.out.println("status error");
            String msg = (String)map.get("msg");
            System.out.println("msg: " + msg);
        }
        for (int i = 0; i < 6; i++) {
            bddUtil.sleep(20);
        }
        bddUtil.sleep(15);
    }

    public void clickFinancingStatus(){
        financingRequest_page.clickFinancingStatus.click();
        financingRequest_page.clickPaymentInProgress.click();
    }

    public void clickMoreBtn(){
        financingRequest_page.more.click();
        financingRequest_page.ratingLimits.click();
        financingRequest_page.ratingLimitsList.click();
    }

    public void seeQuotaOccupancy(String companyName){
        financingRequest_page.client.sendKeys(companyName);
        financingRequest_page.ratingTitle.click();
        bddUtil.clickByJS(financingRequest_page.find(By.xpath("//div[@data-key='f2u4lp9q']//div[@class='lowcode-table-base']//tbody//span[@data-key='f0pbd6tn']//span")));
        bddUtil.sleep(5);
    }//查看客户额度占用情况。
}

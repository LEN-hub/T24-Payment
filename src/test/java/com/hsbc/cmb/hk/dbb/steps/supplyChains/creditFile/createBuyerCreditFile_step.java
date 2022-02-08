package com.hsbc.cmb.hk.dbb.steps.supplyChains.creditFile;

import com.hsbc.cmb.hk.dbb.pages.supplyChains.creditFile.createBuyerCreditFile_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class createBuyerCreditFile_step extends ScenarioSteps {

    private createBuyerCreditFile_page createBuyerCreditFile_page;
    private BDDUtil bddUtil;

    @Step
    public void clickBuyerCreditProfileList(){
        createBuyerCreditFile_page.clickBuyerCreditProfileList.click();
    }
    @Step
    public void clickCreateNewUnderwriting(){
        createBuyerCreditFile_page.clickCreateNewUnderwriting.click();
    }
    @Step
    public void createNewUnderwriting(){
        createBuyerCreditFile_page.clickToGetCustomerName.click();
        bddUtil.scrollWindowToElement(createBuyerCreditFile_page.getBuyerName);
        createBuyerCreditFile_page.getBuyerName.click();
        createBuyerCreditFile_page.clickToGetUnderwritingMode.click();
        bddUtil.scrollWindowToElement(createBuyerCreditFile_page.getUnderwritingMode);
        createBuyerCreditFile_page.getUnderwritingMode.click();
        createBuyerCreditFile_page.clickPublicCompany.click();
        createBuyerCreditFile_page.clickConfirmToCreateNewUnderwriting.click();
    }
    @Step
    public void editBuyerCreditProfile(String companyName){
        List<WebElementFacade> companyNameList = createBuyerCreditFile_page.companyNameList;
        List<WebElementFacade> editBuyerList = createBuyerCreditFile_page.editBuyerList;
        for (int i = 0;i < companyNameList.size();i++){
            if(companyName.equals(companyNameList.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", editBuyerList.get(i));
                break;
            }
        }
    }

    @Step
    public void displayedCreateBuyerCreditProfilePage(){
        if (createBuyerCreditFile_page.checkCreateBuyerCreditProfilePage.isDisabled()){
            System.out.println("买方档案创建完成，开始编辑买方信息");
        }
    }
    @Step
    public void toEditBuyerCreditProfile(){
        createBuyerCreditFile_page.getLastFiscalYear.click();
        createBuyerCreditFile_page.pickAYear.click();
        createBuyerCreditFile_page.getDRSKRating.clear();
        createBuyerCreditFile_page.getDRSKRating.sendKeys("1");
        createBuyerCreditFile_page.upScreenshotOfDRSKRating.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        createBuyerCreditFile_page.getToReportingCurrency.click();
        bddUtil.scrollWindowToElement(createBuyerCreditFile_page.getReportingCurrency);
        createBuyerCreditFile_page.getReportingCurrency.click();
        createBuyerCreditFile_page.getTotalLiabilities.clear();
        createBuyerCreditFile_page.getTotalLiabilities.sendKeys("1");
        createBuyerCreditFile_page.getCurrentLiabilities.clear();
        createBuyerCreditFile_page.getCurrentLiabilities.sendKeys("1");
        createBuyerCreditFile_page.getTotalAsset.clear();
        createBuyerCreditFile_page.getTotalAsset.sendKeys("1000000");
        createBuyerCreditFile_page.getTotalRevenue.clear();
        createBuyerCreditFile_page.getTotalRevenue.sendKeys("100000");
        createBuyerCreditFile_page.getNetProfit.clear();
        createBuyerCreditFile_page.getNetProfit.sendKeys("100000");
        createBuyerCreditFile_page.getCashAndCashEquivalents.clear();
        createBuyerCreditFile_page.getCashAndCashEquivalents.sendKeys("10000");
        createBuyerCreditFile_page.getBookValueOfEquity.clear();
        createBuyerCreditFile_page.getBookValueOfEquity.sendKeys("10000");
        createBuyerCreditFile_page.upFinancialInformationInLastYear.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        createBuyerCreditFile_page.upOtherFiles.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        createBuyerCreditFile_page.clickSaveBuyerCreditProfile.click();
    }

    @Step
    public void submitBuyerProfileList(String companyName){
        List<WebElementFacade> companyNameList = createBuyerCreditFile_page.companyNameList;
        List<WebElementFacade> buyerSubmitList = createBuyerCreditFile_page.buyerSubmitList;
        for (int i = 0;i < companyNameList.size();i++){
            if(companyName.equals(companyNameList.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", buyerSubmitList.get(i));
                break;
            }
        }
    }

}

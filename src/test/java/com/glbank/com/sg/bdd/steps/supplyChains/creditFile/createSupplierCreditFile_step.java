package com.glbank.com.sg.bdd.steps.supplyChains.creditFile;

import com.glbank.com.sg.bdd.pages.supplyChains.creditFile.createSupplierCreditFile_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class createSupplierCreditFile_step extends PageObject {

    private createSupplierCreditFile_page createSupplierCreditFile_page;
    private BDDUtil bddUtil;
    String fileAddress = "E:\\DBB_GL_AutoTestting-dev\\src\\test\\resources\\testData\\autopay\\test.jpg";

    @Step
    public void clickSupplierCreditProfileList(){
        createSupplierCreditFile_page.clickSupplierCreditProfileList.click();
    }

    @Step
    public void clickCreateNewUnderwriting(){
        createSupplierCreditFile_page.clickCreateNewUnderwriting.click();
    }

    @Step
    public void createCreateNewUnderwriting(String companyName,String buyerName){
        createSupplierCreditFile_page.clickToGetCustomerName.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.find(By.xpath("//span[text()='"+ companyName +"']"))).click();
        createSupplierCreditFile_page.clickToGetBuyer.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.find(By.xpath("//span[text()='"+ buyerName +"']"))).click();
        createSupplierCreditFile_page.clickToGetProductType.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getProductType).click();
        createSupplierCreditFile_page.clickToGetInputBy.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getInputBy).click();
        createSupplierCreditFile_page.clickConfirm.click();

    }

    @Step
    public void editSupplierCreditFile(String companyName){
        List<WebElementFacade> companyNameList = createSupplierCreditFile_page.companyNameList;
        List<WebElementFacade> clickEditSupplierCreditFileList = createSupplierCreditFile_page.clickEditSupplierCreditFileList;
        for(int i = 0;i < companyNameList.size();i++)
            if(companyName.equals(companyNameList.get(i).getText())) {
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", clickEditSupplierCreditFileList.get(i));
                break;
            }
    }

    @Step
    public void toEditSupplierCreditFile(){
        createSupplierCreditFile_page.clickPublicCompany.click();
        createSupplierCreditFile_page.getStartingYearOfBusiness.sendKeys("2020");
        createSupplierCreditFile_page.clickBlank.click();
//        createSupplierCreditFile_page.clickStartingYearOfBusiness.click();
        createSupplierCreditFile_page.clickHaveFinancials.click();
        createSupplierCreditFile_page.getStartingYearOfBuyerRelationship.sendKeys("2020");
        createSupplierCreditFile_page.clickBlank.click();
//        createSupplierCreditFile_page.clickStartingYearOfBuyerRelationship.click();
        createSupplierCreditFile_page.clickExchange.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getExchange).click();
        createSupplierCreditFile_page.getTickerSymbol.clear();
        createSupplierCreditFile_page.getTickerSymbol.sendKeys("610000");
        createSupplierCreditFile_page.clickIndustry.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getIndustry).click();
        createSupplierCreditFile_page.getDRSKRating.clear();
        createSupplierCreditFile_page.getDRSKRating.sendKeys("1");
        createSupplierCreditFile_page.getLastFiscalYear.sendKeys("2020");
        createSupplierCreditFile_page.clickBlank.click();
//        createSupplierCreditFile_page.clickLastFiscalYear.click();
        createSupplierCreditFile_page.getBuyerCOGS.clear();
        createSupplierCreditFile_page.getBuyerCOGS.sendKeys("0");
//        createSupplierCreditFile_page.upFileScreenshotOfDRSKRating.click();
        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        getDriver().findElement(By.xpath("//label[@for='A0022']/following-sibling::div//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        createSupplierCreditFile_page.clickFinancialInformation.click();
        bddUtil.sleep(1);
        createSupplierCreditFile_page.clickInLastYearReportingCurrency.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getInLastYearReportingCurrency).click();
        createSupplierCreditFile_page.getTotalAssets.clear();
        createSupplierCreditFile_page.getTotalAssets.sendKeys("0");
        createSupplierCreditFile_page.getCurrentAssets.clear();
        createSupplierCreditFile_page.getCurrentAssets.sendKeys("0");
        createSupplierCreditFile_page.getWorkingCapital.clear();
        createSupplierCreditFile_page.getWorkingCapital.sendKeys("0");
        createSupplierCreditFile_page.getTotalLiabilities.clear();
        createSupplierCreditFile_page.getTotalLiabilities.sendKeys("0");
        createSupplierCreditFile_page.getCurrentLiabilities.clear();
        createSupplierCreditFile_page.getCurrentLiabilities.sendKeys("0");
        createSupplierCreditFile_page.getInLastYearNetProfit.clear();
        createSupplierCreditFile_page.getInLastYearNetProfit.sendKeys("0");
        createSupplierCreditFile_page.getOperatingCashFlow.clear();
        createSupplierCreditFile_page.getOperatingCashFlow.sendKeys("100000000");
        createSupplierCreditFile_page.getOperatingProfit.clear();
        createSupplierCreditFile_page.getOperatingProfit.sendKeys("100000000");
        createSupplierCreditFile_page.getTotalRevenue.clear();
        createSupplierCreditFile_page.getTotalRevenue.sendKeys("0");
        createSupplierCreditFile_page.getCashAndCashEquivalents.clear();
        createSupplierCreditFile_page.getCashAndCashEquivalents.sendKeys("0");
        createSupplierCreditFile_page.getBookValueOfEquity.clear();
        createSupplierCreditFile_page.getBookValueOfEquity.sendKeys("0");
//        createSupplierCreditFile_page.upFinancialInformationInLastYear.click();
        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        getDriver().findElement(By.xpath("//label[@for='A0020']/following-sibling::div//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.findFinancialInformation);
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getOperatingCashFlow);
        createSupplierCreditFile_page.clickInYearBeforeLastReportingCurrency.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getInYearBeforeLastReportingCurrency).click();
        createSupplierCreditFile_page.getInYearBeforeLastNetProfit.clear();
        createSupplierCreditFile_page.getInYearBeforeLastNetProfit.sendKeys("0");
        createSupplierCreditFile_page.clickOtherDocuments.click();
//        createSupplierCreditFile_page.upFileFinancialInformationInYearBeforeLast.click();
        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        getDriver().findElement(By.xpath("//label[@for='A0021']/following-sibling::div//input")).sendKeys(fileAddress);
//        bddUtil.sleep(5);
//        createSupplierCreditFile_page.upFileOtherFiles.click();
        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        getDriver().findElement(By.xpath("//label[@for='A0030']/following-sibling::div//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        createSupplierCreditFile_page.clickSave.click();
        bddUtil.sleep(2);
    }
    @Step
    public void submitSupplierCreditProfile(String companyName){
        List<WebElementFacade> submitToReview = createSupplierCreditFile_page.submitListToReview;
        List<WebElementFacade> companyNameList = createSupplierCreditFile_page.companyNameList;
        for (int i = 0;i < companyNameList.size();i++){
            if (companyName.equals(companyNameList.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", submitToReview.get(i));
                break;
            }
        }
        bddUtil.sleep(5);
    }

    @Step
    public void clickToSupplierCreditProfileReviewPage(){
        createSupplierCreditFile_page.clickSupplierCreditProfileReview.click();
    }

    @Step
    public void supplierCreditFileL1Review(String companyName){
        List<WebElementFacade> companyNameListToAssignToMe = createSupplierCreditFile_page.companyNameListToAssignToMe;
        List<WebElementFacade> assignTome = createSupplierCreditFile_page.AssignToMe;
        for (int i = 0;i < companyNameListToAssignToMe.size();i++){
            if(companyName.equals(companyNameListToAssignToMe.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", assignTome.get(i));
                break;
            }
        }
    }
    @Step
    public void clickToAssignToMePage(){
        createSupplierCreditFile_page.clickToAssignedToMePage.click();
    }
    @Step
    public void clickProceed(String companyName){
        List<WebElementFacade> companyNameInAssignedToMePage = createSupplierCreditFile_page.companyNameInAssignedToMePage;
        List<WebElementFacade> proceedInAssignedToMePage = createSupplierCreditFile_page.proceedInAssignedToMePage;
        for (int i = 0;i < companyNameInAssignedToMePage.size();i++){
            if(companyName.equals(companyNameInAssignedToMePage.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", proceedInAssignedToMePage.get(i));
                break;
            }
        }
    }
    @Step
    public void clickSubmit(){
        createSupplierCreditFile_page.clickResult.click();
        createSupplierCreditFile_page.getApprove.click();
//        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getApprove).click();
        createSupplierCreditFile_page.getComments.sendKeys("PASS");
        createSupplierCreditFile_page.clickSubmit.click();
        bddUtil.sleep(2);

    }
}

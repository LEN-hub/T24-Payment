package com.hsbc.cmb.hk.dbb.steps.supplyChains.creditFile;

import com.hsbc.cmb.hk.dbb.pages.supplyChains.creditFile.createSupplierCreditFile_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class createSupplierCreditFile_step extends PageObject {

    private createSupplierCreditFile_page createSupplierCreditFile_page;
    private BDDUtil bddUtil;

    @Step
    public void clickSupplierCreditProfileList(){
        createSupplierCreditFile_page.clickSupplierCreditProfileList.click();
    }

    @Step
    public void clickCreateNewUnderwriting(){
        createSupplierCreditFile_page.clickCreateNewUnderwriting.click();
    }

    @Step
    public void createCreateNewUnderwriting(){
        createSupplierCreditFile_page.clickToGetCustomerName.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getSupplierName);
        createSupplierCreditFile_page.getSupplierName.click();
        createSupplierCreditFile_page.clickToGetBuyer.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getBuyerName);
        createSupplierCreditFile_page.getBuyerName.click();
        createSupplierCreditFile_page.clickToGetProductType.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getProductType);
        createSupplierCreditFile_page.getProductType.click();
        createSupplierCreditFile_page.clickToGetInputBy.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getInputBy);
        createSupplierCreditFile_page.getInputBy.click();
        createSupplierCreditFile_page.clickConfirm.click();
    }

    @Step
    public void editSupplierCreditFile(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();",createSupplierCreditFile_page.clickEditSupplierCreditFile);
    }

    @Step
    public void toEditSupplierCreditFile(){
        createSupplierCreditFile_page.clickPublicCompany.click();
        createSupplierCreditFile_page.getStartingYearOfBusiness.click();
        createSupplierCreditFile_page.clickStartingYearOfBusiness.click();
        createSupplierCreditFile_page.clickHaveFinancials.click();
        createSupplierCreditFile_page.getStartingYearOfBuyerRelationship.click();
        createSupplierCreditFile_page.clickStartingYearOfBuyerRelationship.click();
        createSupplierCreditFile_page.clickExchange.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getExchange);
        createSupplierCreditFile_page.getExchange.click();
        createSupplierCreditFile_page.getTickerSymbol.clear();
        createSupplierCreditFile_page.getTickerSymbol.sendKeys("610000");
        createSupplierCreditFile_page.clickIndustry.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getIndustry);
        createSupplierCreditFile_page.getIndustry.click();
        createSupplierCreditFile_page.getDRSKRating.clear();
        createSupplierCreditFile_page.getDRSKRating.sendKeys("1");
        createSupplierCreditFile_page.getLastFiscalYear.click();
        createSupplierCreditFile_page.clickLastFiscalYear.click();
        createSupplierCreditFile_page.getBuyerCOGS.clear();
        createSupplierCreditFile_page.getBuyerCOGS.sendKeys("0");
        createSupplierCreditFile_page.upFileScreenshotOfDRSKRating.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        createSupplierCreditFile_page.clickInLastYearReportingCurrency.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getInLastYearReportingCurrency);
        createSupplierCreditFile_page.getInLastYearReportingCurrency.click();
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
        createSupplierCreditFile_page.upFinancialInformationInLastYear.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        createSupplierCreditFile_page.clickInYearBeforeLastReportingCurrency.click();
        bddUtil.scrollWindowToElement(createSupplierCreditFile_page.getInYearBeforeLastReportingCurrency);
        createSupplierCreditFile_page.getInYearBeforeLastReportingCurrency.click();
        createSupplierCreditFile_page.getInYearBeforeLastNetProfit.clear();
        createSupplierCreditFile_page.getInYearBeforeLastNetProfit.sendKeys("0");
        createSupplierCreditFile_page.upFileFinancialInformationInYearBeforeLast.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        createSupplierCreditFile_page.upFileOtherFiles.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        createSupplierCreditFile_page.clickSave.click();
        bddUtil.sleep(2);
    }
    @Step
    public void submitSupplierCreditProfile(){
        createSupplierCreditFile_page.clickSubmit.click();
        bddUtil.sleep(5);

    }
}

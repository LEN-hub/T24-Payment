package com.glbank.com.sg.bdd.steps.supplyChains.creditFile;

import com.glbank.com.sg.bdd.pages.supplyChains.creditFile.createBuyerCreditFile_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;


public class createBuyerCreditFile_step extends ScenarioSteps {

    private createBuyerCreditFile_page createBuyerCreditFile_page;
    private BDDUtil bddUtil;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/test.jpg";
    @Step
    public void clickBuyerCreditProfileList(){
        createBuyerCreditFile_page.clickBuyerCreditProfileList.click();
    }
    @Step
    public void clickCreateNewUnderwriting(){
        createBuyerCreditFile_page.clickCreateNewUnderwriting.click();
    }
    @Step
    public void createNewUnderwriting(String companyName){
        createBuyerCreditFile_page.clickToGetCustomerName.click();
        bddUtil.scrollWindowToElement(createBuyerCreditFile_page.find(By.xpath("//span[text()='"+ companyName +"']"))).click();
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
        createBuyerCreditFile_page.getDRSKRating.sendKeys("100000");
//        createBuyerCreditFile_page.upScreenshotOfDRSKRating.click();
        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        getDriver().findElement(By.xpath("//label[@for='A0022']/following-sibling::div//input")).sendKeys(fileAddress);
        bddUtil.sleep(3);
        bddUtil.scrollWindowToElement(getDriver().findElement(By.xpath("//label[@for='bloombergDrskRatings']")));
        createBuyerCreditFile_page.getToReportingCurrency.click();
        bddUtil.scrollWindowToElement(createBuyerCreditFile_page.getReportingCurrency);
        createBuyerCreditFile_page.getReportingCurrency.click();
        createBuyerCreditFile_page.getTotalLiabilities.clear();
        createBuyerCreditFile_page.getTotalLiabilities.sendKeys("100000");
        createBuyerCreditFile_page.getCurrentLiabilities.clear();
        createBuyerCreditFile_page.getCurrentLiabilities.sendKeys("100000");
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
//        bddUtil.scrollWindowToElement(createBuyerCreditFile_page.getToReportingCurrency);
//        createBuyerCreditFile_page.upFinancialInformationInLastYear.click();
        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        getDriver().findElement(By.xpath("//label[@for='A0020']/following-sibling::div//input")).sendKeys(fileAddress);
//        bddUtil.sleep(5);
//        createBuyerCreditFile_page.upOtherFiles.click();
        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        getDriver().findElement(By.xpath("//label[@for='B0030']/following-sibling::div//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        createBuyerCreditFile_page.clickSaveBuyerCreditProfile.click();
        bddUtil.sleep(2);
//        createBuyerCreditFile_page.clickBackBtn.click();   // 不用点击返回按钮了
        bddUtil.sleep(2);
        createBuyerCreditFile_page.inputCompanyText.sendKeys(FileUtils.LastReadFileInput3("buyer"));
        createBuyerCreditFile_page.clickStatusTitle.click();
        bddUtil.sleep(2);
        bddUtil.clickByJS(createBuyerCreditFile_page.clickSubmitBtn);
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

    @Step
    public void checkBuyerStatus() throws Exception{
        createBuyerCreditFile_page.companyNameInput.sendKeys(FileUtils.LastReadFileInput3("buyer"));
        createBuyerCreditFile_page.companyBtn.click();
        bddUtil.sleep(5);
        if (createBuyerCreditFile_page.buyerCreditFileStatus.getText().equals("Under Credit Review")){
            System.out.println("创建信用档案成功");
        }else {
            throw new Exception("创建信用档案失败");
        }
    }

}

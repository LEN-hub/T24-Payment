package com.hsbc.cmb.hk.dbb.steps.ProductSettings;

import com.hsbc.cmb.hk.dbb.pages.ProductSettings.product_page;
import com.hsbc.cmb.hk.dbb.utils.*;
import cucumber.api.java.bs.I;
import cucumber.deps.com.thoughtworks.xstream.io.binary.Token;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class product_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private product_page productPage;

    public static String content = JRandomNameTool.getStringRandom(6);

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        productPage.openUrl(logonUrl);
    }

    @Step
    public void clickProducts() {productPage.products.click();}

    @Step
    public void productList() {
        productPage.List.click();
    }

    @Step
    public void creatProduct() {productPage.addDrop.click();}

    @Step
    public void name() {productPage.name.sendKeys(content);}

    @Step
    public void code() {productPage.code.sendKeys(RandomPhoneNumber.randomPhoneNum());}

    @Step
    public void productType() {productPage.Type.click();}

    @Step
    public void clickPostACC() { productPage.postAcc.click();}

    @Step
    public void sendkeysStart(String Value) {productPage.start.sendKeys(Value);}

    @Step
    public void sendkeysEnd(String Value) { productPage.end.sendKeys(Value);}

    @Step
    public void clickDocs() {productPage.Docs.click();}

    @Step
    public void clickAccepted() {productPage.Accepted.click();}

    @Step
    public void clickPaid() {productPage.Paid.click();}

    @Step
    public void clickSeller() {productPage.seller.click();}

    @Step
    public void clickCOLLETCD() {productPage.colletced.click();}

    @Step
    public void clickDiscount() {productPage.discount.click();}

    @Step
    public void clickRepayment() {productPage.Repayment.click();}

    @Step
    public void  clickFull() {productPage.FULL.click();}

    @Step
    public void sendkeysRatio(String Value) { productPage.Ratio.sendKeys(Value);}

    @Step
    public void clickTerm() {productPage.Term.click();}

    @Step
    public void clickWithout() {productPage.Without.click();}

    @Step
    public void clickIPU() {productPage.IPU.click();}

    @Step
    public void clickoneN() {productPage.one.click();}

    @Step
    public void clickMOU() {productPage.MOU.click();}

    @Step
    public void clicktwoN() {productPage.two.click();}

    @Step
    public void clickLimit() {productPage.Limit.click();}

    @Step
    public void clickBoth() {productPage.Both.click();}

    @Step
    public void clickSubmit() {
        productPage.submit.click();
        bddUtil.sleep(3);}

    //需要添加一个判断，是否创建成功

    @Step
    public void clickQuoteList() {productPage.clickQuoteList.click();}   //第二个

    @Step
    public void clickCreateQuoto() {
        productPage.productManagerTitle.isVisible();
        productPage.clickCreateQuoto.click(); }


    @Step
    public void secondContentName(){               //自动获取创建产品的名称
        productPage.createquoteTitle.isVisible();
        productPage.productName.click();
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//body/div[2]//li/span[text()='"+content+"']"))).click();
    }

    @Step
    public void clickFunder(){productPage.Funder.click();}

    @Step
    public void clickGLB(){productPage.GLB.click();}



    @Step                //supplier  供应商选择，因为目前的供应商值是不定的，所以通过变量来添加
    public void clickSupplier(String value){
        productPage.supplier.click();
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//body/div[4]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='"+value+"']"))).click();

    }

    @Step
    public void clickBuyer(){
        productPage.Buyer.click();}

//    @Step
//    public void selectBuyerList(){
//        String filePath = "D:\\Program Files (x86)\\workspace\\DBB_GL_AutoTestting-dev\\src\\test\\resources\\testData\\autopay\\testData.txt";
//        List<WebElementFacade> buyer = productPage.buyerList;
//        for (int i = 0; i< buyer.size();i++){
//            if (buyer != null){
//                List<String> fileContent = Collections.singletonList(FileUtils.FileRead(filePath));
//                for (int j = 0; j< fileContent.size();j++){
//                    List<String> fileTest = asList(fileContent.get(j));
//                    if (fileContent.size() == 1){
//                        bddUtil.scrollWindowToElement(buyer.get(i)).click();
//                        List<String> strs = asList(buyer.get(i).getText());
//                        FileUtils.FileWrite(filePath,strs.stream().collect(Collectors.joining("\r\n")));
//                    }else if (fileContent.size()>1){
//                        bddUtil.scrollWindowToElement(buyer.get(fileContent.size()+1)).click();
//                        List<String> strs = asList(buyer.get(fileContent.size()+1).getText());
//                        FileUtils.FileWrite(filePath,strs.stream().collect(Collectors.joining("\r\n")));
//                    }
//                    break;
//                }
//            }
//            break;
//        }
//    }

    @Step
    public void clickBuyerKey(){
        productPage.BuyerKey.click();}      //所选的值与供应商对应,所以不能用固定值

    @Step
    public void clickCurrency(){productPage.Currency.click();}

    @Step
    public void clickSGD(){productPage.SGD.click();}

    @Step
    public void clickQuotationMode(){productPage.QuotationMode.click();}

    @Step
    public void clickFixed(){productPage.Fixed.click();}

    @Step
    public void clickInterestRate(String Value){productPage.InterestRate.sendKeys(Value);}

    @Step
    public void clickInterestRateOverdue(String Value){productPage.InterestRateOverdue.sendKeys(Value);}

    @Step
    public void clickFeePaidBy(){productPage.FeePaidBy.click();}

    @Step
    public void clickFeePaidByBuyer(){productPage.FeePaidByBuyer.click();}

    @Step
    public void clickFeeCollectedat(){productPage.FeeCollectedat.click();}

    @Step
    public void clickFeeCollectedatDiscount(){productPage.FeeCollectedatDiscount.click();}

    @Step
    public void clickFeeCalculatedby(){productPage.FeeCalculatedby.click();}

    @Step
    public void clickProportionalRate(){productPage.ProportionalRate.click();}

    @Step
    public void clickFeeRatE(String Value){productPage.FeeRatE.sendKeys(Value);}

    @Step
    public void clickInterestRateExtension(String Value){productPage.InterestRateExtension.sendKeys(Value);}

    @Step
    public void clickPlatformServiceFeeRate(String Value){productPage.PlatformServiceFeeRate.sendKeys(Value);}

    @Step
    public void clickSubmitOne(){productPage.SubmitOne.click();}


    //第三个

    @Step
    public void clickProductProfile(){
        productPage.ProductProfileC.click();
       }

    @Step
    public void clickAddProductProfile(){
        productPage.productManagerTitle.isVisible();
        productPage.CreatAddProductProfile.click();}

    @Step            //选择创建报价的供应商名称
    public void clickClientName(String value){
        productPage.clientName.click();
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//body/div[4]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='"+value+"']"))).click();

    }

    @Step
    public void clickProductName(){productPage.productName.click();}

    @Step             //选择供应商对应的名字（也就是创建产品的名称）
    public void SendKeyProductName(){
        productPage.ProductNAME.click();
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//div[@x-placement='bottom-start']//li/span[text()='"+content+"']"))).click();
    }


    @Step
    public void clickFunderOne(){productPage.FunderOe.click();}

    @Step
    public void clickFunderOneGLB(){productPage.FunDeronGLB.click();}

    @Step
    public void clickBuyerOne(){productPage.BuyerOne.click();}

    @Step
    public void clickFinancingMode(){productPage.FinancingMode.click();}

    @Step
    public void clickFinancingModeManual(){productPage.FinancingModeManual.click();}

    @Step
    public void clickRefundInterest(){productPage.RefundInterest.click();}

    @Step
    public void clickRefundInterestN(){productPage.RefundInterestN.click();}

    @Step
    public void clickEstimatedFinancingTenor(String value){productPage.EstimatedFinancingTenor.sendKeys(value);}

    @Step
    public void clickGracePeriod(String value){productPage.GracePeriod.sendKeys(value);}

    @Step
    public void clickConfirm(){productPage.Confirm.click();}

    @Step
    public void JumpToSupplierPortal() {
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open('http://119.8.173.195:8080')");
        bddUtil.switchToNewWindow();
        bddUtil.sleep(40);
        }

    @Step
    public void SupplierEmail(String value) {
        productPage.Email.sendKeys(value);
    }
    @Step
    public void SupplierPassword(String value) {
        productPage.PasswordEmail.sendKeys(value);}
    @Step
    public void SupplierEnterCompanyID(String value) {productPage.EnterCompanyID.sendKeys(value);}

    @Step
    public void SupplierEnterCode(String value) {productPage.EnterCode.sendKeys(value);}

    @Step
    public void SupplierLoginProducts(){productPage.LoginProducts.click();}


}


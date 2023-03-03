package com.glbank.com.sg.bdd.steps.supplyChains.ProductSettings;

import com.glbank.com.sg.bdd.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class product_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private com.hsbc.cmb.hk.dbb.pages.supplyChains.ProductSettings.product_page productPage;

    public static String content = JRandomNameTool.getStringRandom(6);

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        productPage.openUrl(logonUrl);
    }

    @Step
    public void clickProducts() {
        bddUtil.sleep(5);
        productPage.products.click();
        bddUtil.sleep(3);
    }

    @Step
    public void productList() {
        productPage.List.click();
    }

    @Step
    public void creatProduct() {
        productPage.addDrop.click();
    }

    @Step
    public void name() {
        productPage.name.sendKeys(content);
    }

    @Step
    public void code() {
        productPage.code.sendKeys("SCF.REV.PF.BWREC");
    }

    @Step
    public void productType() {
        productPage.Type.click();
    }

    @Step
    public void clickPostACC() {
        productPage.postAcc.click();
    }

    @Step
    public void sendkeysStart(String Value) {
        productPage.start.sendKeys(Value);
    }

    @Step
    public void sendkeysEnd(String Value) {
        productPage.end.sendKeys(Value);
    }

    @Step
    public void clickDocs() {
        productPage.code.click();
        productPage.Docs.click();
    }

    @Step
    public void clickAccepted() {
        productPage.Accepted.click();
    }

    @Step
    public void clickPaid() {
        productPage.Paid.click();
    }

    @Step
    public void clickSeller() {
        productPage.seller.click();
    }

    @Step
    public void clickCOLLETCD() {
        productPage.colletced.click();
    }

    @Step
    public void clickDiscount() {
        productPage.discount.click();
    }

    @Step
    public void clickRepayment() {
        productPage.Repayment.click();
    }

    @Step
    public void clickFull() {
        productPage.FULL.click();
    }

    @Step
    public void clickPartial(){
        productPage.partial.click();
    }

    @Step
    public void sendkeysRatio(String Value) {
        productPage.Ratio.sendKeys(Value);
    }

    @Step
    public void clickTerm() {
        productPage.Term.click();
    }

    @Step
    public void clickWithout() {
        productPage.Without.click();
    }

    @Step
    public void clickIPU() {
        productPage.IPU.click();
    }

    @Step
    public void clickoneN() {
        productPage.one.click();
    }

    @Step
    public void clickMOU() {
        productPage.MOU.click();
    }

    @Step
    public void clicktwoN() {
        productPage.two.click();
    }

    @Step
    public void clickLimit() {
        productPage.Limit.click();
    }

    @Step
    public void clickBoth() {
        productPage.Both.click();
    }

    @Step
    public void clickSubmit() {
//        两个新增字段
        productPage.pool.click();
        getDriver().findElements(By.xpath("//span[text()='N']")).get(2).click();
//        productPage.financingTenor.sendKeys("500");//新版本 业务变更不用这个字段了
        productPage.CreditTerm.sendKeys("300");
        productPage.GracePeriod1.sendKeys("201");
        productPage.submit.click();
        bddUtil.sleep(5);

    }
    @Step
    public void refreshCheck(){
        productPage.name.sendKeys(content);
        productPage.refresh.click();
        assertEquals("Active", productPage.find(By.xpath("//td[@data-key='f2e7uikt']")).getText());
    }



    @Step
    public void clickQuoteList() {
        productPage.clickQuoteList.click();
    }   //第二个

    @Step
    public void clickCreateQuoto() {
        productPage.productManagerTitle.isVisible();
        bddUtil.sleep(1);
        productPage.clickCreateQuoto.click();
    }


    @Step
    public void secondContentName() {               //自动获取创建产品的名称
        productPage.createquoteTitle.isVisible();
        bddUtil.sleep(3);
        productPage.productName.click();
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//body/div[2]//li/span[text()='" + content + "']"))).click();
    }

    @Step
    public void clickFunder() {
        productPage.Funder.click();
    }

    @Step
    public void clickGLB() {
//        bddUtil.sleep(10);
        //显性等待等待 加载
        WebDriverWait driverWait = new WebDriverWait(getDriver(), 50);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Green Link Digital Bank')]")));
        productPage.GLB.click();
    }

    public void clickSupplier() {
        productPage.supplier.click();
    }

    @Step
    public void SupplierKey() {
        bddUtil.sleep(1);
//        List<WebElementFacade> textValue = productPage.supplierSelectList;
//        for (int i = 0; i < textValue.size(); i++) {
//            if (FileUtils.LastReadFileInput3("companyData").equals(textValue.get(i).getText())) {
//                bddUtil.scrollWindowToElement(textValue.get(i)).click();
//                break;
//            }
//        }
        String supplierName = FileUtils.LastReadFileInput3("companyData");
        //显示等待判断是否加载出来
        WebDriverWait driverWait = new WebDriverWait(getDriver(), 50);
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@x-placement='bottom-start' or @x-placement='top-start' ]//span")));
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='"+supplierName+"']"))).click();
        bddUtil.sleep(1);
    }

    @Step
    public void clickBuyer() {
        bddUtil.sleep(3);
        productPage.Buyer.click();
        bddUtil.sleep(3);
    }

    @Step
    public void clickBuyerKey() {
        bddUtil.sleep(1);
//        List<WebElementFacade> textValue = productPage.BuyerSelectList;
//        for (int i = 0; i < textValue.size(); i++) {
//            if (FileUtils.LastReadFileInput3("buyer").equals(textValue.get(i).getText())) {
//                bddUtil.scrollWindowToElement(textValue.get(i)).click();
//                break;
//            }
//        }
        String buyerName = FileUtils.LastReadFileInput3("buyer");
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='"+buyerName+"']"))).click();
        bddUtil.sleep(1);
    }


    @Step
    public void clickCurrency() {
        productPage.Currency.click();
        CommonUtil.waiting(3000);
    }

    @Step
    public void clickCurrency(String selectCurr) {
        List<WebElementFacade> usd = productPage.selectCurr;
        for (int i = 0; i < usd.size(); i++) {
            if (selectCurr.equals(usd.get(i).getText())) {
                usd.get(i).click();
                break;
            }
        }
    }


    @Step
    public void clickQuotationMode() {
        productPage.QuotationMode.click();

    }

    @Step
    public void clickFixed() {
        productPage.Fixed.click();
    }

    @Step
    public void clickInterestRate(String Value) {
        productPage.InterestRate.sendKeys(Value);
    }

    @Step
    public void clickInterestRateOverdue(String Value) {
        productPage.InterestRateOverdue.sendKeys(Value);
    }

    @Step
    public void clickFeePaidBy() {
        productPage.FeePaidBy.click();
    }

    @Step
    public void clickFeePaidByBuyer() {
        productPage.FeePaidByBuyer.click();
    }

    @Step
    public void clickFeeCollectedat() {
        productPage.FeeCollectedat.click();
    }

    @Step
    public void clickFeeCollectedatDiscount() {
        productPage.FeeCollectedatDiscount.click();
    }

    @Step
    public void clickFeeCalculatedby() {
        productPage.FeeCalculatedby.click();
    }

    @Step
    public void clickProportionalRate() {
        productPage.ProportionalRate.click();
    }

    @Step
    public void clickFeeRatE(String Value) {
        productPage.FeeRatE.sendKeys(Value);
    }

    @Step
    public void clickInterestRateExtension(String Value) {
        productPage.InterestRateExtension.sendKeys(Value);
    }

    @Step
    public void clickPlatformServiceFeeRate(String Value) {
        productPage.PlatformServiceFeeRate.sendKeys(Value);
    }

    @Step
    public void clickSubmitOne() {
        productPage.SubmitOne.click();
    }


    //第三个

    @Step
    public void clickProductProfile() {
        productPage.ProductProfileC.click();
    }

    @Step
    public void clickAddProductProfile() {
        productPage.productManagerTitle.isVisible();
        productPage.CreatAddProductProfile.click();
    }

    @Step            //选择创建报价的供应商名称
    public void clickClientName() {
        productPage.clientName.click();
//        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//body/div[4]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='"+value+"']"))).click();

    }

    @Step
    public void clickProductName() {
        productPage.productName.click();
    }

    @Step             //选择供应商对应的名字（也就是创建产品的名称）
    public void SendKeyProductName() {
//        productPage.ProductNAME.click();
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//div[@x-placement='top-start' or @x-placement='bottom-start']//li/span[text()='" + content + "']"))).click();
    }


    @Step
    public void clickFunderOne() {
        productPage.FunderOe.click();
    }

    @Step
    public void clickFunderOneGLB() {
        bddUtil.sleep(1);
        productPage.FunDeronGLB.click();
    }

    @Step
    public void clickBuyerOne() {
        productPage.BuyerOne.click();
    }

    @Step
    public void clickFinancingMode() {
        productPage.FinancingMode.click();
    }

    @Step
    public void clickFinancingModeManual() {
        productPage.FinancingModeManual.click();
    }

    @Step
    public void clickRefundInterest() {
        productPage.RefundInterest.click();
    }

    @Step
    public void clickRefundInterestN() {
        bddUtil.sleep(2);
        productPage.RefundInterestN.click();
    }

    @Step
    public void clickEstimatedFinancingTenor(String value) {
        productPage.EstimatedFinancingTenor.sendKeys(value);
    }

    @Step
    public void clickGracePeriod(String value) {
        productPage.GracePeriod.clear();
        productPage.GracePeriod.sendKeys(value);
        productPage.setUpFee.sendKeys("5");
//        getDriver().findElement(By.xpath("//div[@data-key='f0vilgld']//input")).sendKeys("5");
    }

    @Step
    public void clickConfirm() {
        productPage.Confirm.click();
        bddUtil.sleep(4);
    }

    @Step
    public void jumpToSupplierPortal() {     //跳转供应商门户
        JavascriptExecutor webdriver = (JavascriptExecutor) getDriver();
        webdriver.executeScript("window.open('http://10.24.9.126:8080/#/login')");
        bddUtil.switchToNewWindow();
        bddUtil.sleep(10);
    }
    @Step
    public void openEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        System.out.println("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");
        bddUtil.switchToNewWindow();
        if (productPage.errorText.isVisible()){
            productPage.advancedButton.click();
            productPage.enterEmailLink.click();
        }
        productPage.firstEmail.click();
//        String password = productPage.emailPassword.getText();
        productPage.greenLinkSystem.isVisible();
        bddUtil.sleep(2);
//        productPage.greenLinkSystem.click();
        productPage.plainText.click();
        bddUtil.sleep(1);
        productPage.tokenLink.click();
    }


    @Step
    public void loginServiceAgreementWindow() {
        bddUtil.switchToWindows();
        productPage.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        productPage.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        productPage.enterCompanyId.sendKeys("1234");
        productPage.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(3);
//        productPage.advancedButton.click();
//        productPage.enterEmailLink.click();
        productPage.clickRefreshBtn.click();
        bddUtil.sleep(1);
        productPage.thirdEmail.click();
        String Vcode = productPage.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        productPage.inputSendCode.sendKeys(Vcode);
        productPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(10);
//        assertEquals("Post Acceptance",productPage.find(By.xpath("//div[@class='list-left-bottom simple']//span[text()=' Post Acceptance ']")).getText());
    }
}






package com.glbank.com.sg.bdd.steps.supplyChains.ProductSettings;

import com.glbank.com.sg.bdd.pages.supplyChains.ProductSettings.product_page;
import com.glbank.com.sg.bdd.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.*;

import java.util.List;

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
    public void clickProducts() {
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
        productPage.code.sendKeys("SCF.REV.PF.BMLTDREC");
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
        productPage.clickCreateQuoto.click();
    }


    @Step
    public void secondContentName() {               //自动获取创建产品的名称
        productPage.createquoteTitle.isVisible();
        productPage.productName.click();
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//body/div[2]//li/span[text()='" + content + "']"))).click();
    }

    @Step
    public void clickFunder() {
        productPage.Funder.click();
    }

    @Step
    public void clickGLB() {
        productPage.GLB.click();
    }

    public void clickSupplier() {
        productPage.supplier.click();
    }

    @Step
    public void SupplierKey() {
        List<WebElementFacade> textValue = productPage.supplierSelectList;
        for (int i = 0; i < textValue.size(); i++) {
            if (FileUtils.LastReadFileInput3("test").equals(textValue.get(i).getText())) {
                bddUtil.scrollWindowToElement(textValue.get(i)).click();
                break;
            }
        }

    }

    @Step
    public void clickBuyer() {

        productPage.Buyer.click();
        bddUtil.sleep(2);
    }

    @Step
    public void clickBuyerKey() {
        List<WebElementFacade> textValue = productPage.BuyerSelectList;
        for (int i = 0; i < textValue.size(); i++) {
            if (FileUtils.LastReadFileInput3("testBuyer").equals(textValue.get(i).getText())) {
                bddUtil.scrollWindowToElement(textValue.get(i)).click();
                break;
            }
        }
    }


    @Step
    public void clickCurrency() {
        productPage.Currency.click();
    }

    @Step
    public void clickSGD() {
        productPage.SGD.click();
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
        productPage.ProductNAME.click();
        bddUtil.scrollWindowToElement(productPage.find(By.xpath("//div[@x-placement='bottom-start']//li/span[text()='" + content + "']"))).click();
    }


    @Step
    public void clickFunderOne() {
        productPage.FunderOe.click();
    }

    @Step
    public void clickFunderOneGLB() {
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
        productPage.RefundInterestN.click();
    }

    @Step
    public void clickEstimatedFinancingTenor(String value) {
        productPage.EstimatedFinancingTenor.sendKeys(value);
    }

    @Step
    public void clickGracePeriod(String value) {
        productPage.GracePeriod.sendKeys(value);
    }

    @Step
    public void clickConfirm() {
        productPage.Confirm.click();
    }

    @Step
    public void jumpToSupplierPortal() {     //跳转供应商门户
        JavascriptExecutor webdriver = (JavascriptExecutor) getDriver();
        webdriver.executeScript("window.open('http://119.8.173.195:8080')");
        bddUtil.switchToNewWindow();
        bddUtil.sleep(10);
    }
    @Step
    public void openEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        System.out.println("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");
    }


    @Step
    public void loginServiceAgreementWindow() {
        productPage.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        productPage.GLDBEmailPassword.sendKeys("Gl123456-");
        productPage.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        productPage.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(3);
        productPage.clickRefreshBtn.click();
        bddUtil.sleep(1);
        productPage.thirdEmail.click();
        String Vcode = productPage.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        productPage.inputSendCode.sendKeys(Vcode);
        productPage.GLDBEmailLoginBtn.click();
        bddUtil.sleep(10);
        assertEquals("Post Acceptance",productPage.find(By.xpath("//div[@class='list-left-bottom simple']/p[4]/span")).getText());
    }
}






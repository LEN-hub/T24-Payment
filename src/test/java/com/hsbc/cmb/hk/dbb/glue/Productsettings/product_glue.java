package com.hsbc.cmb.hk.dbb.glue.Productsettings;

import com.hsbc.cmb.hk.dbb.steps.ProductSettings.product_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.com.thoughtworks.xstream.io.binary.Token;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class product_glue {

    @ManagedPages
    public Pages pages;

    @Steps
    private product_step productStep;
    private BDDUtil bddUtil;
    public static String envTag;


    @When("^logon \"([^\"]*)\" on tubea by inputting system$")
    public void logon_onboarding_custom_portal(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            productStep.open_the_first_dbb_logon_page(envName);
//            productStep.enter_Organisation_ID("123456");
        }

    }

    @When("^I click product$")
    public void iClickProduct() {
        productStep.clickProducts();
    }

    @When("^I click on Product List$")
    public void iClickOnProductList() {
        productStep.productList();
    }

    @And("^click Create Product$")
    public void clickCreateProduct() {
        productStep.creatProduct();
    }

    @When("^enter the page information$")
    public void enterThePageInformation() {
        productStep.name();
        productStep.code();
        productStep.productType();
        productStep.clickPostACC();
        productStep.sendkeysStart("2022-01-19");
        productStep.sendkeysEnd("2024-01-19");
        productStep.clickDocs();
        productStep.clickAccepted();
        productStep.clickPaid();
        productStep.clickSeller();
        productStep.clickCOLLETCD();
        productStep.clickDiscount();
        productStep.clickRepayment();
        productStep.clickFull();
        productStep.sendkeysRatio("80");
        productStep.clickTerm();
        productStep.clickWithout();
        productStep.clickIPU();
        productStep.clickoneN();
        productStep.clickMOU();
        productStep.clicktwoN();
        productStep.clickLimit();
        productStep.clickBoth();
    }

    @Then("^click Submit to submit a new product$")
    public void clickSubmitToSubmitANewProduct() {
        productStep.clickSubmit();
    }


    //第二个脚本

    @When("^I click on Quote List$")
    public void iClickOnQuoteList() {
        productStep.clickQuoteList();
    }


    @And("^click Create Quote$")
    public void clickCreateQuote() {
        productStep.clickCreateQuoto();
    }


    @When("^enter the second case information and select supplier \"([^\"]*)\" on this page$")
    public void enterTheSecondCaseInformationAndSelectSupplierOnThisPage(String value) {
        productStep.secondContentName();
        productStep.clickFunder();
        productStep.clickGLB();
        productStep.clickSupplier(value);          //supplier  供应商选择，值不定，变量引用
        productStep.clickBuyer();
        productStep.clickBuyerKey();          //所选的值与供应商对应，买方
        productStep.clickCurrency();
        productStep.clickSGD();
        productStep.clickQuotationMode();
        productStep.clickFixed();
        productStep.clickInterestRate("5");
        productStep.clickInterestRateOverdue("10");
        productStep.clickFeePaidBy();
        productStep.clickFeePaidBySeller();
        productStep.clickFeeCollectedat();
        productStep.clickFeeCollectedatDiscount();
        productStep.clickFeeCalculatedby();
        productStep.clickProportionalRate();
        productStep.clickFeeRatE("0");
        productStep.clickInterestRateExtension("0");
        productStep.clickPlatformServiceFeeRate("0");


    }

    @Then("^I click Submit to submit a new product$")
    public void iClickSubmitToSubmitANewProduct() {
        productStep.clickSubmitOne();
    }

//第三个脚本

    @When("^I click ProductProfile$")
    public void iClickProductProfile() {
        productStep.clickProductProfile();
    }


    @And("^click Create ProductProfile$")
    public void clickCreateProductProfile() {
        productStep.clickAddProductProfile();
    }


    @When("^Enter page information and select Client Name \"([^\"]*)\" on this page$")
    public void enterPageInformationAndSelectClientNameOnThisPage(String value) {
        productStep.clickClientName(value);          //供应商的名字
        productStep.clickProductName();             //供应商对应产品名称
        productStep.SendKeyProductName();
        productStep.clickFunderOne();
        productStep.clickFunderOneGLB();
        productStep.clickBuyerOne();
        productStep.clickBuyerKey();  //供应商对应的买方信息,不确定因素
        productStep.clickFinancingMode();
        productStep.clickFinancingModeManual();
        productStep.clickRefundInterest();
        //   需要创建变量（yes/no） Refund Interest
        productStep.clickEstimatedFinancingTenor("10");
        productStep.clickGracePeriod("20");


    }
}




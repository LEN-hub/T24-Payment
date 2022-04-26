package com.glbank.com.sg.bdd.glue.supplyChains.Productsettings;

import com.glbank.com.sg.bdd.steps.supplyChains.ProductSettings.product_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.util.List;
import java.util.Map;

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
        productStep.sendkeysStart("2022-03-01");
        productStep.sendkeysEnd("2025-03-10");
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

    @Then("^Refresh check whether the data is added successfully$")
    public void refreshCheckWhetherTheDataIsAddedSuccessfully() {
        productStep.refreshCheck();
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

    @When("^enter the second case information supplier with buyer$")
    public void enterTheSecondCaseInformationSupplierWithBuyer(DataTable payDetails) {
        productStep.secondContentName();
        productStep.clickFunder();
        productStep.clickGLB();
        productStep.clickSupplier();
        productStep.SupplierKey();
        productStep.clickBuyer();
        productStep.clickBuyerKey();
        bddUtil.sleep(1);
        productStep.clickCurrency();
        List<Map<String, String>> payToI = payDetails.asMaps(String.class,String.class);
        productStep.clickCurrency(payToI.get(0).get("selectCurr"));
        productStep.clickQuotationMode();
        productStep.clickFixed();
        productStep.clickInterestRate("5");
        productStep.clickInterestRateOverdue("10");
        productStep.clickFeePaidBy();
        productStep.clickFeePaidByBuyer();
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


    @When("^enter the second case information supplier and buyer$")
    public void enterTheSecondCaseInformationSupplierAndBuyer() {
        productStep.clickClientName();          //供应商的名字，应用第二个脚本即可
        productStep.SupplierKey();
        productStep.clickProductName();             //供应商对应产品名称
        productStep.SendKeyProductName();
        productStep.clickFunderOne();
        productStep.clickFunderOneGLB();
        productStep.clickBuyerOne();
        productStep.clickBuyerKey();
        productStep.clickFinancingMode();
        productStep.clickFinancingModeManual();
        productStep.clickRefundInterest();
        productStep.clickRefundInterestN();
        productStep.clickEstimatedFinancingTenor("10");
        productStep.clickGracePeriod("20");
    }

    @Then("^I click Submit product profile$")
    public void iClickSubmitProductProfile() {
        productStep.clickConfirm();
    }


    @When("^The vendor logs in to the vendor portal to view products$")
    public void theVendorLogsInToTheVendorPortalToViewProducts() {
        productStep.jumpToSupplierPortal();
    }

    @And("^Enter login information$")
    public void enterLoginInformation() {
        productStep.openEmailUrlTest();
        productStep.loginServiceAgreementWindow();
    }


}





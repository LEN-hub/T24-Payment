package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.loanApplication_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class loanApplication_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private loanApplication_step loanApplication_step;
    private BDDUtil bddUtil;

    @When("^I hover over the loan business$")
    public void iHoverOverTheLoanBusiness() {
        loanApplication_step.FloatingLoanButton();
    }

    @When("^I continue to fill in the information$")
    public void iContinueToFillInTheInformation(DataTable amount) {
        List<Map<String, String>> loanAmount = amount.asMaps(String.class,String.class);
        loanApplication_step.sendInformation(loanAmount.get(0).get("amount"));
    }

    @When("^I choose personal guarantor$")
    public void iChoosePersonalGuarantor(DataTable name) {
        List<Map<String, String>> maps = name.asMaps(String.class, String.class);
        loanApplication_step.selectPersonalGuarantor(maps.get(0).get("name"));
    }

    @And("^I select birthday and input Industry experience$")
    public void iSelectBirthdayAndInputIndustryExperience(DataTable experience) {
        List<Map<String, String>> maps = experience.asMaps(String.class, String.class);
        loanApplication_step.selectBirthday(maps.get(0).get("experience"));
    }

    @When("^I select personal guarantor$")
    public void iSelectPersonalGuarantor(DataTable name) {
        List<Map<String, String>> maps = name.asMaps(String.class, String.class);
        loanApplication_step.selectGuarantor(maps.get(0).get("name"),maps.get(0).get("birthday"),maps.get(0).get("idCard"),maps.get(0).get("phoneNum"),maps.get(0).get("email"),maps.get(0).get("experience"));
    }

    @When("^I declare my financial situation$")
    public void iDeclareMyFinancialSituation(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputFinancialStatus(maps.get(0).get("reportDate"),maps.get(0).get("netSales"),maps.get(0).get("preTaxSales"),maps.get(0).get("totalAssets"),maps.get(0).get("dibtAssets"));
    }

    @When("^I announce my financial report two$")
    public void iAnnounceMyFinancialReportTwo(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputSecondFinancialStatus(maps.get(0).get("reportDate"),maps.get(0).get("netSales"),maps.get(0).get("preTaxSales"),maps.get(0).get("totalAssets"),maps.get(0).get("dibtAssets"));
    }

    @When("^I fill out other financial commitments$")
    public void iFillOutOtherFinancialCommitments(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputOtherFinancialCommitment(maps.get(0).get("financialInstitutionName"),maps.get(0).get("loanAmt"),maps.get(0).get("outstandingAmt"),maps.get(0).get("monthlyInstallments"),maps.get(0).get("rate"));
    }

    @When("^I upload the three required documents$")
    public void iUploadTheThreeRequiredDocuments(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.upLoadFile(maps.get(0).get("fileAddress"));

    }

    @When("^I click next button on the upLoadFile page$")
    public void iClickNextButtonOnTheUpLoadFilePage() {
        loanApplication_step.clickNextBtn();
    }

    @When("^I choose a turnover of one million to two million$")
    public void iChooseATurnoverOfOneMillionToTwoMillion(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.selectOneMillionTOTwoMillion(maps.get(0).get("amount"));
    }

    @When("^I select real estate mortgage$")
    public void iSelectRealEstateMortgage(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.selectRealEstateMortgage(maps.get(0).get("houseAddress"),maps.get(0).get("zipCode"),maps.get(0).get("constructionArea"));
    }

    @When("^I fill out other financial commitments on real estate mortgage$")
    public void iFillOutOtherFinancialCommitmentsOnRealEstateMortgage(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputOtherOnRealEstateMortgage(maps.get(0).get("financialInstitutionName"),maps.get(0).get("loanAmt"),maps.get(0).get("outstandingAmt"),maps.get(0).get("monthlyInstallments"),maps.get(0).get("rate"));
    }

    @When("^I upload the five required documents$")
    public void iUploadTheFiveRequiredDocuments(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.upLoadFileOnHouse(maps.get(0).get("fileAddress"));
    }

    @When("^I choose collection financing$")
    public void iChooseCollectionFinancing(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.selectCollectionFinancing(maps.get(0).get("amount"));
    }

    @When("^I provide primary buyer information$")
    public void iProvidePrimaryBuyerInformation(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputBuyerInformation(maps.get(0).get("name"),maps.get(0).get("RelationshipYears"),maps.get(0).get("annualSales"),maps.get(0).get("creditPeriod"));
    }

    @When("^I provide primary supplier information$")
    public void iProvidePrimarySupplierInformation(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputSupplierInformation(maps.get(0).get("name"),maps.get(0).get("RelationshipYears"),maps.get(0).get("annualSales"),maps.get(0).get("creditPeriod"));
    }

    @When("^I choose fixed asset loan$")
    public void iChooseFixedAssetLoan(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.selectCarFinancing(maps.get(0).get("amount"));
    }

    @When("^I choose corporate guarantor$")
    public void iChooseCorporateGuarantor(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.selectCorporateGuarantee(maps.get(0).get("registeredName"),maps.get(0).get("RegistrationNumber"),maps.get(0).get("registrationDate"),maps.get(0).get("address"),maps.get(0).get("city"),maps.get(0).get("zipCode"));
    }

    @When("^I fill out other financial commitments on company guarantee page$")
    public void iFillOutOtherFinancialCommitmentsOnCompanyGuaranteePage(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputOtherFinancialCommitmentOnCompany(maps.get(0).get("financialInstitutionName"),maps.get(0).get("loanAmt"),maps.get(0).get("outstandingAmt"),maps.get(0).get("monthlyInstallments"),maps.get(0).get("rate"));
    }

    @When("^I enter vehicle details$")
    public void iEnterVehicleDetails(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputVehicleDetails(maps.get(0).get("brand"),maps.get(0).get("price"));
    }

    @When("^I click the loan draw button$")
    public void iClickTheLoanDrawButton() {
        loanApplication_step.clickLoanDisbursementBtn();
    }

    @When("^I choose to apply for disbursement of financing receivables$")
    public void iChooseToApplyForDisbursementOfFinancingReceivables() {
        loanApplication_step.clickApplicationForPayment();
    }

    @When("^I have filled in the other information$")
    public void iHaveFilledInTheOtherInformation(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.inputApplyForAmount(maps.get(0).get("amount"),maps.get(0).get("dayNum"),maps.get(0).get("goodsDescr"),maps.get(0).get("fileAddress"));
    }

    @Then("^I should see Submitted successfully page$")
    public void iShouldSeeSubmittedSuccessfullyPage() {
        bddUtil.sleep(10);
    }

    @When("^I choose Singapore Dollar$")
    public void iChooseSingaporeDollar() {
        loanApplication_step.selectISingaporeDollar();
    }

    @When("^I choose US Dollar$")
    public void iChooseUSDollar() {
        loanApplication_step.selectUsDollar();
    }

    @When("^I click the loan Manage ment Button$")
    public void iClickTheLoanManageMentButton() {
        loanApplication_step.clickLoanManagement();
    }

    @When("^I click Prepay button$")
    public void iClickPrepayButton(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        loanApplication_step.clickPrepayBtn(maps.get(0).get("data"));
    }
}

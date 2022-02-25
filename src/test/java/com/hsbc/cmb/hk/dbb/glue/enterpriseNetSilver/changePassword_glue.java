package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.changePassword_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.pages.Pages;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class changePassword_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private changePassword_step changePassword_step;
    private BDDUtil bddUtil;

    @When("^I click forgotPassword button$")
    public void iClickForgotPasswordButton() {
        changePassword_step.clickForgotPassword();

    }

    @When("^I input other information on the forgotPassword page$")
    public void iInputOtherInformationOnTheForgotPasswordPage(DataTable forgotPassword) {

    }

    @When("^I login and manage the platform$")
    public void iLoginAndManageThePlatform(DataTable username) {
        List<Map<String, String>> maps = username.asMaps(String.class, String.class);
        changePassword_step.openRearTubePlatform(maps.get(0).get("url"),maps.get(0).get("username"),maps.get(0).get("password"));

    }

    @When("^I click the Enterprise User Management button$")
    public void iClickTheEnterpriseUserManagementButton() {
        changePassword_step.clickEnterpriseUserManagement();
    }

    @When("^I input select client number$")
    public void iInputSelectClientNumber(DataTable number) {
        List<Map<String, String>> maps = number.asMaps(String.class, String.class);
        changePassword_step.inputSelectClientNumber(maps.get(0).get("clientNumber"));
    }

    @When("^I choose to modify the account details$")
    public void iChooseToModifyTheAccountDetails(DataTable email) {
        List<Map<String, String>> maps = email.asMaps(String.class, String.class);
        changePassword_step.selectRequiredAccountDetails(maps.get(0).get("email"));
    }

    @When("^I input Enterprise customer number and other information$")
    public void iInputEnterpriseCustomerNumberAndOtherInformation(DataTable data) {
        List<Map<String, String>> maps = data.asMaps(String.class, String.class);
        changePassword_step.inputCustomerNumber(maps.get(0).get("customerNumber"));
    }

    @When("^I click idCard button and input idCardNumber$")
    public void iClickIdCardButtonAndInputIdCardNumber(DataTable idCard) {
        List<Map<String, String>> maps = idCard.asMaps(String.class, String.class);
        changePassword_step.clickIdCardBtn(maps.get(0).get("idCardNumber"));
    }

    @When("^I click passPort button and input passPortNumber$")
    public void iClickPassPortButtonAndInputPassPortNumber(DataTable passPort) {
        List<Map<String, String>> maps = passPort.asMaps(String.class, String.class);
        changePassword_step.clickPassPortBtn(maps.get(0).get("passPortNumber"));
    }

    @And("^I Select country code and enter mobile number$")
    public void iSelectCountryCodeAndEnterMobileNumber(DataTable code) {
        List<Map<String, String>> maps = code.asMaps(String.class, String.class);
        changePassword_step.selectCountryCode(maps.get(0).get("countryCode"),maps.get(0).get("iphoneNumber"));

    }

    @When("^I click get verification code button$")
    public void iClickGetVerificationCodeButton() throws AWTException {
        changePassword_step.clickCodeButton();
        changePassword_step.inputCode();
        bddUtil.sleep(10);
    }

    @When("^I input email address$")
    public void iInputEmailAddress(DataTable emailAddress) {
        List<Map<String, String>> maps = emailAddress.asMaps(String.class, String.class);
        changePassword_step.inputEmailAddress(maps.get(0).get("emailAddress"));
    }

    @When("^I click next button on the change Password page$")
    public void iClickNextButtonOnTheChangePasswordPage() {
        changePassword_step.clickNextBtn();
    }

    @When("^I input new password and click confirm button$")
    public void iInputNewPasswordAndClickConfirmButton() {
        changePassword_step.inputNewPassword();
    }

}

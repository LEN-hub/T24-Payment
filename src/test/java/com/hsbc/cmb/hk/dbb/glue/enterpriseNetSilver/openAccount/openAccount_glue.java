package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver.openAccount;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.Logon_step;
import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.openAccount.openAccount_step;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
import com.hsbc.cmb.hk.dbb.utils.JRandomNameTool;
import com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class openAccount_glue {

    @Steps
    private Logon_step logon_step;
    @Steps
    private openAccount_step openAccount_step;

    public static String envTag,accountType,currencyType;
    public static String accountName = "AutoTestAccountName" + JRandomNameTool.getStringRandom(5);
    public static String applicantName = "AutoTestApplicantName" + JRandomNameTool.getStringRandom(5);
    public static String emailName = JRandomNameTool.getStringRandom(5); //
    public static String contactPersonNm = "AutoTestDirector" + JRandomNameTool.getStringRandom(5);
    public static String aliasNm = "AutoTestDirectorAliasNm" + JRandomNameTool.getStringRandom(5);
    public static String passportNumber = JRandomNameTool.getStringRandom(10);
    public static String mobileNumber = RandomPhoneNumber.randomPhoneNum();
    public static String directorPhoneNumber = RandomPhoneNumber.randomPhoneNum();
    public static String directorEmailName = JRandomNameTool.getStringRandom(5);
    public static String ultimateBeneficialOwnerName = "AutoTestUBO" + JRandomNameTool.getStringRandom(5);
    public static String ultimateBeneficialOwnerAliasName = "AutoTestUBOAlias" + JRandomNameTool.getStringRandom(5);
    public static String ultimateBeneficialOwnerPassportNumber = JRandomNameTool.getStringRandom(10);
    public static String ultimateBeneficialOwnerPhoneNumber = RandomPhoneNumber.randomPhoneNum();
    public static String ultimateBeneficialOwnerEmailName = JRandomNameTool.getStringRandom(5);
    public static String onlyUBOName = "AutoTestUBO2" + JRandomNameTool.getStringRandom(5);
    public static String onlyUBOAliasName = "AutoTestUBO2Alias" + JRandomNameTool.getStringRandom(5);
    public static String onlyUBOPassportNumber = JRandomNameTool.getStringRandom(10);
    public static String onlyUBOPhoneNumber = RandomPhoneNumber.randomPhoneNum();
    public static String onlyUBOEmailName = JRandomNameTool.getStringRandom(5);



    @Given("^open \"([^\"]*)\" enterprise net silver page$")
    public void openEnterpriseNetSilverPage(String envName){
        envTag = envName;
        if (!envName.isEmpty()) {
            logon_step.open_the_first_dbb_logon_page(envName);
        }
    }

    @When("^click open Account page$")
    public void clickOpenAccountPage(){
        openAccount_step.clickOpenAccount();
    }

    @Then("^Fill in information \"([^\"]*)\" on Getting Started page$")
    public void fillInInformationOnGettingStartedPage(String envName){
        accountType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountType_CurrentAccount-Only");
        currencyType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_SGD");
        openAccount_step.fillInInformationOnGettingStartedPage();
        openAccount_step.fillInInformationOnGettingStartedPage2(accountType,accountName,currencyType);
        System.out.println("---------------账户名称："+ accountName + "----------------------");
    }

    @And("^Provide Essential Information$")
    public void provideEssentialInformation()throws AWTException {
        openAccount_step.provideEssentialInformation(applicantName,emailName,mobileNumber);
        System.out.println("---------------申请人姓名："+ applicantName + "----------------------");
        System.out.println("---------------申请人电话号码："+ mobileNumber + "----------------------");
        System.out.println("---------------申请人邮箱地址："+ emailName + "@MailTemp.top"+"----------------------");
        openAccount_step.clickValidationCode();
        openAccount_step.inputValidationCode();
        openAccount_step.inputEntityDetails();
    }

    @Then("^Enter Connected People's Details$")
    public void enterConnectedPeoplesDetails(){
        openAccount_step.inputDirectorDetails(contactPersonNm,aliasNm,passportNumber,directorPhoneNumber,directorEmailName);
        System.out.println("---------------董事姓名："+ contactPersonNm + "----------------------");
        System.out.println("---------------董事别名："+ aliasNm + "----------------------");
        System.out.println("---------------董事护照号码："+ passportNumber + "----------------------");
        System.out.println("---------------董事电话："+ directorPhoneNumber + "----------------------");
        System.out.println("---------------董事邮箱："+ directorEmailName + "@MailTemp.top"+"----------------------");
        openAccount_step.inputUltimateBeneficialOwnerDetails(ultimateBeneficialOwnerName,ultimateBeneficialOwnerAliasName,ultimateBeneficialOwnerPassportNumber,ultimateBeneficialOwnerPhoneNumber,ultimateBeneficialOwnerEmailName);
        System.out.println("---------------最终受益者姓名："+ ultimateBeneficialOwnerName + "----------------------");
        System.out.println("---------------最终受益者别名："+ ultimateBeneficialOwnerAliasName + "----------------------");
        System.out.println("---------------最终受益者护照号码："+ ultimateBeneficialOwnerPassportNumber + "----------------------");
        System.out.println("---------------最终受益者电话："+ ultimateBeneficialOwnerPhoneNumber + "----------------------");
        System.out.println("---------------最终受益者邮箱："+ ultimateBeneficialOwnerEmailName + "@MailTemp.top"+"----------------------");
        openAccount_step.inputOnlyUBODetails(onlyUBOName,onlyUBOAliasName,onlyUBOPassportNumber,onlyUBOPhoneNumber,onlyUBOEmailName);
        System.out.println("---------------最终受益者2姓名："+ onlyUBOName + "----------------------");
        System.out.println("---------------最终受益者2别名："+ onlyUBOAliasName + "----------------------");
        System.out.println("---------------最终受益者2护照号码："+ onlyUBOPassportNumber + "----------------------");
        System.out.println("---------------最终受益者2电话："+ onlyUBOPhoneNumber + "----------------------");
        System.out.println("---------------最终受益者2邮箱："+ onlyUBOEmailName + "@MailTemp.top"+"----------------------");
        openAccount_step.goOnDueDiligence();
    }

    @And("^Enter Connected Entities’ Details$")
    public void enterConnectedEntitiesDetails(){
        openAccount_step.enterConnectedEntitiesDetails();
    }

    @Then("^Create Company Administrators’ Profiles$")
    public void createCompanyAdministratorsProfiles()throws AWTException{
        openAccount_step.createCompanyAdministratorsProfiles(contactPersonNm);
        openAccount_step.clickValidationCode();
        openAccount_step.inputValidationCode();
        openAccount_step.clickVerifyEmailAddress1();
        openAccount_step.clickValidationCode();
        openAccount_step.inputValidationCode();
        openAccount_step.clickNextToAdministrator2AndEdit(ultimateBeneficialOwnerName);
        openAccount_step.clickValidationCode();
        openAccount_step.inputValidationCode();
        openAccount_step.clickVerifyEmailAddress2();
        openAccount_step.clickValidationCode();
        openAccount_step.inputValidationCode();
        openAccount_step.clickNextToStep6();
    }

    @And("^Share Account’s Risk Profile$")
    public void shareAccountsRiskProfile(){
        openAccount_step.choseRiskProfile();
    }

    @Then("^Upload Supporting Documents$")
    public void uploadSupportingDocuments(){
        openAccount_step.uploadSupportingDocuments();
    }

    @And("^Review Details$")
    public void reviewDetails(){
        openAccount_step.reviewDetails();
    }

    @Then("^get Organisation ID$")
    public void getOrganisationID(){
        openAccount_step.getOrganisationID(emailName);
    }
}

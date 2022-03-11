package com.hsbc.cmb.hk.dbb.glue.enterpriseNetSilver.openAccount;

import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.Logon_step;
import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.openAccount.openAccount_step;
import com.hsbc.cmb.hk.dbb.utils.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class openAccount_glue {

    @Steps
    private Logon_step logon_step;
    @Steps
    private openAccount_step openAccount_step;




    public static String envTag,accountType,currencyType,currencyTypeUSD,currencyTypeCNY,currencyTypeHKD,currencyTypeEUR;
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
    public String nowDate = BDDUtil.getTimeNowThroughCalendar();
    public String openAccountInformation = "openAccountInformation";



    @When("^open \"([^\"]*)\" enterprise net silver page$")
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
        FileUtils.FileString4(""+openAccountInformation+"",nowDate+"\n"+"账户名称:" + accountName);
    }

    @Then("^Fill in information \"([^\"]*)\" on Getting Started page about CA_SGD$")
    public void fillInInformationOnGettingStartedPageAboutCA_SGD(String envName){
        accountType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountType_CurrentAccount-Only");
        currencyType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_SGD");
        openAccount_step.fillInInformationOnGettingStartedPage();
        openAccount_step.fillInInformationOnGettingStartedPage2(accountType,accountName,currencyType);
        System.out.println("---------------账户名称："+ accountName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"",nowDate+"\n"+"账户名称:" + accountName);
    }

    @Then("^Fill in information \"([^\"]*)\" on Getting Started page about CA_USD$")
    public void fillInInformationOnGettingStartedPageAboutCA_USD(String envName){
        accountType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountType_CurrentAccount-Only");
        currencyType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_USD");
        openAccount_step.fillInInformationOnGettingStartedPage();
        openAccount_step.fillInInformationOnGettingStartedPage2(accountType,accountName,currencyType);
        System.out.println("---------------账户名称："+ accountName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"",nowDate+"\n"+"账户名称:" + accountName);
    }

    @Then("^Fill in information \"([^\"]*)\" on Getting Started page about CA_EUR$")
    public void fillInInformationOnGettingStartedPageAboutCA_EUR(String envName){
        accountType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountType_CurrentAccount-Only");
        currencyType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_EUR");
        openAccount_step.fillInInformationOnGettingStartedPage();
        openAccount_step.fillInInformationOnGettingStartedPage2(accountType,accountName,currencyType);
        System.out.println("---------------账户名称："+ accountName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"",nowDate+"\n"+"账户名称:" + accountName);
    }

    @Then("^Fill in information \"([^\"]*)\" on Getting Started page about CA_CNY$")
    public void fillInInformationOnGettingStartedPageAboutCA_CNY(String envName){
        accountType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountType_CurrentAccount-Only");
        currencyType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_CNY");
        openAccount_step.fillInInformationOnGettingStartedPage();
        openAccount_step.fillInInformationOnGettingStartedPage2(accountType,accountName,currencyType);
        System.out.println("---------------账户名称："+ accountName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"",nowDate+"\n"+"账户名称:" + accountName);
    }

    @Then("^Fill in information \"([^\"]*)\" on Getting Started page about CA_HKD$")
    public void fillInInformationOnGettingStartedPageAboutCA_HKD(String envName){
        accountType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountType_CurrentAccount-Only");
        currencyType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_HKD");
        openAccount_step.fillInInformationOnGettingStartedPage();
        openAccount_step.fillInInformationOnGettingStartedPage2(accountType,accountName,currencyType);
        System.out.println("---------------账户名称："+ accountName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"",nowDate+"\n"+"账户名称:" + accountName);
    }

    @Then("^Fill in information \"([^\"]*)\" on Getting Started page about MCA_SGD_CNY$")
    public void fillInInformationOnGettingStartedPageAboutMCA_CNY_SGD(String envName){
        accountType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountType_Multi-CurrentAccount-Only");
        currencyType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_CNY");
        openAccount_step.fillInInformationOnGettingStartedPage();
        openAccount_step.fillInInformationOnGettingStartedPage2MCA_SGD_CNY(accountType,accountName,currencyType);
        System.out.println("---------------账户名称："+ accountName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"",nowDate+"\n"+"账户名称:" + accountName);
    }

    @Then("^Fill in information \"([^\"]*)\" on Getting Started page about MCA_SGD_USD_CNY_HKD_EUR$")
    public void fillInInformationOnGettingStartedPageAboutMCA_SGD_USD_CNY_HDK_EUR(String envName){
        accountType = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".accountType_Multi-CurrentAccount-Only");
        currencyTypeUSD = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_USD");
        currencyTypeCNY = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_CNY");
        currencyTypeHKD = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_HKD");
        currencyTypeEUR = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".CurrencyType_EUR");
        openAccount_step.fillInInformationOnGettingStartedPage();
        openAccount_step.fillInInformationOnGettingStartedPage2MCA_SGD_USD_CNY_HKD_EUR(accountType,accountName,currencyTypeUSD,currencyTypeCNY,currencyTypeHKD,currencyTypeEUR);
        System.out.println("---------------账户名称："+ accountName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"",nowDate+"\n"+"账户名称:" + accountName);
    }

    @And("^Provide Essential Information$")
    public void provideEssentialInformation()throws AWTException {
        openAccount_step.provideEssentialInformation(applicantName,emailName,mobileNumber);
        System.out.println("---------------申请人姓名："+ applicantName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","申请人姓名:" + applicantName);
        System.out.println("---------------申请人电话号码："+ mobileNumber + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","申请人电话号码:" + mobileNumber);
        System.out.println("---------------申请人邮箱地址："+ emailName + "@MailTemp.top"+"----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","申请人邮箱地址:" + emailName + "@MailTemp.top");
        openAccount_step.clickValidationCode();
        openAccount_step.inputValidationCode();
        openAccount_step.inputEntityDetails();
    }

    @Then("^Enter Connected People's Details$")
    public void enterConnectedPeoplesDetails(){
        openAccount_step.inputDirectorDetails(contactPersonNm,aliasNm,passportNumber,directorPhoneNumber,directorEmailName);
        System.out.println("---------------董事姓名："+ contactPersonNm + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","董事姓名:" + contactPersonNm);
        System.out.println("---------------董事别名："+ aliasNm + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","董事别名:" + aliasNm);
        System.out.println("---------------董事护照号码："+ passportNumber + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","董事护照号码:" + passportNumber);
        System.out.println("---------------董事电话："+ directorPhoneNumber + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","董事电话:" + directorPhoneNumber);
        System.out.println("---------------董事邮箱："+ directorEmailName + "@MailTemp.top"+"----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","董事邮箱:" + directorEmailName + "@MailTemp.top");
        openAccount_step.inputUltimateBeneficialOwnerDetails(ultimateBeneficialOwnerName,ultimateBeneficialOwnerAliasName,ultimateBeneficialOwnerPassportNumber,ultimateBeneficialOwnerPhoneNumber,ultimateBeneficialOwnerEmailName);
        System.out.println("---------------最终受益者姓名："+ ultimateBeneficialOwnerName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者姓名:" + ultimateBeneficialOwnerName);
        System.out.println("---------------最终受益者别名："+ ultimateBeneficialOwnerAliasName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者别名:" + ultimateBeneficialOwnerAliasName);
        System.out.println("---------------最终受益者护照号码："+ ultimateBeneficialOwnerPassportNumber + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者护照号码:" + ultimateBeneficialOwnerPassportNumber);
        System.out.println("---------------最终受益者电话："+ ultimateBeneficialOwnerPhoneNumber + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者电话:" + ultimateBeneficialOwnerPhoneNumber);
        System.out.println("---------------最终受益者邮箱："+ ultimateBeneficialOwnerEmailName + "@MailTemp.top"+"----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者邮箱:" + ultimateBeneficialOwnerEmailName + "@MailTemp.top");
        openAccount_step.inputOnlyUBODetails(onlyUBOName,onlyUBOAliasName,onlyUBOPassportNumber,onlyUBOPhoneNumber,onlyUBOEmailName);
        System.out.println("---------------最终受益者2姓名："+ onlyUBOName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者2姓名:" + onlyUBOName);
        System.out.println("---------------最终受益者2别名："+ onlyUBOAliasName + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者2别名:" + onlyUBOAliasName);
        System.out.println("---------------最终受益者2护照号码："+ onlyUBOPassportNumber + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者2护照号码:" + onlyUBOPassportNumber);
        System.out.println("---------------最终受益者2电话："+ onlyUBOPhoneNumber + "----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者2电话:" + onlyUBOPhoneNumber);
        System.out.println("---------------最终受益者2邮箱："+ onlyUBOEmailName + "@MailTemp.top"+"----------------------");
        FileUtils.FileString4(""+openAccountInformation+"","最终受益者2邮箱:" + onlyUBOEmailName + "@MailTemp.top");
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

    @Then("^Create Company Administrators’ Profiles About One$")
    public void createCompanyAdministratorsProfilesAboutOne()throws AWTException{
        openAccount_step.choseOneAdministrator(contactPersonNm);
        openAccount_step.clickValidationCode();
        openAccount_step.inputValidationCode();
        openAccount_step.clickVerifyEmailAddress1();
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

    @And("^Review Details CNY$")
    public void reviewDetailsCNY(){
        openAccount_step.reviewDetailsCNY();
    }

    @Then("^get Organisation ID$")
    public void getOrganisationID(){
        openAccount_step.getOrganisationID(emailName,applicantName);
    }
}

package com.glbank.com.sg.bdd.glue.supplyChains.tubeByInputting;

import com.glbank.com.sg.bdd.steps.supplyChains.systemManager.logon_step;
import com.glbank.com.sg.bdd.steps.supplyChains.tubeByInputting.creatCustomers_step;
import com.glbank.com.sg.bdd.utils.*;
import com.lu.sn.Language;
import com.lu.sn.NameType;
import com.lu.sn.RandomNameTool;
import com.lu.sn.en.EnglishNameUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;
import java.util.Map;

import static com.glbank.com.sg.bdd.utils.JDBCUtil.*;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class creatCustomers_glue {
    @ManagedPages
    public Pages pages;
    IdCardGenerator g = new IdCardGenerator();
    public static String code;

    @Steps
    private creatCustomers_step customers_step;
    public static String envTag;
    private BDDUtil bddUtil;
    private logon_step logon_step;
    public String englishName = RandomNameTool.getName(Language.en,NameType.FULL_NAME);
    public String chineseName = RandomNameTool.getName(Language.zh, NameType.FULL_NAME);
//    String translateName = EnglishNameUtil.getTranslateName(Language.zh);
    public String mailName = JRandomNameTool.getStringRandom(8);
    public String mailName1 = JRandomNameTool.getStringRandom(8);
    public String CompanyName = RandomNameTool.getName(Language.en, NameType.FULL_NAME)+JRandomNameTool.getStringRandom(4);
//    public String CompanyName = "PUBLIC UTILITIES BOARD";


    @When("^login successfully and click the SCF link$")
    public void loginSuccessfullyAndClickTheSCFLink() {
        customers_step.disPlayedSCFTitle();

    }

    @When("^I click Customers and select Onboarding List$")
    public void iClickCustomersAndSelectOnboardingList() {
        customers_step.getClickCustomersMenu();
        customers_step.getClickOnboardingListMenu();
    }

    @And("^I click Create Customer and fill in the buyer information in the pop-up window$")
    public void iClickCreateCustomerAndFillInTheBuyerInformationInThePopUpWindow() {
        customers_step.getClickCreateCustomerBtn();
        customers_step.getSelectCustomerType();
        customers_step.getCustomerTypeValue();
        customers_step.getCompanyName(CompanyName);
        FileUtils.FileString4("buyer",CompanyName);
        customers_step.getCompanyID(RandomPhoneNumber.randomPhoneNum());
        customers_step.getSelectCountryOfRegistration();
        customers_step.getCountryOfRegistrationValue();
        customers_step.getCompanyNameLeft(JRandomNameTool.getStringRandom(10));
        customers_step.clickSubmitBtn();
        bddUtil.sleep(4);
    }

    @And("^I click Create Customer and fill in the supplier information in the pop-up window$")
    public void iClickCreateCustomerAndFillInTheSupplierInformationInThePopUpWindow(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        customers_step.getClickCreateCustomerBtn();
        customers_step.getSelectCustomerType();
        customers_step.getCustomerTypeSupplier();
        customers_step.getCompanyName(CompanyName);
        FileUtils.FileString4("companyData",CompanyName);
        FileUtils.FileString4("emailData",CompanyName);
        customers_step.getCompanyID(RandomPhoneNumber.randomPhoneNum());
        customers_step.getSelectCountryOfRegistration();
        customers_step.getCountryOfRegistrationValue();
        customers_step.getCompanyNameLeft(JRandomNameTool.getStringRandom(10));
        customers_step.kycMode(maps.get(0).get("KYC Mode"));
        customers_step.inputBy(maps.get(0).get("Input by"));
        customers_step.getCLickNextBtn();
    }

    @And("^I click Create Customer and fill in the supplier information in the pop-up window buyer$")
    public void iClickCreateCustomerAndFillInTheSupplierInformationInThePopUpWindowBuyer(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps(String.class, String.class);
        customers_step.getClickCreateCustomerBtn();
        customers_step.getSelectCustomerType();
        customers_step.getCustomerTypeBuyer();
        customers_step.getCompanyName(CompanyName);
        FileUtils.FileString4("buyer",CompanyName);
        FileUtils.FileString4("emailData",CompanyName);
        customers_step.getCompanyID(RandomPhoneNumber.randomPhoneNum());
        customers_step.getSelectCountryOfRegistration();
        customers_step.getCountryOfRegistrationValue();
        customers_step.getCompanyNameLeft(JRandomNameTool.getStringRandom(10));
        customers_step.kycMode(maps.get(0).get("KYC Mode"));
        customers_step.inputBy(maps.get(0).get("Input by"));
        customers_step.getCLickNextBtn();
    }

    @Then("^I Check to see if you jump to the Authorized Person page$")
    public void checkToSeeIfYouJumpToTheAuthorizedPersonPage() {
        customers_step.getCheckNextPage();
    }

    @When("^Fill in email 1 and email 2 supplier information on the Authorized Person page$")
    public void fillInAdministratorAndAdministratorSupplierInformationOnTheAuthorizedPersonPage() {
        customers_step.getFirstNameInput(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
        bddUtil.switchToNewWindow();
        customers_step.emailOperation(mailName);
        bddUtil.switchToWindows();
        customers_step.getEmailInput(mailName + "@MailTemp.top");
        FileUtils.FileString4("emailData",mailName + "@MailTemp.top");
        System.out.println("---------------第一个邮箱地址："+ mailName + "@MailTemp.top"+"----------------------");
        customers_step.phoneNumberFirst();
        customers_step.getLastName(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
        customers_step.getEmailSecondInput(mailName1+ "@MailTemp.top");
        System.out.println("---------------第二个邮箱地址："+ mailName1 + "@MailTemp.top"+"----------------------");
        customers_step.getMobileInput();
//        customers_step.getFirstNameSecondInput(JRandomNameTool.getStringRandom(4));
//
//        customers_step.getLastNameSecondInput(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
//        customers_step.getMobileSecondInput(RandomPhoneNumber.randomPhoneNum());
//        customers_step.clickInputBySelectBox();
        customers_step.clickSubmitBtn();
        bddUtil.sleep(3);
    }

    @When("^Fill in email 1 and email 2 buyer information on the Authorized Person page$")
    public void fillInAdministratorAndAdministratorBuyerInformationOnTheAuthorizedPersonPage() {
        customers_step.getFirstNameInput(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
        bddUtil.switchToNewWindow();
        customers_step.emailOperation(mailName);
        bddUtil.switchToWindows();
        customers_step.getEmailInput(mailName + "@MailTemp.top");
        System.out.println("---------------第一个邮箱地址："+ mailName + "@MailTemp.top"+"----------------------");
        customers_step.getLastName(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
        customers_step.getMobileInput();
        customers_step.getFirstNameSecondInput(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
        customers_step.getEmailSecondInput(mailName1  + "@MailTemp.top");
        System.out.println("---------------第二个邮箱地址："+ mailName1 + "@MailTemp.top"+"----------------------");
        customers_step.getLastNameSecondInput(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
        customers_step.getMobileSecondInput(RandomPhoneNumber.randomPhoneNum());
        customers_step.clickSubmitBtn();
    }

    @Then("^Successfully create buyer customer information$")
    public void successfullyCreateBuyerCustomerInformation() {
        customers_step.checkSuccessPageTitle();
    }

    @And("^I switch to the SCF page$")
    public void iSwitchToTheSCFPage() {
        bddUtil.switchToSecondWindows();
    }

    @When("^open the email browser page$")
    public void openThreePage() {
       customers_step.openEmailUrl();
    }

    @And("^I received an email from Green Union Bank on the email page$")
    public void iReceivedAnEmailFromGreenUnionBankOnTheEmailPage() {
        customers_step.viewEmail();
    }

    @And("^I click the email icon to send the email$")
    public void clickTheEmailIconToSendTheEmail() {
        customers_step.clickSendEmailBtn();
    }

    @Then("^I check that the email has been sent successfully$")
    public void iCheckThatTheEmailHasBeenSentSuccessfully() {
        customers_step.checkSendEmailSuccess();
    }

    @When("^I get the verification code in the email and click to jump to the GLDB page to fill in the information and generate the verification code$")
    public void iGetTheVerificationCodeInTheEmailAndClickToJumpToTheGLDBPageToFillInTheInformationAndGenerateTheVerificationCode() {
        customers_step.selectFirstEmailAndTakeVCode();
    }

    @And("^I went back to the email page to get the verification code$")
    public void iWentBackToTheEmailPageToGetTheVerificationCode() {
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
        bddUtil.switchToNewWindow();
        customers_step.emailOperation(mailName);
        customers_step.thirdEmail();
    }

    @And("^I enter Company ID and click Login button$")
    public void iEnterCompanyIDAndClikLoginButton() {
        customers_step.enterCompanyIdAndClickLoginBtn();
    }

    @Then("^Click login to jump to the Set New Password page$")
    public void clickLoginToJumpToTheSetNewPasswordPage() {
        customers_step.setNewPasswordPage();
    }

    @When("^After login Set a New Password on the Set New Password page$")
    public void afterLoginSetANewPasswordOnTheSetNewPasswordPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        customers_step.enterNewPassword(payToInfo.get(0).get("first_new_password"),payToInfo.get(0).get("second_new_password"));
    }

    @Then("^I jump to the login page$")
    public void iJumpToTheLoginPage() {
        customers_step.jumpLoginPage();
    }

    @When("^I fill in the content on the login page and click operation$")
    public void iFillInTheContentOnTheLoginPageAndClickOperation(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        customers_step.enterLoginInformationAgain(mailName,payToInfo.get(0).get("password"));
    }


    @When("^I click agree Service Agreement$")
    public void iClickAgreeServiceAgreement() {
        customers_step.getClickCheckBox();
    }

    @Then("^I jump to the Tell Us About Your Company page$")
    public void iJumpToTheTellUsAboutYourCompanyPage() {
        customers_step.checkJumpPageTellUsTitle();
    }

    @When("^I entered information on the Tell Us About Your Company page$")
    public void iEnteredInformationOnTheTellUsAboutYourCompanyPage() {
        customers_step.companyPageInformation(mailName);

    }

    @When("^I login service agreement window$")
    public void iLoginServiceAgreementWindow() {
        customers_step.openEmailUrlTest();
        customers_step.iLoginServiceAgreementWindow();
    }

    @Given("^logon \"([^\"]*)\" test code$")
    public void logonTestCode(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            customers_step.open_the_first_dbb_logon_page(envName);
        }
    }

    @Then("^Check whether to jump to the next page after filling in the content of Company page$")
    public void checkWhetherToJumpToTheNextPageAfterFillingInTheContentOfCompanyPage() {
        customers_step.jumpSetUpPrimaryAdminTitle();
    }

    @When("^Fill in the administrator information on the People page and click Next to go to the Next page$")
    public void fillInTheAdministratorInformationOnThePeoplePageAndClickNextToGoToTheNextPage() {
        customers_step.enterInformationOnPeoplePage(mailName);
    }

    @Then("^Verify whether the director page is displayed$")
    public void clickNextToGoToThePageForFillingInDirectorInformation() {
        customers_step.jumpToDirectorInformation();
    }

    @When("^Fill in the board information on the current page and click the Next button$")
    public void fillInTheBoardInformationOnTheCurrentPageAndClickTheNextButton() {
        customers_step.fillInTheInformationOnTheDirectorPage(mailName);
    }

    @Then("^Verify whether the Shareholder page is displayed$")
    public void clickNextButtonToJumpToThePageOfShareholderInformationFilling() {
        customers_step.jumpToTheShareholderInformation();
    }

    @When("^Fill in the user information on the Shareholder page$")
    public void fillInTheUserInformationOnTheShareholderPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        customers_step.fillInTheInformationOnTheShareholderPage(payToInfo.get(0).get("allocation"),mailName);
    }

    @Then("^Verify whether the Beneficial page is displayed$")
    public void verifyWhetherTheBeneficialPageIsDisplayed() {
        customers_step.verifyWhetherTheBeneficialPageIsDisplayed();
    }

    @When("^Fill in the information on the Beneficial page$")
    public void fillInTheInformationOnTheBeneficialPage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        customers_step.fillInTheInformationOnTheBeneficialPage(payToInfo.get(0).get("allocation"),mailName);
    }

    @Then("^Verify whether the Account page is displayed$")
    public void verifyWhetherTheAccountPageIsDisplayed() {
        customers_step.verifyWhetherTheAccountPageIsDisplayed();
    }

    @When("^Enter the Account information$")
    public void enterTheAccountInformation(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        customers_step.enterTheAccountInformation(payToInfo.get(0).get("currency"));
    }

    @Then("^Check whether the Questionnaire page is displayed$")
    public void checkWhetherTheQuestionnairePageIsDisplayed() {
        customers_step.checkWhetherTheQuestionnairePageIsDisplayed();
    }

    @When("^Enter information on the Questionnaire page$")
    public void enterInformationOnTheQuestionnairePage(DataTable payDetails) {
        List<Map<String, String>> payToInfo = payDetails.asMaps(String.class,String.class);
        customers_step.questionFirstCheckBox(payToInfo.get(0).get("currency"),payToInfo.get(0).get("num"));
    }

    @Then("^Verify whether the Confirm page is displayed$")
    public void verifyWhetherTheConfirmPageIsDisplayed() {
        customers_step.confirmPageTitle();
    }

    @When("^Click the Submit button on the Confirm page$")
    public void clickTheSubmitButtonOnTheConfirmPage() {
        customers_step.clickSubmitBtnOnGLDB();
    }

    @When("^I click next Button on the page$")
    public void iClickNextButtonOnThePage() {
        customers_step.testNext();
    }

    @When("^Approval in the supply chain system$")
    public void approvalInTheSupplyChainSystem() {
        updateAmlResult(1, "companyData");
        bddUtil.sleep(5);
//        for (int i = 0; i < 3; i++) {
//            int result = updateAmlResult(1, "companyData");
//            if (result <= 0){
//                updateAmlResult(1,"companyData");
//                break;
//            }
//            System.out.println("AML状态修改成功");
//        }
        int result = updateAmlResult(1, "companyData");
        if (result <= 0){
            bddUtil.sleep(2);
            updateAmlResult(1,"companyData");
        }
        for (int i = 0; i < 3; i++) {
            bddUtil.sleep(2);
            updateAmlResult(1,"companyData");
            bddUtil.sleep(4);
        }
        updateAmlResult(1,"companyData");
        bddUtil.sleep(3);
        customers_step.getClickCustomersMenu();
        customers_step.onboardingReview();
        customers_step.onboardingReviewTitle();
    }

    @When("^Approval in the buyer chain system$")
    public void approvalInTheBuyerChainSystem() {
        updateAmlResult(1, "buyer");
        bddUtil.sleep(5);
        int result = updateAmlResult(1, "buyer");
        if (result <= 0){
            bddUtil.sleep(2);
            updateAmlResult(1,"buyer");
        }
        for (int i = 0; i < 3; i++) {
            bddUtil.sleep(2);
            updateAmlResult(1,"buyer");
            bddUtil.sleep(4);
        }
        bddUtil.sleep(3);
        updateAmlResult(1,"buyer");
        bddUtil.sleep(4);
        customers_step.getClickCustomersMenu();
        customers_step.onboardingReview();
        customers_step.onboardingReviewTitle();
    }

    @When("^End the current browser process$")
    public void endTheCurrentBrowserProcess() {
        bddUtil.quitDriver();
    }

    @Then("^Switch To the Assign To Me page and perform the corresponding operations$")
    public void switchToTheAssignToMePageAndPerformTheCorrespondingOperations() {
        customers_step.assignToMePage();
        customers_step.clickAssignToMeTitle();
        customers_step.clickProceedButtonOnAssignToMePage();
        customers_step.processPageApprove();
    }

    @Then("^Switch To the Assign To Me page and perform the corresponding operations buyer$")
    public void switchToTheAssignToMePageAndPerformTheCorrespondingOperationsBuyer() {
        customers_step.assignToMePageBuyer();
        customers_step.clickAssignToMeTitle();
        customers_step.clickProceedButtonOnAssignToMePageBuyer();
        customers_step.processPageApprove();
    }

    @When("^Closing the Browser driver$")
    public void closingTheBrowserDriver() {
        bddUtil.quitDriver();
    }

    @Then("^I verify whether the current page is redirected$")
    public void iVerifyWhetherTheCurrentPageIsRedirected() {
        customers_step.checkApprovedText();
    }



//    @After
//    public void testCase.feature(){
//        System.out.println("--------------------testcase--------------------");
//    }
}

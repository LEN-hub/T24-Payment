package com.glbank.com.sg.bdd.steps.supplyChains.tubeByInputting;

import com.glbank.com.sg.bdd.pages.supplyChains.tubeByInputting.creatCustomers_page;
import com.glbank.com.sg.bdd.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static com.glbank.com.sg.bdd.utils.AssertLocal.assertTrue;
import static org.junit.Assert.assertEquals;

public class creatCustomers_step extends ScenarioSteps {
    private creatCustomers_page customers_page;
    private BDDUtil bddUtil;
    public static String envTag;

    @Step
    public void getClickCustomersMenu(){
        customers_page.clickCustomersMenu.isVisible();
        customers_page.clickCustomersMenu.click();
    }

    @Step
    public void onboardingReview(){
        customers_page.onboardingReview.click();
    }

    public void getClickOnboardingListMenu(){
        customers_page.clickOnboardingListMenu.click();
    }

    public void getClickCreateCustomerBtn(){
        customers_page.clickCreateCustomerBtn.click();
    }

    @Step
    public void disPlayedSCFTitle(){
        if (customers_page.scfTitle.isVisible()){
            System.out.println("成功进入CSF页面");
        }
    }

    @Step
    public void getSelectCustomerType(){
        customers_page.selectCustomerType.click();
    }
    
    @Step
    public void getCustomerTypeValue(){
        customers_page.customerTypeBuyer.click();
    }

    @Step
    public void getCustomerTypeSupplier(){
        customers_page.customerTypeSupplier.click();
    }

    @Step
    public void checkSuccessPageTitle(){
        assertEquals("Customer Profiles",customers_page.checkSuccessPageTitle.getText());
    }

    @Step
    public void getCompanyName(String value){
        customers_page.companyName.sendKeys(value);
    }

    @Step
    public void getCompanyID(String value){
        customers_page.companyID.sendKeys(value);
    }

    @Step
    public void getSelectCountryOfRegistration(){
        customers_page.selectCountryOfRegistration.click();
    }

    @Step
    public void getCountryOfRegistrationValue(){
        bddUtil.scrollWindowToElement(customers_page.countryOfRegistrationValue);
        customers_page.countryOfRegistrationValue.click();
    }

    @Step
    public void getCompanyNameLeft(String value){
        customers_page.companyNameLeft.sendKeys(value);
    }

    @Step
    public void getCLickNextBtn(){
        customers_page.nextBtn.click();
    }

    @Step
    public void getCheckNextPage(){
        FileUtils.FileInput3("test");
        customers_page.checkNextPage.isVisible();
        assertEquals("Administrator 1",customers_page.checkNextPage.getText());
    }

    @Step
    public void getFirstNameInput(String value){
        customers_page.firstNameInput.sendKeys(value);
    }

    @Step
    public void getEmailInput(String value){
        customers_page.emailInput.sendKeys(value);
    }

    @Step
    public void getLastName(String value){
        customers_page.lastNameInput.sendKeys(value);
    }

    @Step
    public void getMobileInput(String value){
        customers_page.mobileInput.sendKeys(value);
    }

    @Step
    public void getFirstNameSecondInput(String value){
        customers_page.firstNameSecondInput.sendKeys(value);
    }

    @Step
    public void getEmailSecondInput(String value){
        customers_page.emailSecondInput.sendKeys(value);
    }

    @Step
    public void getLastNameSecondInput(String value){
        customers_page.lastNameSecondInput.sendKeys(value);
    }

    @Step
    public void getMobileSecondInput(String value){
        customers_page.mobileSecondInput.sendKeys(value);
    }

    @Step
    public void clickSubmitBtn(){
        customers_page.submitBtn.click();
    }

    @Step
    public void emailOperation(String value){
        customers_page.sendEmail.clear();
        customers_page.sendEmail.sendKeys(value);
        customers_page.createEmailButton.click();
    }

    @Step
    public void errorEmailLink(){
        if (customers_page.errorText.isVisible()){
            customers_page.advancedButton.click();
            customers_page.enterEmailLink.click();
        }
    }

    @Step
    public void openEmailUrl(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox\");");
        bddUtil.switchToNewWindow();
        errorEmailLink();
        bddUtil.switchToWindows();
    }
    @Step
    public void openEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name=Po0xIH6P\");");
        bddUtil.switchToNewWindow();
        errorEmailLink();
        bddUtil.switchToWindows();
    }

    @Step
    public void clickInputBySelectBox(){
        customers_page.clickInputBySelectBox.click();
        customers_page.inputByTypeCustomer.click();
    }

    @Step
    public void clickSendEmailBtn(){
//        bddUtil.sleep(5);
        customers_page.emailIcon.isVisible();
        bddUtil.sleep(1);
        customers_page.emailIcon.click();
        customers_page.confirmBtn.click();
    }

    @Step
    public void checkSendEmailSuccess(){
        assertEquals("Green Link Digital Bank - Invitation",customers_page.firstEmail.getText());
    }

    @Step
    public void viewEmail(){
        bddUtil.switchToNewWindow();
        bddUtil.sleep(3);
        customers_page.clickRefreshBtn.click();
        customers_page.firstEmail.click();
    }

    @Step
    public void selectFirstEmailAndTakeVCode(String value){
        customers_page.firstEmail.click();
        String password = customers_page.emailPassword.getText();
        customers_page.greenLinkSystem.isVisible();
        CommonUtil.waiting(2000);
        customers_page.greenLinkSystem.click();
        customers_page.GLDBEmailInput.sendKeys(value + "@MailTemp.top");
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.sendCodeBtn.click();
    }

    @Step
    public void thirdEmail(){
        customers_page.emailPageContent.isVisible();
        customers_page.clickRefreshBtn.click();
        bddUtil.sleep(1);
        customers_page.thirdEmail.click();
        String verificationCode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.sendKeys(verificationCode);
    }
    @Step
    public void enterCompanyIdAndClickLoginBtn(){
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.GLDBEmailLoginBtn.click();
    }

    @Step
    public void setNewPasswordPage(){
        customers_page.setNewPasswordPage.isVisible();
    }

    @Step
    public void enterNewPassword(String firstPassword,String secondPassword){
        customers_page.firstNewPassword.sendKeys(firstPassword);
        customers_page.secondNewPassword.sendKeys(secondPassword);
        customers_page.newPasswordPageConfirmBtn.click();
    }

    @Step
    public void enterLoginInformationAgain(String value,String password){
        customers_page.GLDBEmailInput.sendKeys(value + "@MailTemp.top");
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.enterCompanyId.clear();
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(5);
        customers_page.clickRefreshBtn.click();
        bddUtil.sleep(1);
        customers_page.thirdEmail.click();
        bddUtil.sleep(1);
//        customers_page.find(By.xpath("//div[@id='message-list']/button[1]")).click();
        String Vcode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.clear();
        customers_page.inputSendCode.sendKeys(Vcode);
        customers_page.GLDBEmailLoginBtn.click();
    }

    @Step
    public void getClickCheckBox(){
        if (customers_page.serviceAgreementTitle.isVisible()){
//            bddUtil.scrollWindowToElement(customers_page.clickCheckBox);
//            customers_page.clickCheckBox.click();
            customers_page.selectFirstCheckBox.click();
            customers_page.selectSecondCheckBox1.click();
            customers_page.selectThirdCheckBox.click();
            customers_page.selectFourCheckBox.click();
            customers_page.clickAgreeBtn.click();
        }
    }

    @Step
    public void jumpLoginPage(){
        customers_page.loginPageTitle.isVisible();
    }

    @Step
    public void checkJumpPageTellUsTitle(){
        customers_page.checkjumpPageTellUs.isVisible();
    }

    @Step
    public void companyPageInformation(String value){
        customers_page.dateInputBox.sendKeys(bddUtil.dateFormate());
        customers_page.annualReturnSizeClick.click();
        customers_page.annualReturnSizeSelect.click();
        customers_page.checkBoxPublicCompanyYes.click();
        customers_page.companyEmail.sendKeys(value+ "@MailTemp.top");
        customers_page.companyPhoneNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.fileUpdate.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        bddUtil.scrollWindowToElement(customers_page.noExpiryDateTitle);
        customers_page.noExpiryDateInput.sendKeys("2024-9-10");
        customers_page.memorandumAndArticlesOfAssLink.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        customers_page.countryOfTaxation.click();
        bddUtil.scrollWindowToElement(customers_page.selectCountryOfTaxation).click();
        bddUtil.scrollWindowToElement(customers_page.registeredAddressTitle);
        customers_page.registeredAddress.sendKeys(JRandomNameTool.getStringRandom(11));
        bddUtil.scrollWindowToElement(customers_page.sectorTitle);
        customers_page.businessCountry.click();
        bddUtil.scrollWindowToElement(customers_page.selectBusinessCountry).click();
        customers_page.businessAddress.sendKeys(JRandomNameTool.getStringRandom(12));
        customers_page.industry.click();
        bddUtil.scrollWindowToElement(customers_page.selectIndustry).click();
        customers_page.legalStructure.click();
        bddUtil.scrollWindowToElement(customers_page.selectLegalStructure).click();
        customers_page.isNonProfitYes.click();
        customers_page.sectorInputBox.sendKeys(JRandomNameTool.getStringRandom(10));
        bddUtil.scrollWindowToElement(customers_page.adminSectorInput);
        customers_page.adminIndustry.click();
        bddUtil.scrollWindowToElement(customers_page.adminIndustrySelect).click();
        customers_page.adminLegalStructure.click();
        bddUtil.scrollWindowToElement(customers_page.adminLegalStructureSelect).click();
        customers_page.adminIsNonProfitCheckBox.click();
        customers_page.adminSectorInput.sendKeys(JRandomNameTool.getStringRandom(10));
//        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void testNext(){
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void clickSubmitBtnOnGLDB(){
        bddUtil.sleep(3);
        customers_page.clickSubmitBtnOnGLDB.click();
        customers_page.clickConfirmBtnOnGLDB.click();
    }

    @Step
    public void confirmPageTitle(){
        customers_page.confirmPageTitle.isVisible();
    }

    @Step
    public void iLoginServiceAgreementWindow(){
        customers_page.GLDBEmailInput.sendKeys("Po0xIH6P@MailTemp.top");
        customers_page.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(3);
        customers_page.clickRefreshBtn.click();
        bddUtil.sleep(1);
        customers_page.thirdEmail.click();
        String Vcode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.sendKeys(Vcode);
        customers_page.GLDBEmailLoginBtn.click();

    }

    @Step
    public void jumpSetUpPrimaryAdminTitle(){
        customers_page.jumpSetUpPrimaryAdminTitle.isVisible();
    }

    @Step
    public void enterInformationOnPeoplePage(){
        customers_page.admin1DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.admin1LegalCountry.click();
        bddUtil.scrollWindowToElement(customers_page.admin1LegalCountrySelectChina).click();
        customers_page.admin1CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.admin1CountryOfResidenceSelectChina).click();
        customers_page.admin1ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.admin1LegalCertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.admin1LegalCertificationTypeSelectPersonlId).click();
        customers_page.admin1LegalCertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.admin1TimePermanentCheckBox.click();
        bddUtil.scrollWindowToElement(customers_page.admin2TimePermanent);
        customers_page.admin2DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.admin2LegalCountry.click();
        bddUtil.scrollWindowToElement(customers_page.admin2LegalCountrySelectChina).click();
        customers_page.admin2CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.admin2CountryOfResidenceSelectChina).click();
        customers_page.admin2ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.admin2LegalCertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.admin2LegalCertificationTypeSelectPassport).click();
        customers_page.admin2LegalCertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.admin2TimePermanentCheckBox.click();
//        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void jumpToDirectorInformation(){
        customers_page.directorOfTheInformation.isVisible();
    }

    @Step
    public void jumpToTheShareholderInformation(){
        customers_page.shareholderOfTheInformation.isVisible();
    }

    @Step
    public void fillInTheInformationOnTheDirectorPage(String value){
        customers_page.director1CheckBox.click();
        customers_page.director1FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.director1LastName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.director1CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.director1PersonalId).click();
        customers_page.director1CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director1CheckBox2.click();
        customers_page.director1DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.director1Country.click();
        bddUtil.scrollWindowToElement(customers_page.director1CountrySelectChina).click();
        customers_page.director1ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.director1Email.sendKeys(value + "@MailTemp.top");
        customers_page.director1CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.director1CountryOfResidenceSelectChina).click();
        customers_page.director1Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        bddUtil.scrollWindowToElement(customers_page.director2TimePermanent);
        customers_page.director2CheckBox.click();
        customers_page.director2FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.director2LastName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.director2CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.director2Passport).click();
        customers_page.director2CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director2TimePermanentCheckBox.click();
        customers_page.director2DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.director2Country.click();
        bddUtil.scrollWindowToElement(customers_page.director2CountrySelectChina).click();
        customers_page.director2ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.director2Email.sendKeys(value + "@MailTemp.top");
        customers_page.director2CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.director2CountryOfResidenceSelectChina).click();
        customers_page.director2Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
//        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void fillInTheInformationOnTheShareholderPage(String value){
        customers_page.shareholder1FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.shareholder1LastName.sendKeys(JRandomNameTool.getRandomJianHan(4));
        customers_page.shareholder1CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder1CertificationTypeSelectPersonalId).click();
        customers_page.shareholder1CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder1Checkbox.click();
        customers_page.shareholder1DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.shareholder1Country.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder1CountrySelectChina).click();
        customers_page.shareholder1CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder1CountryOfResidenceSelectChina).click();
        customers_page.shareholder1Email.sendKeys(value + "@MailTemp.top");
        customers_page.shareholder1Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder1ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        bddUtil.scrollWindowToElement(customers_page.shareholder2FundScale);
        customers_page.shareholder1FundScale.sendKeys("25");
        customers_page.shareholder2FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.shareholder2LastName.sendKeys(JRandomNameTool.getRandomJianHan(4));
        customers_page.shareholder2CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2CertificationTypeSelectPassport).click();
        customers_page.shareholder2CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder2TimePermanent.click();
        customers_page.shareholder2DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.shareholder2Country.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2CountrySelectChina).click();
        customers_page.shareholder2CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2CountryOfResidenceSelectChina).click();
        customers_page.shareholder2Email.sendKeys(value + "@MailTemp.top");
        customers_page.shareholder2Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder2ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.shareholder2FundScale.sendKeys("25");
//        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void verifyWhetherTheBeneficialPageIsDisplayed(){
        customers_page.beneficialTitle.isVisible();
    }

    @Step
    public void fillInTheInformationOnTheBeneficialPage(String value){
        customers_page.beneficialCheckBox.click();
        customers_page.beneficial1FirstName.sendKeys(JRandomNameTool.getRandomJianHan(3));
        customers_page.beneficial1LastName.sendKeys(JRandomNameTool.getRandomJianHan(4));
        customers_page.beneficial1CertificationType.click();
        bddUtil.scrollWindowToElement(customers_page.beneficial1CertificationTypeSelectPersonalId).click();
        customers_page.beneficial1CertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.beneficial1TimePermanent.click();
        customers_page.beneficial1FundScale.sendKeys("25");
        customers_page.beneficial1Email.sendKeys(value + "@MailTemp.top");
        customers_page.beneficial1DateOfBirth.sendKeys(bddUtil.dateFormate());
        customers_page.beneficial1Country.click();
        bddUtil.scrollWindowToElement(customers_page.beneficial1CountrySelectChina).click();
        bddUtil.scrollWindowToElement(customers_page.beneficial1ResidentialAddress).click();
        customers_page.beneficial1Phone.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.beneficial1CountryOfResidence.click();
        bddUtil.scrollWindowToElement(customers_page.beneficial1CountryOfResidenceSelectChina).click();
        customers_page.beneficial1ResidentialAddress.sendKeys(JRandomNameTool.getStringRandom(10));
//        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void verifyWhetherTheAccountPageIsDisplayed(){
        customers_page.tellUsAboutAccoutPageTitle.isVisible();
    }

    @Step
    public void enterTheAccountInformation(String value){
        customers_page.accountCurrency.click();
        bddUtil.scrollWindowToElement(customers_page.find(By.xpath("//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='"+value+"']"))).click();
        customers_page.tellUsAboutAccoutPageTitle.click();
        customers_page.collectionAccountCurrency.click();
        bddUtil.scrollWindowToElement(customers_page.find(By.xpath("//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='"+value+"']"))).click();
        customers_page.tellUsAboutAccoutPageTitle.click();
//        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void checkWhetherTheQuestionnairePageIsDisplayed(){
        customers_page.questionnaireTitle.isVisible();
    }

    @Step
    public void questionNaireInformation(){
        customers_page.firstQuestion.click();
        bddUtil.scrollWindowToElement(customers_page.firstQuestionAnswer).click();
        customers_page.secondQuestion.click();
        bddUtil.scrollWindowToElement(customers_page.secondQuestionAnswer).click();
        customers_page.thirdQuestion.click();
        bddUtil.scrollWindowToElement(customers_page.thirdQuestionAnswer).click();
        bddUtil.scrollWindowToElement(customers_page.sixQuestionCheckBox);
        customers_page.fourQuestionCheckBox.click();
        customers_page.fiveQuestionCheckBox.click();
        customers_page.sixQuestionCheckBox.click();
//        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void questionFirstCheckBox(String currency,String num){
        customers_page.questionFirstCheckBox.click();
        customers_page.questionSecondCheckBox.click();
        customers_page.selectCheckBox.click();
        List<WebElementFacade> selectData = customers_page.selectData;
        for (int i = 0; i < selectData.size(); i++){
            if (currency.equals(selectData.get(i).getText())){
                selectData.get(i).click();
                break;
            }
        }
        customers_page.selectSecondCheckBox.click();
        for (int j = 0; j < selectData.size(); j++){
            if (num.equals(selectData.get(j).getText())){
                selectData.get(j).click();
                break;
            }
        }
        bddUtil.scrollWindowToElement(customers_page.clickThirdYes);
        customers_page.clickFirstYes.click();
        customers_page.clickSecondYes.click();
        customers_page.clickThirdYes.click();
        customers_page.clickNextBtn.click();
    }

    @Step
    public void approvalInTheSupplyChainSystem(){
        getClickCustomersMenu();
        customers_page.clickOnboardingReview.click();

    }

    @Step
    public void click_login_btn(){
        customers_page.clickLogonBtn.click();
    }

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        customers_page.openUrl(logonUrl);
    }

    @Step
    public void onboardingReviewTitle(){
        customers_page.onboardingReviewTitle.isVisible();
    }

    @Step
    public void assignToMePage(){
        customers_page.searchCompanyInput.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        customers_page.searchCheckBox.click();
        bddUtil.clickByJS(customers_page.assignToMeButton);
    }

    @Step
    public void assignToMeBtn(String value){
        List<WebElementFacade> assignToMe = customers_page.assignToMeBtn;
        List<WebElementFacade> companyName = customers_page.companyNameList;
        for (int i = 0; i < companyName.size(); i++){
            if (value.equals(companyName.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", assignToMe.get(i));
                break;
            }
        }
    }

    @Step
    public void clickAssignToMeTitle(){
        customers_page.clickAssignToMeTitle.click();
    }

    @Step
    public void clickProceedButtonOnAssignToMePage(){
        customers_page.searchCompanyInput.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        customers_page.searchCheckBox.click();
        customers_page.proceedButtton.click();
    }

    @Step
    public void clickProceedBtnOnAssignToMePage(String value){
        List<WebElementFacade> proceedBtn = customers_page.proceedBtn;
        List<WebElementFacade> assignToMeContent = customers_page.comPanyNameListOnAssginToMePage;
        for (int i = 0; i < assignToMeContent.size(); i++){
            if (value.equals(assignToMeContent.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", proceedBtn.get(i));
                break;
            }
        }
    }

    public void processPageApprove(){
        bddUtil.scrollWindowToElement(customers_page.relatedPartyCheckBox).click();
        customers_page.resultCheckBox.click();
        customers_page.selectApprove.click();
        customers_page.inputBoxComment.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.submitBtnOnAssignToMePage.click();
        bddUtil.quitDriver();
    }


}

package com.glbank.com.sg.bdd.steps.supplyChains.tubeByInputting;

import com.glbank.com.sg.bdd.pages.supplyChains.tubeByInputting.creatCustomers_page;
import com.glbank.com.sg.bdd.utils.*;
import com.lu.sn.Language;
import com.lu.sn.NameType;
import com.lu.sn.RandomNameTool;
import com.lu.sn.en.EnglishNameUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.glbank.com.sg.bdd.utils.AssertLocal.assertTrue;
import static org.junit.Assert.assertEquals;

public class creatCustomers_step extends ScenarioSteps {
    private creatCustomers_page customers_page;
    private BDDUtil bddUtil;
    public static String envTag;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/test.jpg";
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
        bddUtil.sleep(1);
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
    public void kycMode(String kycMode){
        customers_page.kycMode.click();
        List<WebElementFacade> kyc = customers_page.kycModeTitleList;
        for (int i = 0; i < kyc.size(); i++){
            if (kyc.get(i).getText().equals(kycMode)){
                kyc.get(i).click();
                break;
            }
        }
    }

    @Step
    public void inputBy(String inputBy){
        customers_page.inputBy.click();
        List<WebElementFacade> inputby = customers_page.kycModeTitleList;
        for (int i = 0; i < inputby.size(); i++){
            if (inputby.get(i).getText().equals(inputBy)){
                inputby.get(i).click();
                break;
            }
        }
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
    public void checkApprovedText(){
        customers_page.viewButton.click();
        assertEquals("Approved ",customers_page.approvedText.getText());
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
    public void phoneNumberFirst(){
        customers_page.mobileAreaCode.sendKeys("+86");
        customers_page.mobileNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
    }

    @Step
    public void getMobileInput(){
        customers_page.twoMobileAreaCodeInput.sendKeys("+86");
        customers_page.twomobileNumberInput.sendKeys(RandomPhoneNumber.randomPhoneNum());
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
//        if (getDriver().findElement(By.xpath("//div[@id='icon']")).isDisplayed()){
//            getDriver().findElement(By.xpath("//div[@class='nav-wrapper']/button[3]")).click();
//            bddUtil.sleep(1);
//            getDriver().findElement(By.xpath("//p[@id='final-paragraph']/a")).click();
//        }
        customers_page.selectEmailDropDown.click();
        customers_page.selectC0c.click();
        customers_page.chageSendEmail.clear();
        customers_page.chageSendEmail.sendKeys(value);
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
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
        bddUtil.switchToNewWindow();
//        errorEmailLink();
        bddUtil.switchToWindows();
    }
    @Step
    public void openEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://applet.itcp.site/mail/#/\");");
        bddUtil.switchToNewWindow();
        bddUtil.sleep(5);
        customers_page.selectEmailDropDown.click();
        customers_page.selectC0c.click();
        customers_page.chageSendEmail.clear();
        customers_page.chageSendEmail.sendKeys("dt1amdv5");
        bddUtil.switchToNewWindow();
//        errorEmailLink();
//        bddUtil.switchToWindows();
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
        bddUtil.sleep(5);
    }

    @Step
    public void checkSendEmailSuccess(){
        assertEquals("GreenLinkDigitalBank-Invitation",customers_page.firstEmail.getText());
    }

    @Step
    public void viewEmail(){
        bddUtil.switchToNewWindow();
        bddUtil.sleep(5);
        customers_page.clickRefresh.click();
        customers_page.clickFirstEmail.click();
    }

    @Step
    public void selectFirstEmailAndTakeVCode(){
        String username = customers_page.userName.getText();
        String password = customers_page.passWord.getText();
        customers_page.scfLink.isVisible();
        CommonUtil.waiting(2000);
        customers_page.scfLink.click();
        customers_page.GLDBEmailInput.sendKeys(username);
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.sendCodeBtn.click();
    }

    @Step
    public void thirdEmail(){
        bddUtil.sleep(3);
        customers_page.clickRefresh.click();
        bddUtil.sleep(1);
        List<WebElementFacade> selectEmail = customers_page.emailSubject;
        List<WebElementFacade> clickViewBtn = customers_page.clickViewBtn;
        for (int i = 0; i < selectEmail.size(); i++) {
            if (selectEmail.get(i).getText().equals("GreenLinkDigitalBank-VerificationCode")){
                clickViewBtn.get(i).click();
                break;
            }
        }
        bddUtil.sleep(2);
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
        customers_page.GLDBEmailInput.sendKeys(value + "@c0c.fun");
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.enterCompanyId.clear();
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(5);
        customers_page.clickCloseEmailBtn.click();
        customers_page.clickRefresh.click();
        List<WebElementFacade> selectEmail = customers_page.emailSubject;
        List<WebElementFacade> clickViewBtn = customers_page.clickViewBtn;
        for (int i = 0; i < selectEmail.size(); i++) {
            if (selectEmail.get(i).getText().equals("GreenLinkDigitalBank-VerificationCode")){
                clickViewBtn.get(i).click();
                break;
            }
        }
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
            if (customers_page.selectFirstCheckBox.isVisible()){
                customers_page.selectFirstCheckBox.click();
            }else {
                customers_page.selectFirstCheckBox.click();
                customers_page.selectSecondCheckBox1.click();
                customers_page.selectThirdCheckBox.click();
                customers_page.selectFourCheckBox.click();
            }
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
        customers_page.dateInputBox.sendKeys(bddUtil.lastDate());//公司创建日期 要小于核心日期。
        bddUtil.sleep(2);
        customers_page.annualReturnSizeClick.click();
        customers_page.annualReturnSizeSelect.click();
        customers_page.checkBoxPublicCompanyYes.click();
        customers_page.companyEmail.sendKeys(value+ "@c0c.fun");
        customers_page.companyPhoneNumber.sendKeys("+86");
        customers_page.companyPhoneNumberTwo.sendKeys(RandomPhoneNumber.randomPhoneNum());
//        customers_page.fileUpdate.click();
//        getDriver().findElement(By.xpath("//label[@for='A0001']//following-sibling::div//input")).sendKeys("C:\\workspace\\DBB_GL_AutoTesting-dev\\src\\test\\resources\\testData\\autopay\\test.jpg");
        getDriver().findElement(By.xpath("//label[@for='A0001']//following-sibling::div//input")).sendKeys(fileAddress);
//        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        bddUtil.sleep(5);
        bddUtil.scrollWindowToElement(customers_page.noExpiryDateTitle);
        customers_page.selectDate.click();
        customers_page.noExpiryDateInput.sendKeys("2024-09-10");
//        customers_page.memorandumAndArticlesOfAssLink.click();
        bddUtil.sleep(2);
//        getDriver().findElement(By.xpath("//label[@for='A0010']//following-sibling::div//input")).sendKeys("C:\\workspace\\DBB_GL_AutoTesting-dev\\src\\test\\resources\\testData\\autopay\\test2.jpg");
        getDriver().findElement(By.xpath("//label[@for='A0010']//following-sibling::div//input")).sendKeys(fileAddress);
//        bddUtil.fileUpload();
        bddUtil.sleep(5);
        customers_page.countryOfTaxation.sendKeys("China");
        customers_page.selectChina.click();
//        bddUtil.scrollWindowToElement(customers_page.registeredAddressTitle);
        customers_page.registeredAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        bddUtil.scrollWindowToElement(customers_page.sectorTitle);
        customers_page.businessCountry.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.businessAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.industry.click();
        bddUtil.scrollWindowToElement(customers_page.selectIndustry).click();
        customers_page.legalStructure.click();
        bddUtil.scrollWindowToElement(customers_page.selectLegalStructure).click();
        customers_page.isNonProfitYes.click();
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
        bddUtil.sleep(2);
        customers_page.clickConfirmBtnOnGLDB.click();
        bddUtil.sleep(10);
    }

    @Step
    public void confirmPageTitle(){
        customers_page.confirmPageTitle.isVisible();
    }

    @Step
    public void iLoginServiceAgreementWindow(){
        customers_page.GLDBEmailInput.sendKeys("dt1amdv5@c0c.fun");
        customers_page.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(5);
        customers_page.clickRefresh.click();
        bddUtil.sleep(2);
        List<WebElementFacade> selectEmail = customers_page.emailSubject;
        List<WebElementFacade> clickViewBtn = customers_page.clickViewBtn;
        for (int i = 0; i < selectEmail.size(); i++) {
            if (selectEmail.get(i).getText().equals("GreenLinkDigitalBank-VerificationCode")){
                clickViewBtn.get(i).click();
                break;
            }
        }
        bddUtil.sleep(1);
//        customers_page.find(By.xpath("//div[@id='message-list']/button[1]")).click();
        String Vcode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.clear();
        customers_page.inputSendCode.sendKeys(Vcode);
        customers_page.GLDBEmailLoginBtn.click();
    }

    @Step
    public void jumpSetUpPrimaryAdminTitle(){
        customers_page.jumpSetUpPrimaryAdminTitle.isVisible();
    }

    @Step
    public void enterInformationOnPeoplePage(String value){
        customers_page.enterFullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.applicantPhoneNumFirst.sendKeys("+86");
        customers_page.applicantPhoneNumSecond.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.applicantEmial.sendKeys(value + "@c0c.fun");
        customers_page.enterPinYin.sendKeys("zhangsan");
        customers_page.enterAlias.sendKeys("China");
        customers_page.enterPinYinAlias.sendKeys("zhongguo");
        customers_page.idTypeDropbox.click();
        bddUtil.scrollWindowToElement(customers_page.selectIdType).click();
        customers_page.enterIdNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.adminIDExpiryDate.click();
        customers_page.dateOfBirth.sendKeys("2024-09-10");
        customers_page.enterNationality.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.countryOfResidence.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.enterCity.sendKeys("beijing");
        customers_page.enterPostalCode.sendKeys("010");
        customers_page.selectDirector.click();
        customers_page.enterResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.enterFullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.enterPinYin2.sendKeys("zhangsan");
        customers_page.enterAlias2.sendKeys("China");
        customers_page.enterPinYinAlias2.sendKeys("zhongguo");
        customers_page.idTypeDropbox2.click();
        bddUtil.scrollWindowToElement(customers_page.selectIdType).click();
        customers_page.enterIdNo2.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.adminIDExpiryDate2.click();
        customers_page.dateOfBirth2.sendKeys("2024-09-10");
        customers_page.enterNationality2.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.countryOfResidence2.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.enterCity2.sendKeys("beijing");
        customers_page.enterPostalCode2.sendKeys("010");
        customers_page.selectDirector2.click();
        customers_page.enterResidentialAddress2.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
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
        customers_page.director1FullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.director1EnterPinYin.sendKeys("zhangsan");
        customers_page.director1Alias.sendKeys("China");
        customers_page.director1PinyinAliasName.sendKeys("zhongguo");
        customers_page.director1IdType.click();
        customers_page.director1SelectIdType.click();
        customers_page.director1IdNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director1IdExpiryDate.click();
        customers_page.director1DateOfBirth.sendKeys("2024-09-10");
        customers_page.director1NationalityDrop.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.director1City.sendKeys("beijing");
        customers_page.director1PostalCode.sendKeys("010");
        customers_page.director1ResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.director1CountryOfResidence.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.director1FirstPhoneNum.sendKeys("+86");
        customers_page.director1SecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director1EmailAddress.sendKeys(value + "@c0c.fun");
        customers_page.director1SelectCheckBox.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void fillInTheInformationOnTheShareholderPage(String currency,String value){
        customers_page.shareholder1Name.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.shareholder1PinyinName.sendKeys("zhangsan");
        customers_page.shareholder1Alias.sendKeys("China");
        customers_page.shareholder1PinyinAliasName.sendKeys("zhongguo");
        customers_page.shareholder1IdTypeSelect.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(customers_page.shareholder1Passport).click();
        customers_page.shareholder1IdNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder1NoExpiry.click();
        customers_page.shareholder1DateOfBirth.sendKeys("2024-09-10");
        customers_page.shareholder1Nationality.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.shareholder1ResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.shareholder1CountryOfResidence.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.shareholder1NoExpiry.click();
        customers_page.shareholder1FirstPhoneNum.sendKeys("+86");
        customers_page.shareholder1SecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder1EnterEmail.sendKeys(value + "@c0c.fun");
        customers_page.shareholder1CEnterCity.sendKeys("beijing");
        customers_page.shareholder1EnterPostalCode.sendKeys("010");
        customers_page.shareholder1ShareTypeDrowBox.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder1SelectShareType).click();
        customers_page.shareholder1AllocationDropDown.click();
        List<WebElementFacade> allocation = customers_page.shareholder1AllocationCurrency;
        for (int i = 0; i < allocation.size(); i++) {
            if (allocation.get(i).getText().equals(currency)){
                allocation.get(i).click();
                break;
            }
        }
        customers_page.shareholder1AllocationSecondEnter.sendKeys("10000");
        customers_page.shareholder1Shareholding.sendKeys("20");
        customers_page.shareholder2FullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.shareholder2PinyinName.sendKeys("zhangsan");
        customers_page.shareholder2Alias.sendKeys("China");
        customers_page.shareholder2PinyinAliasName.sendKeys("zhongguo");
        customers_page.shareholder2IdTypeDropDown.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2SelectPassport).click();
        customers_page.shareholder2IdNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder2IDExpiryDate.click();
        customers_page.shareholder2DateOfBirth.sendKeys("2024-09-10");
        customers_page.shareholder2Nationality.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.shareholder2ResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.shareholder2CountryOfResidence.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.shareholder2FirstPhoneNum.sendKeys("+86");
        customers_page.shareholder2SecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder2EnterEmail.sendKeys(value + "@c0c.fun");
        customers_page.shareholder2CEnterCity.sendKeys("beijing");
        customers_page.shareholder2EnterPostalCode.sendKeys("010");
        customers_page.shareholder2ShareTypeDrowBox.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2SelectShareType).click();
        customers_page.shareholder2AllocationDropDown.click();
        List<WebElementFacade> allocation2 = customers_page.shareholder1AllocationCurrency;
        for (int i = 0; i < allocation2.size(); i++) {
            if (allocation2.get(i).getText().equals(currency)){
                allocation2.get(i).click();
                break;
            }
        }
        customers_page.shareholder2AllocationSecondEnter.sendKeys("10000");
        customers_page.shareholder2Shareholding.sendKeys("20");
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void verifyWhetherTheBeneficialPageIsDisplayed(){
        customers_page.beneficialTitle.isVisible();
    }

    @Step
    public void fillInTheInformationOnTheBeneficialPage(String currency, String value){
        customers_page.beneficialFullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.beneficialPinYinName.sendKeys("lisi");
        customers_page.beneficialAlias.sendKeys("China");
        customers_page.beneficialPinYinAliasName.sendKeys("zhongguo");
        customers_page.beneficialCertificationType.click();
        customers_page.selectIdType.click();
        customers_page.beneficialCertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.beneficialTimePermanent.click();
        customers_page.beneficialDateBirth.sendKeys("2024-09-10");
        customers_page.beneficialShareType.click();
        customers_page.shareholder2SelectShareType.click();
        customers_page.beneficialAllocation.click();
        List<WebElementFacade> allocation = customers_page.shareholder1AllocationCurrency;
        for (int i = 0; i < allocation.size(); i++) {
            if (allocation.get(i).getText().equals(currency)){
                allocation.get(i).click();
                break;
            }
        }
        customers_page.beneficialFundScale.sendKeys("20");
        customers_page.beneficialCountry.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.beneficialCity.sendKeys("beijing");
        customers_page.beneficialCountryOfResidence.sendKeys("China");
        customers_page.selectChina.click();
        customers_page.beneficialPostalCode.sendKeys("010");
        customers_page.beneficialResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.beneficialFirstPhoneNum.sendKeys("+86");
        customers_page.beneficialSecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.beneficialEmail.sendKeys(value + "@c0c.fun");
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void verifyWhetherTheAccountPageIsDisplayed(){
        customers_page.tellUsAboutAccoutPageTitle.isVisible();
    }

    @Step
    public void enterTheAccountInformation(String value){
        customers_page.accountCurrency.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(customers_page.find(By.xpath("//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='"+value+"']"))).click();
        customers_page.tellUsAboutAccoutPageTitle.click();
        customers_page.collectionAccountCurrency.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(customers_page.find(By.xpath("//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='"+value+"']"))).click();
        customers_page.tellUsAboutAccoutPageTitle.click();
//        customers_page.SaveBtnIndustry.click();
        if (getDriver().findElement(By.xpath("//span[text()='Delete']")).isDisplayed()){
            getDriver().findElement(By.xpath("//span[text()='Delete']")).click();
        }
        bddUtil.sleep(2);
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
        bddUtil.scrollWindowToElement(customers_page.clickThirdYes);
        customers_page.selectSecondCheckBox.click();
        bddUtil.sleep(2);
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
        bddUtil.sleep(2);
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
//        bddUtil.scrollWindowToElement(customers_page.relatedPartyCheckBox);
        bddUtil.clickByJS(customers_page.relatedPartyCheckBox);
        bddUtil.sleep(2);
        customers_page.resultCheckBox.click();
        customers_page.selectApprove.click();
        customers_page.inputBoxComment.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.submitBtnOnAssignToMePage.click();
        bddUtil.sleep(13);
        bddUtil.quitDriver();
    }


}

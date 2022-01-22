package com.hsbc.cmb.hk.dbb.pages.supplyChains.tubeByInputting;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class creatCustomers_page extends PageObject {

    @FindBy(xpath = "//span[text()='Customers']")
    public WebElementFacade clickCustomersMenu;

    @FindBy(xpath = "//div[@class='name']")
    public WebElementFacade scfTitle;

    @FindBy(xpath = "//span[text()='Onboarding List']")
    public WebElementFacade clickOnboardingListMenu;

    @FindBy(xpath = "//div[@class='btn-container flex-end']/div/button")
    public WebElementFacade clickCreateCustomerBtn;

    @FindBy(xpath = "//div[@class='dialog_create_container']/div[@class='dialog_create_item'][1]//span[@class='lls-input__suffix-inner']")
    public WebElementFacade selectCustomerType;

    @FindBy(xpath = "//body[@class='el-popup-parent--hidden']/div[4]//span[text()='Buyer']")
    public WebElementFacade customerTypeBuyer;

    @FindBy(xpath = "//span[text()='Supplier']")
    public WebElementFacade customerTypeSupplier;

    @FindBy(xpath = "//label[@for='custEnglishName']/following-sibling::div//input")
    public WebElementFacade companyName;

    @FindBy(xpath = "//label[@for='companyId']/following-sibling::div//input")
    public WebElementFacade companyID;

    @FindBy(xpath = "//label[@for='registryCountry']/following-sibling::div//input/following-sibling::span")
    public WebElementFacade selectCountryOfRegistration;

    @FindBy(xpath = "//body[@class='el-popup-parent--hidden']/div[5]//ul//span[text()='China']")
    public WebElementFacade countryOfRegistrationValue;

    @FindBy(xpath = "//label[@for='custName']/following-sibling::div//input")
    public WebElementFacade companyNameLeft;

    @FindBy(xpath = "//div[@class='form_btn_bottom']//span[contains(text(), 'Next')]")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//div[@class='form_btn_bottom']//span[contains(text(), 'Previous ')]")
    public WebElementFacade previousBtn;

    @FindBy(xpath = "//span[text()='Administrator 1 ']")
    public WebElementFacade checkNextPage;

    @FindBy(xpath = "//label[@for='authorOne.firstName']/following-sibling::div//input")
    public WebElementFacade firstNameInput;

    @FindBy(xpath = "//label[@for='authorOne.email']/following-sibling::div//input")
    public WebElementFacade emailInput;

    @FindBy(xpath = "//label[@for='authorOne.lastName']/following-sibling::div//input")
    public WebElementFacade lastNameInput;

    @FindBy(xpath = "//label[@for='authorOne.mobile']/following-sibling::div//input")
    public WebElementFacade mobileInput;

    @FindBy(xpath = "//label[@for='authorTwo.firstName']/following-sibling::div//input")
    public WebElementFacade firstNameSecondInput;

    @FindBy(xpath = "//label[@for='authorTwo.email']/following-sibling::div//input")
    public WebElementFacade emailSecondInput;

    @FindBy(xpath = "//label[@for='authorTwo.lastName']/following-sibling::div//input")
    public WebElementFacade lastNameSecondInput;

    @FindBy(xpath = "//label[@for='authorTwo.mobile']/following-sibling::div//input")
    public WebElementFacade mobileSecondInput;

    @FindBy(xpath = "//span[text()='Submit ']")
    public WebElementFacade submitBtn;

    @FindBy(xpath = "//span[text()='Customer Profiles']")
    public WebElementFacade checkSuccessPageTitle;

    @FindBy(xpath = "//label[@for='autoCustBuild']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickInputBySelectBox;

    @FindBy(xpath = "//span[text()='Customer']")
    public WebElementFacade inputByTypeCustomer;

    @FindBy(xpath = "//span[text()='Operator']")
    public WebElementFacade inputByTypeOperator;

    @FindBy(xpath = "//form[@class='form-inline']//input")
    public WebElementFacade sendEmail;

    @FindBy(xpath = "//form[@class='form-inline']//button")
    public WebElementFacade createEmailButton;

    @FindBy(xpath = "//td[@data-key='f38u3atf']")
    public List<WebElementFacade> authPerson;

    @FindBy(xpath = "//div[@class='lowcode-table default-theme']//table[@class='fixed-right-table']/tbody/tr[1]//i[@class='lls-tooltip lls-icon-send-mail']")
    public WebElementFacade emailIcon;

    @FindBy(xpath = "//div[@class='lls-message-box__wrapper']//span[contains(text(), 'Confirm')]")
    public WebElementFacade confirmBtn;

    @FindBy(xpath = "//span[text()='Green Link Digital Bank - Invitation']")
    public WebElementFacade firstEmail;

    @FindBy(xpath = "//span[text()='Green Link Digital Bank - Verify Identity']")
    public WebElementFacade secondEmail;

    @FindBy(xpath = "//p[text()='Log In']")
    public WebElementFacade loginPageTitle;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-refresh']")
    public WebElementFacade clickRefreshBtn;

    @FindBy(xpath = "//div[@id='body-html']//h2")
    public WebElementFacade emailPassword;

    @FindBy(xpath = "//div[@class='tab-pane message-body active']//h2")
    public WebElementFacade emailVerificationCode;

    @FindBy(xpath = "//div[@class='tab-pane message-body active']//h2/preceding-sibling::span//a")
    public WebElementFacade greenLinkSystem;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@placeholder='Enter email']")
    public WebElementFacade GLDBEmailInput;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@type='password']")
    public WebElementFacade GLDBEmailPassword;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/button")
    public WebElementFacade sendCodeBtn;

    @FindBy(xpath = "//div[@id='message-list']/button[1]//span[text()='Green Link Digital Bank - Verification Code']")
    public WebElementFacade thirdEmail;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/preceding-sibling::input")
    public WebElementFacade inputSendCode;

    @FindBy(xpath = "//input[@placeholder='Enter Company ID']")
    public WebElementFacade enterCompanyId;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElementFacade GLDBEmailLoginBtn;

    @FindBy(xpath = "//p[text()='Set New Password']")
    public WebElementFacade setNewPasswordPage;

    @FindBy(xpath = "//p[text()='New password']/following-sibling::div[1]//input")
    public WebElementFacade firstNewPassword;

    @FindBy(xpath = "//p[text()='New password']/following-sibling::div[2]//input")
    public WebElementFacade secondNewPassword;

    @FindBy(xpath = "//span[text()='Confirm']")
    public WebElementFacade newPasswordPageConfirmBtn;

    @FindBy(xpath = "//span[text()='Service Agreement']")
    public WebElementFacade serviceAgreementTitle;

    @FindBy(xpath = "//span[@class='dialog-footer']/label[@class='lls-checkbox']/span[1]")
    public WebElementFacade clickCheckBox;

    @FindBy(xpath = "//span[@class='dialog-footer']/div[@class='btn-sty']/button[2]")
    public WebElementFacade clickAgreeBtn;

    @FindBy(xpath = "//div[text()=' Tell Us About Your Company ']")
    public WebElementFacade checkjumpPageTellUs;

    @FindBy(xpath = "//label[text()='Date of Incorporation']/following-sibling::div//input")
    public WebElementFacade dateInputBox;

    @FindBy(xpath = "//label[text()='Annual Return Size（SGD eqiv.）']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade annualReturnSizeClick;

    @FindBy(xpath = "//span[text()='Micro SME（≤1,000,000）']")
    public WebElementFacade annualReturnSizeSelect;

    @FindBy(xpath = "//label[@for='isListed']/following-sibling::div/label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade checkBoxPublicCompanyYes;

    @FindBy(xpath = "//label[@for='isListed']/following-sibling::div/label[2]//span[@class='lls-radio__inner']")
    public WebElementFacade checkBoxPublicCompanyNo;

    @FindBy(xpath = "//label[@for='websiteUrl']/following-sibling::div//input)")
    public WebElementFacade webSiteUrl;

    @FindBy(xpath = "//label[@for='companyEmail']/following-sibling::div//input")
    public WebElementFacade companyEmail;

    @FindBy(xpath = "//label[@for='companyPhoneNumber']/following-sibling::div//input")
    public WebElementFacade companyPhoneNumber;

    @FindBy(xpath = "//label[text()='Certificate of Incorporation']/following-sibling::div//span")
    public WebElementFacade fileUpdate;

    @FindBy(xpath = "//label[text()='Memorandum and Articles of Association']")
    public WebElementFacade memorandumTitle;

    @FindBy(xpath = "//span[text()='No Expiry']")
    public WebElementFacade noExpiryDateTitle;

    @FindBy(xpath = "//span[text()='No Expiry']/parent::label/following-sibling::label//input[@class='lls-input__inner']")
    public WebElementFacade noExpiryDateInput;

    @FindBy(xpath = "//label[text()='Memorandum and Articles of Association']/following-sibling::div//span")
    public WebElementFacade memorandumAndArticlesOfAssLink;

    @FindBy(xpath = "//label[@for='countryOfTaxation']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade countryOfTaxation;

    @FindBy(xpath = "//body/div[5]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade selectCountryOfTaxation;

    @FindBy(xpath = "//label[@for='registeredAddress']")
    public WebElementFacade registeredAddressTitle;

    @FindBy(xpath = "//label[@for='registeredAddress']/following-sibling::div//textarea")
    public WebElementFacade registeredAddress;

    @FindBy(xpath = "//label[@for='businessCountry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade businessCountry;

    @FindBy(xpath = "//body/div[6]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade selectBusinessCountry;

    @FindBy(xpath = "//label[@for='businessAddress']/following-sibling::div//textarea")
    public WebElementFacade businessAddress;

    @FindBy(xpath = "//label[@for='industry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade industry;

    @FindBy(xpath = "//span[text()='Agriculture & Fishing']")
    public WebElementFacade selectIndustry;

    @FindBy(xpath = "//label[@for='legalStructure']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade legalStructure;

    @FindBy(xpath = "//span[text()='Private Limited Co']")
    public WebElementFacade selectLegalStructure;

    @FindBy(xpath = "//label[@for='isNonProfit']/following-sibling::div/label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade isNonProfitYes;

    @FindBy(xpath = "//label[@for='isNonProfit']/following-sibling::div/label[2]//span[@class='lls-radio__inner']")
    public WebElementFacade isNonProfitNo;

    @FindBy(xpath = "//label[@for='sector']/following-sibling::div//input")
    public WebElementFacade sectorInputBox;

    @FindBy(xpath = "//div[@class='content-submit']/button[3]")
    public WebElementFacade nextBtnIndustry;

    @FindBy(xpath = "//div[@class='content-submit']/button[2]")
    public WebElementFacade SaveBtnIndustry;

    @FindBy(xpath = "//div[text()=' Set up Primary Administrators ']")
    public WebElementFacade jumpSetUpPrimaryAdminTitle;

    @FindBy(xpath = "//label[@for='sector']")
    public WebElementFacade sectorTitle;

    @FindBy(xpath = "//div[text()=' Administrator 1 ']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade admin1DateOfBirth;

    @FindBy(xpath = "//div[text()=' Administrator 1 ']/parent::div/following-sibling::div//label[@for='legalCountry']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade admin1LegalCountry;

    @FindBy(xpath = "//body/div[3]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade admin1LegalCountrySelectChina;

    @FindBy(xpath = "//div[text()=' Administrator 1 ']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade admin1CountryOfResidence;

    @FindBy(xpath = "//body/div[4]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade admin1CountryOfResidenceSelectChina;

    @FindBy(xpath = "//div[text()=' Administrator 1 ']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade admin1ResidentialAddress;

    @FindBy(xpath = "//div[text()=' Administrator 1 ']/parent::div/following-sibling::div//label[@for='legalCertificationType']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade admin1LegalCertificationType;

    @FindBy(xpath = "//body/div[5]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='Personal ID']")
    public WebElementFacade admin1LegalCertificationTypeSelectPersonlId;

    @FindBy(xpath = "//div[text()=' Administrator 1 ']/parent::div/following-sibling::div//label[@for='legalCertificationNo']/following-sibling::div//input")
    public WebElementFacade admin1LegalCertificationNo;

    @FindBy(xpath = "//div[text()=' Administrator 2 ']/parent::div/following-sibling::div//label[@for='timePermanent']")
    public WebElementFacade admin2TimePermanent;

    @FindBy(xpath = "//div[text()=' Administrator 2 ']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade admin2DateOfBirth;

    @FindBy(xpath = "//div[text()=' Administrator 2 ']/parent::div/following-sibling::div//label[@for='legalCountry']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade admin2LegalCountry;

    @FindBy(xpath = "//body/div[7]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade admin2LegalCountrySelectChina;;

    @FindBy(xpath = "//div[text()=' Administrator 2 ']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade admin2CountryOfResidence;

    @FindBy(xpath = "//body/div[8]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade admin2CountryOfResidenceSelectChina;

    @FindBy(xpath = "//div[text()=' Administrator 2 ']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade admin2ResidentialAddress;

    @FindBy(xpath = "//div[text()=' Administrator 2 ']/parent::div/following-sibling::div//label[@for='legalCertificationType']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade admin2LegalCertificationType;

    @FindBy(xpath = "//body/div[9]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='Passport']")
    public WebElementFacade admin2LegalCertificationTypeSelectPassport;

    @FindBy(xpath = "//div[text()=' Administrator 2 ']/parent::div/following-sibling::div//label[@for='legalCertificationNo']/following-sibling::div//input")
    public WebElementFacade admin2LegalCertificationNo;

    @FindBy(xpath = "//div[@class='title']")
    public WebElementFacade directorOfTheInformation;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//span[@class='lls-switch__core is-small']")
    public WebElementFacade director1CheckBox;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='firstName']/following-sibling::div//input")
    public WebElementFacade director1FirstName;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='lastName']/following-sibling::div//input")
    public WebElementFacade director1LastName;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade director1CertificationType;

    @FindBy(xpath = "//body/div[2]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='Personal ID']")
    public WebElementFacade director1PersonalId;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade director1CertificationNo;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade director1DateOfBirth;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade director1Country;

    @FindBy(xpath = "//body/div[8]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade director1CountrySelectChina;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//div")
    public WebElementFacade director1ResidentialAddress;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade director1Email;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade director1CountryOfResidence;

    @FindBy(xpath = "//body/div[9]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade director1CountryOfResidenceSelectChina;

    @FindBy(xpath = "//div[text()=' Director 1 ']/parent::div/following-sibling::div//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade director1Phone;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//span[@class='lls-switch__core is-small']")
    public WebElementFacade director2CheckBox;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='firstName']/following-sibling::div//input")
    public WebElementFacade director2FirstName;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='lastName']/following-sibling::div//input")
    public WebElementFacade director2LastName;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade director2CertificationType;

    @FindBy(xpath = "//body/div[3]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='Passport']")
    public WebElementFacade director2Passport;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade director2CertificationNo;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade director2DateOfBirth;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade director2Country;

    @FindBy(xpath = "//body/div[9]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade director2CountrySelectChina;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//div")
    public WebElementFacade director2ResidentialAddress;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade director2Email;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade director2CountryOfResidence;

    @FindBy(xpath = "//body/div[9]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade director2CountryOfResidenceSelectChina;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade director2Phone;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div")
    public WebElementFacade director2TimePermanent;

    @FindBy(xpath = "//div[text()=' Director 2 ']/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__input']")
    public WebElementFacade director2TimePermanentCheckBox;

    @FindBy(xpath = "//div[@class='title']")
    public WebElementFacade shareholderOfTheInformation;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='firstName']/following-sibling::div//input")
    public WebElementFacade shareholder1FirstName;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='lastName']/following-sibling::div//input")
    public WebElementFacade shareholder1LastName;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade shareholder1CertificationType;

    @FindBy(xpath = "//body/div[2]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='Personal ID']")
    public WebElementFacade shareholder1CertificationTypeSelectPersonalId;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade shareholder1CertificationNo;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade shareholder1DateOfBirth;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade shareholder1Country;

    @FindBy(xpath = "//body/div[4]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade shareholder1CountrySelectChina;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade shareholder1CountryOfResidence;

    @FindBy(xpath = "//body/div[5]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade shareholder1CountryOfResidenceSelectChina;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade shareholder1Email;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade shareholder1Phone;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div")
    public WebElementFacade shareholder1ResidentialAddress;

    @FindBy(xpath = "//div[text()=' Shareholder 1 ']/parent::div/following-sibling::div//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade shareholder1FundScale;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='firstName']/following-sibling::div//input")
    public WebElementFacade shareholder2FirstName;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='lastName']/following-sibling::div//input")
    public WebElementFacade shareholder2LastName;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade shareholder2CertificationType;

    @FindBy(xpath = "//body/div[6]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='Passport']")
    public WebElementFacade shareholder2CertificationTypeSelectPersonalId;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade shareholder2CertificationNo;

    @FindBy(xpath = " //div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__input']")
    public WebElementFacade shareholder2TimePermanent;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade shareholder2DateOfBirth;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade shareholder2Country;

    @FindBy(xpath = "//body/div[6]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade shareholder2CountrySelectChina;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade shareholder2CountryOfResidence;

    @FindBy(xpath = "//body/div[7]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade shareholder2CountryOfResidenceSelectChina;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade shareholder2Email;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade shareholder2Phone;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div")
    public WebElementFacade shareholder2ResidentialAddress;

    @FindBy(xpath = "//div[text()=' Shareholder 2 ']/parent::div/following-sibling::div//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade shareholder2FundScale;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//span[@class='lls-switch__core is-small']")
    public WebElementFacade beneficialCheckBox;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='firstName']/following-sibling::div//input")
    public WebElementFacade beneficial1FirstName;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='lastName']/following-sibling::div//input")
    public WebElementFacade beneficial1LastName;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade beneficial1CertificationType;

    @FindBy(xpath = "//body/div[2]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='Passport']")
    public WebElementFacade beneficial1CertificationTypeSelectPersonalId;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade beneficial1CertificationNo;

    @FindBy(xpath = " //div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__input']")
    public WebElementFacade beneficial1TimePermanent;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade beneficial1FundScale;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade beneficial1Email;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade beneficial1DateOfBirth;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade beneficial1Country;

    @FindBy(xpath = "//body/div[3]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade beneficial1CountrySelectChina;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade beneficial1Phone;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade beneficial1CountryOfResidence;

    @FindBy(xpath = "//body/div[4]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade beneficial1CountryOfResidenceSelectChina;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div")
    public WebElementFacade beneficial1ResidentialAddress;

    @FindBy(xpath = "//div[text()=' Tell Us About Your Bank Account(s) ']")
    public WebElementFacade tellUsAboutAccoutPageTitle;

    @FindBy(xpath = "//span[text()='Current Account']/parent::div/following-sibling::div[2]//label[@for='currency']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade accountCurrency;

    @FindBy(xpath = "//body/div[2]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CNY']")
    public WebElementFacade accountCurrencyCNY;

    @FindBy(xpath = "//span[text()='SCF Collection Account']/parent::div/following-sibling::div[2]//label[@for='currency']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade collectionAccountCurrency;

    @FindBy(xpath = "//body/div[3]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CNY']")
    public WebElementFacade collectionAccountCurrencyCNY;

    @FindBy(xpath = "//div[text()=' Questionnaire ']")
    public WebElementFacade questionnaireTitle;
}

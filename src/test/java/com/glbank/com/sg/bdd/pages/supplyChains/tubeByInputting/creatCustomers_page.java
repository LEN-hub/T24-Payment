package com.glbank.com.sg.bdd.pages.supplyChains.tubeByInputting;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

import static java.time.temporal.ChronoUnit.SECONDS;

public class creatCustomers_page extends PageObject {

    @FindBy(xpath = "//span[text()='Customers']")
    public WebElementFacade clickCustomersMenu;

    @FindBy(xpath = "//span[text()='Onboarding Review']")
    public WebElementFacade clickOnboardingReview;

    @FindBy(xpath = "//div[@class='name']")
    public WebElementFacade scfTitle;

    @FindBy(xpath = "//span[text()='Onboarding List']")
    public WebElementFacade clickOnboardingListMenu;

    @FindBy(xpath = "//span[text()='Contracts']/parent::div/following-sibling::div//span")
    public WebElementFacade clickContractManagement;

    @FindBy(xpath = "//label[text()='Company Name']/following-sibling::div//input")
    public WebElementFacade uploadSingBR;

    @FindBy(xpath = "//label[text()='Contract Type']")
    public WebElementFacade clickContractType;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//span[contains(text(),'Upload')]")
    public WebElementFacade clickUploadButton;

    @FindBy(xpath = "//div[@class='relative-input-div']//input")
    public WebElementFacade dateInput;

    @FindBy(xpath = "//div[@class='lls-dialog__body']//span[contains(text(),'Confirm')]")
    public WebElementFacade clickSingBRConfirmBtn;

    @FindBy(xpath = "//div[@class='btn-container flex-end']/div/button")
    public WebElementFacade clickCreateCustomerBtn;

    @FindBy(xpath = "//div[@class='dialog_create_container']/div[@class='dialog_create_item'][1]//span[@class='lls-input__suffix-inner']")
    public WebElementFacade selectCustomerType;

    @FindBy(xpath = "//body[@class='el-popup-parent--hidden']/div[4]//span[text()='Buyer']")
    public WebElementFacade customerTypeBuyer;

    @FindBy(xpath = "//span[text()='Supplier']")
    public WebElementFacade customerTypeSupplier;

    @FindBy(xpath = "//span[text()='Buyer']")
    public WebElementFacade getCustomerTypeBuyer;

    @FindBy(xpath = "//label[@for='custEnglishName']/following-sibling::div//input")
    public WebElementFacade companyName;

    @FindBy(xpath = "//label[@for='companyId']/following-sibling::div//input")
    public WebElementFacade companyID;

    @FindBy(xpath = "//label[@for='registryCountry']/following-sibling::div//input/following-sibling::span")
    public WebElementFacade selectCountryOfRegistration;

    @FindBy(xpath = "//body[@class='el-popup-parent--hidden']/div[5]//ul//span[text()='Singapore']")
    public WebElementFacade countryOfRegistrationValue;

    @FindBy(xpath = "//label[@for='custName']/following-sibling::div//input")
    public WebElementFacade companyNameLeft;

    @FindBy(xpath = "//label[@for='kycMode']/following-sibling::div//span[@class=\"lls-input__suffix-inner\"]")
    public WebElementFacade kycMode;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span")
    public List<WebElementFacade> kycModeTitleList;

    @FindBy(xpath = "//label[@for='autoCustBuild']/following-sibling::div//input")
    public WebElementFacade inputBy;

    @FindBy(xpath = "//div[@class='form_btn_bottom']//span[contains(text(), 'Next')]")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//div[@class='form_btn_bottom']//span[contains(text(), 'Previous ')]")
    public WebElementFacade previousBtn;

    @FindBy(xpath = "//span[contains(text(),'Administrator 1')]")
    public WebElementFacade checkNextPage;

    @FindBy(xpath = "//p[text()=' Approved ']")
    public WebElementFacade approvedText;

    @FindBy(xpath = "//div[@class=\"lowcode-table-fixed-right\"]//table[1]/tbody/tr[1]//div[@class='lls-design-table-btn-wrapper']/span[1]//button")
    public WebElementFacade viewButton;

    @FindBy(xpath = "//label[@for='authorOne.legalName']/following-sibling::div//input")
    public WebElementFacade firstNameInput;

    @FindBy(xpath = "//label[@for='authorOne.email']/following-sibling::div//input")
    public WebElementFacade emailInput;

    @FindBy(xpath = "//label[@for='authorTwo.legalName']/following-sibling::div//input")
    public WebElementFacade lastNameInput;

    @FindBy(xpath = "//label[@for='authorOne.mobileWrap']/following-sibling::div/div[1]//input")
    public WebElementFacade mobileAreaCode;

    @FindBy(xpath = "//label[@for='authorOne.mobileWrap']/following-sibling::div/div[2]//input")
    public WebElementFacade mobileNumber;

    @FindBy(xpath = "//label[@for='authorTwo.mobileWrap']/following-sibling::div/div[1]//input")
    public WebElementFacade twoMobileAreaCodeInput;

    @FindBy(xpath = "//label[@for='authorTwo.mobileWrap']/following-sibling::div/div[2]//input")
    public WebElementFacade twomobileNumberInput;

    @FindBy(xpath = "//label[@for='authorTwo.firstName']/following-sibling::div//input")
    public WebElementFacade firstNameSecondInput;

    @FindBy(xpath = "//label[@for='authorTwo.email']/following-sibling::div//input")
    public WebElementFacade emailSecondInput;

    @FindBy(xpath = "//label[@for='authorTwo.lastName']/following-sibling::div//input")
    public WebElementFacade lastNameSecondInput;

    @FindBy(xpath = "//label[@for='authorTwo.mobile']/following-sibling::div//input")
    public WebElementFacade mobileSecondInput;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
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

    @FindBy(id = "converts")
    public WebElementFacade sendEmailContent;

    @FindBy(xpath = "//input[@placeholder=\"请输入邮箱账号\"]")
    public WebElementFacade chageSendEmail;

    @FindBy(xpath = "//button[text()=' 设邮箱']")
    public WebElementFacade emailAddress;

    @FindBy(xpath = "//span[text()=' 刷新 ']")
    public WebElementFacade clickRefresh;

    @FindBy(xpath = "//span[text()='查看']")
    public WebElementFacade clickFirstEmail;

    @FindBy(xpath = "//table[@class='el-table__body']/tbody/tr/td[3]/div")
    public List<WebElementFacade> emailSubject;

    @FindBy(xpath = "//table[@class='el-table__body']/tbody/tr//span[text()='查看']")
    public List<WebElementFacade> clickViewBtn;

    @FindBy(xpath = "//div[@id= 'message']")
    public WebElementFacade emailMessage;

    @FindBy(xpath = "//form[@class='form-inline']//button")
    public WebElementFacade createEmailButton;

    @FindBy(xpath = "//div[@id='main-message']/h1")
    public WebElementFacade errorText;

    @FindBy(id = "details-button")
    public WebElementFacade advancedButton;

    @FindBy(id = "proceed-link")
    public WebElementFacade enterEmailLink;

    @FindBy(xpath = "//td[@data-key='f38u3atf']")
    public List<WebElementFacade> authPerson;

    @FindBy(xpath = "//div[@class='lowcode-table default-theme']//table[@class='fixed-right-table']/tbody/tr[1]//i[@class='lls-tooltip lls-icon-send-mail']")
    public WebElementFacade emailIcon;

    @FindBy(xpath = "//div[@class='lowcode-table default-theme']//table[@class='fixed-right-table']/tbody/tr[1]//i[@class='lls-tooltip lls-icon-edit']")
    public WebElementFacade clickEditIcon;

    @FindBy(xpath = "//div[@class='lowcode-table default-theme']//table[@class='fixed-right-table']/tbody/tr[1]//i[@class='lls-tooltip lls-icon-sell']")
    public WebElementFacade clickUpgradeKYC;

    @FindBy(xpath = "//label[@for='kycMode']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickUpgradeModeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectUpgradeMode;

    @FindBy(xpath = "//label[@for='autoCustBuild']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickInputByDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectInpuByText;

    @FindBy(xpath = "//span[text()='Confirm']")
    public WebElementFacade clickConfirmBtn;

    @FindBy(xpath = "//label[@for='registeredAddress']/following-sibling::div//textarea")
    public WebElementFacade enterRegisteredAddress;

    @FindBy(xpath = "//label[@for='businessCountry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickCountryOfBusiness;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='Andorra']")
    public WebElementFacade selectCountryOfBusinessText;

    @FindBy(xpath = "//label[@for='businessCity']/following-sibling::div//input")
    public WebElementFacade enterBusinessCity;

    @FindBy(xpath = "//label[@for='businessAddress']/following-sibling::div//textarea")
    public WebElementFacade enterBusinessAddress;

    @FindBy(xpath = "//label[@for='industry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickIndustryDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectIndustryText;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade enterPinYinName;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterAliasSimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade enterPinYinAliasName;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='legalCertificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickIdTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectIdTypeText;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='legalCertificationNo']/following-sibling::div//input")
    public WebElementFacade enterIdNoSimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade selectNoExpirySimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterDateSimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='legalCountry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickNationalityDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='Andorra']")
    public WebElementFacade selectNationalitySimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterResidentialAddressSimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickCountryOfResidenceSimpleKYC;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='Andorra']")
    public WebElementFacade selectCountryOfResidenceSimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 1')]/parent::div/following-sibling::div[1]//label[@for='city']/following-sibling::div//input")
    public WebElementFacade enterCitySimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade enterPinYin2Name;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterAlias2SimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade enterPinYin2AliasName;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='legalCertificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickIdType2DownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectIdType2Text;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='legalCertificationNo']/following-sibling::div//input")
    public WebElementFacade enterIdNo2SimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade selectNoExpiry2SimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterDate2SimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='legalCountry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickNationality2DownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='Andorra']")
    public WebElementFacade selectNationality2SimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterResidentialAddress2SimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickCountryOfResidence2SimpleKYC;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='Andorra']")
    public WebElementFacade selectCountryOfResidence2SimpleKYC;

    @FindBy(xpath = "//div[contains(text(),'Administrator 2')]/parent::div/following-sibling::div//label[@for='city']/following-sibling::div//input")
    public WebElementFacade enterCity2SimpleKYC;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElementFacade getClickSaveBtn;

    @FindBy(xpath = "//div[@class='lowcode-table default-theme']//table[@class='fixed-right-table']/tbody/tr[1]//i[@class='lls-tooltip lls-icon-s-check']")
    public WebElementFacade clickSubmitSimpleKYC;

    @FindBy(xpath = "//div[@class='lls-message-box']//span[contains(text(),'Confirm')]")
    public WebElementFacade clickComfirmBtnSimpleKYC;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//tbody/tr/td[3]")
    public List<WebElementFacade> ReviewCustomer;

    @FindBy(xpath = "//label[@for=\"relatedParty\"]/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade clickRelatedPartySelectYes;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//tbody/tr/td[8]")
    public List<WebElementFacade> clickAssignBtn;

    @FindBy(xpath = "//span[contains(text(),'Assigned to Me')]")
    public WebElementFacade assignedToMeClick;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//tbody//td[3]")
    public List<WebElementFacade> getCompanyNameList;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//tbody//td[10]//span[contains(text(),'Proceed')]")
    public List<WebElementFacade> clickProceedBtn;

    @FindBy(xpath = "//label[@for='auditState']/following-sibling::div//i")
    public WebElementFacade clickResultDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectResult;

    @FindBy(xpath = "//label[@for='comment']/following-sibling::div//textarea")
    public WebElementFacade enterComment;

    @FindBy(xpath = "//div[@class='btn']//span[contains(text(),'Submit')]")
    public WebElementFacade clickSubmitBtn;

    @FindBy(xpath = "//label[text()='Company Name']/following-sibling::div//input")
    public WebElementFacade sendKeysCompanyNameOnOnboardingList;

    @FindBy(xpath = "//label[text()='Status']")
    public WebElementFacade clickStatusOnOnboardingList;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//tbody/tr/td[9]/span")
    public WebElementFacade checkRegistrationtatus;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//tbody/tr/td[7]")
    public WebElementFacade checkEmail;

    @FindBy(xpath = "//tbody[@id='convertd']/tr/td[1]")
    public WebElementFacade checkFirstEmail;

    @FindBy(xpath = "//tbody[@id='convertd']/tr[1]/td[1]")
    public WebElementFacade firstEmailText;

    @FindBy(xpath = "//strong[text()='返回']")
    public WebElementFacade clickBackBtn;

    @FindBy(xpath = "//div[@class='container content']/h2")
    public WebElementFacade getEmailOtp;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role=\"tab\"]/parent::div//div[@class='form_container'][1]//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterPrimaryAdministrators1Date;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role=\"tab\"]/parent::div//div[@class='form_container'][1]//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterPrimaryAdministrators1Alias;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role=\"tab\"]/parent::div//div[@class='form_container'][1]//label[@for='legalCertificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickPrimaryAdministrators1IdTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectPrimaryAdministrators1IdType;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role=\"tab\"]/parent::div//div[@class='form_container'][1]//label[@for='legalCountry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickPrimaryAdministrators1NationalityDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectPrimaryAdministrators1Nationality;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role=\"tab\"]/parent::div//div[@class='form_container'][1]//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickPrimaryAdministrators1CountryOfResidenceDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='AD-Andorra']")
    public WebElementFacade selectPrimaryAdministrators1CountryOfResidence;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role=\"tab\"]/parent::div//div[@class='form_container'][1]//label[@for='legalCertificationNo']/following-sibling::div//input")
    public WebElementFacade enterPrimaryAdministrators1IdNo;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role=\"tab\"]/parent::div//div[@class='form_container'][1]//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade clickPrimaryAdministrators1NoExpiry;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role=\"tab\"]/parent::div//div[@class='form_container'][1]//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterPrimaryAdministrators1ResidentialAddress;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterPrimaryAdministrators2Date;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterPrimaryAdministrators2Alias;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='legalCertificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickPrimaryAdministrators2IdTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectPrimaryAdministrators2IdType;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='legalCountry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickPrimaryAdministrators2NationalityDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectPrimaryAdministrators2Nationality;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickPrimaryAdministrators2CountryOfResidenceDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='AD-Andorra']")
    public WebElementFacade selectPrimaryAdministrators2CountryOfResidence;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='legalCertificationNo']/following-sibling::div//input")
    public WebElementFacade enterPrimaryAdministrators2IdNo;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='timePermanent']/following-sibling::div//label[2]//span[@class='lls-radio__inner']")
    public WebElementFacade clickPrimaryAdministrators2NoExpiry;

    @FindBy(xpath = "//div[contains(text(),'Primary Administrators')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterPrimaryAdministrators2ResidentialAddress;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterDirector1Alias;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickDirector1IdTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectDirector1IdTypeText;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade inputDirector1IdNo;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade selectDirector1IdExpiryDate;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterDirector1Date;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickDirector1NationalityDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='AD-Andorra']")
    public WebElementFacade selectDirector1NationalityText;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickDirector1CountryOfResidence;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='email']/following-sibling::div//input")
    public WebElementFacade enterDirector1Email;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade enterDirector1Phone;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterDorector1ResidentialAddress;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterDirector2Alias;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickDirector2IdTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectDirector2IdTypeText;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade inputDirector2IdNo;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='timePermanent']/following-sibling::div//label[2]//span[@class='lls-radio__inner']")
    public WebElementFacade selectDirector2IdExpiryDate;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterDirector2Date;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickDirector2NationalityDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='AD-Andorra']")
    public WebElementFacade selectDirector2NationalityText;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickDirector2CountryOfResidence;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='email']/following-sibling::div//input")
    public WebElementFacade enterDirector2Email;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade enterDirector2Phone;

    @FindBy(xpath = "//div[contains(text(),'Director (s) / Legal Representative')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterDorector2ResidentialAddress;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterShareholder1Alias;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickShareholder1IdTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectShareholder1IdTypeText;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade inputShareholder1IdNo;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade selectShareholder1IdExpiryDate;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterShareholder1Date;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickShareholder1NationalityDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='AD-Andorra']")
    public WebElementFacade selectShareholder1NationalityText;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickShareholder1CountryOfResidence;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='email']/following-sibling::div//input")
    public WebElementFacade enterShareholder1Email;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade enterShareholder1Phone;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterShareholderResidentialAddress;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade enterShareholder1Shareholding;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterShareholder2Alias;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickShareholder2IdTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectShareholder2IdTypeText;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade inputShareholder2IdNo;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='timePermanent']/following-sibling::div//label[2]//span[@class='lls-radio__inner']")
    public WebElementFacade selectShareholder2IdExpiryDate;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterShareholder2Date;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickShareholder2NationalityDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='AD-Andorra']")
    public List<WebElementFacade> selectShareholder2NationalityText;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickShareholder2CountryOfResidence;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='email']/following-sibling::div//input")
    public WebElementFacade enterShareholder2Email;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade enterShareholder2Phone;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterShareholder2ResidentialAddress;

    @FindBy(xpath = "//div[contains(text(),'Shareholder')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][2]//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade enterShareholder2Shareholding;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterBeneficialAlias;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade enterBeneficialUltimate;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickBeneficialIdTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span")
    public List<WebElementFacade> selectBeneficialIdTypeText;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade enterBeneficialIdNo;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade selectBeneficialNoExpiry;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='email']/following-sibling::div//input")
    public WebElementFacade enterBeneficialEmail;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade enterBeneficialDateOfBirth;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade enterBeneficialPhone;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickBeneficialCountryOfResidence;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//span[text()='AD-Andorra']")
    public List<WebElementFacade> selectBeneficialCountryOfResidence;

    @FindBy(xpath = "//div[contains(text(),'Beneficial')]/ancestor::div[@role='tab']/parent::div//div[@class='form_container'][1]//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterBeneficialResidentialAddress;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElementFacade clickSaveBtn;

    @FindBy(xpath = "//div[@class='lls-message-box__wrapper']//span[contains(text(), 'Confirm')]")
    public WebElementFacade confirmBtn;

    @FindBy(xpath = "//tbody[@id=\"convertd\"]//td[1]")
    public WebElementFacade firstEmail;

    @FindBy(xpath = "//a[text()=' SCF portal ']")
    public WebElementFacade scfLink;

    @FindBy(xpath = "//div[@class='login-info']/p[1]/span")
    public WebElementFacade userName;

    @FindBy(xpath = "//div[@class='login-info']/p[2]/span")
    public WebElementFacade passWord;

    @FindBy(xpath = "//span[text()='Green Link Digital Bank - Verify Identity']")
    public WebElementFacade secondEmail;

    @FindBy(xpath = "//p[text()='Log In']")
    public WebElementFacade loginPageTitle;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-refresh']")
    public WebElementFacade clickRefreshBtn;

    @FindBy(xpath = "//button[text()='手动刷新']")
    public WebElementFacade clickRefreshByHands;

    @FindBy(id = "customShortid")
    public WebElementFacade clickEditEmailName;

    @FindBy(id = "shortid")
    public WebElementFacade sendKeysEmailName;

    @FindBy(xpath = "//tbody[@id='maillist']/tr[1]/td[1]")
    public WebElementFacade clickFirstEmailName;

    @FindBy(xpath = "//div[@id='message-content']/p")
    public WebElementFacade emailPageContent;

    @FindBy(xpath = "//span[@class='el-input__suffix']/span/i")
    public WebElementFacade selectEmailDropDown;

    @FindBy(xpath = "//span[text()='@c0c.fun']")
    public WebElementFacade selectC0c;

    @FindBy(xpath = "//div[@id='body-html']//p[text()='     Password: ']/span[1]")
    public WebElementFacade emailPassword;

    @FindBy(xpath = "//div[@class='container content']//h2")
    public WebElementFacade emailVerificationCode;

    @FindBy(xpath = "//div[@class='tab-pane message-body active']//a[text()=' SCF portal ']")
    public WebElementFacade greenLinkSystem;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@placeholder='Enter email']")
    public WebElementFacade GLDBEmailInput;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@type='password']")
    public WebElementFacade GLDBEmailPassword;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/button")
    public WebElementFacade sendCodeBtn;

    @FindBy(xpath = "//button[@aria-label=\"close drawer\"]/i")
    public WebElementFacade clickCloseEmailBtn;

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

    @FindBy(xpath = "//span[contains(text(),'Confirm')]")
    public WebElementFacade newPasswordPageConfirmBtn;

    @FindBy(xpath = "//span[text()='Service Agreement']")
    public WebElementFacade serviceAgreementTitle;

    @FindBy(xpath = "//span[@class='dialog-footer']/label[@class='lls-checkbox']/span[1]")
    public WebElementFacade clickCheckBox;

    @FindBy(xpath = "//span[text()=' Agree ']")
    public WebElementFacade clickAgreeBtn;

    @FindBy(xpath = "//span[text()='I will input manually']")
    public WebElementFacade inputManually;

    @FindBy(xpath = "//div[@class='dialog-footer-top']//span[@class='lls-checkbox__input']")
    public WebElementFacade selectFirstCheckBox;

    @FindBy(xpath = "//div[@class='dialog-footer-btm']//label[1]/span[@class='lls-checkbox__input']")
    public WebElementFacade selectSecondCheckBox1;

    @FindBy(xpath = "//div[@class='dialog-footer-btm']//label[2]/span[@class='lls-checkbox__input']")
    public WebElementFacade selectThirdCheckBox;

    @FindBy(xpath = "//div[@class='dialog-footer-btm']//label[3]/span[@class='lls-checkbox__input']")
    public WebElementFacade selectFourCheckBox;

    @FindBy(xpath = "//div[text()=' Tell Us About Your Company ']")
    public WebElementFacade checkjumpPageTellUs;

    @FindBy(xpath = "//label[text()='Date of Incorporation']/following-sibling::div//input")
    public WebElementFacade dateInputBox;

    @FindBy(xpath = "//label[@for=\"annualReturnSize\"]/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade annualReturnSizeClick;

    @FindBy(xpath = "//span[text()='Micro SME（≤1,000,000）']")
    public WebElementFacade annualReturnSizeSelect;

    @FindBy(xpath = "//label[@for='isListed']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade checkBoxPublicCompanyYes;

    @FindBy(xpath = "//label[@for='isListed']/following-sibling::div/label[2]//span[@class='lls-radio__inner']")
    public WebElementFacade checkBoxPublicCompanyNo;

    @FindBy(xpath = "//label[@for='websiteUrl']/following-sibling::div//input)")
    public WebElementFacade webSiteUrl;

    @FindBy(xpath = "//label[@for='custEmail']/following-sibling::div//input")
    public WebElementFacade companyEmail;

    @FindBy(xpath = "//label[text()='Company Tel.']/following-sibling::div/div[1]//input")
    public WebElementFacade companyPhoneNumber;

    @FindBy(xpath = "//label[text()='Company Tel.']/following-sibling::div/div[2]//input")
    public WebElementFacade companyPhoneNumberTwo;

    @FindBy(xpath = "//label[text()='Certificate of Incorporation']/following-sibling::div//span")
    public WebElementFacade fileUpdate;

    @FindBy(xpath = "//label[text()='Memorandum and Articles of Association']")
    public WebElementFacade memorandumTitle;

    @FindBy(xpath = "//span[text()='No Expiry']")
    public WebElementFacade noExpiryDateTitle;

    @FindBy(xpath = "//label[@for='timePermanent']/following-sibling::div//label[2]//span[@class=\"lls-radio__inner\"]")
    public WebElementFacade selectDate;

    @FindBy(xpath = "//span[text()='No Expiry']/parent::label/following-sibling::label//input[@class='lls-input__inner']")
    public WebElementFacade noExpiryDateInput;

    @FindBy(xpath = "//label[text()='Memorandum and Articles of Association']/following-sibling::div//span")
    public WebElementFacade memorandumAndArticlesOfAssLink;

    @FindBy(xpath = "//label[@for='countryOfTaxation']/following-sibling::div//input")
    public WebElementFacade countryOfTaxation;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]/div/div[1]//span")
    public List<WebElementFacade> selectCountryOfTaxation;

    @FindBy(xpath = "//label[@for='registeredAddress']")
    public WebElementFacade registeredAddressTitle;

    @FindBy(xpath = "//label[@for='registeredAddress']/following-sibling::div//textarea")
    public WebElementFacade registeredAddress;

    @FindBy(xpath = "//label[@for='businessCountry']/following-sibling::div//input")
    public WebElementFacade businessCountry;

    @FindBy(xpath = "//body/div[6]//ul[@class='lls-scrollbar__view lls-select-dropdown__list']//span[text()='CN - China']")
    public WebElementFacade selectBusinessCountry;

    @FindBy(xpath = "//label[@for='businessAddress']/following-sibling::div//textarea")
    public WebElementFacade businessAddress;

    @FindBy(xpath = "//label[@for='industry']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade industry;

    @FindBy(xpath = "//span[text()='Wholesale & Retail Trade']")
    public WebElementFacade selectIndustry;

    @FindBy(xpath = "//label[@for='legalStructure']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade legalStructure;

    @FindBy(xpath = "//span[text()='Private Limited Co']")
    public WebElementFacade selectLegalStructure;

    @FindBy(xpath = "//label[@for='isNonProfit']/following-sibling::div/div[1]/label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade isNonProfitYes;

    @FindBy(xpath = "//label[@for='isNonProfit']/following-sibling::div/label[2]//span[@class='lls-radio__inner']")
    public WebElementFacade isNonProfitNo;

    @FindBy(xpath = "//label[@for='sector']/following-sibling::div//input")
    public WebElementFacade sectorInputBox;

    @FindBy(xpath = "//div[@class='content-submit']/button[3]")
    public WebElementFacade nextBtnIndustry;

    @FindBy(xpath = "//div[@class='content-submit']/button[2]")
    public WebElementFacade SaveBtnIndustry;

    @FindBy(xpath = "//div[text()='Set up Primary Administrators']")
    public WebElementFacade jumpSetUpPrimaryAdminTitle;

    @FindBy(xpath = "//label[@for='sector']")
    public WebElementFacade sectorTitle;

    @FindBy(xpath = "//label[@for='name']/following-sibling::div//input")
    public WebElementFacade enterFullName;

    @FindBy(xpath = "//div[text()='Applicant']/parent::div/following-sibling::div[1]//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[1]//input")
    public WebElementFacade applicantPhoneNumFirst;

    @FindBy(xpath = "//div[text()='Applicant']/parent::div/following-sibling::div[1]//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[2]//input")
    public WebElementFacade applicantPhoneNumSecond;

    @FindBy(xpath = "//div[text()='Applicant']/parent::div/following-sibling::div[1]//label[@for='email']/following-sibling::div//input")
    public WebElementFacade applicantEmial;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade enterPinYin;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterAlias;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade enterPinYinAlias;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='city']/following-sibling::div//input")
    public WebElementFacade enterCity;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='postalCode']/following-sibling::div//input")
    public WebElementFacade enterPostalCode;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='ThisAdministratorIsAlsoA']/following-sibling::div//label[1]//span[@class='lls-checkbox__inner']")
    public WebElementFacade selectDirector;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='legalCertificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade idTypeDropbox;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span[text()='Passport']")
    public WebElementFacade selectIdType;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='legalCertificationNo']/following-sibling::div//input")
    public WebElementFacade enterIdNo;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade dateOfBirth;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade adminIDExpiryDate;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='legalCountry']/following-sibling::div//input")
    public WebElementFacade enterNationality;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//input")
    public WebElementFacade countryOfResidence;

    @FindBy(xpath = "//div[text()='Administrator 1']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterResidentialAddress;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade enterPinYin2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade enterAlias2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade enterPinYinAlias2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='city']/following-sibling::div//input")
    public WebElementFacade enterCity2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='postalCode']/following-sibling::div//input")
    public WebElementFacade enterPostalCode2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='ThisAdministratorIsAlsoA']/following-sibling::div//label[1]//span[@class='lls-checkbox__inner']")
    public WebElementFacade selectDirector2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='legalCertificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade idTypeDropbox2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade adminIDExpiryDate2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='legalCertificationNo']/following-sibling::div//input")
    public WebElementFacade enterIdNo2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade dateOfBirth2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='legalCountry']/following-sibling::div//input")
    public WebElementFacade enterNationality2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//input")
    public WebElementFacade countryOfResidence2;

    @FindBy(xpath = "//div[text()='Administrator 2']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade enterResidentialAddress2;

    @FindBy(xpath = "//div[@class='title']")
    public WebElementFacade directorOfTheInformation;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='executiveName']/following-sibling::div//input")
    public WebElementFacade director1FullName;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade director1EnterPinYin;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade director1Alias;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade director1PinyinAliasName;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade director1IdType;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\"]//span[text()='Passport']")
    public WebElementFacade director1SelectIdType;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade director1IdNumber;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade director1IdExpiryDate;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade director1DateOfBirth;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//input")
    public WebElementFacade director1NationalityDrop;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='city']/following-sibling::div//input")
    public WebElementFacade director1City;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='postalCode']/following-sibling::div//input")
    public WebElementFacade director1PostalCode;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade director1ResidentialAddress;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//input")
    public WebElementFacade director1CountryOfResidence;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[1]//input")
    public WebElementFacade director1FirstPhoneNum;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[2]//input")
    public WebElementFacade director1SecondPhoneNum;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade director1EmailAddress;

    @FindBy(xpath = "//div[text()='Director 1']/parent::div/parent::div/following-sibling::div//label[@for='ThisDirectorIsAlsoAShareholder']/following-sibling::div//span[@class='lls-checkbox__inner']")
    public WebElementFacade director1SelectCheckBox;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='executiveName']/following-sibling::div//input")
    public WebElementFacade director2FullName;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade director2EnterPinYin;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade director2Alias;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade director2PinyinAliasName;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade director2IdType;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\"]//span[text()='Passport']")
    public WebElementFacade director2SelectIdType;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade director2IdNumber;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade director2IdExpiryDate;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade director2DateOfBirth;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//input")
    public WebElementFacade director2NationalityDrop;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='city']/following-sibling::div//input")
    public WebElementFacade director2City;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='postalCode']/following-sibling::div//input")
    public WebElementFacade director2PostalCode;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade director2ResidentialAddress;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//input")
    public WebElementFacade director2CountryOfResidence;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[1]//input")
    public WebElementFacade director2FirstPhoneNum;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[2]//input")
    public WebElementFacade director2SecondPhoneNum;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade director2EmailAddress;

    @FindBy(xpath = "//div[text()='Director 2']/parent::div/parent::div/following-sibling::div//label[@for='ThisDirectorIsAlsoAShareholder']/following-sibling::div//span[@class='lls-checkbox__inner']")
    public WebElementFacade director2SelectCheckBox;

    @FindBy(xpath = "//div[@class='title']")
    public WebElementFacade shareholderOfTheInformation;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='name']/following-sibling::div//input")
    public WebElementFacade shareholder1Name;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade shareholder1IdTypeSelect;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\"]//span[text()='Passport']")
    public WebElementFacade shareholder1Passport;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade shareholder1IdNo;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade shareholder1NoExpiry;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade shareholder1DateOfBirth;


    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade shareholder1PinyinName;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade shareholder1Alias;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade shareholder1PinyinAliasName;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='city']/following-sibling::div//input")
    public WebElementFacade shareholder1CEnterCity;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='postalCode']/following-sibling::div//input")
    public WebElementFacade shareholder1EnterPostalCode;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='shareType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade shareholder1ShareTypeDrowBox;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span[text()='Company Limited by Guarantee Capital']")
    public WebElementFacade shareholder1SelectShareType;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[text()='Allocation']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade shareholder1AllocationDropDown;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//input")
    public WebElementFacade shareholder1Nationality;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span[text()='Singapore']")
    public WebElementFacade selectCountry;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade shareholder1ResidentialAddress;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//input")
    public WebElementFacade shareholder1CountryOfResidence;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[1]//input")
    public WebElementFacade shareholder1FirstPhoneNum;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[2]//input")
    public WebElementFacade shareholder1SecondPhoneNum;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade shareholder1EnterEmail;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span")
    public List<WebElementFacade> shareholder1AllocationCurrency;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[text()='Allocation']/following-sibling::div/div[2]//input")
    public WebElementFacade shareholder1AllocationSecondEnter;

    @FindBy(xpath = "//div[text()='Shareholder 1']/parent::div/parent::div/following-sibling::div//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade shareholder1Shareholding;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='name']/following-sibling::div//input")
    public WebElementFacade shareholder2FullName;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade shareholder2IdTypeDropDown;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span[text()='Passport']")
    public WebElementFacade shareholder2SelectPassport;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade shareholder2IdNo;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade shareholder2IDExpiryDate;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade shareholder2DateOfBirth;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//input")
    public WebElementFacade shareholder2Nationality;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade shareholder2ResidentialAddress;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//input")
    public WebElementFacade shareholder2CountryOfResidence;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[1]//input")
    public WebElementFacade shareholder2FirstPhoneNum;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[2]//input")
    public WebElementFacade shareholder2SecondPhoneNum;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade shareholder2EnterEmail;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade shareholder2PinyinName;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade shareholder2Alias;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade shareholder2PinyinAliasName;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='city']/following-sibling::div//input")
    public WebElementFacade shareholder2CEnterCity;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='postalCode']/following-sibling::div//input")
    public WebElementFacade shareholder2EnterPostalCode;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='shareType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade shareholder2ShareTypeDrowBox;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span[text()='Company Limited by Guarantee Capital']")
    public WebElementFacade shareholder2SelectShareType;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[text()='Allocation']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade shareholder2AllocationDropDown;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span")
    public List<WebElementFacade> shareholder2AllocationCurrency;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[text()='Allocation']/following-sibling::div/div[2]//input")
    public WebElementFacade shareholder2AllocationSecondEnter;

    @FindBy(xpath = "//div[text()='Shareholder 2']/parent::div/parent::div/following-sibling::div//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade shareholder2Shareholding;

    @FindBy(xpath = "//div[@class='onBoardContent-wrapper']/div[1]")
    public WebElementFacade beneficialTitle;

    @FindBy(xpath = "//label[@for='name']/following-sibling::div//input")
    public WebElementFacade beneficialFullName;

    @FindBy(xpath = "//label[@for='pinyinName']/following-sibling::div//input")
    public WebElementFacade beneficialPinYinName;

    @FindBy(xpath = "//label[@for='alias']/following-sibling::div//input")
    public WebElementFacade beneficialAlias;

    @FindBy(xpath = "//label[@for='pinyinAliasName']/following-sibling::div//input")
    public WebElementFacade beneficialPinYinAliasName;

    @FindBy(xpath = "//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade beneficialCertificationType;

    @FindBy(xpath = "//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade beneficialCertificationNo;

    @FindBy(xpath = "//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade beneficialTimePermanent;

    @FindBy(xpath = "//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade beneficialDateBirth;

    @FindBy(xpath = "//label[@for='shareType']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade beneficialShareType;

    @FindBy(xpath = "//div[text()='Beneficial Owner 1']/parent::div/parent::div/following-sibling::div//label[text()='Allocation']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade beneficialAllocation;

    @FindBy(xpath = "//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade beneficialFundScale;

    @FindBy(xpath = "//label[@for='country']/following-sibling::div//input")
    public WebElementFacade beneficialCountry;

    @FindBy(xpath = "//label[@for='city']/following-sibling::div//input")
    public WebElementFacade beneficialCity;

    @FindBy(xpath = "//label[@for='countryOfResidence']/following-sibling::div//input")
    public WebElementFacade beneficialCountryOfResidence;

    @FindBy(xpath = "//label[@for='postalCode']/following-sibling::div//input")
    public WebElementFacade beneficialPostalCode;

    @FindBy(xpath = "//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade beneficialResidentialAddress;

    @FindBy(xpath = "//div[text()='Beneficial Owner 1']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[1]//input")
    public WebElementFacade beneficialFirstPhoneNum;

    @FindBy(xpath = "//div[text()='Beneficial Owner 1']/parent::div/parent::div/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[2]//input")
    public WebElementFacade beneficialSecondPhoneNum;

    @FindBy(xpath = "//label[@for='email']/following-sibling::div//input")
    public WebElementFacade beneficialEmail;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//span[@class='lls-switch__core is-small']")
    public WebElementFacade beneficialCheckBox;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='firstName']/following-sibling::div//input")
    public WebElementFacade beneficial1FirstName;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='lastName']/following-sibling::div//input")
    public WebElementFacade beneficial1LastName;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='certificationType']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade beneficial1CertificationType;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//li[1]/span")
    public WebElementFacade beneficial1CertificationTypeSelectPersonalId;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='certificationNo']/following-sibling::div//input")
    public WebElementFacade beneficial1CertificationNo;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='timePermanent']/following-sibling::div//label[1]//span[@class='lls-radio__input']")
    public WebElementFacade beneficial1TimePermanent;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div/div/span[1]")
    public WebElementFacade performOwner;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='fundScale']/following-sibling::div//input")
    public WebElementFacade beneficial1FundScale;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade beneficial1Email;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='dateOfBirth']/following-sibling::div//input")
    public WebElementFacade beneficial1DateOfBirth;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='country']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade beneficial1Country;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='CN - China']")
    public WebElementFacade beneficial1CountrySelectChina;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='phone']/following-sibling::div//input")
    public WebElementFacade beneficial1Phone;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='countryOfResidence']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade beneficial1CountryOfResidence;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='CN - China']")
    public WebElementFacade beneficial1CountryOfResidenceSelectChina;

    @FindBy(xpath = "//div[text()=' Beneficial Owner 1 ']/parent::div/following-sibling::div//label[@for='residentialAddress']/following-sibling::div//textarea")
    public WebElementFacade beneficial1ResidentialAddress;

    @FindBy(xpath = "//div[text()=' Tell Us About Your Bank Account(s) ']")
    public WebElementFacade tellUsAboutAccoutPageTitle;

    @FindBy(xpath = "//div[text()='Account 1']/parent::div/parent::div/following-sibling::div//label[@for='currency']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade account1Currency;

    @FindBy(xpath = "//div[text()='Account 2']/parent::div/parent::div/following-sibling::div//label[@for='currency']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade account2Currency;

    @FindBy(xpath = "//div[text()='Account 1']/parent::div/parent::div/following-sibling::div//label[@for='accountName']")
    public WebElementFacade clickFirstAccountName;

    @FindBy(xpath = "//div[text()='Account 2']/parent::div/parent::div/following-sibling::div//label[@for='accountName']")
    public WebElementFacade clickSecondAccountName;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span")
    public List<WebElementFacade> selectCurrency;

    @FindBy(xpath = "//span[text()='Current Account']/parent::div/following-sibling::div[2]//label[@for='currency']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade accountCurrency;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='CNY']")
    public WebElementFacade accountCurrencyCNY;

    @FindBy(xpath = "//span[text()='SCF Collection Account']/parent::div/following-sibling::div[2]//label[@for='currency']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade collectionAccountCurrency;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='CNY']")
    public WebElementFacade collectionAccountCurrencyCNY;

    @FindBy(xpath = "//div[text()=' Questionnaire ']")
    public WebElementFacade questionnaireTitle;

    @FindBy(xpath = "//label[@for='question1']/following-sibling::div//label[1]/span[@class='lls-checkbox__input']")
    public WebElementFacade clickFirstCheckBox;

    @FindBy(xpath = "//label[@for='question1']/following-sibling::div//label[2]/span[@class='lls-checkbox__input']")
    public WebElementFacade clickSecondCheckBox;

    @FindBy(xpath = "//label[@for='question1']/following-sibling::div//label[3]/span[@class='lls-checkbox__input']")
    public WebElementFacade clickThirdCheckBox;

    @FindBy(xpath = "//label[@for='question2']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickSecondQuestionDownDrop;

    @FindBy(xpath = "//label[@for='question3']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade clickThirdQuestionDownDrop;

    @FindBy(xpath = "//label[@for='question4']/following-sibling::div//label[1]/span[@class='lls-radio__input']")
    public WebElementFacade clickFourQuestionCheckBox;

    @FindBy(xpath = "//label[@for='question5']/following-sibling::div//label[1]/span[@class='lls-radio__input']")
    public WebElementFacade clickFiveQuestionCheckBox;

    @FindBy(xpath = "//span[text()='Browse']/parent::div/parent::div/following-sibling::input")
    public WebElementFacade inputFile;

    @FindBy(xpath = "//label[@for='FUNDING_ACCOUNT_WAY']/following-sibling::div//label[1]")
    public WebElementFacade questionFirstCheckBox;

    @FindBy(xpath = "//label[@for='FUNDING_ACCOUNT_WAY']/following-sibling::div//label[2]")
    public WebElementFacade questionSecondCheckBox;

    @FindBy(xpath = "//label[@for='PAYMENTS_RECEIVABLES']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade selectCheckBox;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]/div[@class='lls-scrollbar']/div[1]//li")
    public List<WebElementFacade> selectData;

    @FindBy(xpath = "//div[@class=\"customer_info\"]/div/div[3]//span[@class='lls-input__suffix-inner']")
    public WebElementFacade selectSecondCheckBox;

    @FindBy(xpath = "//label[@for='COUNTRIES']/following-sibling::div/label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade clickFirstYes;

    @FindBy(xpath = "//label[@for='RELATED_PARTY']/following-sibling::div/label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade clickSecondYes;

    @FindBy(xpath = "//label[@for='IS_CONTROLLERED']/following-sibling::div/label[1]//span[@class='lls-radio__inner']")
    public WebElementFacade clickThirdYes;

    @FindBy(xpath = "//span[contains(text(),'Previous')]")
    public WebElementFacade clickPreviousBtn;

    @FindBy(xpath = "//span[contains(text(),' Next')]")
    public WebElementFacade clickNextBtn;

    @FindBy(xpath = "//label[@for='FUNDING_ACCOUNT_WAY']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade firstQuestion;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='Proceeds from sales of goods and services']")
    public WebElementFacade firstQuestionAnswer;

    @FindBy(xpath = "//label[@for='PAYMENTS_RECEIVABLES']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade secondQuestion;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='SGD 0 - 10,000']")
    public WebElementFacade secondQuestionAnswer;

    @FindBy(xpath = "//label[@for='ESTIMATED_NUMBER']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade thirdQuestion;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='1 to 20']")
    public WebElementFacade thirdQuestionAnswer;

    @FindBy(xpath = "//label[@for='COUNTRIES']/following-sibling::div//label[1]/span[@class='lls-radio__input']")
    public WebElementFacade fourQuestionCheckBox;

    @FindBy(xpath = "//label[@for='RELATED_PARTY']/following-sibling::div//label[1]/span[@class='lls-radio__input']")
    public WebElementFacade fiveQuestionCheckBox;

    @FindBy(xpath = "//label[@for='IS_CONTROLLERED']/following-sibling::div//label[1]/span[@class='lls-radio__input']")
    public WebElementFacade sixQuestionCheckBox;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    public WebElementFacade clickSubmitBtnOnGLDB;

    @FindBy(xpath = "//div[text()=' Confirm Your Information ']")
    public WebElementFacade confirmPageTitle;

    @FindBy(xpath = "//div[@class='lls-message-box']//span[contains(text(), 'Confirm')]")
    public WebElementFacade clickConfirmBtnOnGLDB;

    @FindBy(id = "form-username")
    public WebElementFacade userNameInputbox;

    @FindBy(id = "form-password")
    public WebElementFacade passwordInputbox;

    @FindBy(xpath = "//tr[@align='center']//button[@type='submit' ]")
    public WebElementFacade clickLogonBtn;

    @FindBy(xpath = "//p[text()='SCF']")
    public WebElementFacade clickSCFlink;

    @FindBy(xpath = "//span[text()='Onboarding Review']")
    public WebElementFacade onboardingReview;

    @FindBy(xpath = "//span[text()='Review Customer Profile']")
    public WebElementFacade onboardingReviewTitle;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//tbody//td[@data-key='f2a6amdf']")
    public List<WebElementFacade> assignToMeBtn;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//tbody/tr[1]/td[@data-key='f2a6amdf']//button")
    public WebElementFacade assignToMeButton;

    @FindBy(xpath = "//input[@placeholder='Search company']")
    public WebElementFacade searchCompanyInput;

    @FindBy(xpath = "//input[@placeholder='Search company']/following-sibling::span")
    public WebElementFacade searchCheckBox;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//tbody//td[@data-key='f24mh683']")
    public List<WebElementFacade> companyNameList;

    @FindBy(xpath = "//div[@id='tab-1']//span")
    public WebElementFacade clickAssignToMeTitle;

    @FindBy(xpath = "//span[@data-key='f0r1iqk6']/button")
    public List<WebElementFacade> proceedBtn;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//tbody/tr[1]/td[@data-key='f2avdhbq']//div[@class='lls-design-table-btn-wrapper']/span[1]/button")
    public WebElementFacade proceedButtton;

    @FindBy(xpath = "//td[@data-key='f2ln8n3n']")
    public List<WebElementFacade> comPanyNameListOnAssginToMePage;

    @FindBy(xpath = "//label[@for='auditState']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade resultCheckBox;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='Approve']")
    public WebElementFacade selectApprove;

    @FindBy(xpath = "//label[@for='comment']/following-sibling::div//textarea")
    public WebElementFacade inputBoxComment;

    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    public WebElementFacade submitBtnOnAssignToMePage;

    @FindBy(xpath = "//label[@for='relatedParty']/following-sibling::div//label[1]/span[1]")
    public WebElementFacade relatedPartyCheckBox;

    @FindBy(xpath = "//p[text()='Confirmation Information']")
    public WebElementFacade clickConfirmationInformation;

    @FindBy(xpath = "//span[contains(text(),'Back')]")
    public WebElementFacade clickBackButton;

    @FindBy(xpath = "//p[text()='Customer Profile']")
    public WebElementFacade clickCustomerProfilePendingActions;

    @FindBy(xpath = "//p[text()='Open Account Application']")
    public WebElementFacade clickOpenAccountApplicationActions;

    @FindBy(xpath = "//p[text()='Board Resolution']")
    public WebElementFacade clickBoardResolutionActions;

    @FindBy(xpath = "//span[text()='I will input manually']")
    public WebElementFacade clickIwillInputManuallyBtn;

    @FindBy(xpath = "//div[text()='Administrator 1']/following-sibling::div//label[@for='legalName']/following-sibling::div//input")
    public WebElementFacade enterUpgradeKYCAdmin1FullName;

    @FindBy(xpath = "//div[text()='Administrator 1']/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade enterUpgradeKYCAdmin1Email;

    @FindBy(xpath = "//div[text()='Administrator 1']/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[1]//input")
    public WebElementFacade enterUpgradeKYCAdmin1AreaCode;

    @FindBy(xpath = "//div[text()='Administrator 1']/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[2]//input")
    public WebElementFacade enterUpgradeKYCAdmin1MobileNum;

    @FindBy(xpath = "//div[text()='Administrator 2']/following-sibling::div//label[@for='legalName']/following-sibling::div//input")
    public WebElementFacade enterUpgradeKYCAdmin2FullName;

    @FindBy(xpath = "//div[text()='Administrator 2']/following-sibling::div//label[@for='email']/following-sibling::div//input")
    public WebElementFacade enterUpgradeKYCAdmin2Email;

    @FindBy(xpath = "//div[text()='Administrator 2']/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[1]//input")
    public WebElementFacade enterUpgradeKYCAdmin2AreaCode;

    @FindBy(xpath = "//div[text()='Administrator 2']/following-sibling::div//label[text()='Mobile (SMS-enabled)']/following-sibling::div/div[2]//input")
    public WebElementFacade enterUpgradeKYCAdmin2MobileNum;




    public void enterUserName(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(userNameInputbox)
                .waitUntilVisible()
                .sendKeys(userName);
    }


    public void enterPassWord(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(passwordInputbox)
                .waitUntilVisible()
                .sendKeys(userName);
    }
}

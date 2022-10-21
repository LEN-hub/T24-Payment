package com.glbank.com.sg.bdd.pages.enterpriseNetSilver.openAccount;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import javax.security.auth.x500.X500Principal;
import java.util.List;

public class openAccount_page extends PageObject {

    @FindBy(xpath = "//div[@class=\"header-top-right\"]//span[2]")
    public WebElementFacade clickOpenAccount;

    @FindBy(xpath = "//div[@class='login_tips']/following-sibling::div[1]/div")
    public WebElementFacade clickNewUser;

    @FindBy(xpath = "//div[contains(text(),'Start a new application')]")
    public WebElementFacade clickStartANewApplication;

    @FindBy(xpath = "//div[contains(text(),'information myself')]")
    public WebElementFacade clickInformationMyself;

    @FindBy(xpath = "//div[@class='link-btn']")
    public WebElementFacade secondTitle;

    @FindBy(xpath = "//div[@class='link-btn mb']")
    public WebElementFacade firstTitle;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[@class=\"el-col el-col-24\"]//div[1]//div[@class=\"el-form-item__content\"]//label[3]//span[@class=\"el-radio__inner\"]")
    public WebElementFacade clickBusinessEntityType;

    @FindBy(xpath = "//span[text()='Current Account']")
    public WebElementFacade currentAccount;

    @FindBy(xpath = "//div[@role='radiogroup']/label[1]")
    public WebElementFacade SGDCurrent;

    @FindBy(xpath = "//label[@class='el-checkbox']/span[1]")
    public WebElementFacade AccountName;

    @FindBy(xpath = "//input[@maxlength='35']")
    public WebElementFacade InputAccountNameNew;

    @FindBy(xpath = "//input[@readonly='readonly']")
    public List<WebElementFacade> accountTypeList;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li[4]")
    public WebElementFacade oneMillion;

    @FindBy(xpath = "//span[text()='Mr']")
    public WebElementFacade mrBtn;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"el-form-item__content\"]//label[2]//span[@class=\"el-radio__inner\"]")
    public WebElementFacade clickNeedThisAccount;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[5]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextOnGettingStartedPage;

    @FindBy(xpath = "//input[@class=\"el-input__inner\"]")
    public WebElementFacade inputAccountName;

    @FindBy(xpath = "//label[@for=\"purposeOfAccount\"]/following-sibling::div//div//label[3]")
    public WebElementFacade clickCreateType;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[6]//div[@class=\"btn_box\"]")
    public WebElementFacade clickWhatNeed;

    @FindBy(xpath = "//div[@class='ui-button primary common out-height']//div[@class='btn_box']")
    public WebElementFacade clickLetGo;

    @FindBy(xpath = "//input[@readonly=\"readonly\"]")
    public WebElementFacade clickSalutation;

    @FindBy(xpath = "//label[@for='salutation']//following-sibling::div//input")
    public WebElementFacade clickSalutationTest;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//li[1]//span")
    public WebElementFacade getSalutation;

    @FindBy(xpath = "//label[@for=\"operatePersonNm\"]/following-sibling::div//div//input")
    public WebElementFacade inputFullName;

    @FindBy(xpath = "//div[@class=\"iddbox\"]//input")
    public WebElementFacade clickCountryCode;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for='salutation']//following-sibling::div//input")
    public WebElementFacade selectSalutation;//第二个人信息。

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span[text()='Mr']")
    public WebElementFacade mr;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for='userNm']//following-sibling::div//input")
    public WebElementFacade fullName;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"birthDate\"]/following-sibling::div//div//input")
    public WebElementFacade dataForBirth;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"nationality\"]/following-sibling::div//div//input")
    public WebElementFacade nationalityTwo;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[1]//label[@for=\"nationality\"]/following-sibling::div//div//input")
    public WebElementFacade nationalityOne;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span")
    public List<WebElementFacade> selectCountry;

    @FindBy(xpath = "//label[@for='nationality']/following-sibling::div//span[@class='el-input__suffix']")
    public WebElementFacade clickSelectCountryIcon;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"countryCd\"]/following-sibling::div//div//input")
    public WebElementFacade countryTwo;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span[text()='SINGAPORE']")
    public WebElementFacade SingaporeCountry;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"idd\"]/following-sibling::div//div//input")
    public WebElementFacade iddNumber;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"mobilePhoneNo\"]/following-sibling::div//div//input")
    public WebElementFacade mobileNumberTest;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span[text()='SINGAPOREAN']")
    public WebElementFacade SINGAPOREAN;

    @FindBy(xpath = "//ul[@class='flag_box-ul']/li/div/span[text()=\"CHINA\"]")
    public WebElementFacade getCountryCode;

    @FindBy(xpath = "//label[@for=\"operatePersonMobilePhoneNo\"]/following-sibling::div//div//input")
    public WebElementFacade inputMobileNumber;

    @FindBy(xpath = "//input[@maxlength='21']")
    public WebElementFacade inputContactNumber;

    @FindBy(xpath = "//div[text()='Verify Email']")
    public WebElementFacade verifyEmailNew;

    @FindBy(xpath = "//label[@for=\"operatePersonEmail\"]/following-sibling::div//div//input")
    public WebElementFacade inputEmailAddress;

    @FindBy(xpath = "//div[@class=\"ui-button primary common out-height\"]//div[@class='btn_box']")
    public WebElementFacade clickVerifyEmailAddress;

    @FindBy(xpath = "//div[@class='codebox']/span[1]")
    public WebElementFacade sendKeysBox; //填验证码的框框

    @FindBy(xpath = "//div[@class='codebox']/span[2]")
    public WebElementFacade secondKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[3]")
    public WebElementFacade thirdKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[4]")
    public WebElementFacade fourKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[5]")
    public WebElementFacade fiveKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[6]")
    public WebElementFacade sixKeysBox;

    @FindBy(xpath = "//label[@for=\"certfctNo\"]")
    public WebElementFacade goEntityDetails;

    @FindBy(xpath = "//label[@for=\"certfctNo\"]/following-sibling::div//div//input")
    public WebElementFacade inputCompanyRegistrationNumber;

    @FindBy(xpath = "//label[@for=\"companyRegisterDate\"]/following-sibling::div//div//input")
    public WebElementFacade inputCompanyRegisterDate;

    @FindBy(xpath = "//label[@for=\"nationality\"]/following-sibling::div//div//input")
    public WebElementFacade clickCountryOfIncorporation;

    @FindBy(xpath = "//div[@class=\"el-picker-panel el-date-picker el-popper\"]/following-sibling::div//ul//span[text()=\"SINGAPORE\"]")
    public WebElementFacade getCountryOfIncorporation;

    @FindBy(xpath = "//div[@role='radiogroup']/label[@role='radio'][1]//span[@class='el-radio__inner']")
    public WebElementFacade selectSameAsCountry;

    @FindBy(xpath = "//div[@role='radiogroup']/label[@role='radio'][1]//span[@class='el-radio__inner']")
    public List<WebElementFacade> selectYesNew;

    @FindBy(xpath = "//label[@for='fundAcctType']/following-sibling::div/div/label[1]")
    public WebElementFacade BusinessOperations;

    @FindBy(xpath = "//label[@for='monthAmont']/following-sibling::div//input")
    public WebElementFacade monthAmontNew;

    @FindBy(xpath = "//label[@for='monthTrsCount']/following-sibling::div//input")
    public WebElementFacade monthTrsCount;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextOnProvideEssentialInformationPage;

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade nextButtonNew;

    @FindBy(xpath = "//div[text()='Confirm']")
    public WebElementFacade confirmNew;

    @FindBy(xpath = "//span[text()='Online account opening information supplement']")
    public WebElementFacade informationSupplement;

    @FindBy(xpath = "//div[text()='Query']")
    public WebElementFacade queryBtn;

    @FindBy(xpath = "//span[text()='Business entity type']/following-sibling::span//input")
    public WebElementFacade businessEntity;

    @FindBy(xpath = "//span[text()='Business turnover']/following-sibling::span//input")
    public WebElementFacade businessTurnover;

    @FindBy(xpath = "//span[text()='Country of operation']/following-sibling::span//input")
    public WebElementFacade countryOfOperation;

    @FindBy(xpath = "//span[text()='Turnover SGD 1 Million to ≤ SGD 20 Million']")
    public WebElementFacade thanOneMillion;

    @FindBy(xpath = "//span[text()='Public Limited Co (not listed in Singapore)']")
    public WebElementFacade noListed;

    @FindBy(xpath = "//span[text()='Is non-profit organization']/following-sibling::span//div[@role='radiogroup']//label[1]/span[1]")
    public WebElementFacade yesBtn;

    @FindBy(xpath = "//div[@class='detail-title'][6]/following-sibling::div[1]//div[@class='el-table__fixed-body-wrapper']//tr[1]/td[8]//span[text()='Delete']")
    public WebElementFacade deletePerson;

    @FindBy(xpath = "//div[text()='Related enterprise information ']/following-sibling::div//div[@class='el-table__fixed-body-wrapper']//span[text()='Delete']")
    public WebElementFacade deleteCompany;

    @FindBy(xpath = "//span[text()='New related person']")
    public WebElementFacade relatedPerson;

    @FindBy(xpath = "//span[text()='Name']/following-sibling::span//input")
    public WebElementFacade relatedName;

    @FindBy(xpath = "//span[text()='Alias']/following-sibling::span//input")
    public WebElementFacade relatedAlias;

    @FindBy(xpath = "//span[text()='Nationality']/following-sibling::span//input")
    public WebElementFacade relatedNationality;

    @FindBy(xpath = "//span[text()='Date of Birth']/following-sibling::span//input")
    public WebElementFacade dateOfBirth;

    @FindBy(xpath = "//span[text()='Document type']/following-sibling::span//input")
    public WebElementFacade documentType;

    @FindBy(xpath = "//span[text()='I.d.']/following-sibling::span//input")
    public WebElementFacade nric;

    @FindBy(xpath = "//span[text()=' Country of residence ']/following-sibling::span//input")
    public WebElementFacade countryOfResidence;

    @FindBy(xpath = "//span[text()=' Address ']/following-sibling::span//input")
    public WebElementFacade adressNew;

    @FindBy(xpath = "//span[text()='City']/following-sibling::span//input")
    public WebElementFacade cityNew;

    @FindBy(xpath = "//span[text()='Email']/following-sibling::span//input")
    public WebElementFacade emailNew;

    @FindBy(xpath = "//div[text()='Determine']")
    public WebElementFacade determine;

    @FindBy(xpath = "//div[text()='Related person information ']/following-sibling::div[1]/div[3]//td[2]//label/span")
    public WebElementFacade directorNew;

    @FindBy(xpath = "//div[text()='Related person information ']/following-sibling::div[1]/div[3]//td[3]//label/span")
    public WebElementFacade shareholderNew;

    @FindBy(xpath = "//div[text()='Related person information ']/following-sibling::div[1]/div[3]//td[5]//input")
    public WebElementFacade percentageNew;

    @FindBy(xpath = "//div[text()='Submit']")
    public WebElementFacade submitNew;

    @FindBy(xpath = "//form[@class='navbar-form navbar-right']//input[@class='form-control']")
    public WebElementFacade inputEmail;

    @FindBy(xpath = "//button[text()='View']")
    public WebElementFacade viewBtn;

    @FindBy(xpath = "//div[@class='input-group-btn']//button[2]")
    public WebElementFacade refreshBtn;

    @FindBy(xpath = "//div[@id='message-list']/button[1]")
    public WebElementFacade firstEmail;

    @FindBy(xpath = "//label[@for='isConcact']/following-sibling::div//input")
    public WebElementFacade chooseAdmin;

    @FindBy(xpath = "//li[@class='el-select-dropdown__item hover']")
    public WebElementFacade selectAdmin;

    @FindBy(xpath = "//div[text()='Verify Email Address']")
    public WebElementFacade verifyEmailAddNew;

    @FindBy(xpath = "//div[text()='Verify Mobile Number']")
    public WebElementFacade verifyMobileNumberNew;

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade nextAdminNew;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul")
    public WebElementFacade selectNationality;

    @FindBy(xpath = "//label[text()='Postal Code']")
    public WebElementFacade goEntityType;

    @FindBy(xpath = "//label[@for=\"entityType\"]/following-sibling::div//div//input")
    public WebElementFacade clickEntityType;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"Public Limited Co (not listed in Singapore)\"]")
    public WebElementFacade getEntityType;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]/div[1]/div[1]//span")
    public List<WebElementFacade> getEntityType2;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"公众有限公司(未在新加坡上市)\"]")
    public WebElementFacade getEntityTypeCN;

    @FindBy(xpath = "//label[@for=\"customerTypeIdCd\"]/following-sibling::div//div//input")
    public WebElementFacade clickEntityConsolidatedAnnualSalesTurnover;

    @FindBy(xpath = "//div[9]//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//li[3]//span")
    public WebElementFacade getEntityConsolidatedAnnualSalesTurnover;

    @FindBy(xpath = "//label[@for=\"industry\"]/following-sibling::div//div//input")
    public WebElementFacade clickIndustry;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"Manufacturing\"]")
    public WebElementFacade getIndustry;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"制造业\"]")
    public WebElementFacade getIndustryCN;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"Financial & Insurance Activities\"]")
    public WebElementFacade getIndustryToSub;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"金融和保险行业\"]")
    public WebElementFacade getGetIndustryToSubCN;

    @FindBy(xpath = "//label[@for=\"industry\"]/following-sibling::div//div//input")
    public WebElementFacade clickMainIndustry;

    @FindBy(xpath = "//label[@for=\"subIndustry\"]//following-sibling::div//div//div")
    public WebElementFacade clickSubIndustry;

    @FindBy(xpath = "//label[@for=\"nonprofitFlag\"]/following-sibling::div//label[2]//span[1]//span")
    public WebElementFacade clickNonprofitFlag;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNext2OnProvideEssentialInformationPage;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToStep3;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[@class=\"ui-button primary common out-height\"]/div")
    public WebElementFacade clickLetContinue;

    @FindBy(xpath = "//label[@for='acraModelConsFlag']/following-sibling::div//span[text()='Yes']")
    public WebElementFacade clickModelConstitution;

    @FindBy(xpath = "//label[@for=\"contactPersonNm\"]/following-sibling::div//div//input")
    public WebElementFacade inputContactPersonNm;

    @FindBy(xpath = "//label[@for=\"aliasNm\"]/following-sibling::div//div//input")
    public WebElementFacade inputAliasNm;

    @FindBy(xpath = "//label[@for='roleCd']")
    public WebElementFacade checkBoxText;

    @FindBy(xpath = "//div[@aria-label=\"checkbox-group\"]/label[1]/span[@class='el-checkbox__input is-checked']")
    public WebElementFacade selectFirstIsCheckBox;

    @FindBy(xpath = "//div[@aria-label=\"checkbox-group\"]/div[1]//span[@class='el-checkbox__input is-checked']")
    public WebElementFacade selectSecondIsCheckBox;

    @FindBy(xpath = "//div[@aria-label=\"checkbox-group\"]/div[2]//span[@class='el-checkbox__input is-checked']")
    public WebElementFacade selectThirdIsCheckBox;

    @FindBy(xpath = "//div[@aria-label=\"checkbox-group\"]/label[1]/span[@class='el-checkbox__input']")
    public WebElementFacade selectFirstCheckBox;

    @FindBy(xpath = "//div[@aria-label=\"checkbox-group\"]/div[1]/label/span[@class='el-checkbox__input']")
    public WebElementFacade selectSecondCheckBox;

    @FindBy(xpath = "//div[@aria-label=\"checkbox-group\"]/div[2]/label/span[@class='el-checkbox__input']")
    public WebElementFacade selectThirdCheckBox;

    @FindBy(xpath = "//label[@for='contactPersonNm']/following-sibling::div//input[@disabled=\"disabled\"]")
    public WebElementFacade nameDisable;

    @FindBy(xpath = "//label[@for='contactPersonNm']/following-sibling::div//input")
    public WebElementFacade enterName;

    @FindBy(xpath = "//label[@for='ownPercent']/following-sibling::div//input")
    public WebElementFacade shareholdingPercentage;

    @FindBy(xpath = "//label[@for=\"birthDate\"]/following-sibling::div//div//input")
    public WebElementFacade inputBirthDate;

    @FindBy(xpath = "//label[@for=\"roleCd\"]")
    public WebElementFacade clickRoleCd;

    @FindBy(xpath = "//label[@for=\"certfctTypeCd\"]")
    public WebElementFacade goIdentificationType;

    @FindBy(xpath = "//label[@for=\"certfctTypeCd\"]/following-sibling::div//label[2]//span//span")
    public WebElementFacade clickIdentificationType;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"certfctTypeCd\"]/following-sibling::div//label[2]//span//span")
    public WebElementFacade clickIdentificationTypeTwo;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"addr\"]/following-sibling::div//input")
    public WebElementFacade addressTwo;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"certfctDueDate\"]/following-sibling::div//input")
    public WebElementFacade dataOfExpiry;

    @FindBy(xpath = "//label[@for=\"certfctNo\"]/following-sibling::div//div//input")
    public WebElementFacade inputPassportNumber;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"certfctNo\"]/following-sibling::div//div//input")
    public WebElementFacade passportNumberTwo;

    @FindBy(xpath = "//label[@for=\"certfctDueDate\"]/following-sibling::div//div//input")
    public WebElementFacade inputDateOfExpiry;

    @FindBy(xpath = "//label[@for='addr']//following-sibling::div//input")
    public WebElementFacade ResidentialAddress;

    @FindBy(xpath = "//label[@for='cityNm']//following-sibling::div//input")
    public WebElementFacade cityTest;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"cityNm\"]/following-sibling::div//input")
    public WebElementFacade cityTestTwo;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"emailAddr\"]/following-sibling::div//input")
    public WebElementFacade emailAddressTwo;

    @FindBy(xpath = "//span[text()='SINGAPORE']")
    public WebElementFacade SINGAPORETest;

    @FindBy(xpath = "//label[text()='Postal Code']//following-sibling::div//input")
    public WebElementFacade postalCodeTest;

    @FindBy(xpath = "//input[@readonly='readonly']")
    public List<WebElementFacade> selectCompany;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start' ]//span")
    public WebElementFacade takaoka;

    @FindBy(xpath = "//label[@for='countryCd']//following-sibling::div//input")
    public WebElementFacade countryTest;

    @FindBy(xpath = "//img[@class='ic_delete']")
    public WebElementFacade deleteImg;

    @FindBy(xpath = "//div[@class='el-message-box']/div[3]/button[2]/span")
    public WebElementFacade YesDelete;

    @FindBy(xpath = "//b[contains(text(),'multiple connected corporate entities')]")
    public WebElementFacade deleteAfterTitle;

    @FindBy(xpath = "//label[@for=\"certfctDueDate\"]")
    public WebElementFacade clickDateOfExpiry;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//input")
    public WebElementFacade clickIddInput;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//span[text()=\"CHINA\"]")
    public WebElementFacade getIdd;

    @FindBy(xpath = "//label[@for=\"mobilePhoneNo\"]/following-sibling::div//input")
    public WebElementFacade inputDirectorMobilePhoneNo;

    @FindBy(xpath = "//label[@for=\"emailAddr\"]/following-sibling::div//input")
    public WebElementFacade inputDirectorEmailAddress;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextOnEnterConnectedPeoplesDetails;

    @FindBy(xpath = "//label[@for='experience']/following-sibling::div//input")
    public WebElementFacade enterIndustryExperience;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for='contactPersonNm']")
    public WebElementFacade goContactPersonNm;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"contactPersonNm\"]/following-sibling::div//input")
    public WebElementFacade inputUBOName;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"aliasNm\"]/following-sibling::div//input")
    public WebElementFacade inputUBOAliasName;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"birthDate\"]/following-sibling::div//input")
    public WebElementFacade inputUBOBirthDate;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"certfctTypeCd\"]/following-sibling::div//label[2]//span//span")
    public WebElementFacade clickUBOIdentificationType;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"certfctNo\"]/following-sibling::div//input")
    public WebElementFacade inputUBOPassportNo;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"certfctDueDate\"]/following-sibling::div//input")
    public WebElementFacade inputUBOPassportDueDate;

    @FindBy(xpath = "//label[@for=\"addr\"]/following-sibling::div//input")
    public WebElementFacade inputUBOResidentialAddress;

    @FindBy(xpath = "//div[contains(text(), 'Connected Person 2')]/following-sibling::div")
    public WebElementFacade selectCheckBox2;

    @FindBy(xpath = "//div[contains(text(), 'Connected Person 3')]/following-sibling::div")
    public WebElementFacade selectCheckBox3;

    @FindBy(xpath = "//label[@for=\"cityNm\"]/following-sibling::div//input")
    public WebElementFacade inputUBOCityName;

    @FindBy(xpath = "//label[@for=\"zipCd\"]/following-sibling::div//input")
    public WebElementFacade inputUBOPostalCode;

    @FindBy(xpath = "//label[@for=\"countryCd\"]/following-sibling::div//input")
    public WebElementFacade clickUBOCountryCode;

    @FindBy(xpath = "//span[text()=\"SINGAPORE\"]")
    public WebElementFacade getUBOCountry;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for='idd']/following-sibling::div//input")
    public WebElementFacade clickUBOIdd;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//span[text()=\"CHINA\"]")
    public WebElementFacade getUBOIdd;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"mobilePhoneNo\"]/following-sibling::div//input")
    public WebElementFacade inputUBOMobilePhoneNo;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"emailAddr\"]/following-sibling::div//input")
    public WebElementFacade inputUBOEmailAddress;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextForUBO;

    @FindBy(xpath = "//div[contains(text(),'Connected Person 2')]")
    public WebElementFacade connectedPerson2;

    @FindBy(xpath = "//img[@class='ic_delete']")
    public WebElementFacade deleteBtn;

    @FindBy(xpath = "//span[contains(text(),'Yes')]")
    public WebElementFacade clickYesBtn;

    @FindBy(xpath = "//label[@class='el-checkbox']/span[@class='el-checkbox__input']")
    public WebElementFacade clickCheckBox;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for='contactPersonNm']")
    public WebElementFacade goUBO2Name;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"addr\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2ResidentialAddress;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"addr\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2ResidentialAddress3;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"cityNm\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2CityName;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"cityNm\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2CityName3;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"zipCd\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2PostalCode;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"zipCd\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2PostalCode3;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[2]//label[@for=\"countryCd\"]/following-sibling::div//input")
    public WebElementFacade clickUBO2Country;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"countryCd\"]/following-sibling::div//input")
    public WebElementFacade clickUBO2Country3;

    @FindBy(xpath = "//div[@x-placement=\"top-start\" or @x-placement=\"bottom-start\"]//span[text()=\"SINGAPORE\"]")
    public WebElementFacade getUBO2Country;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"contactPersonNm\"]/following-sibling::div//input")
    public WebElementFacade inputOnlyUBOName;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"aliasNm\"]/following-sibling::div//input")
    public WebElementFacade inputOnlyUBOAliasName;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"birthDate\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2BirthDate;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"certfctTypeCd\"]/following-sibling::div//label[2]//span//span")
    public WebElementFacade clickUBO2IdentificationType;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"certfctNo\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2PassportNo;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"certfctDueDate\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2PassportDueDate;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"idd\"]/following-sibling::div//input")
    public WebElementFacade clickUBO2Idd;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//span[text()=\"CHINA\"]")
    public WebElementFacade getUBO2Idd;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"mobilePhoneNo\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2MobilePhoneNo;

    @FindBy(xpath = "//div[@class='el-collapse out_collapse']/div[3]//label[@for=\"emailAddr\"]/following-sibling::div//input")
    public WebElementFacade inputUBO2EmailAddress;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextForUBO2;

    @FindBy(xpath = "//div[@class=\"el-form-item__content\"]//div[@role=\"group\"]//div[1]//span//span")
    public WebElementFacade clickDirector1;

    @FindBy(xpath = "//div[@class=\"mandatory\"]")
    public WebElementFacade getPageLanguage;

    @FindBy(xpath = "//div[@class=\"out_title_level-1\"]")
    public WebElementFacade goDueDiligence;

    @FindBy(xpath = "//label[text()=\"居住地址\"]/following-sibling::div//input")
    public WebElementFacade inputDirector1ResidentialAddressCN;

    @FindBy(xpath = "//label[text()=\"Residential Address\"]/following-sibling::div//input")
    public WebElementFacade inputDirector1ResidentialAddress;

    @FindBy(xpath = "//label[text()=\"居住城市\"]/following-sibling::div//input")
    public WebElementFacade inputDirector1CityCN;

    @FindBy(xpath = "//label[text()=\"City\"]/following-sibling::div//input")
    public WebElementFacade inputDirector1City;

    @FindBy(xpath = "//label[text()=\"Postal Code\"]/following-sibling::div//input")
    public WebElementFacade inputDirector1PostalCode;

    @FindBy(xpath = "//label[text()=\"邮政编码\"]/following-sibling::div//input")
    public WebElementFacade inputDirector1PostalCodeCN;

    @FindBy(xpath = "//label[text()=\"Country\"]/following-sibling::div//input")
    public WebElementFacade clickDirector1Country;

    @FindBy(xpath = "//label[text()=\"居住国家\"]/following-sibling::div//input")
    public WebElementFacade clickDirector1CountryCN;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"SINGAPOREAN\"]")
    public WebElementFacade getDirector1Country;

    @FindBy(xpath = "//div[@class=\"el-form-item__content\"]//div[@role=\"group\"]//div[2]//span//span")
    public WebElementFacade clickDirector2;

    @FindBy(xpath = "//div[@role=\"group\"]//div[2]//form//label[text()=\"Residential Address\"]/following-sibling::div//input")
    public WebElementFacade inputDirector2ResidentialAddress;

    @FindBy(xpath = "//div[@role=\"group\"]//div[2]//form//label[text()=\"居住地址\"]/following-sibling::div//input")
    public WebElementFacade inputDirector2ResidentialAddressCN;

    @FindBy(xpath = "//div[@role=\"group\"]//div[2]//form//label[text()=\"City\"]/following-sibling::div//input")
    public WebElementFacade inputDirector2City;

    @FindBy(xpath = "//div[@role=\"group\"]//div[2]//form//label[text()=\"居住城市\"]/following-sibling::div//input")
    public WebElementFacade inputDirector2CityCN;

    @FindBy(xpath = "//div[@role=\"group\"]//div[2]//form//label[text()=\"Postal Code\"]/following-sibling::div//input")
    public WebElementFacade inputDirector2PostalCode;

    @FindBy(xpath = "//div[@role=\"group\"]//div[2]//form//label[text()=\"邮政编码\"]/following-sibling::div//input")
    public WebElementFacade inputDirector2PostalCodeCN;

    @FindBy(xpath = "//div[@role=\"group\"]//div[2]//form//label[text()=\"Country\"]/following-sibling::div//input")
    public WebElementFacade inputDirector2Country;

    @FindBy(xpath = "//div[@role=\"group\"]//div[2]//form//label[text()=\"居住国家\"]/following-sibling::div//input")
    public WebElementFacade inputDirector2CountryCN;

    @FindBy(xpath = "//div[6]//span[text()=\"SINGAPOREAN\"]")
    public WebElementFacade getDirector2Country;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToStep4;

    @FindBy(xpath = "//div[@class=\"el-col el-col-8\"]//input")
    public WebElementFacade inputPostalCodeConnectedCorporateEntity1;

    @FindBy(xpath = "//div[text()='Verify Mobile Number']")
    public WebElementFacade mobileNumber;

    @FindBy(xpath = "//div[text()='Verify Email Address']")
    public WebElementFacade emailNumber;


    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToConnectedCorporateEntity2;

    @FindBy(xpath = "//div[contains(text(), 'Connected Corporate Entity 2')]/following-sibling::div")
    public WebElementFacade clickConnectedCorporateEntity2;

    @FindBy(xpath = "//div[@class=\"el-col el-col-8\"]//input")
    public WebElementFacade inputPostalCodeConnectedCorporateEntity2;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToStep5;

    @FindBy(xpath = "//div[@class=\"el-collapse-item is-active\"]//div[@class=\"el-col el-col-8\"]//input")
    public WebElementFacade inputPostalCodeConnectedCorporateEntity;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[@class=\"mandatory\"]/following-sibling::form//label[1]//span[1]//span")
    public WebElementFacade clickOneAdministrators;

    @FindBy(xpath = "//div[@class=\"body\"]//span//div[1]//div[1]//div[@class=\"btn_box\"]")
    public WebElementFacade clickYESOneAdministrators;

    @FindBy(xpath = "//label[@for=\"isConcact\"]/following-sibling::div//label[1]//span//span")
    public WebElementFacade clickYESConnectedPerson1;

    @FindBy(xpath = "//label[@for=\"isConcact\"]/following-sibling::div//div[@class=\"el-form-item__content\"]//input")
    public WebElementFacade clickConnectedPersons1Name;

    @FindBy(xpath = "//label[@for=\"mobilePhoneNo\"]")
    public WebElementFacade goVerifyMobileNumber1;

    @FindBy(xpath = "//div[@class=\"el-col el-col-16\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickVerifyMobileNumber1;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[text()=\"Verify Email Address\"]")
    public WebElementFacade clickVerifyEmailAddress1;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[text()=\"验证邮箱\"]")
    public WebElementFacade clickVerifyEmailAddress1CN;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToAdministrator2;

    @FindBy(xpath = "//label[@for=\"isConcact\"]")
    public WebElementFacade goChoseYESConnectedPerson2;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"isConcact\"]")
    public WebElementFacade YesConnectedPerson2Test;

    @FindBy(xpath = "//label[@for=\"isConcact\"]/following-sibling::div//label[1]//span//span")
    public List<WebElementFacade> clickYESConnectedPerson2;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[2]//label[@for=\"isConcact\"]/following-sibling::div//label[2]//span//span")
    public WebElementFacade clickNOConnectedPerson2;

    @FindBy(xpath = "//label[@for=\"isConcact\"]/following-sibling::div//div[@class=\"el-form-item__content\"]//input")
    public List<WebElementFacade> clickConnectedPersons2Name;

    @FindBy(xpath = "//div[@class=\"el-col el-col-16\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickVerifyMobileNumber2;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[text()=\"Verify Email Address\"]")
    public WebElementFacade clickVerifyEmailAddress2;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[text()=\"验证邮箱\"]")
    public WebElementFacade clickVerifyEmailAddress2CN;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToStep6;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[1]//div[1]//div[1]//label[@class=\"el-form-item__label\"]")
    public WebElementFacade goIndicate;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[1]//div[1]//div[1]//label[@class=\"el-form-item__label\"]/following-sibling::div//label[6]")
    public WebElementFacade clickHowIndicate;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[3]//label[@class=\"el-form-item__label\"]")
    public WebElementFacade goReceiveMoney;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[3]//label[3]")
    public WebElementFacade clickReceiveMoney;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[5]//label[@class=\"el-form-item__label\"]")
    public WebElementFacade goTransactions;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[5]//label[2]")
    public WebElementFacade clickTransactions;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[7]//label[2]")
    public WebElementFacade clickBusinessActivities;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[8]//label[2]")
    public WebElementFacade clickPrincipal;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[9]//label[2]")
    public WebElementFacade clickControlledBy;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToStep12;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade goUploadFile;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[1]//div[2]//div[1]//div[1]//div[@class=\"box_left\"]")
    public WebElementFacade clickUpload1;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[1]//div[2]//div[1]//div[1]//input")
    public WebElementFacade upLoad1;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[2]//div[2]//div[1]//div[1]//div[@class=\"box_left\"]")
    public WebElementFacade clickUpload2;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[2]//div[2]//div[1]//div[1]//input")
    public WebElementFacade upLoad2;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[3]//div[2]//div[1]//div[1]//input")
    public WebElementFacade upLoad3;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[4]//div[2]//div[1]//div[1]//input")
    public WebElementFacade upLoad4;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[5]//div[2]//div[1]//div[1]//input")
    public WebElementFacade upLoad5;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[6]//div[2]//div[1]//div[1]//input")
    public WebElementFacade upLoad6;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[3]//div[2]//div[1]//div[1]//div[@class=\"box_left\"]")
    public WebElementFacade clickUpload3;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[4]//div[2]//div[1]//div[1]//div[@class=\"box_left\"]")
    public WebElementFacade clickUpload4;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[5]//div[2]//div[1]//div[1]//div[@class=\"box_left\"]")
    public WebElementFacade clickUpload5;

    @FindBy(xpath = "//div[@class=\"upload_container\"]//div[6]//div[2]//div[1]//div[1]//div[@class=\"box_left\"]")
    public WebElementFacade clickUpload6;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToStep13;

    @FindBy(xpath = "//div[@class=\"el-col el-col-22\"]//label[1]//span[@class=\"el-checkbox__inner\"]")
    public WebElementFacade clickAccepted;

    @FindBy(xpath = "//div[@class=\"el-col el-col-22\"]//label[2]//span[@class=\"el-checkbox__inner\"]")
    public WebElementFacade clickAcceptedApplication;

    @FindBy(xpath = "//div[@class=\"el-col el-col-22\"]//label[2]//span[@class=\"el-checkbox__inner\"]")
    public WebElementFacade clickAcceptedCNY;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickSubmitToStep14;

    @FindBy(xpath = "//form[@class='form-inline']//input")
    public WebElementFacade sendEmail;

    @FindBy(xpath = "//form[@class='form-inline']//button")
    public WebElementFacade createEmailButton;

    @FindBy(xpath = "//span[text()=\"Green Link Digital Bank Pte. Ltd message notification\"]")
    public List<WebElementFacade> emailList;

    @FindBy(xpath = "//div[@class=\"tab-content\"]//div[1]")
    public WebElementFacade getOrganisationID;

    @FindBy(xpath = "//div[@class=\"input-group-btn\"]//button[2]")
    public WebElementFacade clickRefresh;

    @FindBy(xpath = "//div[@class='ui-button primary common out-height']//div[@class='btn_box']")
    public WebElementFacade loanContinue;

    @FindBy(xpath = "//div[@class='flex middle']/label/span[1]")
    public WebElementFacade capitalLoan;

    @FindBy(xpath = "//div[@class='loan_container']/div[1]//div[@class='btn_box']")
    public WebElementFacade applyMicro;

    @FindBy(xpath = "//label[@for='loanAmont']/following-sibling::div//input")
    public WebElementFacade loanAmount;

    @FindBy(xpath = "//div[@role='radiogroup']")
    public WebElementFacade personal;

//    第十步财务申报，左边的信息。

    @FindBy(xpath = "//div[text()='At Least 18 Months']")
    public WebElementFacade leastMonths;

    @FindBy(xpath = "//div[contains(text(),\"Financial Report 1\")]/following-sibling::form//label[@for='financialReportTerm']")
    public WebElementFacade reportingPeriodTitle;

    @FindBy(xpath = "//div[@class='el-col el-col-10']//label[@for='financialReportDate']/following-sibling::div//input")
    public WebElementFacade reportingDateLeft;

    @FindBy(xpath = "//label[@for='isConnect']/following-sibling::div//span[contains(text(),'No')]")
    public WebElementFacade connectedPersonIsNo;

    @FindBy(xpath = "//div[contains(text(),'Next')]")
    public WebElementFacade clickNextButton;

    @FindBy(xpath = "//span[contains(text(),'Director')]")
    public WebElementFacade selectDirector;

    @FindBy(xpath = "//span[contains(text(),'Director')]")
    public WebElementFacade selectShareholder;

    @FindBy(xpath = "//label[@for=\"ownPercent\"]//following-sibling::div//input")
    public WebElementFacade inputShareholdingPercentage;

    @FindBy(xpath = "//label[@for=\"salutation\"]//following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade clickDownBox;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start' ]//li[1]")
    public WebElementFacade selectMr;

    @FindBy(xpath = "//label[@for=\"bondsmanName\"]//following-sibling::div//input")
    public WebElementFacade enterFullName;

    @FindBy(xpath = "//label[@for=\"certfctNo\"]/following-sibling::div//input")
    public WebElementFacade idNumber;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//input")
    public WebElementFacade countryCode;

    @FindBy(xpath = "//span[text()='SINGAPORE']")
    public WebElementFacade selectSingapore;

    @FindBy(xpath = "//label[@for='birthDay']/following-sibling::div//input")
    public WebElementFacade enterBirthDay;

    @FindBy(xpath = "//label[@for='roleCd']/following-sibling::div//span[contains(text(),'Shareholder')]")
    public WebElementFacade clickShareholder;

    @FindBy(xpath = "//td[@class='available today current']//span")
    public WebElementFacade todayLeft;

    @FindBy(xpath = "//div[@class='el-col el-col-10']//label[@for='financialReportTerm']/following-sibling::div//input")
    public WebElementFacade reportPeriodLeft;

    @FindBy(xpath = "//div[@x-placement=\"top-start\" or @x-placement=\"bottom-start\"]//span")
    public List<WebElementFacade> twelveMonths;

    @FindBy(xpath = "//div[@class='el-col el-col-10']//label[@for='netSales']/following-sibling::div//input")
    public WebElementFacade netSalesLeft;

    @FindBy(xpath = "//div[@class='el-col el-col-10']//label[@for='preTaxSales']/following-sibling::div//input")
    public WebElementFacade preTaxSalesLeft;

    @FindBy(xpath = "//div[@class='el-col el-col-10']//label[@for='totalAssets']/following-sibling::div//input")
    public WebElementFacade totalAssetsLeft;

    @FindBy(xpath = "//div[@class='el-col el-col-10']//label[@for='dibtAssets']/following-sibling::div//input")
    public WebElementFacade dibtAssetsLeft;

//       第十步财务申报，左边的信息。
    @FindBy(xpath = "//div[@class='el-col el-col-10 el-col-offset-4']//label[@for='financialReportDate']/following-sibling::div//input")
    public WebElementFacade reportingDateRight;

    @FindBy(xpath = "//div[@class='el-col el-col-10 el-col-offset-4']//label[@for='financialReportTerm']/following-sibling::div//input")
    public WebElementFacade reportPeriodRight;

    @FindBy(xpath = "//div[@class='el-col el-col-10 el-col-offset-4']//label[@for='netSales']/following-sibling::div//input")
    public WebElementFacade netSalesRight;

    @FindBy(xpath = "//div[@class='el-col el-col-10 el-col-offset-4']//label[@for='preTaxSales']/following-sibling::div//input")
    public WebElementFacade preTaxSalesRight;

    @FindBy(xpath = "//div[@class='el-col el-col-10 el-col-offset-4']//label[@for='totalAssets']/following-sibling::div//input")
    public WebElementFacade totalAssetsRight;

    @FindBy(xpath = "//div[@class='el-col el-col-10 el-col-offset-4']//label[@for='dibtAssets']/following-sibling::div//input")
    public WebElementFacade dibtAssetsRight;

    //openAccountTrack1
    @FindBy(xpath = "//span[text()='Open Account / Apply Loan']")
    public WebElementFacade clickOpenAccountBtn;

    @FindBy(xpath = "//div[contains(text(),'Start from Scratch')]")
    public WebElementFacade clickTrack1SatrtFromScratchBtn;

    @FindBy(xpath = "//div[contains(text(),'Singapore, All Individuals')]")
    public WebElementFacade clickSingaporeAllIndividuals;

    @FindBy(xpath = "//label[@for='accountTypeCd']/following-sibling::div//div[@class='el-radio-group']/label[1]//span[@class='el-radio__inner']")
    public WebElementFacade clickCurrentAccount;

    @FindBy(xpath = "//span[text()='SGD - Singapore dollars']")
    public WebElementFacade selectSGD;

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade clickTrack1NextBtn;

    @FindBy(xpath = "//div[text()='OK, Let’s Go']")
    public WebElementFacade getClickLetGo;

    @FindBy(id = "transCode")
    public WebElementFacade inputMockInformation;

    @FindBy(xpath = "//input[@value='获取交易信息']")
    public WebElementFacade inputMockGetInformation;

    @FindBy(name = "authUrlType")
    public WebElementFacade inputAuthUrlType;

    @FindBy(name = "mockData")
    public WebElementFacade inputMockData;

    @FindBy(xpath = "//input[@value='测试']")
    public WebElementFacade clickTestBtn;

    @FindBy(id = "TTT")
    public WebElementFacade getResponseStatus;

    @FindBy(xpath = "//label[@for='operatePersonSalutation']/following-sibling::div//span[@class=\"el-input__suffix\"]")
    public WebElementFacade clickSalutationDrop;

    @FindBy(xpath = "//div[@x-placement=\"top-start\" or @x-placement=\"bottom-start\"]//span[text()='Mr']")
    public WebElementFacade selectMrOnPage;

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade clickNextBtn;

    @FindBy(xpath = "//span[text()='Ensure that the mobile number is accurate']")
    public WebElementFacade getWindows;

    @FindBy(xpath = "//div[text()='Yes, This is Accurate']")
    public WebElementFacade clickSubmitBtn;
}

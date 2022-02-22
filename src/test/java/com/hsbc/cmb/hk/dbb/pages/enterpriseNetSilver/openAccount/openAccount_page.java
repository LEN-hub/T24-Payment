package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.openAccount;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class openAccount_page extends PageObject {

    @FindBy(xpath = "//div[@class=\"header-top-right\"]//span[2]")
    public WebElementFacade clickOpenAccount;

    @FindBy(xpath = "//div[@class=\"status-container\"]//div[1]//div[@class=\"ui-button-inner\"]")
    public WebElementFacade clickNewUser;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[@class=\"el-col el-col-24\"]//div[1]//div[@class=\"el-form-item__content\"]//label[3]//span[@class=\"el-radio__inner\"]")
    public WebElementFacade clickBusinessEntityType;

    @FindBy(xpath = "//form[@class=\"el-form out_form el-form--label-left\"]//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"el-form-item__content\"]//label[2]//span[@class=\"el-radio__inner\"]")
    public WebElementFacade clickNeedThisAccount;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextOnGettingStartedPage;

    @FindBy(xpath = "//input[@class=\"el-input__inner\"]")
    public WebElementFacade inputAccountName;

    @FindBy(xpath = "//label[@for=\"purposeOfAccount\"]/following-sibling::div//div//label[3]")
    public WebElementFacade clickCreateType;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickWhatNeed;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickLetGo;

    @FindBy(xpath = "//input[@readonly=\"readonly\"]")
    public WebElementFacade clickSalutation;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//li[1]//span")
    public WebElementFacade getSalutation;

    @FindBy(xpath = "//label[@for=\"operatePersonNm\"]/following-sibling::div//div//input")
    public WebElementFacade inputFullName;

    @FindBy(xpath = "//div[@class=\"iddbox\"]//input")
    public WebElementFacade clickCountryCode;

    @FindBy(xpath = "//ul[@class='flag_box-ul']/li/div/span[text()=\"CHINESE\"]")
    public WebElementFacade getCountryCode;

    @FindBy(xpath = "//label[@for=\"operatePersonMobilePhoneNo\"]/following-sibling::div//div//input")
    public WebElementFacade inputMobileNumber;

    @FindBy(xpath = "//label[@for=\"operatePersonEmail\"]/following-sibling::div//div//input")
    public WebElementFacade inputEmailAddress;

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

    @FindBy(xpath = "//div[@class=\"el-picker-panel el-date-picker el-popper\"]/following-sibling::div//ul//span[text()=\"SINGAPOREAN\"]")
    public WebElementFacade getCountryOfIncorporation;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextOnProvideEssentialInformationPage;

    @FindBy(xpath = "//label[@for=\"entityType\"]")
    public WebElementFacade goEntityType;

    @FindBy(xpath = "//label[@for=\"entityType\"]/following-sibling::div//div//input")
    public WebElementFacade clickEntityType;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"Public Limited Co (not listed in Singapore)\"]")
    public WebElementFacade getEntityType;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"公众有限公司(未在新加坡上市)\"]")
    public WebElementFacade getEntityTypeCN;

    @FindBy(xpath = "//label[@for=\"customerTypeIdCd\"]/following-sibling::div//div//input")
    public WebElementFacade clickEntityConsolidatedAnnualSalesTurnover;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"＞20,000,000 and ≤100,000,000\"]")
    public WebElementFacade getEntityConsolidatedAnnualSalesTurnover;

    @FindBy(xpath = "//label[@for=\"industry\"]/following-sibling::div//div//input")
    public WebElementFacade clickIndustry;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"Manufacturing\"]")
    public WebElementFacade getIndustry;

    @FindBy(xpath = "//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()=\"制造业\"]")
    public WebElementFacade getIndustryCN;

    @FindBy(xpath = "//label[@for=\"nonprofitFlag\"]/following-sibling::div//label[2]//span[1]//span")
    public WebElementFacade clickNonprofitFlag;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNext2OnProvideEssentialInformationPage;

    @FindBy(xpath = "//div[@class=\"el-col el-col-12\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextToStep3;

    @FindBy(xpath = "//label[@for=\"contactPersonNm\"]/following-sibling::div//div//input")
    public WebElementFacade inputContactPersonNm;

    @FindBy(xpath = "//label[@for=\"aliasNm\"]/following-sibling::div//div//input")
    public WebElementFacade inputAliasNm;

    @FindBy(xpath = "//label[@for=\"birthDate\"]/following-sibling::div//div//input")
    public WebElementFacade inputBirthDate;

    @FindBy(xpath = "//label[@for=\"roleCd\"]")
    public WebElementFacade clickRoleCd;

    @FindBy(xpath = "//label[@for=\"certfctTypeCd\"]")
    public WebElementFacade goIdentificationType;

    @FindBy(xpath = "//label[@for=\"certfctTypeCd\"]/following-sibling::div//label[2]//span//span")
    public WebElementFacade clickIdentificationType;

    @FindBy(xpath = "//label[@for=\"certfctNo\"]/following-sibling::div//div//input")
    public WebElementFacade inputPassportNumber;

    @FindBy(xpath = "//label[@for=\"certfctDueDate\"]/following-sibling::div//div//input")
    public WebElementFacade inputDateOfExpiry;

    @FindBy(xpath = "//label[@for=\"certfctDueDate\"]")
    public WebElementFacade clickDateOfExpiry;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//input")
    public WebElementFacade clickIddInput;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//span[text()=\"CHINESE\"]")
    public WebElementFacade getIdd;

    @FindBy(xpath = "//label[@for=\"mobilePhoneNo\"]/following-sibling::div//input")
    public WebElementFacade inputDirectorMobilePhoneNo;

    @FindBy(xpath = "//label[@for=\"emailAddr\"]/following-sibling::div//input")
    public WebElementFacade inputDirectorEmailAddress;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextOnEnterConnectedPeoplesDetails;

    @FindBy(xpath = "//label[@for=\"contactPersonNm\"]")
    public WebElementFacade goContactPersonNm;

    @FindBy(xpath = "//label[@for=\"contactPersonNm\"]/following-sibling::div//input")
    public WebElementFacade inputUBOName;

    @FindBy(xpath = "//label[@for=\"aliasNm\"]/following-sibling::div//input")
    public WebElementFacade inputUBOAliasName;

    @FindBy(xpath = "//label[@for=\"birthDate\"]/following-sibling::div//input")
    public WebElementFacade inputUBOBirthDate;

    @FindBy(xpath = "//label[@for=\"certfctTypeCd\"]/following-sibling::div//label[2]//span//span")
    public WebElementFacade clickUBOIdentificationType;

    @FindBy(xpath = "//label[@for=\"certfctNo\"]/following-sibling::div//input")
    public WebElementFacade inputUBOPassportNo;

    @FindBy(xpath = "//label[@for=\"certfctDueDate\"]/following-sibling::div//input")
    public WebElementFacade inputUBOPassportDueDate;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//input")
    public WebElementFacade clickUBOIdd;

    @FindBy(xpath = "//label[@for=\"idd\"]/following-sibling::div//span[text()=\"CHINESE\"]")
    public WebElementFacade getUBOIdd;

    @FindBy(xpath = "//label[@for=\"mobilePhoneNo\"]/following-sibling::div//input")
    public WebElementFacade inputUBOMobilePhoneNo;

    @FindBy(xpath = "//label[@for=\"emailAddr\"]/following-sibling::div//input")
    public WebElementFacade inputUBOEmailAddress;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[3]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNextForUBO;
}

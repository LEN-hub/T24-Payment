package com.glbank.com.sg.bdd.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class loanApplication_page extends PageObject {

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[4]//span")
    public WebElementFacade loan;

    @FindBy(xpath = "//div[@class='children-list']//div[@class='list']/div[2]//span[@class='sub-menu-title']")
    public WebElementFacade loanApplicationBtn;

    @FindBy(xpath = "//div[@class='children-list']//div[@class='list']/div[1]/p[2]//span[@class='sub-menu-title']")
    public WebElementFacade loanDisbursementBtn;//贷款支用。

    @FindBy(xpath = "//div[@class='children-list']//div[@class='list']/div[1]/p[4]//span[@class='sub-menu-title']")
    public WebElementFacade loanManagement;//贷款管理。

    @FindBy(xpath = "//span[text()='Turnover ≤ SGD 1 Million']")
    public WebElementFacade lessThanOneMillion;//选择小于一百万的综合销售额。

    @FindBy(xpath = "//span[text()='SGD 1 Million < Turnover ≤ SGD 20 Million']")
    public WebElementFacade oneToTwoMillion;//选择一百万到200W。

    @FindBy(xpath = "//label[@for='loanTypeCd']/following-sibling::div//label[1]")
    public WebElementFacade currentAssets;//流动资产贷款。

    @FindBy(xpath = "//span[text()='Working Capital Loan']/preceding-sibling::span/span")
    public WebElementFacade fixedAssets;//固定资产贷款。

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[3]//div[@class='btn_box']")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//div[@class='loan_container']/div[1]//div//div[@class='btn_box']")
    public WebElementFacade ApplyForMicroDemand;//申请微型活期透支。

    @FindBy(xpath = "//div[@class='loan_container']/div[3]//div[@class='btn_box']")
    public WebElementFacade demandOverdraft;//活期透支。

    @FindBy(xpath = "//div[@class='loan_container']/div[5]/div[11]")
    public WebElementFacade CollectionFinancing;//收账融资。

    @FindBy(xpath = "//div[@class='loan_container']/div[2]//div[11]")
    public WebElementFacade newCarFinancing;//新汽车融资。

    @FindBy(xpath = "//label[@for='loanAmont']/following-sibling::div//input")
    public WebElementFacade inputLoanAmount;

    @FindBy(xpath = "//div[@class='ui-button secondary common']/following-sibling::div/div")
    public WebElementFacade submitBtn;

    @FindBy(xpath = "//label[@for='loanTerm']/following-sibling::div/div/label[1]/span[1]")
    public WebElementFacade thirtyDays;//选择贷款时长30天。

    @FindBy(xpath = "//label[@for='loanTerm']/following-sibling::div/div/label[1]/span[1]")
    public WebElementFacade oneYears;//选择贷款时长1年。

    @FindBy(xpath = "//div[@class='el-radio-group']/label[1]/span[1]")
    public WebElementFacade personalGuarantor;//个人担保人。

    @FindBy(xpath = "//label[@for='bondsmanType']/following-sibling::div//label/span[1]")
    public WebElementFacade corporateGuarantor;//企业担保人。

    @FindBy(xpath = "//label[@for='roleCd']/following-sibling::div//label[1]/span[1]")
    public WebElementFacade personalGuarantorRole;

    @FindBy(xpath = "//label[@for='salutation']/following-sibling::div//input/following-sibling::span")
    public WebElementFacade salutation;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul/li/span")
    public List<WebElementFacade> selectSalutation;

    @FindBy(xpath = "//label[@for='guaranteeType']/following-sibling::div//label[3]/span[1]")
    public WebElementFacade property;//财产。

    @FindBy(xpath = "//label[@for='isConnect']/following-sibling::div/label[1]/span[1]")
    public WebElementFacade relatedParty;//关联方。

    @FindBy(xpath = "//label[@for='connectGarantor']/following-sibling::div//input")
    public WebElementFacade affiliateName;//关联人姓名选择框。

    @FindBy(xpath = "//body[@class='theme-ui']/div[@class='el-select-dropdown el-popper']//li")
    public List<WebElementFacade> nameList;

    @FindBy(xpath = "//label[@for='birthDay']/following-sibling::div//input")
    public WebElementFacade birthDay;//生日

    @FindBy(xpath = "//label[@for='companyRegisterDate']/following-sibling::div//input")
    public WebElementFacade companyRegisterDate;//企业注册日期。

    @FindBy(xpath = "//label[@for='birthDay']/following-sibling::div//input")
    public WebElementFacade dateOfBirth;

    @FindBy(xpath = "//label[@for='nationality']")
    public WebElementFacade getNotionalityText;

    @FindBy(xpath = "//label[@for='mobilePhoneNo']/following-sibling::div//input")
    public WebElementFacade mobileNum;

    @FindBy(xpath = "//label[@for='nationality']/following-sibling::div//input")
    public WebElementFacade notionalityText;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul/li//span[text()='CHINESE']")
    public WebElementFacade selectChinese;

    @FindBy(xpath = "//label[@for='certfctNo']/following-sibling::div//input")
    public WebElementFacade certfctNo;

    @FindBy(xpath = "//label[@for='idd']/following-sibling::div//input")
    public WebElementFacade idd;

    @FindBy(xpath = "//div[@class='flag_box']/ul/li")
    public WebElementFacade selectChina;

    @FindBy(xpath = "//label[@for='experience']/following-sibling::div//input")
    public WebElementFacade inputExperience;

    @FindBy(xpath = "//label[@for='emailAddr']/following-sibling::div//input")
    public WebElementFacade inputEmail;

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade nextBtnTwo;

    @FindBy(xpath = "//label[@for='experience']/following-sibling::div//input")
    public WebElementFacade industryExperience;//行业经验。

    @FindBy(xpath = "//div[@class='el-checkbox-group']/label[1]/span[1]")
    public WebElementFacade director;//从担保人角色中选择董事

    @FindBy(xpath = "//label[@for='salutation']/following-sibling::div//input")
    public WebElementFacade sex;

    @FindBy(xpath = "//div[@x-placement='top-start']/div[1]//li[1]")
    public WebElementFacade mr;

    @FindBy(xpath = "//label[@for='bondsmanName']/following-sibling::div//input")
    public WebElementFacade name;

    @FindBy(xpath = "//label[@for='bondsmanName']/following-sibling::div//input")
    public WebElementFacade registeredName;//企业名字

    @FindBy(xpath = "//label[@for='nationality']/following-sibling::div//input")
    public WebElementFacade countryBox;//选择国籍。

    @FindBy(xpath = "//label[@for='entRegisterCountry']/following-sibling::div//input")
    public WebElementFacade entRegisterCountry;//选择注册国家。

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li//span[text()='CHINA']")
    public WebElementFacade RegisteredInChina;//注册国家是中国。

    @FindBy(xpath = "//label[@for='entRegisterAddr']/following-sibling::div//input")
    public WebElementFacade entRegisterAddr;//注册地址。

    @FindBy(xpath = "//label[@for='city']/following-sibling::div//input")
    public WebElementFacade city;//城市。

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li[1]/span")
    public WebElementFacade privateLimitedCompany;//私人有限公司。

    @FindBy(xpath = "//label[@for='enterpriseTypeCd']/following-sibling::div//input")
    public WebElementFacade enterpriseTypeCd;//企业实体类型。

    @FindBy(xpath = "//li[@class='el-select-dropdown__item country-option']//span[text()='CHINESE']")
    public WebElementFacade china;//中国

    @FindBy(xpath = "//label[@for='certfctNo']/following-sibling::div//input")
    public WebElementFacade idCard;

    @FindBy(xpath = "//label[@for='certfctNo']/following-sibling::div//input")
    public WebElementFacade RegistrationNumber;//企业注册号。

    @FindBy(xpath = "//label[@for='idd']/following-sibling::div//input")
    public WebElementFacade countryCode;

    @FindBy(xpath = "//span[text()='+86']")
    public WebElementFacade chinaCode;

    @FindBy(xpath = "//label[@for='mobilePhoneNo']/following-sibling::div//input")
    public WebElementFacade phoneNumber;

    @FindBy(xpath = "//label[@for='emailAddr']/following-sibling::div//input")
    public WebElementFacade email;

    @FindBy(xpath = "//label[@for='experience']/following-sibling::div//input")
    public WebElementFacade experience;//行业经验。

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='ui-button primary common']/div")
    public WebElementFacade submit;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//label[@for='financialReportDate']/following-sibling::div//input")
    public WebElementFacade reportDate;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//label[@for='financialReportTerm']/following-sibling::div//input")
    public WebElementFacade reportDuration;//报告时长。

    @FindBy(xpath = "//div[@x-placement='top-start'or@x-placement='bottom-start']/div//li[1]")
    public WebElementFacade reportSix;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//label[@for='netSales']")
    public WebElementFacade otherBtn;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//label[@for='netSales']/following-sibling::div//input")
    public WebElementFacade netSales;//净销售额SGD等值。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//label[@for='preTaxSales']/following-sibling::div//input")
    public WebElementFacade preTaxSales;//税前净利润

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//label[@for='totalAssets']/following-sibling::div//input")
    public WebElementFacade totalAssets;//总资产。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//label[@for='dibtAssets']/following-sibling::div//input")
    public WebElementFacade dibtAssets;//负债总额。

    //财务报告第二份
    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[4]//label[@for='financialReportDate']/following-sibling::div//input")
    public WebElementFacade reportDate2;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[4]//label[@for='financialReportTerm']/following-sibling::div//input")
    public WebElementFacade reportDuration2;//报告时长。

    @FindBy(xpath = "//div[@x-placement='top-start'or@x-placement='bottom-start']/div//li[3]")
    public WebElementFacade reportSix2;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[4]//label[@for='netSales']/following-sibling::div//input")
    public WebElementFacade netSales2;//净销售额SGD等值。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[4]//label[@for='preTaxSales']/following-sibling::div//input")
    public WebElementFacade preTaxSales2;//税前净利润

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[4]//label[@for='totalAssets']/following-sibling::div//input")
    public WebElementFacade totalAssets2;//总资产。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[4]//label[@for='dibtAssets']/following-sibling::div//input")
    public WebElementFacade dibtAssets2;//负债总额。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[6]//label[@class='el-form-item__label']/following-sibling::div/div[@class='el-radio-group']/label[1]")
    public WebElementFacade yesBtn;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[2]//label[@class='el-form-item__label']/following-sibling::div/div[@class='el-radio-group']/label[1]/span[1]")
    public WebElementFacade yesBtnCompany;//公司界面的其他财务承诺按钮。

    @FindBy(xpath = "//div[contains(text(),'Financial Report 1')]/following-sibling::div//label[@for='financialReportDate']/following-sibling::div//input")
    public WebElementFacade firstDate;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 1')]/following-sibling::div//label[@for='financialReportTerm']/following-sibling::div//span[@class='el-input__suffix']")
    public WebElementFacade firstReportingPeriod;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 1')]/following-sibling::div//label[@for='financialReportTerm']")
    public WebElementFacade firstReportingPeriodText;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul//span")
    public List<WebElementFacade> firstSelectMonths;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 1')]/following-sibling::div//label[@for='netSales']/following-sibling::div//input")
    public WebElementFacade firstNetSalesInput;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 1')]/following-sibling::div//label[@for='preTaxSales']/following-sibling::div//input")
    public WebElementFacade firstNetProfitInput;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 1')]/following-sibling::div//label[@for='totalAssets']/following-sibling::div//input")
    public WebElementFacade firstTotalAssets;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 1')]/following-sibling::div//label[@for='dibtAssets']/following-sibling::div//input")
    public WebElementFacade firstTotalLiabilities;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 2')]/following-sibling::div//label[@for='financialReportDate']/following-sibling::div//input")
    public WebElementFacade secondDate;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 2')]/following-sibling::div//label[@for='financialReportTerm']/following-sibling::div//span[@class='el-input__suffix']")
    public WebElementFacade secondReportingPeriod;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 2')]/following-sibling::div//label[@for='financialReportTerm']")
    public WebElementFacade secondReportingPeriodText;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 2')]/following-sibling::div//label[@for='netSales']/following-sibling::div//input")
    public WebElementFacade secondNetSalesInput;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 2')]/following-sibling::div//label[@for='preTaxSales']/following-sibling::div//input")
    public WebElementFacade secondNetProfitInput;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 2')]/following-sibling::div//label[@for='totalAssets']/following-sibling::div//input")
    public WebElementFacade secondTotalAssets;

    @FindBy(xpath = "//div[contains(text(),'Financial Report 2')]/following-sibling::div//label[@for='dibtAssets']/following-sibling::div//input")
    public WebElementFacade secondTotalLiabilities;

    //其他财务承诺。
    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[7]//form/div[1]//input")
    public WebElementFacade financialInstitutionName;//金融机构名称。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form/div[1]//input")
    public WebElementFacade financialInstitutionCompanyName;//金融机构名称（公司担保）。

    @FindBy(xpath = "//div[@class='contact_container mb24']/following-sibling::form/div[1]/div//input")
    public WebElementFacade financialInstitutionNameHouse;//金融机构名称 房产抵押。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[7]//form/div[1]/div//label[1]//span[2]")
    public WebElementFacade overdraft;//透支。

    @FindBy(xpath = "//label[@for='loanType']/following-sibling::div/div/label[1]/span[1]")
    public WebElementFacade overdraftCompany;//透支（公司）。

    @FindBy(xpath = "//label[@for='loanType']/following-sibling::div//label[1]//span[2]")
    public WebElementFacade overdraftHouse;//房产抵押 透支按钮。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[7]//form//label[@for='loanAmt']/following-sibling::div//input")
    public WebElementFacade loanAmt;//限額金額。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form//label[@for='loanAmt']/following-sibling::div//input")
    public WebElementFacade loanAmtCompany;//限額金額(公司)。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form//label[@for='loanAmt']/following-sibling::div//input")
    public WebElementFacade loanAmtHouse;//限額金額。 房产抵押业务。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[7]//form/div[4]//input")
    public WebElementFacade outstandingAmt;//未偿还金额。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form/div[4]//input")
    public WebElementFacade outstandingAmtCompany;//未偿还金额（公司）。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form/div[4]//input")
    public WebElementFacade outstandingAmtHouse;//未偿还金额。房产抵押业务。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[7]//form/div[5]//input")
    public WebElementFacade monthlyInstallments;//每月分期付款。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form/div[5]//input")
    public WebElementFacade monthlyInstallmentsCompany;//每月分期付款(公司)。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form/div[5]//input")
    public WebElementFacade monthlyInstallmentsHouse;//每月分期付款。房产抵押业务。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[7]//form//label[@for='rate']/following-sibling::div//input")
    public WebElementFacade rate;//贷款利率。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form//label[@for='rate']/following-sibling::div//input")
    public WebElementFacade rateCompany;//贷款利率(公司)。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[3]//form//label[@for='rate']/following-sibling::div//input")
    public WebElementFacade rateHouse;//贷款利率。房产抵押业务。

    @FindBy(xpath = "//div[@class='add_tips']/following-sibling::div//div[@class='ui-button primary common']/div")
    public WebElementFacade nextStep;

    @FindBy(xpath = "//span[text()='No']/preceding-sibling::span")
    public WebElementFacade checkPoint;

    @FindBy(xpath = "//div[@class='ui-container-full__body']/div//div[@class='ui-button primary common']//div[@class='btn_box']")
    public WebElementFacade nextOnUpLoadFile;

    @FindBy(xpath = "//div[contains(text(),'Submit')]")
    public WebElementFacade clickSubmitBtn;

    @FindBy(xpath = "//div[text()='Congratulations!']")
    public WebElementFacade checkText;

    @FindBy(xpath = "//label[@for='houseAddr']/following-sibling::div//input")
    public WebElementFacade houseAddress;//房产地址。

    @FindBy(xpath = "//label[@for='zipCd']/following-sibling::div//input")
    public WebElementFacade zipCode;//邮政编码。

    @FindBy(xpath = "//label[@for='areaOfStructure']/following-sibling::div//input")
    public WebElementFacade constructionArea;//建筑面积

    @FindBy(xpath = "//label[@class='el-form-item__label']/following-sibling::div//label[1]/span[@class='el-radio__input']")
    public WebElementFacade financialCommitment;//财务承诺。

    @FindBy(xpath = "//label[@for='buyerName']/following-sibling::div//input")
    public WebElementFacade buyerName;//买方姓名。

    @FindBy(xpath = "//label[@for='buyerName']/parent::div/following-sibling::div[1]//input")
    public WebElementFacade buyerYears;//买方关系年限。

    @FindBy(xpath = "//label[@for='buyerName']/parent::div/following-sibling::div[2]//input")
    public WebElementFacade buyerSales;//买方年销售额。

    @FindBy(xpath = "//label[@for='buyerName']/parent::div/following-sibling::div[3]//div[@class='el-radio-group']/label[1]/span[1]")
    public WebElementFacade buyerTermsOfTrade;//买方信用证。

    @FindBy(xpath = "//label[@for='buyerName']/parent::div/following-sibling::div[4]//input")
    public WebElementFacade buyerCreditPeriod;//买方信用期限。

    @FindBy(xpath = "//label[@for='buyerName']/parent::div/following-sibling::div[5]//div[@class='el-radio-group']/label[1]/span[1]")
    public WebElementFacade RelatedParty;//买方关联方。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[5]//div[@class='el-form-item el-form-item--medium']//input")
    public WebElementFacade supplierName;//供应商名字。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[5]//label[@for='relationTerm']/following-sibling::div//input")
    public WebElementFacade supplierYears;//供应方关系年限。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[5]//label[@for='yearSale']/following-sibling::div//input")
    public WebElementFacade supplierSales;//供应方年销售额。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[5]//label[@for='tradeTerm']/following-sibling::div//label[1]/span/span")
    public WebElementFacade supplierTermsOfTrade;//供应方信用证。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[5]//label[@for='creditPeriod']/following-sibling::div//input")
    public WebElementFacade supplierCreditPeriod;//供应方信用期限。

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::div[5]//label[@for='relatedParty']/following-sibling::div//label[1]/span/span")
    public WebElementFacade supplierRelatedParty;//供应方关联方。

    @FindBy(xpath = "//label[@for='carInfo']/following-sibling::div//input")
    public WebElementFacade carInfo;//车辆型号。

    @FindBy(xpath = "//label[@for='buyAmount']/following-sibling::div//input")
    public WebElementFacade buyAmount;//车辆价格。

    @FindBy(xpath = "//label[@for='carType']/following-sibling::div//label[1]/span[1]")
    public WebElementFacade carType;//车辆类型选择乘用车。

    @FindBy(xpath = "//div[@class='el-table__fixed-right']//tbody/tr[3]/td[7]//div/div")
    public WebElementFacade threePoint;//贷款支用的支用申请按钮。

    @FindBy(xpath = "//div[@class='el-table__fixed-right']//div[@class='el-tooltip btn-icon']")
    public WebElementFacade threePointSingapore;//新币的支用还款按钮。

    @FindBy(xpath = "//label[@for='repayDate']/following-sibling::div//input")
    public WebElementFacade repaymentDate;

    @FindBy(xpath = "//label[@for='repayDate']")
    public WebElementFacade repayDate;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom']//div[@class='btn_box']")
    public WebElementFacade ApplicationForPayment;//支用申请按钮。

    @FindBy(xpath = "//div[@class='table-box']/div[2]/div[3]//table[@class='el-table__body']//tr/td[1]/div")
    public List<WebElementFacade> productType;

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//table[@class='el-table__body']//tr/td//img")
    public List<WebElementFacade> moreInformation;

    @FindBy(xpath = "//label[@for='disburseCurrencyTypeCd']/following-sibling::div//input")
    public WebElementFacade currency;//支用币种.

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li[1]")
    public WebElementFacade SingaporeDollars;//新币、

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li[2]")
    public WebElementFacade usDollar;//美元。

    @FindBy(xpath = "//label[@for='issueLoanSettleAcctNo']/following-sibling::div//input")
    public WebElementFacade LendingAccount;//放款账户。

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li[1]//span")
    public WebElementFacade account;//第一个账户。

    @FindBy(xpath = "//label[@for='disburseApplyforAmont']/following-sibling::div//input")
    public WebElementFacade ApplyForAmount;//申请支用金额。

    @FindBy(xpath = "//label[@for='financingDayNum']/following-sibling::div//input")
    public WebElementFacade financingDayNum;//融资天数。

    @FindBy(xpath = "//label[@for='goodsDescr']/following-sibling::div//textarea")
    public WebElementFacade goodsDescr;//货物描述及数量。

    @FindBy(xpath = "//label[@for='transportMethod']/following-sibling::div//input")
    public WebElementFacade transportMethod;//运输途径。

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li[1]")
    public WebElementFacade landTran;//陆运

    @FindBy(xpath = "//span[@class='el-checkbox__input']")
    public WebElementFacade agreeToTerms;//同意条款。

    @FindBy(xpath = "//div[@class='ui-container-full__body']/div/div[2]//div[@class='ui-button primary common']/div")
    public WebElementFacade submitOnSpendPage;//支用界面的提交按钮。

}



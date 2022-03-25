package com.glbank.com.sg.bdd.pages.supplyChains.creditFile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class createSupplierCreditFile_page extends PageObject {

    @FindBy(xpath = "//div[@class=\"lls-submenu__content\"]//span[text()=\"Supplier Credit Profile List\"]")
    public WebElementFacade clickSupplierCreditProfileList;

    @FindBy(xpath = "//div[@data-key=\"f228nvqh\"]//button//span")
    public WebElementFacade clickCreateNewUnderwriting;

    @FindBy(xpath = "//label[text()=\"Customer Name\"]/following-sibling::div//input")
    public WebElementFacade clickToGetCustomerName;

    @FindBy(xpath = "//span[text()=\"AutoTestSupplier_chen\"]")
    public WebElementFacade getSupplierName;

    @FindBy(xpath = "//label[text()=\"Buyer\"]/following-sibling::div//input")
    public WebElementFacade clickToGetBuyer;

    @FindBy(xpath = "//span[text()=\"AutoTestBuyer_chen\"]")
    public WebElementFacade getBuyerName;

    @FindBy(xpath = "//label[text()=\"Product Type\"]/following-sibling::div//input[@placeholder=\"\"]")
    public WebElementFacade clickToGetProductType;

    @FindBy(xpath = "//div[@class=\"lls-dialog__wrapper\"]/following-sibling::div//span[text()=\"Post Acceptance\"]")
    public WebElementFacade getProductType;

    @FindBy(xpath = "//label[text()=\"Input by\"]/following-sibling::div//input")
    public WebElementFacade clickToGetInputBy;

    @FindBy(xpath = "//span[text()=\"Operator\"]")
    public WebElementFacade getInputBy;

    @FindBy(xpath = "//div[@data-key=\"f055gmsm\"]//button//span")
    public WebElementFacade clickConfirm;

    @FindBy(xpath = "//span[@data-key=\"f2213nfl\"]//i")
    public List<WebElementFacade> clickEditSupplierCreditFileList;

    @FindBy(xpath = "//label[text()=\"Is a Public Company?\"]/following-sibling::div//label//span[text()=\"Yes\"]/preceding-sibling::span//span")
    public WebElementFacade clickPublicCompany;

    @FindBy(xpath = "//label[text()=\"Starting Year of Business\"]/following-sibling::div//input")
    public WebElementFacade getStartingYearOfBusiness;

    @FindBy(xpath = "//div[text()=\"Create Supplier Credit Profile\"]")
    public WebElementFacade clickBlank;

    @FindBy(xpath = "//label[text()=\"Starting Year of Business\"]/following-sibling::div//td//a[text()=\"2020\"]")
    public WebElementFacade clickStartingYearOfBusiness;

    @FindBy(xpath = "//label[text()=\"Have Financials?\"]/following-sibling::div//label//span[text()=\"Yes\"]/preceding-sibling::span//span")
    public WebElementFacade clickHaveFinancials;

    @FindBy(xpath = "//label[text()=\"Starting Year of Buyer Relationship\"]/following-sibling::div//input")
    public WebElementFacade getStartingYearOfBuyerRelationship;

    @FindBy(xpath = "//label[text()=\"Starting Year of Buyer Relationship\"]/following-sibling::div//td//a[text()=\"2020\"]")
    public WebElementFacade clickStartingYearOfBuyerRelationship;

    @FindBy(xpath = "//label[text()=\"Exchange\"]/following-sibling::div//input")
    public WebElementFacade clickExchange;

    @FindBy(xpath = "//span[text()=\"SHSE - Shanghai Stock Exchange\"]")
    public WebElementFacade getExchange;

    @FindBy(xpath = "//label[text()=\"Ticker Symbol\"]/following-sibling::div//input")
    public WebElementFacade getTickerSymbol;

    @FindBy(xpath = "//label[text()=\"Industry\"]/following-sibling::div//input")
    public WebElementFacade clickIndustry;

    @FindBy(xpath = "//span[text()=\"Airlines\"]")
    public WebElementFacade getIndustry;

    @FindBy(xpath = "//label[text()=\"DRSK Rating\"]/following-sibling::div//input")
    public WebElementFacade getDRSKRating;

    @FindBy(xpath = "//label[text()=\"Last Fiscal Year\"]/following-sibling::div//input")
    public WebElementFacade getLastFiscalYear;

    @FindBy(xpath = "//label[text()=\"Last Fiscal Year\"]/following-sibling::div//td//a[text()=\"2020\"]")
    public WebElementFacade clickLastFiscalYear;

    @FindBy(xpath = "//label[text()=\"Buyer COGS\"]/following-sibling::div//input")
    public WebElementFacade getBuyerCOGS;

    @FindBy(xpath = "//label[text()=\"Screenshot of DRSK Rating\"]/following-sibling::div//div[@class=\"lls-upload-dragger\"]")
    public WebElementFacade upFileScreenshotOfDRSKRating;

    @FindBy(xpath = "//div[text()=\" Financial Information \"]")
    public WebElementFacade clickFinancialInformation;

    @FindBy(xpath = "//div[@class=\"cust_info_tag_top topTag\"]/following-sibling::div//label[text()=\"Reporting Currency\"]/following-sibling::div//input")
    public WebElementFacade clickInLastYearReportingCurrency;

    @FindBy(xpath = "//div[@class=\"cust_info_tag_top topTag\"]/following-sibling::div//span[text()=\"USD\"]")
    public WebElementFacade getInLastYearReportingCurrency;

    @FindBy(xpath = "//label[text()=\"Total Assets\"]/following-sibling::div//input")
    public WebElementFacade getTotalAssets;

    @FindBy(xpath = "//label[text()=\"Current Assets\"]/following-sibling::div//input")
    public WebElementFacade getCurrentAssets;

    @FindBy(xpath = "//label[text()=\"Working Capital\"]/following-sibling::div//input")
    public WebElementFacade getWorkingCapital;

    @FindBy(xpath = "//label[text()=\"Total Liabilities\"]/following-sibling::div//input")
    public WebElementFacade getTotalLiabilities;

    @FindBy(xpath = "//label[text()=\"Current Liabilities\"]/following-sibling::div//input")
    public WebElementFacade getCurrentLiabilities;

    @FindBy(xpath = "//div[@class=\"cust_info_tag_top topTag\"]/following-sibling::div//label[text()=\"Net Profit\"]/following-sibling::div//input")
    public WebElementFacade getInLastYearNetProfit;

    @FindBy(xpath = "//label[text()=\"Operating Cashflow\"]/following-sibling::div//input")
    public WebElementFacade getOperatingCashFlow;

    @FindBy(xpath = "//label[text()=\"Operating Profit\"]/following-sibling::div//input")
    public WebElementFacade getOperatingProfit;

    @FindBy(xpath = "//label[text()=\"Total Revenue (p.a.)\"]/following-sibling::div//input")
    public WebElementFacade getTotalRevenue;

    @FindBy(xpath = "//label[text()=\"Cash and Cash Equivalents\"]/following-sibling::div//input")
    public WebElementFacade getCashAndCashEquivalents;

    @FindBy(xpath = "//label[text()=\"Book Value of Equity\"]/following-sibling::div//input")
    public WebElementFacade getBookValueOfEquity;

    @FindBy(xpath = "//label[text()=\"Financial Information in Last Year\"]/following-sibling::div//div[@class=\"lls-upload-dragger\"]")
    public WebElementFacade upFinancialInformationInLastYear;

    @FindBy(xpath = "//div[@class=\"cust_info_tag_top undefined\"]/following-sibling::div//label[text()=\"Reporting Currency\"]/following-sibling::div//input")
    public WebElementFacade clickInYearBeforeLastReportingCurrency;

    @FindBy(xpath = "//div[text()=\"Financial Information\"]")
    public WebElementFacade findFinancialInformation;

    @FindBy(xpath = "//div[text()=\" Other Documents \"]")
    public WebElementFacade clickOtherDocuments;

    @FindBy(xpath = "//div[@class=\"cust_info_tag_top undefined\"]/following-sibling::div//span[text()=\"USD\"]")
    public WebElementFacade getInYearBeforeLastReportingCurrency;

    @FindBy(xpath = "//div[@class=\"cust_info_tag_top undefined\"]/following-sibling::div//label[text()=\"Net Profit\"]/following-sibling::div//input")
    public WebElementFacade getInYearBeforeLastNetProfit;

    @FindBy(xpath = "//label[text()=\"Financial Information in Year Before Last\"]/following-sibling::div//div[@class=\"lls-upload-dragger\"]")
    public WebElementFacade upFileFinancialInformationInYearBeforeLast;

    @FindBy(xpath = "//label[text()=\"Other Files\"]/following-sibling::div//div[@class=\"lls-upload-dragger\"]")
    public WebElementFacade upFileOtherFiles;

    @FindBy(xpath = "//span[text()=\"Save \"]")
    public WebElementFacade clickSave;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//tbody//td[@data-key=\"f2e1tmh0\"]")
    public List<WebElementFacade> companyNameList;

    @FindBy(xpath = "//span[@data-key=\"f3vg3h03\"]//i")
    public List<WebElementFacade> submitListToReview;

    @FindBy(xpath = "//div[@class=\"lls-submenu__content\"]//span[text()=\"Supplier Credit Profile Review\"]")
    public WebElementFacade clickSupplierCreditProfileReview;

    @FindBy(xpath = "//td[@data-key=\"f3mbtifu\"]")
    public List<WebElementFacade> companyNameListToAssignToMe;

    @FindBy(xpath = "//td[@data-key=\"f3gcso3e\"]//button")
    public List<WebElementFacade> AssignToMe;

    @FindBy(id="tab-1")
    public WebElementFacade clickToAssignedToMePage;

    @FindBy(xpath = "//td[@data-key=\"f1ukpqvq\"]")
    public List<WebElementFacade> companyNameInAssignedToMePage;

    @FindBy(xpath = "//td[@data-key=\"f29m37ir\"]//span[@data-key=\"f19rqem9\"]//button")
    public List<WebElementFacade> proceedInAssignedToMePage;

    @FindBy(xpath = "//label[text()=\"Result\"]/following-sibling::div//input")
    public WebElementFacade clickResult;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start' ]//span[text()='Approve']")
    public WebElementFacade getApprove;

    @FindBy(xpath = "//label[text()=\"Comments\"]/following-sibling::div//textarea")
    public WebElementFacade getComments;

    @FindBy(xpath = "//button[@class=\"lls-button btn-item lls-button--primary\"]")
    public WebElementFacade clickSubmit;


}

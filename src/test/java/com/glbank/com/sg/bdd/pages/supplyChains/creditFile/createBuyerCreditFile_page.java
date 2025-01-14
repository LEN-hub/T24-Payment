package com.glbank.com.sg.bdd.pages.supplyChains.creditFile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class createBuyerCreditFile_page extends PageObject {
    @FindBy(xpath = "//div[@class=\"lls-submenu__content\"]//span[text()=\"Buyer Credit Profile List\"]")
    public WebElementFacade clickBuyerCreditProfileList;

    @FindBy(xpath = "//div[@data-key=\"f0o20nrp\"]//span")
    public WebElementFacade clickCreateNewUnderwriting;

    @FindBy(xpath = "//div[contains(text(),'Customer Name')]/parent::label/following-sibling::div//input")
    public WebElementFacade clickToGetCustomerName;

    @FindBy(xpath = "//span[text()=\"AutoTestBuyer_chen\"]")
    public WebElementFacade getBuyerName;

    @FindBy(xpath = "//div[contains(text(),'Underwriting Mode')]/parent::label/following-sibling::div//input")
    public WebElementFacade clickToGetUnderwritingMode;

    @FindBy(xpath = "//span[text()=\"on Buyer Entity\"]")
    public WebElementFacade getUnderwritingMode;

    @FindBy(xpath = "//label[@class=\"lls-radio\"]/following-sibling::label//span[@class=\"lls-radio__inner\"]")
    public WebElementFacade clickPublicCompany;

    @FindBy(xpath = "//div[@data-key=\"f0fto2q8\"]//button//span")
    public WebElementFacade clickConfirmToCreateNewUnderwriting;

    @FindBy(xpath = "//td[@data-key=\"f1glrqpn\"]")
    public List<WebElementFacade> companyNameList;

    @FindBy(xpath = "//td[@data-key=\"f103l7h9\"]//span[@data-key=\"f3up86pa\"]//i")
    public List<WebElementFacade> editBuyerList;

    @FindBy(xpath = "//div[text()=\"Create Buyer Credit Profile\"]")
    public WebElementFacade checkCreateBuyerCreditProfilePage;

    @FindBy(xpath = "//div[@class=\"lls-date-editor lls-input lls-input--suffix lls-date-editor--year\"]//input")
    public WebElementFacade getLastFiscalYear;

    @FindBy(xpath = "//table[@class=\"lls-year-table\"]//a[text()=\"2020\"]")
    public WebElementFacade pickAYear;

    @FindBy(xpath = "//label[text()=\"DRSK Rating\"]/following-sibling::div//input")
    public WebElementFacade getDRSKRating;

    @FindBy(xpath = "//label[text()=\"Screenshot of DRSK Rating\"]/following-sibling::div//div[@class=\"lls-upload-dragger\"]")
    public WebElementFacade upScreenshotOfDRSKRating;

    @FindBy(xpath = "//div[@class=\"lls-input lls-input--suffix\"]//input")
    public WebElementFacade getToReportingCurrency;

    @FindBy(xpath = "//span[text()=\"CNY\"]")
    public WebElementFacade getReportingCurrency;

    @FindBy(xpath = "//label[text()=\"Total Liabilities\"]/following-sibling::div//input") //总负债增长
    public WebElementFacade getTotalLiabilities;

    @FindBy(xpath = "//label[text()=\"Current Liabilities\"]/following-sibling::div//input")  //流动负债
    public WebElementFacade getCurrentLiabilities;

    @FindBy(xpath = "//label[text()=\"Total Asset\"]/following-sibling::div//input") //总资产
    public WebElementFacade getTotalAsset;

    @FindBy(xpath = "//label[text()=\"Total Revenue (p.a.)\"]/following-sibling::div//input") //总收入每年
    public WebElementFacade getTotalRevenue;

    @FindBy(xpath = "//label[text()=\"Net Profit\"]/following-sibling::div//input") //净利润
    public WebElementFacade getNetProfit;

    @FindBy(xpath = "//label[text()=\"Cash and Cash Equivalents\"]/following-sibling::div//input") //现金及现金等价物
    public WebElementFacade getCashAndCashEquivalents;

    @FindBy(xpath = "//label[text()=\"Book Value of Equity\"]/following-sibling::div//input") //权益账面价值
    public WebElementFacade getBookValueOfEquity;

    @FindBy(xpath = "//label[text()=\"Financial information in last year\"]/following-sibling::div//div[@class=\"lls-upload-dragger\"]") //去年的财务信息
    public WebElementFacade upFinancialInformationInLastYear;

    @FindBy(xpath = "//label[text()=\"Other Files\"]/following-sibling::div//div[@class=\"lls-upload-dragger\"]") //其它文件
    public WebElementFacade upOtherFiles;

    @FindBy(xpath = "//span[text()=\"Save \"]")
    public WebElementFacade clickSaveBuyerCreditProfile;

    @FindBy(xpath = "//div[@class='back_view']//span[contains(text(),'Back')]")
    public WebElementFacade clickBackBtn;

    @FindBy(xpath = "//label[text()='Status']")
    public WebElementFacade clickStatusTitle;

    @FindBy(xpath = "//label[text()='Company']/following-sibling::div//input")
    public WebElementFacade inputCompanyText;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//table/tbody//i[@class='lls-tooltip lls-icon-s-check']")
    public WebElementFacade clickSubmitBtn;


    @FindBy(xpath = "//div[@class=\"lls-menu-item is-active\"]//span[text()=\"Buyer Credit Profile List\"]")
    public WebElementFacade checkBuyerCreditProfileList;

    @FindBy(xpath = "//td[@title=\"1\"]/following-sibling::td[@data-key=\"f103l7h9\"]//span[@data-key=\"f1bkanph\"]//i")
    public WebElementFacade clickSubmit;

    @FindBy(xpath = "//td[@data-key=\"f103l7h9\"]//span[@data-key=\"f1bkanph\"]//i")
    public List<WebElementFacade> buyerSubmitList;

    @FindBy(xpath = "//label[text()='Company']/following-sibling::div//input")
    public WebElementFacade companyNameInput;

    @FindBy(xpath = "//label[text()='Company']")
    public WebElementFacade companyBtn;

    @FindBy(xpath = "//tbody//span[text()='Under Credit Review']")
    public WebElementFacade buyerCreditFileStatus;
}

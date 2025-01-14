package com.glbank.com.sg.bdd.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class accountService_page extends PageObject {
    @FindBy(xpath = "//span[text()='Accounts']")
    public WebElementFacade accountList;

    @FindBy(xpath = "//span[text()='Accounts Overview']")
    public WebElementFacade accountInformationQuery;

    @FindBy(xpath = "//span[text()='Transaction Histories']")
    public WebElementFacade accountDetailsQuery;

    @FindBy(xpath = "//div[@class='el-tooltip btn-icon']/img")
    public WebElementFacade detailsList;

    @FindBy(xpath = "//p[@class='line_style acctNo_style']")
    public WebElementFacade accountAndCurrency;

    @FindBy(xpath = "//label[@for='payerAcctObj']")
    public WebElementFacade accountTitle;

    @FindBy(xpath = "//label[@for='payerAcctObj']/parent::div/following-sibling::div//label")
    public WebElementFacade currencyTitle;

    @FindBy(xpath = "//label[@for='payerAcctObj']/parent::div/parent::div/parent::div/following-sibling::div//label")
    public WebElementFacade selectDataTitle;

    @FindBy(xpath = "//label[@for='payerAcctObj']/parent::div/parent::div/parent::div/following-sibling::div[2]//div[@class='ui-button secondary common']//div[@class='btn_box']")
    public WebElementFacade resetBtn;

    @FindBy(xpath = "//label[@for='payerAcctObj']/parent::div/parent::div/parent::div/following-sibling::div[2]//div[@class='ui-button primary common']//div[@class='btn_box']")
    public WebElementFacade queryButton;

    @FindBy(xpath = "//p[@class='line_style alis']/span")
    public WebElementFacade accountAlias;

    @FindBy(xpath = "//div[@class='bankcard-info']/span[1]")
    public WebElementFacade balance;

    @FindBy(xpath = "//div[@class='bankcard-info']/span[2]")
    public WebElementFacade balanceSecond;

    @FindBy(xpath = "//div[@class='el-tooltip__popper is-light']/div[1]/div[1]")
    public WebElementFacade detailedQuery;

    @FindBy(xpath = "//div[@class='el-tooltip__popper is-light']/div[1]/div[2]")
    public WebElementFacade domesticTransfer;

    @FindBy(xpath = "//div[@class='el-tooltip__popper is-light']/div[1]/div[3]")
    public WebElementFacade regularBasis;

    @FindBy(xpath = "//div[@class='el-tooltip__popper is-light']/div[1]/div[4]")
    public WebElementFacade accountDetails;

    @FindBy(xpath = "//div[@class='ui-theme-container-main']/div[2]//div[contains(text(),'A.')]")
    public WebElementFacade accountInformationDetails;

    @FindBy(xpath = "//div[@class='ui-theme-container-main']/div[2]//div[contains(text(),'B.')]/parent::div/parent::div/following-sibling::div/child::div[1]//div[@class='btn_box']")
    public WebElementFacade backBtn;

    @FindBy(xpath = "//div[@class='ui-theme-container-main']/div[2]//div[contains(text(),'B.')]/parent::div/parent::div/following-sibling::div/child::div[2]//div[@class='btn_box']")
    public WebElementFacade detailsQuery;

    @FindBy(xpath = "//div[@class='ui-theme-container-main']/div[2]//div[contains(text(),'B.')]/parent::div/parent::div/following-sibling::div/child::div[3]//div[@class='btn_box']")
    public WebElementFacade domesticTransferBtn;

    @FindBy(xpath = "//div[@class='ui-theme-container-main']/div[2]//div[contains(text(),'B.')]/parent::div/parent::div/following-sibling::div/child::div[4]//div[@class='btn_box']")
    public WebElementFacade regularBasisBtn;

    @FindBy(xpath = "//div[@class='ui-theme-container-main']/div[2]//div[contains(text(),'B.')]")
    public WebElementFacade basicInformation;

    @FindBy(xpath = "//label[@for='payerAcctObj']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade payerAccount;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or x-placement=\"top-start\"]/div[1]/div[1]//li")
    public WebElementFacade AccountList;

    @FindBy(xpath = "//p[@class='line_style alis']/span/i")
    public WebElementFacade clickEditAlias;

    @FindBy(xpath = "//p[@class='line_style alis']/following-sibling::div//input")
    public WebElementFacade inputAlias;

    @FindBy(xpath = "//p[@class='line_style alis']/following-sibling::div/child::div[2]//div[@class='btn_box']")
    public WebElementFacade saveBtn;

    @FindBy(xpath = "//div[@class='el-message-box__title']/span")
    public WebElementFacade popWindowsTitle;

    @FindBy(xpath = "//div[@class='el-message-box__btns']/button[2]")
    public WebElementFacade popWindowsOk;

    @FindBy(xpath = "//div[@class='header-top-right']/div[5]")
    public WebElementFacade clickDownloadBtn;

    @FindBy(xpath = "//ul[@x-placement='bottom' ]/li[3]")
    public WebElementFacade clickMyDownloads;

    @FindBy(xpath = "//ul[@x-placement='bottom' ]/li[2]")
    public WebElementFacade viewEadvices;

    @FindBy(xpath = "//ul[@x-placement='bottom' ]/li[1]")
    public WebElementFacade viewEstatements;

    @FindBy(xpath = "//a[@class='md-tab-title']")
    public WebElementFacade downloadTemplate;

    @FindBy(xpath = "//tr[@class='el-table__row']/td[3]//div[@class='btn_box']")
    public WebElementFacade downloadBtn;

    @FindBy(xpath = "//div[@class='el-col el-col-14']/div[2]/div/div[2]//div[@class='btn_box']")
    public WebElementFacade clickSelectBtn;

    @FindBy(xpath = "//div[@class='el-table__fixed-right']//table[@class='el-table__body']//tr/td[6]//div[@class='btn_box']")
    public WebElementFacade clickViewEstatementsDownloadBtn;

    @FindBy(xpath = "//div[@class='header-top-right']//div[7]//div[@class='btn_box']")
    public WebElementFacade mySetting;

    @FindBy(xpath = "//ul[@x-placement='bottom' ]/li[2]")
    public WebElementFacade managerMyProfile;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-container'][1]/div/div[2]/div[@class='el-col el-col-23']/div[1]/div[2]//i")
    public WebElementFacade editProfile;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-container'][1]/div/div[2]/div[@class='el-col el-col-23']/div[1]/div[2]//input")
    public WebElementFacade enterProfile;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-container'][1]/div/div[2]/div[@class='el-col el-col-23']/div[1]/div[2]//div[@class='but aff']")
    public WebElementFacade clickSaveBtn;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-container'][1]/div/div[2]/div[@class='el-col el-col-23']/div[1]//div[@class='value-style']")
    public WebElementFacade checkEditProfile;

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[6]/div")
    public WebElementFacade enterpriseManagementDesk;

    @FindBy(xpath = "//div[@class='list']/div[2]//span[@class='sub-menu-title']")
    public WebElementFacade operationLogQuery;

    @FindBy(xpath = "//span[@class='more_btn']/preceding-sibling::div[1]//div[@class='btn_box']")
    public WebElementFacade queryBtn;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form/div[3]/div[2]/div[2]/div")
    public WebElementFacade clickQueryButton;

    @FindBy(xpath = "//table[@class='el-table__body']/tbody//tr[1]/td[7]//span")
    public WebElementFacade querySuccess;

    @FindBy(xpath = "//label[@for='queryTypeCd']")
    public WebElementFacade transactionType;

    @FindBy(xpath = "//label[@for=\"queryTypeCd\"]/parent ::div/preceding-sibling::div/label")
    public WebElementFacade operator;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form/div[2]//label[@class='el-form-item__label']")
    public WebElementFacade selectDate;

    @FindBy(xpath = "//table[@class='el-table__header']//tr/th")
    public List<WebElementFacade> fieldList;

    @FindBy(xpath = "//div[@class='header-top-right']/div[3]//div[@class='btn_box']")
    public WebElementFacade myTransactions;

    @FindBy(xpath = "//li[text()='Manage Transactions']")
    public WebElementFacade manageTransactions;

    @FindBy(xpath = "//span[@class='more_btn']")
    public WebElementFacade moreBtn;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[1]//label[@class='el-form-item__label']")
    public List<WebElementFacade> transactionField;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//form[@class='el-form box el-form--label-left']//div[@class='tag'][1]")
    public WebElementFacade selectSevenDay;

    @FindBy(xpath = "//div[@class='content-right']//div[@class='btn_box']")
    public WebElementFacade myTaskBtn;

//    等待授权页面标题。
    @FindBy(xpath = "//div[@class='sub-title']/div")
    public WebElementFacade PendingApprovalTitle;

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr[1]//div[text()='授权']")
    public WebElementFacade firstAuthorizeBtn;

    //审批页面 通过按钮。
    @FindBy(xpath = "//div[@class='el-radio-group']/label[1]/span[1]")
    public WebElementFacade passThroughBtn;

    @FindBy(xpath = "//div[text()='提交']")
    public WebElementFacade submitBtn;

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[5]/div")
    public WebElementFacade transferMoneyBtn;

    @FindBy(xpath = "//div[@class='list']/div[2]/p[2]/span")
    public WebElementFacade rosterManagementBtn;

    @FindBy(xpath = "//div[@class='ui-theme-container-main']/div[1]//div[@class='el-row']/div[2]/div")
    public WebElementFacade addPayeeBtn;

    //收款账号
    @FindBy(xpath = "//label[@for='payeeAcctNo']/following-sibling::div//input")
    public WebElementFacade inputReceivingAccount;

//    收款户名
    @FindBy(xpath = "//label[@for='payeeAcctNm']/following-sibling::div//input")
    public WebElementFacade inputPayeeAccountName;

    // 收款银行
    @FindBy(xpath = "//label[@for='bankInfo']/following-sibling::div//input")
    public WebElementFacade selectBankInfo;

    //收款银行名称列表
    @FindBy(xpath = "//ul[@class='el-scrollbar__view el-select-dropdown__list']/li")
    public List<WebElementFacade> bankList;

    @FindBy(xpath = "//body[@class='theme-ui el-popup-parent--hidden']/div[@class='el-dialog__wrapper large-dialog superLarge-left']//div[@class='body']/div//div[@class='ui-button primary common']")
    public WebElementFacade createSaveBtn;

    @FindBy(xpath = "//span[text()='Transaction History']")
    public WebElementFacade clickTransactionHistory;

    @FindBy(xpath = "//span[text()='Accounts']")
    public WebElementFacade clickAccounts;

    @FindBy(xpath = "//label[@for=\"payerAcctObj\"]/following-sibling::div//span[@class=\"el-input__suffix-inner\"]")
    public WebElementFacade clickDropDownBox;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span")
    public List<WebElementFacade> selectAccontNum;

    @FindBy(xpath = "//div[text()='Search']")
    public WebElementFacade clickSearch;

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr[1]/td[6]//div[@class='el-tooltip btn-icon']")
    public WebElementFacade clickThreePoint;

    @FindBy(xpath = "//div[@x-placement=\"bottom\"]//div[text()='Download']")
    public WebElementFacade clickSitEnvDownloadBtn;

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[6]//span")
    public WebElementFacade adminMenu;

    @FindBy(xpath = "//span[text()='Extract Audit Logs']")
    public WebElementFacade clickExtractAuditLogs;

    @FindBy(xpath = "//div[contains(text(),'Search')]")
    public WebElementFacade clickSearchBtn;

    @FindBy(xpath = "//div[@class='container-component']//div[contains(text(),'Download')]")
    public WebElementFacade clickDownloadButton;

    @FindBy(xpath = "//ul[@x-placement=\"bottom\" or @x-placement=\"top\"]/li[1]/div")
    public WebElementFacade clickXlsDownload;

    @FindBy(xpath = "//tr[@class='el-table__row'][1]//div[text()='Download']")
    public WebElementFacade getClickDownloadButton;

    @FindBy(xpath = "//ul[@x-placement=\"bottom\" or @x-placement=\"top\"]/li[1]/div")
    public WebElementFacade clickCsvDownload;

    @FindBy(xpath = "//ul[@x-placement=\"bottom\" or @x-placement=\"top\"]/li[3]/div")
    public WebElementFacade clickXlsxDownload;

    @FindBy(xpath = "//label[@for='queryTypeCd']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade clickTransactionTypeDownDrop;

    @FindBy(xpath = "//div[@x-placement=\"top-start\" or @x-placement=\"bottom-start\"]//span")
    public List<WebElementFacade> selectTransactionType;
}

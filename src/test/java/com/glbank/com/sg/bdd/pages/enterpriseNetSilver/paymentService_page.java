package com.glbank.com.sg.bdd.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class paymentService_page extends PageObject {

    @FindBy(xpath = "//div[@class='el-message-box__title']/span")
    public WebElementFacade popWindowsTitle;

    @FindBy(xpath = "//div[@class='el-message-box__btns']/button[2]")
    public WebElementFacade popWindowsOk;

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[5]//span")
    public WebElementFacade transferAndRemittanceMenu;

    @FindBy(xpath = "//div[@class='list']/div[1]/p[2]")
    public WebElementFacade transferMoney;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//li/span")
    public List<WebElementFacade> selectTitle;

    @FindBy(xpath = "//div[@class='bank_list']/div[1]//div[@class='name'][1]")
    public WebElementFacade overseasTrasferAccount;

    @FindBy(xpath = "//div[@class='list']/div[1]/p[3]")
    public WebElementFacade domesticTransfer;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::form/child::div[2]/child::div[2]/child::div[1]//span[@class='el-input__suffix-inner']")
    public WebElementFacade collectingBankPopWindows;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//ul/li")
    public List<WebElementFacade> selectSGD;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::form/child::div[2]/child::div[2]/child::div[2]//input")
    public WebElementFacade accountName;

    @FindBy(xpath = "//label[@for='payeeAcctNo']/following-sibling::div//input")
    public WebElementFacade paymentAccount;

    @FindBy(xpath = "//label[@for='tradeAmont']/following-sibling::div//input")
    public WebElementFacade transferAmount;

    @FindBy(xpath = "//label[@for='tradeAmont']/parent::div/following-sibling::div[1]//span[@class='el-input__suffix-inner']/i")
    public WebElementFacade tradeAmountPopWindows;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul/li/span")
    public List<WebElementFacade> tradeAmountSelectFirst;

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[6]//div[@class='btn_box']")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//label[@for='payerAcctObj']/parent::div/following-sibling::div[1]//input")
    public WebElementFacade rollOutCurrency;

    @FindBy(xpath = "//label[@for='payerAcctObj']/following-sibling::div[1]//span[@class='el-input__suffix-inner']")
    public WebElementFacade rollOutCurrencySelectWindows;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//li/span")
    public List<WebElementFacade> rollOutAccountSGD;

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[2]//span[@class='el-input__suffix-inner']")
    public WebElementFacade secondPopWindows;

    @FindBy(xpath = "//label[text()='To Account']")
    public WebElementFacade clickToAccount;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//li/span")
    public List<WebElementFacade> secondCurrencySelectSGD;

    @FindBy(xpath = "//label[@for='tradeAmont']/following-sibling::div//input")
    public WebElementFacade enterMoney;

    @FindBy(xpath = "//label[@for='tradePurpose']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade transferPurpose;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//li[1]/span")
    public WebElementFacade selectTransferPurpose;

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[6]//div[@class='ui-button-inner']")
    public WebElementFacade clickNextBtn;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]")
    public WebElementFacade accountTitle;

    @FindBy(xpath = "//div[@class='el-dialog__wrapper has-icon-small']//span[@class='el-dialog__title']")
    public WebElementFacade tipsTitle;

    @FindBy(xpath = "//div[@class='el-dialog__wrapper has-icon-small']//div[@class='el-dialog__body']//span[@class='dialog-footer']/div[2]//div[@class='btn_box']")
    public WebElementFacade clickTipsContinueBtn;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='el-col el-col-24']/div[2]//div[@class='btn_box']")
    public WebElementFacade submitBtn;

    @FindBy(xpath = "//div[@class='num']")
    public WebElementFacade referenceID;

    @FindBy(xpath = "//div[@class='ui-button primary common disabled']")
    public WebElementFacade disabledSubmitBtn;

    @FindBy(xpath = "//img[@class='refresh']")
    public WebElementFacade clickRefreshBtn;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][1]//div[contains(text(),'Account Name')]/following-sibling::div")
    public WebElementFacade debitAccountName;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][1]//div[contains(text(),'Account Currency')]/following-sibling::div")
    public WebElementFacade debitAccountCurrency;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][1]//div[contains(text(),'Account Number')]/following-sibling::div")
    public WebElementFacade debitAccountNumber;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][1]//div[contains(text(),'Company Name')]/following-sibling::div")
    public WebElementFacade debitCompanyName;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][2]//div[contains(text(),'Account Name')]/following-sibling::div")
    public WebElementFacade creditAccountName;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][2]//div[contains(text(),'Account Currency')]/following-sibling::div")
    public WebElementFacade creditAccountCurrency;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][2]//div[contains(text(),'Account Number')]/following-sibling::div")
    public WebElementFacade creditAccountNumber;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][2]//div[contains(text(),'Company Name')]/following-sibling::div")
    public WebElementFacade creditCompanyName;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),'Transaction Amount')]/following-sibling::div")
    public WebElementFacade transactionAmount;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),'Purpose of Transfer')]/following-sibling::div")
    public WebElementFacade purposeOfTransfer;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][1]//div[contains(text(),'Bank Name')]/following-sibling::div")
    public WebElementFacade fxDetailBankName;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][2]//div[contains(text(),\"Payee's Name\")]/following-sibling::div")
    public WebElementFacade fxDetailPayeeName;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][2]//div[contains(text(),\"Account Currency\")]/following-sibling::div")
    public WebElementFacade fxDetailAccountCurrency;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][2]//div[contains(text(),\"Payee's Account Number\")]/following-sibling::div")
    public WebElementFacade fxDetailPayeeAccountNum;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),\"Exchange Rate\")]/following-sibling::div")
    public WebElementFacade fxDetailExchangeRate;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),'Transaction Amount')]/following-sibling::div")
    public WebElementFacade fxDetailTransactionAmount;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),\"Beneficiary Bank's BIC\")]/following-sibling::div")
    public WebElementFacade fxDetailBeneficiaryBankBIC;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),\"Payee's Address\")]/following-sibling::div")
    public WebElementFacade fxDetailPayeeAddress;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),\"Payee's Country\")]/following-sibling::div")
    public WebElementFacade fxDetailPayeeCountry;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),\"Estimated Processing Fee\")]/following-sibling::div")
    public WebElementFacade fxDetailEstimatedProcessingFee;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),\"Payment Mode for Charges\")]/following-sibling::div")
    public WebElementFacade fxDetailPaymentModeForCharges;

    @FindBy(xpath = "//div[@class='container-component']//div[@class='detail_page-block'][3]//div[contains(text(),\"Purpose of Transfer\")]/following-sibling::div")
    public WebElementFacade fxDetailPurposeOfTransfer;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='el-col el-col-24']/div[@class='ui-button primary common disabled']")
    public WebElementFacade displaySubmitBtn;

    @FindBy(xpath = "//div[contains(text(),\"Exchange Rate\")]/img")
    public WebElementFacade refreshBtn;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='el-col el-col-24']/div[1]//div[@class='btn_box']")
    public WebElementFacade previousBtn;

    @FindBy(xpath = "//div[@class='result-info']")
    public WebElementFacade successTitle;

    @FindBy(xpath = "//div[@class='num']")
    public WebElementFacade serialNumber;

    @FindBy(xpath = "//div[@class='status']")
    public WebElementFacade statusSuccess;

    @FindBy(xpath = "//div[contains(text(),'View Details')]")
    public WebElementFacade checkDetails;

    @FindBy(xpath = "//div[@class='body']/parent::div/preceding-sibling::div/span")
    public WebElementFacade popwindowsTitleTransferInformation;

    @FindBy(xpath = "//div[@class='body']//span[@class='dialog-footer']/div[2]//div[@class='btn_box']")
    public WebElementFacade continueButtonClick;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[2]/div[2]/div[2]/div[1]/div[1]/div[@class='con-content']")
    public WebElementFacade checkCollectionName;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[2]/div[2]/div[2]/div[1]/div[2]/div[@class='con-content']")
    public WebElementFacade checkPaymentAccount;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[3]/div[2]/div[2]/div[1]/div[1]/div[@class='con-content']")
    public WebElementFacade checkTransferAmount;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[3]/div[2]/div[2]/div[3]/div[2]/div[@class='con-content']")
    public WebElementFacade checkTradeAmountSelect;

    @FindBy(xpath = "//div[@class='detail_page-container']/following-sibling::div//div[@class='ui-button primary common']//div[@class='btn_box']")
    public WebElementFacade confirmBtn;

    @FindBy(xpath = "//div[@class='demo-tips']/div[4]//div[@class='btn_box']")
    public WebElementFacade confirmInformationNextBtn;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start' ]//table[@class='el-date-table']/tbody/tr/td[@class!='normal disabled'  and @class != 'prev-month' and @class != 'prev-month disabled' and @class !='next-month']//span")
    public List<WebElementFacade> rollOutDate;

    @FindBy(xpath = "//label[@for='appointmentDdate']/following-sibling::div//input")
    public WebElementFacade dateInputBox;

    @FindBy(xpath = "//div[@class='open_account_tips']//div[@class='title']")
    public WebElementFacade textTitle;

    @FindBy(xpath = "//label[@class=\"el-checkbox pd0\"]//span[@class='el-checkbox__inner']")
    public WebElementFacade cycleTransferCheckBox;

    @FindBy(xpath = "//button[@aria-label='下个月']")
    public WebElementFacade nextMonth;

    @FindBy(xpath = "//label[@for='contractPeriodTypObj']/following-sibling::div//i")
    public WebElementFacade popWindowsSelect;

    @FindBy(xpath = "//span[text()='Weekly']/parent::li/parent::ul/li")
    public List<WebElementFacade> selectDate;

    @FindBy(xpath = "//label[@for='contractPeriodTypObj']/parent::div/following-sibling::div[1]//input")
    public WebElementFacade appointmentPeriods;

    @FindBy(xpath = "//div[@class='result-info']")
    public WebElementFacade transferSuccessTitle;

    @FindBy(xpath = "//div[@class='result-container']/div[2]//div[@class='ui-button secondary common'][2]//div[@class='btn_box']")
    public WebElementFacade checkDetailsBtn;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-block'][2]//div[@class='el-col el-col-8'][1]/div[@class='con-content']")
    public WebElementFacade getAccountName;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-block'][2]//div[@class='el-col el-col-8'][2]/div[@class='con-content']")
    public WebElementFacade getAccountNumber;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-block'][3]//div[@class='el-row'][1]/div[@class='el-col el-col-8'][1]/div[@class='con-content']")
    public WebElementFacade getAccountMount;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-block'][3]//div[@class='el-row'][3]/div[@class='el-col el-col-8'][2]/div[@class='con-content']")
    public WebElementFacade getAccountUse;

    @FindBy(xpath = "//div[@class='el-dialog__wrapper has-icon-small']//div[@class='el-dialog__header']/span")
    public WebElementFacade getPopWindowsTitle;

    @FindBy(xpath = "//div[@class='el-dialog__wrapper has-icon-small']//div[@class='el-dialog__body']/div[2]//div[@class='ui-button dialog_btn primary common']//div[@class='btn_box']")
    public WebElementFacade continueBtn;

    @FindBy(xpath = "//label[@for='acctObj']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade clickPopupbtn;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//ul/li/span")
    public List<WebElementFacade> paymentInformationText;


//境外转账（SGD--USD)

   @FindBy(xpath = "//div[@class='list']/div[1]/p[4]//span")
    public WebElementFacade overseasTransfer;  //点击境外转账

   @FindBy(xpath = "//div[@class='el-form-item is-success is-required el-form-item--medium']/div//i[@class='el-select__caret el-input__icon el-icon-arrow-up']")
    public WebElementFacade accountBox; //点击账户选择下拉框

   @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li")
    public List<WebElementFacade> selectAccount;  //选择付款账户

    @FindBy(xpath = "//label[@for='currencyTypeCd']/following-sibling::div//i")
    public WebElementFacade clickCurrencyBox;  //点击币种下拉框

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span")
    public List<WebElementFacade>payeeCurrency; //选择付款币种

    @FindBy(xpath = "//div[@class='el-form-item is-success is-required el-form-item--medium']/following-sibling::div[3]//input")
    public WebElementFacade enterAmount; //输入金额 输入

    @FindBy(xpath = "//label[@for='tradeCurrencyTypeCd']/following-sibling::div//i")
    public WebElementFacade currencyBox; //汇币下拉框

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span")
    public List<WebElementFacade>selectAccBth; //选择收款币种

    @FindBy(xpath = "//label[@for='payeeAcctNo']/following-sibling::div//input")
    public WebElementFacade sendPaymentAccount;  //输入收款账户 输入

    @FindBy(xpath = "//label[@for='payeeNm']/following-sibling::div//input")
    public WebElementFacade NamePayee;  //收款人名称 输入

    @FindBy(xpath = "//label[@for='payeeBank']/following-sibling::div//input")
    public WebElementFacade selectBank;

    @FindBy(xpath = "//p[@class=\"searchBox\"]//input")
    public WebElementFacade searchBox;

    @FindBy(xpath = "//p[@class=\"searchBox\"]//div[@class='btn_box']")
    public WebElementFacade serachButton;

    @FindBy(xpath = "//label[@class=\"el-radio\"]")
    public WebElementFacade radioSelect;

    @FindBy(xpath = "//div[text()='Confirm']")
    public WebElementFacade getConfirmBtn;

    @FindBy(xpath = "//label[@for='payeeBank']/following-sibling::div//i")
    public WebElementFacade collectingBankBox;  //收款银行下拉框

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//li")
    public List<WebElementFacade> collectingBank;  //选择收款银行

    @FindBy(xpath = "//label[@for='payeeAddr']/following-sibling::div//input")
    public WebElementFacade payeeAdd;  //收款人地址 输入

    @FindBy(xpath = "//label[@for='payeeCountriesEnCd']/following-sibling::div//i")
    public WebElementFacade payeeCountriesEnCdBox;  //收款国家下拉框

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul//li")
    public List<WebElementFacade> payeeCountries; //美国

    @FindBy(xpath = "//div[@class='el-textarea el-input--medium']/textarea")
    public WebElementFacade remittancePostscriptContent;//汇款留言 输入

    @FindBy(xpath = "//label[@for='costFeeAssumeCd']/following-sibling::div//i")
    public WebElementFacade expenseBox; // 费用承担下拉框

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul//li")
    public List<WebElementFacade> expense; //费用承担

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul//li")
    public List<WebElementFacade> expenseEnglish; //费用承担

    @FindBy(xpath = "//label[@for='paymentAttributeCd']/following-sibling::div//i")
    public WebElementFacade paymentAttributeCdBox;  //付汇性质下拉框

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul//li")
    public List<WebElementFacade> selectPaymentAttributeCd;  //选择付汇性质

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade clickNextButton;

    @FindBy(xpath = "//div[text()='Send verification code']")
    public WebElementFacade clickSendVerificationBtn;

    @FindBy(xpath = "//div[contains(text(),'Please enter SMS verification code')]/following-sibling::div[1]/input")
    public WebElementFacade inputVerificationCode;

    @FindBy(xpath = "//div[contains(text(),'Please enter SMS verification code')]/following-sibling::div[4]//div[text()='OK']")
    public WebElementFacade clickOkBtn;

    @FindBy(xpath = "//div[@class='el-col el-col-18']/div[3]/div/div")
    public  WebElementFacade clickNextBox;  //下一步

    @FindBy(xpath = "//div[@class='ui-button dialog_btn primary common is-block']//div[@class='btn_box']")
    public WebElementFacade staging;  //暂存

    @FindBy(xpath = "//div[@class='el-col el-col-24']/div[2]//div[@class='btn_box']")
    public WebElementFacade selectSumB;

   @FindBy(xpath = "//div[@class='trade-status']//div[2]")
    public WebElementFacade BankProcess;  //提交状态为银行处理中

    @FindBy(xpath = "//div[@class='el-col el-col-17']/div[2]//div[@class='btn_box']")
    public WebElementFacade checkDetail;   //查看详情

    @FindBy(xpath = "//div[@class='detail_page-block'][1]//div[@class='el-col el-col-8'][3]//div[@class='con-content']")
    public WebElementFacade checkSelectAccount;  //付款

    @FindBy(xpath = "//div[@class='detail_page-block'][2]//div[@class='el-col el-col-8'][3]//div[@class='con-content']")
    public WebElementFacade checkSendPaymentAccount;//收款

//模板导入
    @FindBy(xpath = "//div[@class='el-col el-col-18']/div[1]//div[@class='btn_box']")
    public WebElementFacade saveTemplate; //保存至模板

    @FindBy(xpath = "//label[@for='templateNm']/following-sibling::div//input")
    public WebElementFacade templateName; //模板名称，参数提取

    @FindBy(xpath = "//label[@for='templateNm']/parent::div/following-sibling::div[2]//div[@class='btn_box']")
    public WebElementFacade save;

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr[1]/td[9]//img")
    public WebElementFacade theMenu;  //菜单

    @FindBy(xpath = "//div[@x-placement='bottom' or @x-placement='top']/div/div[2]//div[@class='btn_box']")
    public WebElementFacade templateImport;//从模板导入

    //贸易融资
    @FindBy(xpath = "//label[@for='transportMethod']/following-sibling::div//i")
    public WebElementFacade transportMethodBox;  //运输途径框

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//ul/li")
    public List<WebElementFacade> transportMethod;  //sea 运输途径

    @FindBy(xpath = "//label[@for='shipNm']/following-sibling::div//input")
    public WebElementFacade shipNm;  //船名

    @FindBy(xpath = "//label[@for='shipNo']/following-sibling::div//input")
    public WebElementFacade shipNo;  //船编号

    @FindBy(xpath = "//label[@for='shipmentAddr']/following-sibling::div//input")
    public WebElementFacade shipmentAddR; //装货港

    @FindBy(xpath = "//label[@for='trafficAddr']/following-sibling::div//input")
    public WebElementFacade trafficAddR;  //交货港

    @FindBy(xpath = "//label[@for='goodInvolved']/following-sibling::div//input")
    public WebElementFacade goodInvolved;  //涉及到的货物

    @FindBy(xpath = "//div[@class='out_title_level-1']/parent::div/div[9]//div[@class='box_left']/i")
    public WebElementFacade invoice; //上传发票

    @FindBy(xpath = "//div[@class='out_title_level-1']/parent::div/div[11]//div[@class='box_left']/i")
    public WebElementFacade billLading; //上传提货单

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\" ]//li[18]")
    public WebElementFacade SINGAPORE;

    @FindBy(xpath = "//div[@class='ui-button dialog_btn primary common']/div/div")
    public WebElementFacade begin;

    @FindBy(xpath = "//img[@class='status-img']")
    public WebElementFacade popTitle;
















}

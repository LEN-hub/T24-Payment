package com.glbank.com.sg.bdd.pages.T24.Payment;

import cn.hutool.setting.GroupedMap;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.glbank.com.sg.bdd.utils.FileUtils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.thucydides.core.webdriver.stubs.WebElementFacadeStub;

import java.security.cert.X509Certificate;
import java.util.List;

public class t24_Payments_page extends PageObject {

    @FindBy(xpath = "//title[contains(text(),'GLDB')]/parent::head/following-sibling::frameset/frame[2]")
    public WebElementFacade switchToSecondFrame;

    @FindBy(xpath = "//title[contains(text(),'GLDB')]/parent::head/following-sibling::frameset/frame[1]")
    public WebElementFacade switchToFirstFrame;

    @FindBy(xpath = "//frame[2]")
    public WebElementFacade switchToThirdFrame;

    @FindBy(xpath = "//frameset[1]//frameset[2]//frameset[2]//frame[2]")
    public WebElementFacade switchToFourFrame;

    @FindBy(id = "commandValue")
    public WebElementFacade inputBox;

    @FindBy(id = "cmdline_img")
    public WebElementFacade searchBtn;

    @FindBy(xpath = "//span[text()='User Menu']")
    public WebElementFacade clickUserMenu;

    @FindBy(xpath = "//span[text()='Products']")
    public WebElementFacade clickProducts;

    @FindBy(xpath = "//a[text()='Find Account ']")
    public WebElementFacade clickFindAccount;

    @FindBy(xpath = "//a[text()='Find Multi Currency ']")
    public WebElementFacade FindMultiCurrency;

    @FindBy(xpath = "//a[text()='Find Multi Currency ']")
    public WebElementFacade clickFindMCY;

    @FindBy(xpath = "//span[text()='Loan Transactions']")
    public WebElementFacade LoanTransactions;

    @FindBy(xpath = "//a[text()='AA Disbursement External ']")
    public WebElementFacade DisbursementExternal;

    @FindBy(xpath = "//a[text()='AA Disbursement (SGMEPS) ']")
    public WebElementFacade DisbursementSGMEPS;

    @FindBy(xpath = "//td[@id='dealtitle']/following-sibling::td[1]//td[6]/a")
    public WebElementFacade newDeal;

    @FindBy(id = "fieldName:DEBIT.ACCOUNT")
    public WebElementFacade DebitAccountNumber_SGMEPS;

    @FindBy(id = "fieldName:DEBIT.CCY")
    public WebElementFacade DebitCurrency_SGMEPS;

    @FindBy(id = "fieldName:PAYMENT.CURRENCY")
    public WebElementFacade PaymentCurrency_SGMEPS;

    @FindBy(id = "fieldName:PAYMENT.AMOUNT")
    public WebElementFacade PaymentAmount_SGMEPS;

    @FindBy(id = "fieldName:BENEFICIARY.ACCOUNT.NO")
    public WebElementFacade BeneficiaryAccountNo_SGMEPS;

    @FindBy(id = "fieldName:ACCT.WITH.BANK.BIC")
    public WebElementFacade BeneficiaryBankBIC_SGMEPS;

    @FindBy(id = "fieldName:BENEFICIARY.NAME")
    public WebElementFacade BeneficiaryName_SGMEPS;

    @FindBy(id = "fieldCaption:PAYMENT.ORDER.PRODUCT")
    public WebElementFacade PaymentOrderProductTitle;

    @FindBy(id = "fieldName:BENEFICIARY.STREET.NAME")
    public WebElementFacade BeneficiaryStreetName_SGMEPS;

    @FindBy(id = "fieldName:BENEFICIARY.POST.CODE")
    public WebElementFacade BeneficiaryPostCode_SGMEPS;

    @FindBy(id = "fieldName:BENEFICIARY.TOWN.NAME")
    public WebElementFacade BeneficiaryTownName_SGMEPS;

    @FindBy(id = "fieldName:BENEFICIARY.COUNTRY.CODE")
    public WebElementFacade BeneficiaryCountry_SGMEPS;

    @FindBy(id = "fieldName:BENEFICIARY.RESIDENCE.CTRY")
    public WebElementFacade BeneficiaryResidenceCountry_SGMEPS;

    @FindBy(id = "fieldCaption:BENEFICIARY.BIC")
    public WebElementFacade BeneficiaryBICTitle;

    @FindBy(xpath = "//span[text()='Loan Transactions']/following-sibling::ul/li[11]/a")
    public WebElementFacade AuthoriseArrangements;

    @FindBy(xpath = "//span[text()='Payments']")
    public WebElementFacade clickPayments;

    @FindBy(xpath = "//a[text()='Clear Selection']")
    public WebElementFacade clickCleraSelectionBtn;

    @FindBy(xpath = "//table[@id='selectiondisplay']/tbody/tr[1]//input[@type='text']")
    public WebElementFacade inputChannelId;

    @FindBy(xpath = "//td[@id='enqselfavs']/following-sibling::td//td[@width='1'][2]//td")
    public WebElementFacade clickFindBtn;

    @FindBy(xpath = "//div[@id='enquiryDataSizer']//td[8]")
    public WebElementFacade checkT24Status;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[1]")
    public WebElementFacade t24Id;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[4]")
    public WebElementFacade t24TransactionReference;

    @FindBy(xpath = "//span[text()='Payment Hub']")
    public WebElementFacade clickPaymentHubMenu;

    @FindBy(xpath = "//span[text()='Payment Inquiries and Exceptions']")
    public WebElementFacade clickPaymentInquiriesMenu;

    @FindBy(xpath = "//a[contains(text(),'Party wise')]")
    public WebElementFacade clickPaymentTransactionWiseMenu;

    @FindBy(xpath = "//a[contains(text(),'Transaction wise')]")
    public WebElementFacade TransactionWise;

    @FindBy(xpath = "//label[text()='Processing Date']/parent::span/parent::td/following-sibling::td[2]/input[1]")
    public WebElementFacade inputDate;

    @FindBy(xpath = "//label[text()='SendersReferenceIncoming']")
    public WebElementFacade findFileSendersReference;

    @FindBy(xpath = "//label[text()='SendersReferenceIncoming']/parent::span/parent::td/following-sibling::td[2]/input[1]")
    public WebElementFacade fileSendersReferenceInput;

    @FindBy(xpath = "//a[text()='Find']")
    public WebElementFacade getClickFindBtn;

    @FindBy(xpath = "//label[@for='fieldName:Status']/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getStatus;

    @FindBy(xpath = "//table[@id='datadisplay']//td[2]")
    public WebElementFacade getFtNumber;

    @FindBy(xpath = "//table[@id='datadisplay']//td[12]")
    public WebElementFacade checkStatus;

    @FindBy(xpath = "//a[@title='View']")
    public WebElementFacade clickViewIcon;

    @FindBy(xpath = "//a[text()='Transaction Reference Number']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getTransactionReferenceNum;

    @FindBy(xpath = "//a[@id='fieldCaption:SendersReferenceNumber']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getSenderReferenceNum;

    @FindBy(xpath = "//a[text()='Processing Date']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getProcessingDate;

    @FindBy(xpath = "//a[text()='Debit Value Date']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getDebitValueDate;

    @FindBy(xpath = "//a[text()='Credit Value Date']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getCreditValueDate;

    @FindBy(xpath = "//a[text()='Transaction Currency']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getTransactionCurrency;

    @FindBy(xpath = "//a[text()='Instructed Currency']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getInstructedCurrency;

    @FindBy(xpath = "//a[text()='Transaction Amount']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getTransactionAmount;

    @FindBy(xpath = "//a[text()='Instructed Amount']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getInstructedAmount;

    @FindBy(xpath = "//a[text()='Charge Option']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getChargeOption;

    @FindBy(xpath = "//a[text()='Debit Account Number']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getDebitAccountNum;

    @FindBy(xpath = "//a[text()='Credit Account Number']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getCreditAccountNum;

    @FindBy(xpath = "//a[text()='Debit Account Currency']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getDebitAccountCurrency;

    @FindBy(xpath = "//a[text()='Credit Account Currency']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getCreditAccountCurrency;

    @FindBy(xpath = "//a[text()='Debit Amount']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getDebitAmount;

    @FindBy(xpath = "//a[text()='Credit Amount']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getCreditAmount;

    @FindBy(xpath = "//a[text()='Debit Customer Rate']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getDebitCustomerRate;

    @FindBy(xpath = "//a[text()='Debit Treasury Rate']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getDebitTreasuryRate;

    @FindBy(xpath = "//a[text()='Ordering Account']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getOrderingAccount;

    @FindBy(xpath = "//a[text()='Beneficiary Account']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getBeneficiaryAccount;

    @FindBy(xpath = "//a[text()='Ordering Name']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getOrderingName;

    @FindBy(xpath = "//a[text()='Beneficiary Name']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getBeneficiaryName;

    @FindBy(xpath = "//a[text()='Ordering Address']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getOrderingAddress;

    @FindBy(xpath = "//a[text()='Beneficiary Address']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getBeneficiaryAddress;

    @FindBy(xpath = "//a[text()='Ordering Town/PostalC - 2']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getOrderingTown;

    @FindBy(xpath = "//span[text()='Charge Information']")
//    @FindBy(xpath = "//span[text()='Charge Info']")
    public WebElementFacade getClickChargeInformation;

    @FindBy(xpath = "//span[text()='Routing Information']")
    public WebElementFacade getRoutingInformation;

    @FindBy(xpath = "//span[text()='Additional Information']")
    public WebElementFacade getAdditionalInformation;

    @FindBy(xpath = "//img[@title='ViewinDetail']")
    public WebElementFacade getClickViewDetail;

    @FindBy(xpath = "//td[text()='Options']/following-sibling::td//select")
    public WebElementFacade clickInBox;

    @FindBy(xpath = "//option[text()='Accounting Entries']")
    public WebElementFacade selectAccountingEntries;

    @FindBy(xpath = "//option[text()='Outgoing Message']")
    public WebElementFacade selectOutgoingMessage;

    @FindBy(xpath = "//option[text()='Fees Applied']")
    public WebElementFacade selectFeesApplied;

    @FindBy(xpath = "//td[text()='Not Applicable']")
    public WebElementFacade notApplicableView;

    @FindBy(xpath = "//img[@alt='Select Drilldown']")
    public WebElementFacade clickSelectDrilldown;

    @FindBy(xpath = "//table[@class='enquirydata enquirydata_PAYFEE']//td[7]")
    public WebElementFacade getAmount;

    @FindBy(xpath = "//table[@class='enquirydata enquirydata_PAYFEE']//td[5]")
    public WebElementFacade getFeeAmt;

    @FindBy(xpath = "//table[@id='datadisplay']")
    public WebElementFacade outgoingMessage;

    @FindBy(xpath = "//td[contains(text(),':20:')]")
    public WebElementFacade check20Field;

    @FindBy(xpath = "//td[contains(text(),':32A:')]")
    public WebElementFacade check32AField;

    @FindBy(xpath = "//td[contains(text(),':33B:')]")
    public WebElementFacade check33BField;

    @FindBy(xpath = "//td[contains(text(),':36:')]")
    public WebElementFacade check36Field;

    @FindBy(xpath = "//td[contains(text(),':50K:')]")
    public WebElementFacade check50KField;

    @FindBy(xpath = "//tr[@id='r8']/td[6]")
    public WebElementFacade check50KSecondField;

    @FindBy(xpath = "//tr[@id='r10']/td[6]")
    public WebElementFacade check50KFourField;

    @FindBy(xpath = "//td[contains(text(),':53B:')]")
    public WebElementFacade check53BField;

    @FindBy(xpath = "//td[contains(text(),':57A:')]]")
    public WebElementFacade check57AField;

    @FindBy(xpath = "//td[contains(text(),':59:')]")
    public WebElementFacade check59Field;

    @FindBy(xpath = "//tr[@id='r14']/td[6]")
    public WebElementFacade check59SecondField;

    @FindBy(xpath = "//tr[@id='r15']/td[6]")
    public WebElementFacade check59ThreeField;

    @FindBy(xpath = "//td[contains(text(),'71A')]")
    public WebElementFacade check71AField;

    @FindBy(xpath = "//table[@id='datadisplay']//tr[@id='r1']/td[1]")
    public WebElementFacade companyId;

    @FindBy(xpath = "//table[@id='datadisplay']//tr[@id='r1']/td[2]")
    public WebElementFacade getGetFtNumber;

    @FindBy(xpath = "//table[@id='datadisplay']//tr[@id='r1']/td[3]")
    public WebElementFacade sendRef;

    @FindBy(xpath = "//table[@id='datadisplay']//tr[@id='r1']/td[4]")
    public WebElementFacade sendDateTime;

    @FindBy(xpath = "//td[text()='MT103STP']")
    public WebElementFacade mtMsgType;

    @FindBy(xpath = "//td[text()='pacs.008']")
    public WebElementFacade msgType;

    @FindBy(xpath = "//table[@id='datadisplay']//tr[@id='r1']/td[6]")
    public WebElementFacade msgContent;

    @FindBy(xpath = "//table[@id='datadisplay']//tr[@id='r35']/td[6]")
    public WebElementFacade msgContent35;

    @FindBy(xpath = "//table[@id='datadisplay']//tr[@id='r70']/td[6]")
    public WebElementFacade msgContent70;

    @FindBy(xpath = "//img[@title='Next Page']")
    public WebElementFacade clickNextPage;

    @FindBy(xpath = "//table[@id='datadisplay']//tr")
    public List<WebElementFacade> trList;

    @FindBy(xpath = "//img[@title='Selection Criteria']")
    public WebElementFacade forexSearchBtn;

    @FindBy(xpath = "//label[text()='L.TRAN.REF']")
    public WebElementFacade findLTranRef;

    @FindBy(xpath = "//label[text()='L.TRAN.REF']/parent::span/parent::td/following-sibling::td[2]/input[1]")
    public WebElementFacade findLTranRefInputBox;

    @FindBy(xpath = "//table[@id='datadisplay']//td[1]//img")
    public WebElementFacade clickForexDefaultListIcon;

    @FindBy(xpath = "//span[text()='No data to display']")
    public WebElementFacade forexPageNoData;

    @FindBy(xpath = "//span[text()='Treasury']")
    public WebElementFacade clickTreasuryMenu;

    @FindBy(xpath = "//span[text()='Treasury']/following-sibling::ul//span[text()='Forex']")
    public WebElementFacade clickForexMenu;

    @FindBy(xpath = "//a[text()='Unauthorized Forex Deals ']")
    public WebElementFacade clickUnauthorizedForexDealsMenu;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[7]")
    public List<WebElementFacade> AmountBought;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[1]//img")
    public List<WebElementFacade> detailInformation;

    @FindBy(xpath = "//table[@class='enqfooter']/following-sibling::div//tr//span/following-sibling::span")
    public List<WebElementFacade> sumPage;

    @FindBy(xpath = "//a[@title='Next Page']/img")
    public WebElementFacade getClickNextPage;

    @FindBy(xpath = "//img[@title='Amend']")
    public List<WebElementFacade> amendBtn;

    @FindBy(xpath = "//img[@title='Authorise']")
    public List<WebElementFacade> authoriseBtn;

    @FindBy(xpath = "//img[@title='Validate a deal']")
    public WebElementFacade validateDeal;

    @FindBy(xpath = "//img[@title='Commit the deal']")
    public WebElementFacade commitTheDeal;

    @FindBy(xpath = "//span[text()=\"Counterparty's SSI.1\"]")
    public WebElementFacade clickErrorMessage;

    @FindBy(xpath = "//label[@for=\"fieldName:CPARTY.CORR.NO:1\"]/parent::td/following-sibling::td[2]/a[1]/img")
    public WebElementFacade clickDownBox;

    @FindBy(xpath = "//tr[@id='rowHeader']/following-sibling::tr[1]")
    public WebElementFacade selectData;

    @FindBy(xpath = "//a[text()='Accept Overrides']")
    public WebElementFacade clickAcceptOverrides;

    @FindBy(xpath = "//img[@title='Authorises a deal']")
    public WebElementFacade clickAuthorisesADeal;

    @FindBy(xpath = "//table[@id='datadisplay']//tr//img")
    public WebElementFacade searchIcon;

    @FindBy(xpath = "//a[text()='Dept Code']")
    public WebElementFacade deptCode;

    @FindBy(xpath = "//a[text()='Currency Bought']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade currencyBought;

    @FindBy(xpath = "//a[text()='Amount Bought']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade amountBought;

    @FindBy(xpath = "//a[text()='Currency Sold']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade currencySold;

    @FindBy(xpath = "//a[text()='Amount Sold']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade amountSold;

    @FindBy(xpath = "//a[text()='Spot Rate']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade spotRate;

    @FindBy(xpath = "//a[text()='Spot Lcy Amount']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade spotLcyAmount;

    @FindBy(xpath = "//a[text()='Our Account Rec.1']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade ourAccountRec;

    @FindBy(xpath = "//a[text()='Our Account Pay.1']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade ourAccountPay;

    @FindBy(xpath = "//a[text()='Treasury Rate']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade treasuryRate;

    @FindBy(xpath = "//a[text()='L Tran Ref']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade lTranRef;

    @FindBy(xpath = "//td[@title='FUNDS.TRANSFER']/following-sibling::td//input[@id='transactionId']")
    public WebElementFacade clickFundsTransfer;

    @FindBy(xpath = "//img[@title='View a contract']")
    public WebElementFacade clickViewContractBtn;

    @FindBy(xpath = "//a[text()='Debit Acct No']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade fundsTransferDebitAccountNum;

    @FindBy(xpath = "//a[text()='Debit Currency']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade fundsTransferDebitCurrency;

    @FindBy(xpath = "//a[text()='Credit Acct No']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade fundTransferCreditAccNo;

    @FindBy(xpath = "//a[text()='Debit Charge Amount.1']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getDebitChargeAmount;

    @FindBy(xpath = "//a[text()='Credit Charge Amount.1']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getCreditChargeAmount;

    @FindBy(xpath = "//a[text()='Credit Currency']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade fundsTransferCreditCurrency;

    @FindBy(xpath = "//a[text()='Credit Amount']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade fundsTransferCreditAmount;

    @FindBy(xpath = "//a[text()='Amount Debited']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade fundsTransferAmountDebited;

    @FindBy(xpath = "//a[text()='Amount Credited']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade fundsTransferAmoyntCredited;

    @FindBy(xpath = "//label[text()='Arrangement']/parent::span/parent::td/following-sibling::td[2]/input[1]")
    public WebElementFacade inputArrangement;

    @FindBy(xpath = "//img[@title='Overview']")
    public WebElementFacade clickOverViewBtn;

    @FindBy(xpath = "//table[@summary=\"Recent Transactions\"]//div[2]//tr[2]/td[8]")
    public WebElementFacade getMinuend;

    @FindBy(xpath = "//table[@summary=\"Recent Transactions\"]//div[2]//tr[2]/td[6]")
    public WebElementFacade subtract;

    @FindBy(xpath = "//table[@summary=\"Recent Transactions\"]//div[2]//tr[1]/td[6]")
    public WebElementFacade firstDebitAmount;

    @FindBy(xpath = "//table[@summary=\"Recent Transactions\"]//div[2]//tr[2]/td[7]")
    public WebElementFacade creditAmount;

    @FindBy(xpath = "//table[@summary=\"Recent Transactions\"]//div[2]//tr[1]/td[7]")
    public WebElementFacade firstCreditAmount;

    @FindBy(xpath = "//table[@summary=\"Recent Transactions\"]//div[2]//tr[1]/td[8]")
    public WebElementFacade getDifference;

    @FindBy(xpath = "//span[text()='Admin Menu']")
    public WebElementFacade clickAdminMenu;

    @FindBy(xpath = "//div[@id='pane_']/ul[2]//span[text()='Payments']")
    public WebElementFacade clickPaymentsBtn;

    @FindBy(xpath = "//a[text()='Payment Order RFQ Rate Audit ']")
    public WebElementFacade clickPaymentOrderRFQRateAuditMenu;

    @FindBy(xpath = "//td[@id='dealtitle']/following-sibling::td[1]//input[@id='transactionId']")
    public WebElementFacade sendTransactionID;

    @FindBy(xpath = "//a[@title='View a contract']")
    public WebElementFacade clickSearchBtn;

    @FindBy(xpath = "//label[@for='fieldName:PRICE']/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getPriceRate;

    @FindBy(xpath = "//span[text()='Debit Credit Info']")
    public WebElementFacade clickdebitCreditInfoMenu;

    @FindBy(xpath = "//td[text()='SGD']/following-sibling::td[6]//img[@title='Overview']")
    public WebElementFacade clickMultiCurrencySGDOverview;

    @FindBy(xpath = "//td[text()='USD']/following-sibling::td[6]//img[@title='Overview']")
    public WebElementFacade getClickMultiCurrencyUSDOverview;

//    CUSTOMER页面输入T24ID
    @FindBy(xpath = "//div[@id='toolBar']//input[@id='transactionId']")
    public WebElementFacade customerIdInput;

//    CUSTOMER页面查询T24ID按钮
    @FindBy(xpath = "//img[@alt='View a contract']")
    public WebElementFacade selectT24ID;

    //CUSTOMER详情页面 customer type状态
    @FindBy(xpath = "//label[@for='fieldName:CUSTOMER.TYPE']/parent::td/following-sibling::td[2]/span")
    public WebElementFacade customerType;

    @FindBy(xpath = "//a[text()='Find Customer ']")
    public WebElementFacade FindCustomer;

    @FindBy(xpath = "//label[text()='Customer ID']/parent::span/parent::td/following-sibling::td[2]/input[1]")
    public WebElementFacade CustomerIDInput;

    @FindBy(xpath = "//a[text()='Find']")
    public WebElementFacade FindBtn;

    @FindBy(xpath = "//a[@title='Single Customer View']")
    public WebElementFacade viewCustomer;

    @FindBy(xpath = "//span[text()='Loans']")
    public WebElementFacade loansBtn;

    @FindBy(xpath = "//a[@title='Select Drilldown']")
    public WebElementFacade SelectDrilldown;

    @FindBy(xpath = "//td[text()='Amount']/following-sibling::td[1]")
    public List<WebElementFacade> LoanAmount;

    @FindBy(xpath = "//table[@summary='Arrangement Search']/tbody/tr[2]/td[2]/div[2]/div/table[1]/tbody/tr[1]/td[1]")
    public WebElementFacade AccountID;

    @FindBy(xpath = "//table[@summary='Lending closed Arrangements']/tbody/tr[2]/td[2]/div[2]/div/table[1]/tbody/tr[1]/td[1]")
    public WebElementFacade repaymentID;

    @FindBy(xpath = "//span[text()='Initiate ISO Payment Transfer']")
    public WebElementFacade ISOPaymentTransfer;

    @FindBy(xpath = "//span[text()='Initiate ISO Payment Transfer']/following-sibling::ul/li[2]/a")
    public WebElementFacade OutgoingIsoCustomerTransfer;

    @FindBy(xpath = "//span[text()='Initiate ISO Payment Transfer']/following-sibling::ul/li[4]/a")
    public WebElementFacade OutgoingIsoBankTransfer;

    @FindBy(xpath = "//span[text()='Payment Hub']/following-sibling::ul/li[2]/a")
    public WebElementFacade OutgoingCustomerTransfer;

    @FindBy(xpath = "//label[@for='fieldName:ReceiverInstitutionBIC']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade InstructedAgentBic;

    @FindBy(xpath = "//label[@for='fieldName:TransactionCurrency']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade TransactionCurrency;

    @FindBy(xpath = "//label[@for='fieldName:TransactionAmount']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade TransactionAmount;

    @FindBy(xpath = "//label[@for='fieldName:DebitAccountNumber']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade DebitAccountNumber;

    @FindBy(id = "fieldName:BeneficiaryAddress1")
    public WebElementFacade BeneficiaryAddress;

    @FindBy(id = "fieldName:BeneficiaryAddress2")
    public WebElementFacade BeneficiaryAddressTwo;

    @FindBy(id = "fieldName:DEBIT.ACCOUNT")
    public WebElementFacade InternalDebitAccountNumber;

    @FindBy(xpath = "//input[@id='fieldName:DEBIT.CCY']")
    public WebElementFacade DebitCurrency;

    @FindBy(xpath = "//input[@id='fieldName:PAYMENT.AMOUNT']")
    public WebElementFacade PaymentAmount;

    @FindBy(xpath = "//input[@id='fieldName:PAYMENT.CURRENCY']")
    public WebElementFacade PaymentCurrency;

    @FindBy(xpath = "//label[@for='fieldName:DebitAccountCurrency']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade DebitAccountCurrency;

    @FindBy(xpath = "//label[@for='fieldName:BeneficiaryAccount']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CreditorAccount;

    @FindBy(id = "fieldName:CREDIT.ACCOUNT")
    public WebElementFacade InternalCreditorAccount;

    @FindBy(xpath = "//label[@for='fieldName:BeneficiaryName']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CreditorName;

    @FindBy(id = "fieldName:ChargeOption")
    public WebElementFacade ChargeOption;

    @FindBy(xpath = "//label[@for='fieldName:SendersReferenceNumber']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade SenderReference;

    @FindBy(xpath = "//label[@for='fieldName:RelatedReference']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade EndToEndIdentification;

    @FindBy(xpath = "//label[@for='fieldName:BeneficiaryIdentifierCode']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CreditorBic;

    @FindBy(xpath = "//label[@for='fieldName:CreditorStreetName']/parent::td/following-sibling::td[2]//input")
    public WebElementFacade StreetName;

    @FindBy(xpath = "//label[@for='fieldName:BeneficiaryTownName']/parent::td/following-sibling::td[2]//input")
    public WebElementFacade TownName;

    @FindBy(xpath = "//label[@for='fieldName:BeneficiaryCountry']/parent::td/following-sibling::td[2]//input")
    public WebElementFacade CreditorCountry;

    @FindBy(xpath = "//a[@title='Validate a deal']/parent::td")
    public WebElementFacade preSubmit;

    @FindBy(xpath = "//a[@title='Commit the deal']/parent::td")
    public WebElementFacade Commit;

    @FindBy(id = "CheckBox:fieldName:WaiveCreditCharges")
    public WebElementFacade WaiveCreditCharges;

    @FindBy(id = "CheckBox:fieldName:DebitRepairFee")
    public WebElementFacade RepairFee;

    @FindBy(xpath = "//a[text()='Pending Authorise Payments ']")
    public WebElementFacade PendingAuthorisePayments;

    @FindBy(xpath = "//a[@TITLE='Selection Screen']")
    public WebElementFacade selectScreen;

    @FindBy(xpath = "//label[text()='Debit Acc Number']/parent::span/parent::td/following-sibling::td[2]//input[1]")
    public WebElementFacade inputDebitAccNumber;

    @FindBy(xpath = "//label[text()='@ID']/parent::span/parent::td/following-sibling::td[2]//input[1]")
    public WebElementFacade inputOENumber;

    @FindBy(xpath = "//label[text()='FTNumber']/parent::span/parent::td/following-sibling::td[2]//input[1]")
    public WebElementFacade inputFTNumber;

    @FindBy(xpath = "//label[text()='FileSendersReference']/parent::span/parent::td/following-sibling::td[2]//input[1]")
    public WebElementFacade inputFileSendersReference;

    @FindBy(xpath = "//a[text()='Find']")
    public WebElementFacade Find;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[14]")
    public WebElementFacade statusCode;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[18]")
    public WebElementFacade View;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[19]")
    public WebElementFacade ViewDetails;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[10]/a")
    public WebElementFacade Auth;

    @FindBy(xpath = "//table[@id='goButton']//a[@title='Authorises a deal']/parent::td")
    public WebElementFacade AuthorisesADeal;

    @FindBy(xpath = "//a[text()='Balance Reservation']/parent::label")
    public WebElementFacade BalanceReservation;

    @FindBy(id = "fieldCaption:ReceiverInstitutionBIC")
    public WebElementFacade SGMEPSTitle;

    @FindBy(xpath = "//span[text()='Debit/Credit Info']")
    public WebElementFacade CreditInfo;

    @FindBy(xpath = "//td[@id='dealtitle']/following-sibling::td[1]//span")
    public WebElementFacade OENumber;


    @FindBy(xpath = "//span[text()='Charge Information']")
    public WebElementFacade ChargeInformation;

    @FindBy(xpath = "//span[text()='Routing Information']")
    public WebElementFacade Routingformation;

    @FindBy(xpath = "//span[text()='Additional Info']")
    public WebElementFacade AdditionalInfo;

    @FindBy(xpath = "//a//span[text()='Additional Information']")
    public WebElementFacade AdditionalInfoUSD;

    @FindBy(xpath = "//a//span[text()='Error Information']")
    public WebElementFacade ErrorInformation;

    @FindBy(xpath = "//a//span[text()='Extended Debtor Info']")
    public WebElementFacade ExtendedDebtorInfo;

    @FindBy(xpath = "//a//span[text()='Extended Creditor Info']")
    public WebElementFacade ExtendedCreditorInfo;

    @FindBy(xpath = "//a//span[text()='Ultimate Debtor Info']")
    public WebElementFacade UltimateDebtorInfo;

    @FindBy(xpath = "//a//span[text()='Ultimate Creditor Info']")
    public WebElementFacade UltimateCreditorInfo;

    @FindBy(xpath = "//a//span[text()='Regulatory Reporting']")
    public WebElementFacade RegulatoryReporting;

    @FindBy(xpath = "//a//span[text()='Structured Remittance Info']")
    public WebElementFacade StructuredRemittanceInfo;

    @FindBy(xpath = "//a//span[text()='Prev Instr Agents']")
    public WebElementFacade PrevInstrAgents;

    @FindBy(xpath = "//table[@id='datadisplay']//tr/td[2]")
    public WebElementFacade getFTNumber;

    @FindBy(xpath = "//a[text()='Pending Repair Payments ']")
    public WebElementFacade PendingRepairPayments;

    @FindBy(xpath = "//a[@title='Modify']")
    public WebElementFacade Modify;

    @FindBy(xpath = "//a//span[text()='Changed Fields']")
    public WebElementFacade ChangedFields;

    @FindBy(xpath = "//a//span[text()='Audit']")
    public WebElementFacade Audit;

    @FindBy(xpath = "//table[@id='datadisplay']//select")
    public WebElementFacade selectOptions;

    @FindBy(xpath = "//option[text()='Accounting Entries']")
    public WebElementFacade AccountingEntries;

    @FindBy(xpath = "//option[text()='Outgoing Message']")
    public WebElementFacade OutgoingMessage;

    @FindBy(xpath = "//option[text()='Audit trail']")
    public WebElementFacade AuditTrail;

    @FindBy(xpath = "//option[text()='Received Message']")
    public WebElementFacade ReceivedMessage;

    @FindBy(xpath = "//option[text()='Posting Lines']")
    public WebElementFacade PostingLines;

    @FindBy(xpath = "//option[text()='Fees Applied']")
    public WebElementFacade FeesApplied;

    @FindBy(xpath = "//a[@class='iconLink']/parent::td")
    public WebElementFacade iconLink;

    @FindBy(xpath = "//th[@id='columnHeaderText6']/ancestor::div[@id='enquiryHeadingScroller']/following-sibling::div//tr//td[6]")
    public List<WebElementFacade> xmlText;

    @FindBy(xpath = "//img[@title='Next Page']//parent::a/parent::td")
    public WebElementFacade xmlNext;

//    Loan Disbursement External页面的字段

    @FindBy(xpath = "//label[@for='fieldName:DEBIT.ACCOUNT']/parent::td/following-sibling::td[2]//input")
    public WebElementFacade DebitAccountNumberLoan;

    @FindBy(id = "fieldName:DEBIT.CCY")
    public WebElementFacade LoanDebitCurrency;

    @FindBy(id = "fieldName:PAYMENT.CURRENCY")
    public WebElementFacade LoanPaymentCurrency;

    @FindBy(id = "fieldName:PAYMENT.AMOUNT")
    public WebElementFacade LoanPaymentAmount;

    @FindBy(id = "fieldName:BENEFICIARY.COUNTRY.CODE")
    public WebElementFacade LoanBeneficiaryCountryCode;

    @FindBy(id = "fieldName:BENEFICIARY.ACCOUNT.NO")
    public WebElementFacade BeneficiaryAccountNo;

    @FindBy(id = "fieldName:BENEFICIARY.NAME")
    public WebElementFacade BeneficiaryName;

    @FindBy(xpath = "//span[text()='Routing Details']/parent::a")
    public WebElementFacade LoanRoutingDetails;

    @FindBy(xpath = "//span[text()='Creditor Agent Details']/parent::td/parent::tr/following-sibling::tr[2]//input")
    public WebElementFacade inputLoanAccountWithBankBIC;

    @FindBy(xpath = "//span[text()='Creditor Agent Details']/parent::td/parent::tr/following-sibling::tr[10]//input")
    public WebElementFacade inputLoanAccountWithTownName;

    @FindBy(xpath = "//span[text()='Creditor Agent Details']/parent::td/parent::tr/following-sibling::tr[11]//input")
    public WebElementFacade inputLoanAccountWithBankCountry;

    @FindBy(xpath = "//span[text()='Loan Transactions']")
    public WebElementFacade clickLoanTransactions;

    @FindBy(xpath = "//a[text()='AA Disbursement Internal ']")
    public WebElementFacade clickDisbursementInternal;

    @FindBy(xpath = "//input[@id='value:1:1:1']")
    public WebElementFacade InputArrangement;

    @FindBy(xpath = "//a[@title='Run Selection']")
    public WebElementFacade clickFindButt1;

    @FindBy(xpath = "//a[@title='Overview']")
    public WebElementFacade clickFindButt2;

    @FindBy(xpath = "//td[text()='USD']/following-sibling::td[6]/a")
    public WebElementFacade USDOverView;

    @FindBy(xpath = "//td[text()='SGD']/following-sibling::td[6]/a")
    public WebElementFacade SGDOverView;

    @FindBy(xpath = "//a[text()='Order Entry Outgoing ISO Transfer (CTR)']")
    public WebElementFacade OutgoingISOTransferTitle;

    @FindBy(xpath = "//td[@class='message']")
    public WebElementFacade message;

    @FindBy(xpath = "//td[@id='dealtitle']/a")
    public WebElementFacade ViewPageTitle;

    @FindBy(xpath = "//td[@id='dealtitle']/a")
    public WebElementFacade LoanViewPageTitle;

    @FindBy(xpath = "//td[text()='Options']")
    public WebElementFacade ViewDetailsPageTitle;

    @FindBy(xpath = "//a[text()='AA Loan Disbursement External']")
    public WebElementFacade LoanDisbursementTitle;

    @FindBy(xpath = "//td[text()='Account Details']")
    public WebElementFacade AccountDetailsTitle;

    @FindBy(xpath = "//span[text()='Audit']")
    public WebElementFacade getAudit;

    @FindBy(xpath = "//a[text()='Account Transfer ']")
    public WebElementFacade clickAccountTransfer;

    @FindBy(xpath = "//input[@name='fieldName:DEBIT.ACCT.NO']")
    public WebElementFacade debit_account;

    @FindBy(xpath = "//input[@name='fieldName:DEBIT.AMOUNT']")
    public WebElementFacade debit_amount;

    @FindBy(xpath = "//input[@name='fieldName:DEBIT.CURRENCY']")
    public WebElementFacade debit_currency;

    @FindBy(xpath = "//input[@name='fieldName:CREDIT.ACCT.NO']")
    public WebElementFacade credit_account;

    @FindBy(xpath = "//input[@name='fieldName:CREDIT.CURRENCY']")
    public WebElementFacade credit_currency;

    @FindBy(xpath = "//input[@name='fieldName:ORDERING.BANK:1']")
    public WebElementFacade ordering_bank;

    @FindBy(xpath = "//a[text()='Authorise/Delete FT transactions ']")
    public WebElementFacade clickAuthoriseDeleteFTTransactions;

    @FindBy(xpath = "//a[@title='Selection Screen']")
    public WebElementFacade clickSerchBut;

    @FindBy(xpath = "//input[@name='value:2:1:1']")
    public WebElementFacade credit_account_no;

    @FindBy(xpath = "//a[@title='Run Selection']")
    public WebElementFacade clicFind;

    @FindBy(xpath = "//a[@title='Authorise']")
    public WebElementFacade clickAuthorizeBut1;

    @FindBy(xpath = "//a[@title='Authorises a deal']")
    public WebElementFacade clickAuthorizeBut2;

    @FindBy(xpath = "//span[text()='Risk Management']")
    public WebElementFacade ClickRiskManagement;

    @FindBy(xpath = "//span[text()='Limits']")
    public WebElementFacade clickLimits;

    @FindBy(xpath = "//span[text()='Limit Menu']")
    public WebElementFacade ClickLimitMenu;

    @FindBy(xpath = "//a[text()='Create Unsecured Limit ']")
    public WebElementFacade ClickCreateUnsecuredLimit;

    @FindBy(xpath = "//a[@title='New Deal']")
    public WebElementFacade ClickNewDeal;

    @FindBy(xpath = "//input[@name='fieldName:CUSTOMER.NUMBER:1']")
    public WebElementFacade customer_number;

    @FindBy(xpath = "//input[@name='fieldName:LIMIT.PRODUCT']")
    public WebElementFacade limit_product;

    @FindBy(xpath = "//input[@name='fieldName:SERIAL.NUMBER']")
    public WebElementFacade serial_no;

    @FindBy(xpath = "//input[@name='fieldName:LIMIT.CURRENCY']")
    public WebElementFacade currency;

    @FindBy(xpath = "//input[@name='fieldName:INTERNAL.AMOUNT']")
    public WebElementFacade internal_amount;

    @FindBy(xpath = "//input[@value='Y']")
    public WebElementFacade AvailableMarker;

    @FindBy(xpath = "//a//span[text()='Other Details']")
    public WebElementFacade ClickOtherDetails;

   @FindBy(xpath = "//input[@name='fieldName:ALLOWED.CCY:1']")
    public WebElementFacade AllowedCcy;

    @FindBy(xpath = "//input[@id='fieldName:L.INT.TYPE']/following-sibling::table//tr/td[2]/input")
    public WebElementFacade Loan_Interest_Type;

   @FindBy(xpath = "//input[@name='fieldName:L.ACT.RATE']")
    public WebElementFacade loan_interest_rate;

    @FindBy(xpath = "//input[@name='fieldName:L.TENOR']")
    public WebElementFacade loan_tenor;

    @FindBy(xpath = "//input[@name='fieldName:L.SETTLE.ACC']")
    public WebElementFacade settlement_account;

    @FindBy(xpath = "//td[2]//input[@name='radio:tab5:L.TENOR.UNIT']")
    public WebElementFacade Loan_Tenor_Unit;

    @FindBy(xpath = "//a//span[text()='Loan Details']")
    public WebElementFacade LoanDetails;

    @FindBy(xpath ="//a[text()='Authorise/Delete/Reject Limit ']" )
    public WebElementFacade ClickAuthoriseDeleteRejectLimit;

    @FindBy(xpath ="//span[@tabindex]" )
    public WebElementFacade LimitID;

    @FindBy(xpath ="//span[@id='disabled_ARRANGEMENT']" )
    public WebElementFacade Arrangement;

    @FindBy(xpath = "//input[@name='value:1:1:1']")
    public WebElementFacade Limit_ID;

    @FindBy(xpath = "//a[text()='Product Catalog ']")
    public WebElementFacade ClickProductCatalog;

    @FindBy(xpath = "//img[@id='treestop6']")
    public WebElementFacade ClickLending;

    @FindBy(xpath = "//td[text()='Syndicated Loans']/following-sibling::td[2]/a")
    public WebElementFacade ClickSyndicatedLoans;

    @FindBy(xpath = "//img[@title='New Arrangement']")
    public WebElementFacade ClickNewArrangement;

    @FindBy(xpath = "//input[@name='fieldName:CUSTOMER:1']")
    public WebElementFacade customer;

    @FindBy(xpath = "//input[@name='fieldName:CURRENCY']")
    public WebElementFacade currency1;

    @FindBy(xpath = "//input[@name='fieldName:LIMIT']")
    public WebElementFacade InputLimit;

    @FindBy(xpath = "//input[@name='fieldName:AMOUNT']")
    public WebElementFacade amount1;

    @FindBy(xpath = "//input[@name='fieldName:TERM']")
    public WebElementFacade term;

    @FindBy(xpath = "//input[@name='fieldName:MATURITY.DATE']")
    public WebElementFacade maturity_date;

    @FindBy(xpath = "//input[@name='fieldName:FIXED.RATE:1'][1]")
    public WebElementFacade Fixed;

    @FindBy(xpath = "//input[@name='fieldName:LINKED.ARRANGEMENT'][1]")
    public WebElementFacade LinkedArrangement;

    @FindBy(xpath = "//a//span[text()='CCY Reference'][1]")
    public WebElementFacade CCYReference;

    @FindBy(xpath = "//input[@name='fieldName:CUSTOM.TYPE:1'][1]")
    public WebElementFacade currency2;

    @FindBy(xpath = "//input[@name='fieldName:CUSTOM.NAME:1'][1]")
    public WebElementFacade fixedFloating;

    @FindBy(xpath = "//input[@name='fieldName:CUSTOM.VALUE:1'][1]")
    public WebElementFacade rateIndex;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[4]/td[3]/input")
    public WebElementFacade LinkedArrangement2;

    @FindBy(xpath = "//select[@id='fieldName:PAYIN.SETTLEMENT:1']")
    public WebElementFacade Active1;

    @FindBy(xpath = "/html/body/div[5]/fieldset[20]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[8]/td[2]/select")
    public WebElementFacade Active2;

    @FindBy(xpath = "//input[@id='fieldName:PAYIN.ACCOUNT:1:1']")
    public WebElementFacade settlement1;

    @FindBy(xpath = "/html/body/div[5]/fieldset[20]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[8]/td[5]/input")
    public WebElementFacade settlement2;

    @FindBy(xpath = "//a[text()='Unauthorized AAA records ']")
    public WebElementFacade ClickUnauthorizedAAARecords;

    @FindBy(xpath = "//img[@alt='Select Drilldown']")
    public WebElementFacade clickAuthorizeBut3;

    @FindBy(xpath = "//span[@class='iddisplay iddisplay_AAARRANGEMENTACTIVITY iddisplay_AAARRANGEMENTACTIVITY_AANEW']")
    public WebElementFacade Active;

    @FindBy(xpath = "//select[@name='fieldName:MARGIN.OPER:1:1']")
    public WebElementFacade Add;

    @FindBy(xpath = "//select[@name='fieldName:MARGIN.TYPE:1:1']")
    public WebElementFacade single;

    @FindBy(xpath = "//input[@name='fieldName:MARGIN.RATE:1:1']")
    public WebElementFacade MinMaxRate;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[10]/select")
    public WebElementFacade spread;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[14]/select")
    public WebElementFacade Add2;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[16]/select/option[4]")
    public WebElementFacade single2;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[4]/td[7]/input")
    public WebElementFacade LinkedProperty;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[18]/input")
    public WebElementFacade MinMaxRate2;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[2]/td/table/tbody/tr/td[5]/a/span")
    public WebElementFacade CCYReference2;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[5]/tbody/tr[2]/td[3]/input")
    public WebElementFacade Currency3;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[5]/tbody/tr[2]/td[6]/input")
    public WebElementFacade FixedFloating3;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[5]/tbody/tr[2]/td[8]/input")
    public WebElementFacade RateIndex3;

    @FindBy(xpath = "/html/body/div[5]/fieldset[12]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[7]/td[10]/input")
    public WebElementFacade rate;

    @FindBy(xpath = "/html/body/div[5]/fieldset[13]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td[3]/input")
    public WebElementFacade FixedAmount;

    @FindBy(xpath = "//input[@name='fieldName:PAYMENT.TYPE:2']")
    public WebElementFacade type;

    @FindBy(xpath = "//input[@name='fieldName:START.DATE:2:1']")
    public WebElementFacade startTime;

    @FindBy(xpath = "//input[@name='fieldName:END.DATE:2:1']")
    public WebElementFacade endTime;

    @FindBy(xpath = "/html/body/div[5]/fieldset[20]/div/div/form[1]/div[3]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a/span")
    public WebElementFacade PayIn;

    @FindBy(xpath = "//input[@name='fieldName:PAYIN.AC.DB.RULE:1']")
    public WebElementFacade Rule;

    @FindBy(xpath = "/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[14]/select")
    public WebElementFacade Margin;
}

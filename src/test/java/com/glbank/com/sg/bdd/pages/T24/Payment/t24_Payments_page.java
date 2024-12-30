package com.glbank.com.sg.bdd.pages.T24.Payment;

import cn.hutool.setting.GroupedMap;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.glbank.com.sg.bdd.utils.FileUtils;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeImpl;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.webdriver.stubs.WebElementFacadeStub;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.html.HTMLInputElement;

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

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[1]/td/table/tbody/tr[3]/td[8]/span")
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

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[4]/td[3]/span")
    public WebElementFacade getOrderingAccount;

    @FindBy(xpath = "//a[text()='Beneficiary Account']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getBeneficiaryAccount;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[11]/td[3]/span")
    public WebElementFacade getOrderingName;

    @FindBy(xpath = "//a[text()='Beneficiary Name']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getBeneficiaryName;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[12]/td[3]/span")
    public WebElementFacade getOrderingAddress;

    @FindBy(xpath = "//a[text()='Beneficiary Address']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getBeneficiaryAddress;

    @FindBy(xpath = "//a[text()='Ordering Town/PostalC - 2']/parent::label/parent::td/following-sibling::td[2]/span")
    public WebElementFacade getOrderingTown;


   @FindBy(xpath = "//span[text()='Charge Information']")
   // @FindBy(xpath = "//span[text()='Charge Info']")
    public WebElementFacade getClickChargeInformation;

    @FindBy(xpath = "//span[text()='Routing Information']")
    public WebElementFacade getRoutingInformation;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a/span")
    public WebElementFacade getback;

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

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[16]/td[7]/input")
    public WebElementFacade StreetName2;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[19]/td[7]/input")
    public WebElementFacade PostCode2;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[20]/td[7]/input")
    public WebElementFacade TownName3;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[21]/td[7]/input")
    public WebElementFacade CreditorCountry3;

    @FindBy(xpath = "//label[@for='fieldName:RelatedReference']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade EndToEndIdentification;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[13]/td[3]/input[1]")
    public WebElementFacade clickimposeinformation;


    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[14]/td[7]/input")
    public WebElementFacade CreditorBic;

    @FindBy(xpath = "//label[@for='fieldName:CreditorStreetName']/parent::td/following-sibling::td[2]//input")
    public WebElementFacade StreetName;

    @FindBy(xpath = "//label[@for='fieldName:BeneficiaryTownName']/parent::td/following-sibling::td[2]//input")
    public WebElementFacade TownName;

    @FindBy(xpath = "//label[@for='fieldName:BeneficiaryCountry']/parent::td/following-sibling::td[2]//input")
    public WebElementFacade CreditorCountry;

  //  @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[16]/td[6]/input")
   // public WebElementFacade CreditorName1;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[20]/td[7]/input")
    public WebElementFacade PostCode;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[14]/td[3]/input")
    public WebElementFacade DebitAccountNumber1;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[16]/td[3]/input")
    public WebElementFacade DebitName;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[17]/td[3]/input")
    public WebElementFacade StreetName1;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[20]/td[3]/input")
    public WebElementFacade PostCode1;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[21]/td[3]/input")
    public WebElementFacade TownName1;


    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[1]/tbody/tr[22]/td[3]/input")
    public WebElementFacade DebtorCountry;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[3]/tbody/tr[16]/td[3]/input")
    public WebElementFacade IntermediaryBIC;

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

    @FindBy(xpath = "/html/body/div[3]/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/a")
    public WebElementFacade clear;

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

    @FindBy(xpath = "/html/body/div[3]/div/form/div/table/tbody/tr[2]/td[2]/div[2]/div/table[1]/tbody/tr/td[14]/a/img")
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


    @FindBy(xpath = "//span[text()='Charge Info']")
    public WebElementFacade ChargeInformation;

    @FindBy(xpath = "//span[text()='Charge Information']")
    public WebElementFacade ChargeInformation2;

    @FindBy(xpath = "//span[text()='Routing Information']")
    public WebElementFacade Routingformation;

    @FindBy(xpath = "//span[text()='Additional Information']")
    public WebElementFacade AdditionalInfo;

    @FindBy(xpath = "//a//span[text()='Additional Information']")
    public WebElementFacade AdditionalInfoUSD;

    //UAT
    @FindBy(xpath = "//a//span[text()='Error Information']")
//    SIT
   // @FindBy(xpath = "//a//span[text()='Error Info']")
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

    @FindBy(xpath = "/html/body/div[3]/div/form/div/table/tbody/tr[2]/td[2]/div/div/table[1]/tbody/tr[9]/td[4]/a/img")
    public WebElementFacade ClickSyndicatedLoans;

    @FindBy(xpath = "/html/body/div[3]/div/form/div/table/tbody/tr[2]/td[2]/div[2]/div/table[1]/tbody/tr[4]/td[4]/a/img")
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

    @FindBy(xpath = "//a[text()='Find Loan ']")
    public WebElementFacade ClickFindLoan;

    @FindBy(xpath = "//img[@title='Overview']")
    public WebElementFacade ClickFindLoanOverview;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/div[3]/div/form/div/table/tbody/tr[2]/td[2]/div[2]/div/table[1]/tbody/tr/td[7]/a")
    public WebElementFacade clickschedule;

    @FindBy(xpath = "//img[@alt='Account']")
    public WebElementFacade ClickAccount;

    @FindBy(xpath = "//span[text()='Account Entries']")
    public WebElementFacade clickAccountEntries;

    @FindBy(xpath = "//a[text()='Entries for Today ']")
    public WebElementFacade clickEntriesForToday;

    @FindBy(xpath = "//input[@name='commandValue']")
    public WebElementFacade LIMIT;

    @FindBy(xpath = "//img[@title='Go']")
    public WebElementFacade duihao;

    @FindBy(xpath = "//input[@class='idbox idbox_LIMIT']")
    public WebElementFacade LIMITINPUT;

    @FindBy(xpath = "//img[@title='View a contract']")
    public WebElementFacade fangdajing;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[2]/td/table/tbody/tr[37]/td[1]/label/a")
    public WebElementFacade zuihou;


    @FindBy(xpath = "")
    public WebElementFacade accountID;

    @FindBy(xpath = "//span[text()='User Menu']")
    public WebElementFacade clickUsermenu;

    @FindBy(xpath = "/html/body/div[3]/ul[1]/li/ul/li[5]/span")
    public WebElementFacade clickProduct;

    @FindBy(xpath = "/html/body/div[3]/ul[1]/li/ul/li[5]/ul/li[7]/a")
    public WebElementFacade account;

    @FindBy(xpath = "/html/body/div[3]/ul[1]/li/ul/li[5]/ul/li[6]/a")
    public WebElementFacade accountB;

    @FindBy(xpath = "/html/body/div[3]/ul[1]/li/ul/li[5]/ul/li[7]/a")
    public WebElementFacade accountA;


    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/div[3]/form/table/tbody/tr/td[2]/table/tbody/tr[3]/td/div/table/tbody/tr[1]/td[3]/input[1]")
    public WebElementFacade inputaccount;

    @FindBy(xpath = "//td[text()='SGD']/following-sibling::td/a")
    public WebElementFacade CASGD;

    @FindBy(xpath = "//td[text()='USD']/following-sibling::td/a")
    public WebElementFacade CAUSD;

    @FindBy(xpath = "//td[text()='CNY']/following-sibling::td/a")
    public WebElementFacade CACNY;

    @FindBy(xpath = "//td[text()='HKD']/following-sibling::td/a")
    public WebElementFacade CAHKD;

    @FindBy(xpath = "//td[text()='AUD']/following-sibling::td/a")
    public WebElementFacade CAAUD;

    @FindBy(xpath = "//td[text()='AED']/following-sibling::td/a")
    public WebElementFacade CAAED;

    @FindBy(xpath = "//td[text()='GBP']/following-sibling::td/a")
    public WebElementFacade CAGBP;

    @FindBy(xpath = "//td[text()='NOK']/following-sibling::td/a")
    public WebElementFacade CANOK;

    @FindBy(xpath = "//td[text()='EUR']/following-sibling::td/a")
    public WebElementFacade CAEUR;

    @FindBy(xpath = "//td[text()='JPY']/following-sibling::td/a")
    public WebElementFacade CAJPY;


    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/div[3]/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[3]/div/table/tbody/tr/td/a")
    public WebElementFacade find;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/div[3]/div/form/div/table/tbody/tr[2]/td[2]/div[2]/div/table[1]/tbody/tr/td[9]/a/img")
    public WebElementFacade Details;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/div[3]/div/form/div/table/tbody/tr[2]/td[2]/div[2]/div/table[1]/tbody/tr/td[11]/a/img")
    public WebElementFacade Details1;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/table/tbody/tr[10]/td/table/tbody/tr[2]/td/div[3]/div/form/div/table/tbody/tr[2]/td[2]/div[2]/div/table[1]/tbody/tr[2]/td[8]/a/img")
    public WebElementFacade Details2;

    @FindBy(id = "moreactions" )
    public WebElementFacade selectListLiveFile;

    @FindBy(xpath = "//option[text( )='List Live File']")
    public WebElementFacade ListLiveFile;

    @FindBy(xpath = "//img[@title='Go']")
    public WebElementFacade Listgo;

    @FindBy(xpath = "//label[@for='fieldName:OutputChannel']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade OutputChannel;

    @FindBy(xpath = "/html/body/div[3]/div[2]/form[1]/div[4]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[3]/input")
    public WebElementFacade BICInput;


    @FindBy(xpath = "//span[text()='Money Market']")
    public WebElementFacade clickMoneyMarketMenu;

    @FindBy(xpath = "//span[text()='Money Market']/following-sibling::ul/li[1]/a")
    public WebElementFacade FixedMaturityPlacementContracts;

    @FindBy(xpath = "//a[text()='MM Placement (Loan)-Fixed Maturity']")
    public WebElementFacade MMPlacementTitle;

    @FindBy(xpath = "//label[@for='fieldName:DEALER.DESK']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade DealerDesk;

    @FindBy(xpath = "//label[@for='fieldName:CUSTOMER.ID']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CounterpartyID;

    @FindBy(xpath = "//div[@id='contract_screen_div']")
    public WebElementFacade ContractScreen;

    @FindBy(xpath = "//label[@for='fieldName:CURRENCY']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade Currency;

    @FindBy(xpath = "//label[@for='fieldName:PRINCIPAL']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade Amount;

    @FindBy(xpath = "//label[@for='fieldName:VALUE.DATE']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade StartDate;

    @FindBy(xpath = "//label[@for='fieldName:INTEREST.RATE']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade InterestRateFixed;

    @FindBy(xpath = "//a//span[text()='Payment/Settlement']")
    public WebElementFacade PaymentSettlement;

    @FindBy(xpath = "//label[@for='fieldName:DRAWDOWN.ACCOUNT']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CreditAccount;

    @FindBy(xpath = "//label[@for='fieldName:PRIN.BEN.BANK.1']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CounterpartyCorresBank1;

    @FindBy(xpath = "//label[@for='fieldName:PRIN.LIQ.ACCT']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade PrincipalLiqAcct;

    @FindBy(xpath = "//label[@for='fieldName:INT.LIQ.ACCT']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade InterestLiqAcct;

    @FindBy(xpath = "//a//span[text()='MM Placement/Loan - Fixed Maturity']")
    public WebElementFacade MMPlacementLoanFixedMaturity;

    @FindBy(xpath = "//td[@id='dealtitle']/following-sibling::td[1]//span")
    public WebElementFacade MMNumber;

    @FindBy(xpath = "//a[text()='Unauthorized MM Transactions ']")
    public WebElementFacade clickUnauthorizedMMTransactionsMenu;

    @FindBy(xpath = "//label[text()='Transaction Ref']/parent::span/parent::td/following-sibling::td[2]//input[1]")
    public WebElementFacade inputTransRef;

    @FindBy(xpath = "//a[@title='Authorise']")
    public WebElementFacade Autho;

    //@FindBy(xpath = "//span[text()='Settlement']")
    @FindBy(xpath = "/html/body/div[3]/ul[1]/li/ul/li[7]/ul/li[4]/ul/li[8]/span")
    public WebElementFacade clickSettlementMenu;

    @FindBy(xpath = "//a[text()='MM.PAYMENT.ENTRY ']")
    public WebElementFacade clickMMPaymentEntryMenu;

    @FindBy(xpath = "//td[@id='dealtitle']/following-sibling::td[1]//input[@name='transactionId']")
    public WebElementFacade FOREX;

    @FindBy(xpath = "//td[@id='dealtitle']/following-sibling::td[1]//input[@name='transactionId']")
    public WebElementFacade inputTransID;

    @FindBy(xpath = "//label[@for='fieldName:PO.REFERENCE']/parent::td/following-sibling::td[2]/span")
    public WebElementFacade PORef;

    @FindBy(xpath = "//span[text()=\"AccountWithInstIdentifierCode\"]")
    public WebElementFacade ClickErrorMessage;

    @FindBy(xpath = "//input[@id='fieldName:AccountWithInstIdentifierCode']")
    public WebElementFacade inputError;

    @FindBy(xpath = "//span[text()='Forex']/following-sibling::ul/li[1]/a")
    public WebElementFacade clickCaptureForexSpotDeal;

    @FindBy(xpath = "//a[text()='Corporate Customer']")
    public WebElementFacade clickCorporateCustomer;

    @FindBy(xpath = "//a[text()='FX Spot Trade']")
    public WebElementFacade FXSpotTradeTitle;

    @FindBy(xpath = "//label[@for='fieldName:COUNTERPARTY']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade Counterparty;

    @FindBy(xpath = "//label[@for='fieldName:CURRENCY.BOUGHT']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CurrencyBought;

    @FindBy(xpath = "//label[@for='fieldName:CURRENCY.SOLD']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CurrencySold;

    @FindBy(xpath = "//label[@for='fieldName:SPOT.RATE']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade SpotRate;

    @FindBy(xpath = "//label[@for='fieldName:AMOUNT.BOUGHT']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade BuyAmount;

    @FindBy(xpath = "//label[@for='fieldName:AMOUNT.SOLD']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade SellAmount;

    @FindBy(xpath = "//label[@for='fieldName:VALUE.DATE.BUY']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade ValueDateBuy;

    @FindBy(xpath = "//label[@for='fieldName:VALUE.DATE.SELL']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade ValueDateSell;

    @FindBy(xpath = "//td[2]//input[@name='radio:tab1:SOD.MAT' and @value='NO']")
    public WebElementFacade MatureStartDay_No;

    @FindBy(xpath = "//td[3]//input[@name='radio:tab1:SOD.MAT' and @value='YES']")
    public WebElementFacade MatureStartDay_Yes;

    @FindBy(xpath = "//a//span[text()='Settlement Instructions']")
    public WebElementFacade SettlementInstructions;

    @FindBy(xpath = "//label[@for='fieldName:OUR.ACCOUNT.PAY']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade SettlementAccSell1;

    @FindBy(xpath = "//label[@for='fieldName:OUR.ACCOUNT.REC']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade SettlementAccBuy1;

    @FindBy(xpath = "//label[@for='fieldName:CPARTY.CORR.NO']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CounterpartysSSI1;

    @FindBy(xpath = "//a//span[text()='Spot Deal']")
    public WebElementFacade SpotDeal;

    @FindBy(xpath = "//td[@id='dealtitle']/following-sibling::td[1]//span")
    public WebElementFacade FXNumber;

    @FindBy(xpath = "//a[text()='Unauthorized Forex Deals ']")
    public WebElementFacade clickUnauthorizedFXTransactionsMenu;

    @FindBy(xpath = "//label[@for='fieldName:ProcessingDate']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade ProcessingDate;

    @FindBy(xpath = "//input[@id='CheckBox:fieldName:ProcessingDateImposedFlag']")
    public WebElementFacade CheckProcessingDate;

    @FindBy(xpath = "//label[@for='fieldName:DebitValueDate']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade DebitValueDate;

    @FindBy(xpath = "//input[@id='CheckBox:fieldName:DebitValueDateImposedFlag']")
    public WebElementFacade CheckDebitValueDate;

    @FindBy(xpath = "//label[@for='fieldName:CreditValueDate']/parent::td/following-sibling::td[2]/input")
    public WebElementFacade CreditValueDate;

    @FindBy(xpath = "//input[@id='CheckBox:fieldName:CreditValueDateImposedFlag']")
    public WebElementFacade CheckCreditValueDate;

    @FindBy(xpath = "//a[text()='Inter Bank']")
    public WebElementFacade clickInterBank;

    @FindBy(xpath = "//td[2]//input[@name='radio:tab1:NETTING.STATUS' and @value='N']")
    public WebElementFacade Netting_No;

    @FindBy(xpath = "//td[3]//input[@name='radio:tab1:NETTING.STATUS' and @value='Y']")
    public WebElementFacade Netting_Yes;

    @FindBy(xpath = "//a//span[text()='Spot Deal.']")
    public WebElementFacade SpotDealdot;

}

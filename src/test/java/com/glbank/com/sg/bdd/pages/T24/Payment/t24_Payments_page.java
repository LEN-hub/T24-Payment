package com.glbank.com.sg.bdd.pages.T24.Payment;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class t24_Payments_page extends PageObject {

    @FindBy(xpath = "//title[contains(text(),'GLDB')]/parent::head/following-sibling::frameset/frame[2]")
    public WebElementFacade switchToSecondFrame;

    @FindBy(xpath = "//title[contains(text(),'GLDB')]/parent::head/following-sibling::frameset/frame[1]")
    public WebElementFacade switchToFirstFrame;

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


    @FindBy(xpath = "//span[text()='Payments']")
    public WebElementFacade clickPayments;

    @FindBy(xpath = "//a[text()='Clear Selection']")
    public WebElementFacade clickCleraSelectionBtn;

    @FindBy(xpath = "//table[@id='selectiondisplay']/tbody/tr[1]//input[@type='text']")
    public WebElementFacade inputChannelId;

    @FindBy(xpath = "//td[@id='enqselfavs']/following-sibling::td//td[@width='1'][2]//td")
    public WebElementFacade clickFindBtn;

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

    @FindBy(xpath = "//td[text()='Not Applicable']")
    public WebElementFacade notApplicableView;

    @FindBy(xpath = "//img[@alt='Select Drilldown']")
    public WebElementFacade clickSelectDrilldown;

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

    @FindBy(xpath = "//table[@summary=\"Recent Transactions\"]//div[2]//tr[1]/td[6]")
    public WebElementFacade getTransferDebitAmount;
}

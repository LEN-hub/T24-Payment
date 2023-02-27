package com.glbank.com.sg.bdd.pages.supplyChains.creditLimit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.security.cert.X509Certificate;
import java.util.List;


public class creditLimit_page extends PageObject {

    @FindBy(xpath = "//div[@class='lls-menu__content']/div[@class='lls-submenu']/div[@class='lls-submenu__title']/span[text()='Underwriting']")
    public WebElementFacade underWriting;

    @FindBy(xpath = "//div[@class='lls-menu__content']//div[5]/div[1]//span[text()='Underwriting']")
    public WebElementFacade choseUnderWriting;

    @FindBy(xpath = "//div[@class='lls-menu-item']/span[text()='Underwriting Approval']")
    public WebElementFacade underWritingApproval;

    @FindBy(xpath = "//span[@class='text-node-f2klo2he']")
    public WebElementFacade underWritingApprovalText;

    @FindBy(xpath = "//span[@data-key='f2imibvb']//span")
    public List<WebElementFacade> assignToMeBtn;

    @FindBy(xpath = "//div[@class='lls-design-table-btn-wrapper']//button")
    public List<WebElementFacade> assignBtn;

    @FindBy(xpath = "//tr/td[@class='lls-design-cloumn'][@data-key='f3o19io2']")
    public List<WebElementFacade> role;

    @FindBy(xpath = "//tr/td[@class='lls-design-cloumn cust-f1fohrfl'][@data-key='f1fohrfl']")
    public List<WebElementFacade> applicant;

    @FindBy(xpath = "//div[@class='lls-tabs__nav is-top']//div[@aria-controls='pane-1']")
    public WebElementFacade assignToMeTopBtn;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//td[@title='1']/following-sibling::td[11]//span[@data-key='f3ql3kf8']//button")
    public WebElementFacade proceedBtn;

    @FindBy(xpath = "//div[@class='lls-tabs__nav-scroll']//div[@class='lls-tabs__nav is-top']//div[@aria-controls='pane-2']")
    public WebElementFacade completed;

    @FindBy(xpath = "//label[@for='auditState']/following-sibling::div//input")
    public WebElementFacade result;

    @FindBy(xpath = "//label[@for='creditAmountNew']/following-sibling::div/div[2]/input")
    public WebElementFacade updateLimit;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span")
    public List<WebElementFacade> resultList;

    @FindBy(xpath = "//div[@class='btn']//button[@class='lls-button btn-item lls-button--primary']")
    public WebElementFacade SubmitBtn;

    @FindBy(xpath = "//div[@class='lls-submenu__content']//span[text()='Underwriting List']")
    public WebElementFacade underwritingListBtn;

    @FindBy(xpath = "//td[@class='lls-design-cloumn cust-f1vhst4e'][@data-key='f1vhst4e']")
    public List<WebElementFacade> roleList;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//span[@data-key='f3cahm5l']")
    public List<WebElementFacade> actionList;

    @FindBy(css = ".lls-button lls-button--primary lls-button--mini is-plain")
    public List<WebElementFacade> actionLists;


    //登录供应商门户
    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@placeholder='Enter email']")
    public WebElementFacade GLDBEmailInput;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@type='password']")
    public WebElementFacade GLDBEmailPassword;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/button/span")
    public WebElementFacade sendCodeBtn;

    @FindBy(xpath = "//div[@id='message-list']/button[1]//span[text()='Green Link Digital Bank - Verification Code']")
    public WebElementFacade thirdEmail;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/preceding-sibling::input")
    public WebElementFacade inputSendCode;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public WebElementFacade GLDBEmailLoginBtn;

    @FindBy(xpath = "//span[@class='el-input__suffix']/span/i")
    public WebElementFacade selectEmailDropDown;

    @FindBy(xpath = "//span[text()='@c0c.fun']")
    public WebElementFacade selectC0c;

    @FindBy(id = "customShortid")
    public WebElementFacade clickEditEmailName;

    @FindBy(id = "shortid")
    public WebElementFacade sendKeysEmailName;

    @FindBy(xpath = "//tbody[@id='maillist']/tr[1]/td[1]")
    public WebElementFacade clickFirstEmailName;

    @FindBy(xpath = "//div[@class='container content']/h2")
    public WebElementFacade getEmailOtp;

    @FindBy(xpath = "//input[@placeholder=\"请输入邮箱账号\"]")
    public WebElementFacade changeSendEmail;

    @FindBy(xpath = "//span[text()=' 刷新 ']")
    public WebElementFacade clickRefresh;

    @FindBy(xpath = "//table[@class='el-table__body']/tbody/tr/td[3]/div")
    public List<WebElementFacade> emailSubject;

    @FindBy(xpath = "//*[contains(text(),'Proceed to Digital Sign')]")
    public WebElementFacade DigitalSign;

    @FindBy(xpath = "//table[@class='el-table__body']/tbody/tr//span[text()='查看']")
    public List<WebElementFacade> clickViewBtn;

    @FindBy(xpath = "//input[@placeholder='Enter Company ID']")
    public WebElementFacade enterCompanyId;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-refresh']")
    public WebElementFacade clickRefreshBtn;

    @FindBy(id = "details-button")
    public WebElementFacade advancedButton;

    @FindBy(id = "proceed-link")
    public WebElementFacade enterEmailLink;

    @FindBy(xpath = "//div[@class='container content']//h2")
    public WebElementFacade emailVerificationCode;

    @FindBy(xpath = "//div[@class='passage']")
    public WebElementFacade pendingSignatureBtn;

    @FindBy(xpath = "//span[@class='dialog-footer']/button")
    public WebElementFacade confirmBtn;

    @FindBy(xpath = "//td[text()='[Green Link Digital Bank] Account Opening - Digital Sign Certified Extract of Board Resolution']")
    public WebElementFacade signEmail;

    @FindBy(xpath = "//a[text()='Proceed to Digital Sign']")
    public WebElementFacade signHref;

    @FindBy(xpath = "//td[contains(text(),'Digital Sign OTP')]")
    public WebElementFacade tokenEmail;

    @FindBy(xpath = "//h5/b")
    public WebElementFacade tokenNum;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-refresh']")
    public WebElementFacade refreshListBtn;

    @FindBy(xpath = "//div[@class='list-group']/button[1]")
    public WebElementFacade firstEmail;

    @FindBy(xpath = "//div[@class='list-group']/button[2]")
    public WebElementFacade secondEmail;

    @FindBy(xpath = "//h5[contains(text(),'Your OTP (One Time Password) for')]/following-sibling::div/b")
    public WebElementFacade token;

    @FindBy(xpath = "//li[@role='presentation'][2]//a")
    public WebElementFacade plainText;

    @FindBy(xpath = "//div[@class='tab-pane message-body active']/a[1]")
    public WebElementFacade tokenLink;

    @FindBy(xpath = "//div[@class='Verificationode_BoxChildIptChild']/div/form/input")
    public WebElementFacade inputToken;

    @FindBy(xpath = "//label[@for='limitType']")
    public WebElementFacade underWritingMode;

    @FindBy(xpath = "//label[@for='ratingNew']//following-sibling::div//input")
    public WebElementFacade rating;

    @FindBy(xpath = "//span[text()='BR Agreement']")
    public List<WebElementFacade> agreement;

    @FindBy(xpath = "//span[text()='OTP (One Time Password) for Digital Sign']")
    public WebElementFacade otpToken;

    @FindBy(xpath = "//div[@class='tab-pane message-body active']//tr[3]/td/div/div[1]//div/b")
    public WebElementFacade emailToken;

    @FindBy(xpath = "//div[@id='pdfList']//div[5]//span[1]")
    public WebElementFacade signHere;

    @FindBy(xpath = "//div[@class='upload-demo']//div//input")
    public WebElementFacade upLoadImg;

    @FindBy(xpath = "//span[text()='Docs List']")
    public WebElementFacade docsList;

    @FindBy(xpath = "//span[contains(text(),'Upload Historical Documents')]")
    public WebElementFacade uploadHistorical;
    
    @FindBy(xpath = "//div[@class='upload-widget']//input")
    public WebElementFacade uploadInput;

    @FindBy(xpath = "//label[text()='Supplier']/following-sibling::div//input")
    public WebElementFacade inputSupplier;

    @FindBy(xpath = "//label[text()='Supplier']")
    public WebElementFacade clickOther;

    @FindBy(xpath = "//button//span[contains(text(),'Confirm')]")
    public WebElementFacade cfmbtn;
}

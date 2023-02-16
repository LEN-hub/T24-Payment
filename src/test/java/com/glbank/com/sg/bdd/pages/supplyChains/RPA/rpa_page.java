package com.glbank.com.sg.bdd.pages.supplyChains.RPA;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class rpa_page extends PageObject {

    @FindBy(xpath = "//span[text()='Customers']/parent::div/span")
    public WebElementFacade Customers;

    @FindBy(xpath = "//span[text()='Contracts']/parent::div/following-sibling::div/div/span")
    public WebElementFacade ContractManagement;

    @FindBy(xpath = "//div[@data-key='f2ggi3np']//input")
    public WebElementFacade CompanyName;

    @FindBy(xpath = "//label[text()='Company Name']/following-sibling::div//input")
    public WebElementFacade enterCompanyName;

    @FindBy(xpath = "//label[text()='Contract Type']")
    public WebElementFacade clickContractType;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//span[contains(text(),'Upload')]")
    public WebElementFacade clickUploadBtn;

    @FindBy(xpath = "//div[@data-key='f17r962a']/button/span")
    public WebElementFacade uploadBtn;

    @FindBy(xpath = "//div[contains(text(),\"Company\")]/parent::label/following-sibling::div//input")
    public WebElementFacade companyName;

    @FindBy(xpath = "//div[contains(text(),\"Contract Type\")]/parent::label/following-sibling::div//input")
    public WebElementFacade ContractType;


    @FindBy(xpath = "//div[contains(text(),'Active Date of Contract')]/parent::label/following-sibling::div//input")
    public WebElementFacade enterDate;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    public WebElementFacade clickNextBtn;

    @FindBy(xpath = "//div[@class='lls-dialog__body']//span[contains(text(),'Confirm')]")
    public WebElementFacade clickConfirmBtn;

    @FindBy(xpath = "//span[text()='Contract Management']")
    public WebElementFacade CompanyNameClickReset;

    @FindBy(xpath = "//div[@class='lls-design-table-btn-wrapper']/span[2]//span")
    public WebElementFacade upload;

    @FindBy(xpath = "//i[@class='lls-icon-upload']")
    public WebElementFacade browse;

    @FindBy(xpath = "//div[@class='upload-widget']//input")
    public WebElementFacade inputBtn;

    //上传图片

    @FindBy(xpath = "//div[@class='lls-date-editor lls-input lls-input--suffix lls-date-editor--date']/input")
    public WebElementFacade sendData;

    @FindBy(xpath = "//div[@data-key='f2b9qh6r']//span")
    public WebElementFacade confirms;

    @FindBy(xpath = "//div[@data-key='f0r3lnig']//span")
    public WebElementFacade confirmsTwo;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-refresh']")
    public WebElementFacade clickRefreshBtn;

    @FindBy(xpath = "//div[@class='container content']//h2")
    public WebElementFacade emailVerificationCode;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@placeholder='Enter email']")
    public WebElementFacade GLDBEmailInput;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@type='password']")
    public WebElementFacade GLDBEmailPassword;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/button")
    public WebElementFacade sendCodeBtn;

    @FindBy(xpath = "//div[@id='message-list']/button[1]//span[text()='Green Link Digital Bank - Verification Code']")
    public WebElementFacade thirdEmail;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/preceding-sibling::input")
    public WebElementFacade inputSendCode;

    @FindBy(xpath = "//input[@placeholder='Enter Company ID']")
    public WebElementFacade enterCompanyId;

    @FindBy(xpath = "//span[text()=' 刷新 ']")
    public WebElementFacade clickRefresh;

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

    @net.serenitybdd.core.annotations.findby.FindBy(xpath = "//div[@class='container content']/h2")
    public WebElementFacade getEmailOtp;


    @FindBy(xpath = "//input[@placeholder=\"请输入邮箱账号\"]")
    public WebElementFacade changeSendEmail;

    @FindBy(xpath = "//table[@class='el-table__body']/tbody/tr//span[text()='查看']")
    public List<WebElementFacade> clickViewBtn;

    @FindBy(xpath = "//table[@class='el-table__body']/tbody/tr/td[3]/div")
    public List<WebElementFacade> emailSubject;

    @FindBy(xpath = "//*[contains(text(),'Proceed to Digital Sign')]")
    public WebElementFacade DigitalSign;


    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public WebElementFacade GLDBEmailLoginBtn;

    @FindBy(xpath = "//span[text()='Go to Digibank']")
    public WebElementFacade clickGoToDigibankLink;

    @FindBy(xpath = "//span[contains(text(),'Open Account ')]")
    public WebElementFacade jumpToInbLinkCheck;

    @FindBy(xpath="//body[@id='body']//button[@id='details-button']")
    public WebElementFacade clickSeniorBtn;

    @FindBy(xpath = "//body[@id='body']//a[@id='proceed-link']")
    public WebElementFacade getJumpToInbLink;

    @FindBy(xpath = "//span[text()='Contract']")
    public WebElementFacade Contract;

    @FindBy(xpath = "//span[text()='Report']")
    public WebElementFacade Report;

    @FindBy(xpath = "//td[@title='1']//following-sibling::td[29]//button//span")
    public WebElementFacade firstViewAdvice;

    @FindBy(xpath = "//div[@id='main-message']/h1")
    public WebElementFacade errorText;

    @FindBy(id = "details-button")
    public WebElementFacade advancedButton;

    @FindBy(id = "proceed-link")
    public WebElementFacade enterEmailLink;

    @FindBy(xpath = "//span[text()='Setting']")
    public WebElementFacade setting;

    @FindBy(xpath = "//div[@data-key='f28ip5ur']/button/span")
    public WebElementFacade createUser;

    @FindBy(xpath = "//div[@data-key='f3mhkbh2']//div[@class='lls-form-item is-required'][1]//input")
    public WebElementFacade firstName;

    @FindBy(xpath = "//div[@data-key='f3mhkbh2']//div[@class='lls-form-item is-required'][2]//input")
    public WebElementFacade lastName;

    @FindBy(xpath = "//div[@data-key='f3mhkbh2']//div[@class='lls-form-item is-required'][3]//input")
    public WebElementFacade emailAdd;

    @FindBy(xpath = "//div[@data-key='f3mhkbh2']//div[@class='lls-form-item is-required'][4]//input")
    public WebElementFacade phone;

    @FindBy(xpath = "//div[@data-key='f306i01b']//span")
    public WebElementFacade confirmBtn;

    @FindBy(xpath = "//div[@class='lowcode-table default-theme']//div[@class='lowcode-table-wrap']//tbody//tr[1]//span[@data-key='f2ndb6d8']//button//span")
    public WebElementFacade sendEmail;

    @FindBy(xpath = "//div[@class='lls-message-box__btns']//button[2]//span")
    public WebElementFacade confirmInvitation;

    @FindBy(xpath = "//input[@placeholder='mailbox']")
    public WebElementFacade DisposableEmail;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElementFacade emailView;

    @FindBy(xpath = "//span[text()='Green Link Digital Bank - Invitation']")
    public WebElementFacade firstEmail;

    @FindBy(xpath = "//a[text()='Green Link system']")
    public WebElementFacade logonLink;

    @FindBy(xpath = "//p[text()='New password']/following-sibling::div[1]//input")
    public WebElementFacade firstNewPassword;

    @FindBy(xpath = "//p[text()='New password']/following-sibling::div[2]//input")
    public WebElementFacade secondNewPassword;

    @FindBy(xpath = "//span[contains(text(),'Confirm')]")
    public WebElementFacade newPasswordPageConfirmBtn;

    @FindBy(xpath = "//div[text()='Overview']")
    public WebElementFacade titleOverview;
}

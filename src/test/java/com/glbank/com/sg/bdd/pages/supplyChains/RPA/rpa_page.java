package com.glbank.com.sg.bdd.pages.supplyChains.RPA;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class rpa_page extends PageObject {

    @FindBy(xpath = "//span[text()='Customers']/parent::div/i")
    public WebElementFacade Customers;

    @FindBy(xpath = "//span[text()='Contracts']/parent::div/following-sibling::div/div/span")
    public WebElementFacade ContractManagement;

    @FindBy(xpath = "//div[@data-key='f2ggi3np']//input")
    public WebElementFacade CompanyName;

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

    @FindBy(xpath = "//div[@data-key='f3jt43aq']//span")
    public WebElementFacade confirms;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-refresh']")
    public WebElementFacade clickRefreshBtn;

    @FindBy(xpath = "//div[@class='tab-pane message-body active']//h2")
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

    @FindBy(xpath = "//span[text()='Login']")
    public WebElementFacade GLDBEmailLoginBtn;

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

    @FindBy(xpath = "//div[@class='lowcode-table default-theme']//div[@class='lowcode-table-fixed-right table-shadow']//tbody//tr[1]//span[@data-key='f2ndb6d8']//button//span")
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
}

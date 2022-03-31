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


}

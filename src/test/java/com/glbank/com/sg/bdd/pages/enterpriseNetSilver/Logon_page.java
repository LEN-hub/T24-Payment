package com.glbank.com.sg.bdd.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Logon_page extends PageObject {

    @FindBy(xpath = "//label[@for='custNo']/following-sibling::div//input")
    public WebElementFacade organisationID;

    @FindBy(xpath = "//label[@for='loginId']/following-sibling::div//input")
    public WebElementFacade emailAddress;

    @FindBy(xpath = "//input[@type='password']")
    public WebElementFacade password;

    @FindBy(xpath = "//div[@class='el-row']/following-sibling::div//div[@class='btn_box']")
    public WebElementFacade logonBtn;

    @FindBy(xpath = "//div[@id='fullpage']/following-sibling::div/div[2]//div[text()='Ok']")
    public WebElementFacade clickSecondPageOkBtn;

    @FindBy(xpath = "//div[@class='ui-dialog notice-dialog']/div[2]//div[@class='el-dialog']//div[text()='Ok']")
    public WebElementFacade clickOkBtnOnTitle;

    @FindBy(xpath = "//div[text()='Send verification code']")
    public WebElementFacade clickSitEnvOtpBtn;

    @FindBy(xpath = "//div[contains(text(),'Please enter SMS')]/following-sibling::div[1]/input")
    public WebElementFacade enterSitEnvOtp;

    @FindBy(xpath = "//div[text()='OK']")
    public WebElementFacade clickOkBtn;

    @FindBy(xpath = "//div[contains(text(), '使用OTP进行身份验证')]")
    public WebElementFacade vcodeTitle;

    @FindBy(xpath = "//div[@class='ui-button primary common is-block']/div")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//div[@class='risk-body']/div[2]//div[text()='Next']")
    public WebElementFacade clickSitNextBtn;

    @FindBy(xpath = "//div[@class='OTP-One-Time-Passwo']/following-sibling::div/span[1]")
    public WebElementFacade vcode1;

    @FindBy(xpath = "//div[@class='OTP-One-Time-Passwo']/following-sibling::div/span[2]")
    public WebElementFacade vcode2;

    @FindBy(xpath = "//div[@class='OTP-One-Time-Passwo']/following-sibling::div/span[3]")
    public WebElementFacade vcode3;

    @FindBy(xpath = "//div[@class='OTP-One-Time-Passwo']/following-sibling::div/span[4]")
    public WebElementFacade vcode4;

    @FindBy(xpath = "//div[@class='OTP-One-Time-Passwo']/following-sibling::div/span[5]")
    public WebElementFacade vcode5;

    @FindBy(xpath = "//div[@class='OTP-One-Time-Passwo']/following-sibling::div/span[6]")
    public WebElementFacade vcode6;

    @FindBy(xpath = "//div[text()='Authenticate Now']")
    public WebElementFacade authenticateNowBtn;

    @FindBy(id = "oriPassword")
    public WebElementFacade originalPassword;

    @FindBy(xpath = "//label[@for='passwd']/following-sibling::div//input[@id='passwd']")
    public WebElementFacade firstEnterPassword;

    @FindBy(xpath = "//label[@for='confirmPasswd']/following-sibling::div//input[@id='passwd']")
    public WebElementFacade secondEnterPassword;

    @FindBy(xpath = "//div[contains(text(),'Changed Password')]")
    public WebElementFacade changePasswordTitle;

    @FindBy(xpath = "//div[contains(text(),' Reset Password')]")
    public WebElementFacade resetPasswordBtn;

    @FindBy(xpath = "//span[text()='English']")
    public WebElementFacade checkLanguage;

    @FindBy(xpath = "//li[contains(text(),'中文')]")
    public WebElementFacade selectChinese;

    @FindBy(id = "userAccout")
    public WebElementFacade enterUserName;

    @FindBy(xpath = "//div[@class='lls-login-box']/div[1]//input[@type='password']")
    public WebElementFacade enterPassword;

    @FindBy(xpath = "//div[@class='lls-login-box']/div[1]//input[@placeholder='请输入验证码']")
    public WebElementFacade enterVerificationCode;

    @FindBy(xpath = "//div[@class='lls-login-box']/div[1]/div[8]")
    public WebElementFacade clickLoginBtn;

    public void scfSitEenUserName(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(enterUserName)
                .waitUntilVisible()
                .sendKeys(userName);
    }

    public void scfSitEenPassword(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(enterPassword)
                .waitUntilVisible()
                .sendKeys(userName);
    }


    public void enterOrganisationID(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(organisationID)
                .waitUntilVisible()
                .sendKeys(userName);
    }

    public void enterPassWord(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(password)
                .waitUntilVisible()
                .sendKeys(userName);
    }


    public void enterEmailAddress(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(emailAddress)
                .waitUntilVisible()
                .sendKeys(userName);
    }
}

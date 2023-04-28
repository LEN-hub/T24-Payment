package com.glbank.com.sg.bdd.pages.supplyChains.systemManager;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static java.time.temporal.ChronoUnit.SECONDS;
import static org.junit.Assert.assertTrue;

public class logon_page extends PageObject {


    @FindBy(xpath = "//div[@class='form-top']/img[@alt='image']")
    public WebElementFacade tips;

    @FindBy(id = "form-username")
    public WebElementFacade userNameInputbox;

    @FindBy(id = "form-password")
    public WebElementFacade passwordInputbox;

    @FindBy(xpath = "//tr[@align='center']//button[@type='submit' ]")
    public WebElementFacade clickLogonBtn;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElementFacade IOSBackStage_LoginBtn;

    @FindBy(xpath = "//p[text()='Supply Chain Finance']")
    public WebElementFacade clickSCFlink;

    @FindBy(xpath = "//p[text()='EBK']")
    public WebElementFacade onlineBank;

    @FindBy(xpath = "//p[text()='Online Banking']")
    public WebElementFacade onlineBankUat;

    @FindBy(xpath = "//input[@class='gwt-TextBox']")
    public WebElementFacade ISOBackstageUserName;

    @FindBy(xpath = "//input[@class='gwt-PasswordTextBox']")
    public WebElementFacade ISOBackstagePassWord;

    public void enterUserName(String userName){
        withTimeoutOf(20,SECONDS)
                .waitFor(userNameInputbox)
                .waitUntilVisible()
                .sendKeys(userName);
    }


    public void enterPassWord(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(passwordInputbox)
                .waitUntilVisible()
                .sendKeys(userName);
    }

    public void enterUserNameIsoBackStage(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(ISOBackstageUserName)
                .waitUntilVisible()
                .sendKeys(userName);
    }

    public void enterPassWordIsoBackStage(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(ISOBackstagePassWord)
                .waitUntilVisible()
                .sendKeys(userName);
    }

}

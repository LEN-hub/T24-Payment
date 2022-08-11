package com.glbank.com.sg.bdd.pages.T24.Logon;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

import static java.time.temporal.ChronoUnit.SECONDS;

public class T24_Logon_page extends PageObject {

    @FindBy(id = "signOnName")
    public WebElementFacade logonUserName;

    @FindBy(id = "password")
    public WebElementFacade logonPassword;

    @FindBy(id = "sign-in")
    public WebElementFacade clickLogonBtn;


    public void enter_User_Name(String userName){
        withTimeoutOf(10,SECONDS)
                .waitFor(logonUserName)
                .waitUntilVisible()
                .sendKeys(userName);
    }

    @Step
    public void enter_Password(String password) {
        withTimeoutOf(10, SECONDS)
                .waitFor(logonPassword)
                .waitUntilVisible()
                .sendKeys(password);
    }
}

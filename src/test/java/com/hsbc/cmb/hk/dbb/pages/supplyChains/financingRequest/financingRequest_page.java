package com.hsbc.cmb.hk.dbb.pages.supplyChains.financingRequest;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class financingRequest_page extends PageObject {

    @FindBy(xpath = "//p[text()=\"Email\"]/following-sibling::div//input[@placeholder=\"Enter email\"]")
    public WebElementFacade enterEmailToBox;

    @FindBy(xpath = "//p[text()=\"Password\"]/following-sibling::div//input[@type=\"password\"]")
    public WebElementFacade enterPasswordToBox;

    @FindBy(xpath = "//p[text()=\"Company ID\"]/following-sibling::div//input[@placeholder=\"Enter Company ID\"]")
    public WebElementFacade enterCompanyIdToBox;

    @FindBy(xpath = "//p[text()=\"Verification code\"]/following-sibling::div//input")
    public WebElementFacade enterCodeToBox;

    @FindBy(xpath = "//button//span[text()=\"Login\"]")
    public WebElementFacade clickLogin;

    @FindBy(xpath = "//span[text()=\"Request Financing\"]")
    public WebElementFacade clickRequestFinancing;

    @FindBy(xpath = "//div[@data-key=\"f23gdh29\"]//button//span")
    public WebElementFacade clickUpload;

}

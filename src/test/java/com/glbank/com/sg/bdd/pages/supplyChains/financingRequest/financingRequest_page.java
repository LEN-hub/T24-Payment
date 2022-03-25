package com.glbank.com.sg.bdd.pages.supplyChains.financingRequest;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

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

    @FindBy(xpath = "//div[@data-key=\"f13i7oou\"]//span[text()=\"Browse\"]")
    public WebElementFacade clickOfUploadFile;

    @FindBy(xpath = "//div[@data-key=\"f2v8ji72\"]//span")
    public WebElementFacade clickConfirmOfUpload;

    @FindBy(xpath = "//div[@class=\"lls-cb-slotbox\"]//div[@class=\"lls-cb-indot lls-cb-indot-act\"]")
    public WebElementFacade clickAllRequest;

    @FindBy(xpath = "//div[@data-key=\"f1lrg6e0\"]//span")
    public WebElementFacade clickApplyInBatch;

    @FindBy(xpath = "//span[text()=\"Operations\"]")
    public WebElementFacade clickOperations;

    @FindBy(xpath = "//span[text()=\"FR Review\"]")
    public WebElementFacade clickFrReview;

    @FindBy(xpath = "//td[@class=\"lls-table_9_column_27 is-left  \"]//div[@class=\"cell lls-tooltip\"]//span")
    public List<WebElementFacade> requesterName;

    @FindBy(xpath = "//td[@class=\"lls-table_9_column_38 is-left   is-hidden\"]//span[text()=\"Assign to Me \"]")
    public List<WebElementFacade> requestFinancingAssignToMe;

    @FindBy(xpath = "//div[text()=\"Assigned to Me\"]")
    public WebElementFacade clickAssignedToMe;

    @FindBy(xpath = "//td[@class=\"lls-table_10_column_41 is-left  \"]//span")
    public List<WebElementFacade> getRequesterName;

    @FindBy(xpath = "//td[@class=\"lls-table_9_column_38 is-left   is-hidden\"]//span[text()=\"Proceed\"]")
    public List<WebElementFacade> getProceed;

    @FindBy(xpath = "//label[text()=\"Result\"]/following-sibling::div//input")
    public WebElementFacade clickResult;

    @FindBy(xpath = "//span[text()=\"Approve\"]")
    public WebElementFacade getApprove;

    @FindBy(xpath = "//textarea")
    public WebElementFacade getComments;

    @FindBy(xpath = "//span[text()=\"Submit \"]")
    public WebElementFacade clickSubmit;

    @FindBy(xpath = "//span[text()=\"Financing Status\"]")
    public WebElementFacade clickFinancingStatus;

    @FindBy(xpath = "//div[@id=\"tab-1\"]//span")
    public WebElementFacade clickPaymentInProgress;
}

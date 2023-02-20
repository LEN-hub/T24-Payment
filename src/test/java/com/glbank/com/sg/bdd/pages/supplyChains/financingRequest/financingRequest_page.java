package com.glbank.com.sg.bdd.pages.supplyChains.financingRequest;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.security.cert.X509Certificate;
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

    @FindBy(xpath = "//span[text()='Apply']")
    public WebElementFacade clickRequestFinancing;

    @FindBy(xpath = "//div[@data-key=\"f23gdh29\"]//button//span")
    public WebElementFacade clickUpload;

    @FindBy(xpath = "//div[@data-key=\"f13i7oou\"]//span[text()=\"Browse\"]")
    public WebElementFacade clickOfUploadFile;

    @FindBy(xpath = "//div[@data-key=\"f39ktefg\"]//span")
    public WebElementFacade clickConfirmOfUpload;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//tbody/tr//div[@class='lls-cb-indot lls-cb-indot-act2']")
    public WebElementFacade clickAllRequest;

    @FindBy(xpath = "//div[@data-key=\"f1lrg6e0\"]//span")
    public WebElementFacade clickApplyInBatch;

    @FindBy(xpath = "//span[text()=\"Operations\"]")
    public WebElementFacade clickOperations;

    @FindBy(xpath = "//span[text()=\"FR Review\"]")
    public WebElementFacade clickFrReview;

    @FindBy(xpath = "//td[@class=\"lls-table_9_column_28 is-left  \"]//div[@class=\"cell lls-tooltip\"]//span")
    public List<WebElementFacade> requesterName;

    @FindBy(xpath = "//div[@class='finance']//div[@class='lls-tabs__content'][1]//div[@class='lls-tab-pane'][1]//section[@class='query-table'][1]/div[1]/div[3]//span[contains(text(),'Assign to Me')]")
    public List<WebElementFacade> requestFinancingAssignToMe;

    @FindBy(xpath = "//div[text()=\"Assigned to Me\"]")
    public WebElementFacade clickAssignedToMe;

    @FindBy(xpath = "//td[@class=\"lls-table_10_column_45 is-left  \"]//span")
    public List<WebElementFacade> getRequesterName;

    @FindBy(xpath = "//td[@class=\"lls-table_9_column_38 is-left   is-hidden\"]//span[text()=\"Proceed\"]")
    public List<WebElementFacade> getProceed;

    @FindBy(xpath = "//label[text()=\"Result\"]/following-sibling::div//input")
    public WebElementFacade clickResult;

    @FindBy(xpath = "//div[@class='report_title']/div[@class='tip_top']/i[2]")
    public WebElementFacade amlStatus;

    @FindBy(xpath = "//span[text()=\"Approve\"]")
    public WebElementFacade getApprove;

    @FindBy(xpath = "//span[text()=\"Return\"]")
    public WebElementFacade getReturn;

    @FindBy(xpath = "//textarea")
    public WebElementFacade getComments;

    @FindBy(xpath = "//span[text()=\"Submit \"]")
    public WebElementFacade clickSubmit;

    @FindBy(xpath = "//div[@class='lls-message-box__btns']//button[2]/span")
    public WebElementFacade SubmitBtn;

    @FindBy(xpath = "//span[text()=\"Financing Status\"]")
    public WebElementFacade clickFinancingStatus;

    @FindBy(xpath = "//div[@id=\"tab-1\"]//span")
    public WebElementFacade clickPaymentInProgress;

    @FindBy(xpath = "//span[text()='More']")
    public WebElementFacade more;

    @FindBy(xpath = "//div[text()='Ratings & Limits']")
    public WebElementFacade ratingLimits;

    @FindBy(xpath = "//span[text()='Rating & Limits']")
    public WebElementFacade ratingTitle;
    @FindBy(xpath = "//span[text()='Ratings & Limits List']")
    public WebElementFacade ratingLimitsList;

    @FindBy(xpath = "//label[text()='Client']//following-sibling::div//input")
    public WebElementFacade client;

    @FindBy(xpath = "//div[@data-key='f2u4lp9q']//div[@class='lowcode-table-base']//tbody//span[@data-key='f0pbd6tn']//span")
    public WebElementFacade viewBtn;
}

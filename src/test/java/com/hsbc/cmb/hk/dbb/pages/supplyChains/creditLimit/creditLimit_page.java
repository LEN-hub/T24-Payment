package com.hsbc.cmb.hk.dbb.pages.supplyChains.creditLimit;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
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

    @FindBy(xpath = "//span[@class='single-line-text is-empty']")
    public WebElementFacade underWritingApprovalText;

    @FindBy(xpath = "//div[@class='lls-design-table-btn-wrapper']/span/button")
    public List<WebElementFacade> assignToMeBtn;

    @FindBy(xpath = "//tr/td[@class='lls-design-cloumn'][@data-key='f3o19io2']")
    public List<WebElementFacade> role;

    @FindBy(xpath = "//div[@class='lls-tabs__nav is-top']//div[@aria-controls='pane-1']")
    public WebElementFacade assignToMeTopBtn;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//td[@title='1']/following-sibling::td[11]//span[@data-key='f3ql3kf8']//button")
    public WebElementFacade proceedBtn;

    @FindBy(xpath = "//div[@class='lls-tabs__nav-scroll']//div[@class='lls-tabs__nav is-top']//div[@aria-controls='pane-2']")
    public WebElementFacade completed;

    @FindBy(xpath = "//div[@class='lls-form-item is-required']//div[@class='lls-form-item__content']//div[@class='lls-select']//div[@class='lls-input lls-input--suffix']")
    public WebElementFacade result;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span")
    public List<WebElementFacade> resultList;

    @FindBy(xpath = "//div[@class='btn']//button[@class='lls-button btn-item lls-button--primary']")
    public WebElementFacade SubmitBtn;

    @FindBy(xpath = "//div[@class='lls-submenu__content']//span[text()='Underwriting List']")
    public WebElementFacade underwritingListBtn;

    @FindBy(xpath = "//td[@class='lls-design-cloumn'][@data-key='f08pkuoi']")
    public List<WebElementFacade> roleList;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//span[@data-key='f3ql3kf8']//span[contains(text(),'Proceed')]")
    public List<WebElementFacade> actionList;
}

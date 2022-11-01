package com.glbank.com.sg.bdd.pages.enterpriseNetSilver.fixedDeposits;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class fixedDeposit_page extends PageObject {

    @FindBy(xpath = "//div[@class=\"el-message-box__wrapper\"]")
    public WebElementFacade checkPopup;

    @FindBy(xpath = "//div[@class=\"el-message-box__btns\"]//button[2]")
    public WebElementFacade clickOk;

    @FindBy(xpath = "//ul[@class=\"el-menu--horizontal el-menu\"]//li[3]//div")
    public WebElementFacade clickFixedDeposit;

    @FindBy(xpath = "//div[@class=\"list\"]//p[3]/span")
    public WebElementFacade selectSecondMenu;

    @FindBy(xpath = "//div[@class=\"el-row\"]//div[2]//div")
    public WebElementFacade clickPlaceFixedDeposit;

    @FindBy(xpath = "//label[@for='acctObj']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade clickFromAccount;

    @FindBy(xpath = "//form//div[2]/div/div/div[1]/input")
    public WebElementFacade clickAccountCurrency;

    @FindBy(xpath = "//label[@for=\"acctObj\"]/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade clickPopwindows;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start' ]//li/span")
    public List<WebElementFacade> selectAccountValue;

    @FindBy(xpath = "//div[@class=\"mandatory\"]/following-sibling::form/div[2]/div[2]/div[2]//input[@disabled=\"disabled\"]")
    public WebElementFacade transferAccountDisabled;

    @FindBy(xpath = "//label[@for=\"payeeAcctObj\"]/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade intoAccountPopwindows;

    @FindBy(xpath = "//label[@for=\"depositPeriodCd\"]/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade periodDate;

    @FindBy(xpath = "//label[@for=\"autTraSavFlag\"]/following-sibling::div//label[1]//span[@class='el-radio__inner']")
    public WebElementFacade doNotDump;

    @FindBy(xpath = "//label[@for=\"autTraSavFlag\"]/following-sibling::div//label[2]//span[@class='el-radio__inner']")
    public WebElementFacade principalAdaptation;

    @FindBy(xpath = "//label[@for=\"autTraSavFlag\"]/following-sibling::div//label[3]//span[@class='el-radio__inner']")
    public WebElementFacade checkBoxThree;

    @FindBy(xpath = "//label[@for=\"tradeAmont\"]/following-sibling::div//input")
    public WebElementFacade getPlacementAmount;

    @FindBy(xpath = "//label[@for=\"depositPeriodCd\"]/following-sibling::div//input")
    public WebElementFacade clickPlacementDuration;

    @FindBy(xpath = "//div[@class=\"el-form-item el-form-item--medium\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNext;

    @FindBy(xpath = "//div[@class='detail_page-container']/following-sibling::label/span[1]")
    public WebElementFacade clickCheck;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[@class=\"ui-button primary common\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickSubmit;

    @FindBy(xpath = "//div[@class=\"el-row\"]//div[@class=\"ui-button secondary common\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickDetails;

    //授权
    @FindBy(xpath = "//div[text()='My Tasks']")
    public WebElementFacade clickMyTaskMenu;

    @FindBy(xpath = "//div[contains(text(),'Fixed Deposits')]")
    public WebElementFacade clickFixedDeposits;

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr[1]//div[text()='Authorize']")
    public WebElementFacade clickAuthorizeBtn;

    @FindBy(xpath = "//span[text()='Approve']/preceding-sibling::span/span")
    public WebElementFacade cickApproveBtn;

    @FindBy(xpath = "//div[text()='Submit']")
    public WebElementFacade clickSubmitBtn;

    @FindBy(xpath = "//div[text()='Finish']")
    public WebElementFacade clickFinishBtn;
}

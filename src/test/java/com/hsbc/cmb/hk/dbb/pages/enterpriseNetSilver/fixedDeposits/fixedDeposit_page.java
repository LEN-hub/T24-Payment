package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.fixedDeposits;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class fixedDeposit_page extends PageObject {

    @FindBy(xpath = "//div[@class=\"el-message-box__wrapper\"]")
    public WebElementFacade checkPopup;

    @FindBy(xpath = "//div[@class=\"el-message-box__btns\"]//button[2]")
    public WebElementFacade clickOk;

    @FindBy(xpath = "//ul[@class=\"el-menu--horizontal el-menu\"]//li[3]//div")
    public WebElementFacade clickFixedDeposit;

    @FindBy(xpath = "//div[@class=\"el-row\"]//div[2]//div")
    public WebElementFacade clickPlaceFixedDeposit;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div//div[1]/form/div[2]/div[2]/div[1]//div[1]/div/input")
    public WebElementFacade clickFromAccount;

    @FindBy(xpath = "//form//div[2]/div/div/div[1]/input")
    public WebElementFacade clickAccountCurrency;

    @FindBy(xpath = "//div[@class=\"el-form-item__content\"]//span[@class=\"el-popover__reference-wrapper\"]//input")
    public WebElementFacade getPlacementAmount;

    @FindBy(xpath = "//label[@for=\"depositPeriodCd\"]/following-sibling::div//input")
    public WebElementFacade clickPlacementDuration;

    @FindBy(xpath = "//div[@class=\"el-form-item el-form-item--medium\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickNext;

    @FindBy(xpath = "//span[@class=\"el-checkbox__inner\"]")
    public WebElementFacade clickCheck;

    @FindBy(xpath = "//div[@class=\"el-col el-col-24\"]//div[@class=\"ui-button primary common\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickSubmit;

    @FindBy(xpath = "//div[@class=\"el-row\"]//div[@class=\"ui-button secondary common\"]//div[@class=\"btn_box\"]")
    public WebElementFacade clickDetails;
}

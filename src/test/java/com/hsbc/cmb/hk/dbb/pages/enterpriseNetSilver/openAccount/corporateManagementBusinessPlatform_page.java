package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.openAccount;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class corporateManagementBusinessPlatform_page extends PageObject {

    @FindBy(xpath = "//div[@class=\"el-form-item__content\"]//input[@type=\"text\"]")
    public WebElementFacade inputUserName;

    @FindBy(xpath = "//div[@class=\"el-form-item__content\"]//input[@type=\"password\"]")
    public WebElementFacade inputPassWord;

    @FindBy(xpath = "//div[@class=\"el-card__body\"]//button//span")
    public WebElementFacade clickLogin;

    @FindBy(xpath = "//ul[@class=\"el-menu\"]//li[7]")
    public WebElementFacade clickTradingCenter;

    @FindBy(xpath = "//ul[@class=\"el-menu\"]//li[7]//li[4]")
    public WebElementFacade clickExceptionHandling;

    @FindBy(xpath = "//div[@class=\"el-form-item__content\"]//input")
    public WebElementFacade inputCustomerNo;

    @FindBy(xpath = "//div[@class=\"ui-button-inner\"]")
    public WebElementFacade clickQuery;

    @FindBy(xpath = "//div[@class=\"el-table__fixed-right\"]//tbody//td[7]//button")
    public WebElementFacade clickHandling;

    @FindBy(xpath = "//div[@class=\"btn-group\"]//div[1]//div[1]")
    public WebElementFacade clickSubmit;
}

package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class paymentService_page extends PageObject {

    @FindBy(xpath = "//div[@class='el-message-box__title']/span")
    public WebElementFacade popWindowsTitle;

    @FindBy(xpath = "//div[@class='el-message-box__btns']/button[2]")
    public WebElementFacade popWindowsOk;

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[5]//span")
    public WebElementFacade transferAndRemittanceMenu;

    @FindBy(xpath = "//div[@class='list']/div[1]/p[2]")
    public WebElementFacade transferMoney;

    @FindBy(xpath = "//label[@for='payerAcctObj']/parent::div/following-sibling::div[1]//input")
    public WebElementFacade rollOutCurrency;

    @FindBy(xpath = "//label[@for='payerAcctObj']/following-sibling::div[1]//span[@class='el-input__suffix-inner']")
    public WebElementFacade rollOutCurrencySelectWindows;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//li")
    public List<WebElementFacade> rollOutAccount;


}

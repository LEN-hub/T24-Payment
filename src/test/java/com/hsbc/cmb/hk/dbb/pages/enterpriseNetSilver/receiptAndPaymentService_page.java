package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class receiptAndPaymentService_page extends PageObject {

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[5]//span")
    public WebElementFacade transferAndRemittanceMenu;

    @FindBy(xpath = "//div[@class='list']/div[1]/p[2]")
    public WebElementFacade transferMoney;

    @FindBy(xpath = "//label[@for='payerAcctObj']/parent::div/following-sibling::div[1]//input")
    public WebElementFacade rollOutCurrency;

    @FindBy(xpath = "//label[@for='payerAcctObj']/following-sibling::div[1]//span[@class='el-input__suffix-inner']")
    public WebElementFacade rollOutCurrencySelectWindows;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//li")
    public WebElementFacade rollOutAccount;


}

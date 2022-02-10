package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class accountService_page extends PageObject {
    @FindBy(xpath = "//span[text()='账户服务']")
    public WebElementFacade accountList;

    @FindBy(xpath = "//span[text()='账户信息查询']")
    public WebElementFacade accountInformationQuery;

    @FindBy(xpath = "//span[text()='账户明细查询']")
    public WebElementFacade accountDetailsQuery;

    @FindBy(xpath = "//div[@class='el-tooltip btn-icon']/img")
    public WebElementFacade detailsList;

    @FindBy(xpath = "//div[@class='el-tooltip__popper is-light']/div[1]/div[4]")
    public WebElementFacade accountDetails;

    @FindBy(xpath = "//label[@for='payerAcctObj']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade payerAccount;

    @FindBy(xpath = "//div[@x-placement=\"bottom-start\" or x-placement=\"top-start\"]/div[1]/div[1]//li")
    public WebElementFacade AccountList;
}

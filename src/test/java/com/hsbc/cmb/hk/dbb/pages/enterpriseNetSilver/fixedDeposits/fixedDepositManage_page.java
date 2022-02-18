package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.fixedDeposits;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class fixedDepositManage_page extends PageObject {
    @FindBy(xpath = "//tr[@class=\"el-table__row\"]//img")
    public List<WebElementFacade> moreMenuList;

    @FindBy(xpath = "//tr[@class=\"el-table__row\"]//td[1]//div")
    public List<WebElementFacade> fdAccountNumberList;

    @FindBy(xpath = "//button[@class=\"btn-next\"]//i")
    public WebElementFacade clickNext;

    @FindBy(xpath = "//div[text()=\"Withdraw FD\"]")
    public WebElementFacade clickWithdrawFD;

    @FindBy(xpath = "//div[text()=\"提前支取\"]")
    public WebElementFacade clickWithdrawFDCN;

    @FindBy(xpath = "//div[@class=\"detail_page-container\"]/following-sibling::div//div[2]//i")
    public WebElementFacade clickSubmit;

}

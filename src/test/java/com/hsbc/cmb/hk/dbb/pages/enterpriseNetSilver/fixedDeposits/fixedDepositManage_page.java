package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.fixedDeposits;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class fixedDepositManage_page extends PageObject {
    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr/td[9]//img")
    public List<WebElementFacade> moreMenuList;

    @FindBy(xpath = "//div[@class='pagination']//slot/span")
    public WebElementFacade click11;

    @FindBy(xpath = "//div[@class=\"el-table__body-wrapper is-scrolling-left\"]//tr//td[1]//div")
    public List<WebElementFacade> fdAccountNumberList;

    @FindBy(xpath = "//button[@class=\"btn-next\"]//i")
    public WebElementFacade clickNext;

    @FindBy(xpath = "//div[@x-placement='bottom']/div/div[2]//div[@class='btn_box']")
    public WebElementFacade clickWithdrawFD;

    @FindBy(xpath = "//div[text()=\"提前支取\"]")
    public WebElementFacade clickWithdrawFDCN;

    @FindBy(xpath = "//div[@class=\"detail_page-container\"]/following-sibling::div//div[2]//div[@class=\"btn_box\"]")
    public WebElementFacade clickSubmit;

}

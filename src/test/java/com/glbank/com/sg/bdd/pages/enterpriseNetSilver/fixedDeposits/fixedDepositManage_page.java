package com.glbank.com.sg.bdd.pages.enterpriseNetSilver.fixedDeposits;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class fixedDepositManage_page extends PageObject {
    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr/td[9]//img")
    public List<WebElementFacade> moreMenuList;

    @FindBy(xpath = "//ul[@class=\"el-menu--horizontal el-menu\"]//li[3]//div")
    public WebElementFacade clickFixedDeposit;

    @FindBy(xpath = "//div[@class=\"list\"]//p[2]/span")
    public WebElementFacade selectFirstMenu;

    @FindBy(xpath = "//div[@class='pagination']//slot/span")
    public WebElementFacade click11;

    @FindBy(xpath = "//div[@class=\"el-table__body-wrapper is-scrolling-left\"]//tr//td[5]//div")
    public List<WebElementFacade> fdAccountNumberList;

    @FindBy(xpath = "//button[@class=\"btn-next\"]//i")
    public WebElementFacade clickNext;

    @FindBy(xpath = "//div[@x-placement='bottom']/div/div[2]//div[@class='btn_box']")
    public WebElementFacade clickWithdrawFD;

    @FindBy(xpath = "//div[text()=\"提前支取\"]")
    public WebElementFacade clickWithdrawFDCN;

    @FindBy(xpath = "//div[@class=\"detail_page-container\"]/following-sibling::div//div[2]//div[@class=\"btn_box\"]")
    public WebElementFacade clickSubmit;

    @FindBy(xpath = "//div[contains(text(),' Return')]")
    public WebElementFacade clickReturnBtn;

    @FindBy(xpath = "//div[@class='el-row']//div[contains(text(),'Place Fixed Deposit')]")
    public WebElementFacade clickOverviewPagePlaceFixedDepositBtn;

    @FindBy(xpath = "//div[contains(text(),'Place Fixed Deposit')]")
    public WebElementFacade checkPlaceFixedDepositTitle;

    @FindBy(xpath = "//div[@x-placement=\"bottom\" or @x-placement=\"top\"]//div[text()='view Details']")
    public WebElementFacade clickViewDetails;

    @FindBy(xpath = "//div[@class='ui-table']/div[1]/div[4]//table[@class='el-table__body']//tr[1]/td[9]")
    public WebElementFacade clickThreePoint;

    @FindBy(xpath = "//div[contains(text(),'Which account')]")
    public WebElementFacade getWhichAccount;
}

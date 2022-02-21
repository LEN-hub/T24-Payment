package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class loanApplication_page extends PageObject {

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[4]//span")
    public WebElementFacade loan;

    @FindBy(xpath = "//div[@class='children-list']/div/div/div[1]//span")
    public WebElementFacade loanApplicationBtn;

//    微型活期透支按钮。
    @FindBy(xpath = "//div[text()='微型活期透支']")
    public WebElementFacade microDemandOverdraft;

    //贷款金额输入框。
    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[3]/div[2]/div[1]/div/div/input")
    public WebElementFacade inputLoanAmount;

    //立即申请按钮。
    @FindBy(xpath = "//div[@class='ui-container-full__body']/div/form/div[3]/div[2]/div[3]/div/div[2]/div")
    public WebElementFacade submitBtn;

    //贷款信息录入标题。
    @FindBy(xpath = "//div[@class='icon reached step']/span")
    public WebElementFacade LoanInformationEntry;
}

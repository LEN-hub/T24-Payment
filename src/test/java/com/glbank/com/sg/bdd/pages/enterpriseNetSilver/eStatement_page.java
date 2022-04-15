package com.glbank.com.sg.bdd.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class eStatement_page extends PageObject {

    @FindBy(xpath = "//div[@class='el-dropdown'][1]/div/div/div")
    public WebElementFacade myDownloadsBtn;

    @FindBy(xpath = "//li[@class='el-dropdown-menu__item'][text()='View eStatements']")
    public WebElementFacade viewEStatementsBtn;

    @FindBy(xpath = "//div[text()='eStatements Overview']")
    public WebElementFacade eStatementsOverview;

    @FindBy(xpath = "//div[text()='电子结单概况']")
    public WebElementFacade eStatementSOverviewChina;

    @FindBy(xpath = "//span[@class='el-input__suffix-inner']")
    public WebElementFacade selectBox;

    @FindBy(xpath = "//ul[@class='el-scrollbar__view el-select-dropdown__list']/li")
    public List<WebElementFacade> dataList;

    @FindBy(xpath = "//div[@class='el-form-item__content']//div[@class='ui-button primary common']/div")
    public WebElementFacade SearchBtn;

    @FindBy(xpath = "//div[@class='el-tooltip sizes-box']")
    public WebElementFacade viewLabel;

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//div[@class='cell']//div[@class='el-tooltip btn-icon']/img")
    public List<WebElementFacade> threePoint;

    @FindBy(xpath = "//div[@x-placement=\"bottom\"]/div[1]/div//div[@class='btn_box']")
    public WebElementFacade downloadPdf;

    @FindBy(xpath = "//div[@class='dialog-content']/span/div[2]//div[@class='btn_box']")
    public WebElementFacade submitBtn;

    @FindBy(xpath = "//tr[@class='el-table__row'][1]//td[5]//div[@class='btn_box']")
    public WebElementFacade downloadFirstBtn;

    @FindBy(xpath = "//div[@class='el-table__fixed-right']//tbody/tr[1]/td[5]//img")
    public WebElementFacade firstThreePoint;

    @FindBy(xpath = "//li[@class='el-dropdown-menu__item'][text()='My Downloads']")
    public WebElementFacade seeMyDownloads;

    @FindBy(xpath = "//div[@class='el-table__fixed-right']//tbody/tr[7]/td[5]//img")
    public WebElementFacade pastThreePoint;

    @FindBy(xpath = "//div[@class='el-tooltip__popper is-light']//div[@class='btn_box']")
    public WebElementFacade pastDownloads;

    @FindBy(xpath = "//li[@class='el-dropdown-menu__item'][text()='View eAdvices']")
    public WebElementFacade ViewEAdvicesBtn;

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr[@class='el-table__row'][1]/td[6]/div")
    public WebElementFacade downLoadBtn;

    @FindBy(xpath = "//div[@x-placement='bottom']//div[@class='btn_box']")
    public WebElementFacade downloadNotice;//电子通知下载按钮。
}

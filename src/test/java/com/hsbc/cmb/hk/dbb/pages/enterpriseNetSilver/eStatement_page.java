package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;

import java.security.cert.X509Certificate;
import java.util.List;

public class eStatement_page extends PageObject {

    @FindBy(xpath = "//div[@class='el-dropdown'][3]/div/div/div")
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

    @FindBy(xpath = "//div[@x-placement=\"bottom\"]/div/div[2]//div[@class='btn_box']")
    public WebElementFacade downloadPdf;

    @FindBy(xpath = "//div[@class='el-table__fixed-right']//tbody/tr[1]/td[5]//img")
    public WebElementFacade firstThreePoint;

    @FindBy(xpath = "//li[@class='el-dropdown-menu__item'][text()='My Downloads']")
    public WebElementFacade seeMyDownloads;

    @FindBy(xpath = "//div[@class='el-table__fixed-right']//tbody/tr[7]/td[5]//img")
    public WebElementFacade pastThreePoint;

    @FindBy(xpath = "//div[@x-placement=\"top\"]/div/div[2]//div[@class='btn_box']")
    public WebElementFacade pastDownloads;

    @FindBy(xpath = "//li[@class='el-dropdown-menu__item'][text()='View eAdvices']")
    public WebElementFacade ViewEAdvicesBtn;

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr[@class='el-table__row'][1]/td[6]/div")
    public WebElementFacade downLoadBtn;
}

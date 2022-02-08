package com.hsbc.cmb.hk.dbb.pages.supplyChains.bingdingRelationship;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class relationship_page extends PageObject {

    @FindBy(xpath = "//span[text()='Customer Mapping']" )
    public WebElementFacade customerMapping;

    @FindBy(xpath = "//span[text()='Customers']")
    public WebElementFacade clickCustomersMenu;

    @FindBy(xpath = "//span[text()='Relationship Management']")
    public WebElementFacade checkMappingPage;

    @FindBy(xpath = "//div[@class='lls-form-item__content']/div//input[@type='text']")
    public WebElementFacade SearchCompanyBox;

    @FindBy(xpath = "//div[@class='lls-input lls-input--suffix']/span[@class='lls-input__suffix']//span[@class='lls-input__suffix-inner']/i[@class='search-icon-btn lls-icon-search']")
    public WebElementFacade findButton;

    @FindBy(xpath = "//span[contains(text(), 'Edit')]")
    public List<WebElementFacade> editButton;

    @FindBy(xpath = "//div[@class='lls-page-header__button']//div[@class='btn-container']/div/button/span")
    public WebElementFacade createNewCounter;

    @FindBy(xpath = "//td[@title='s4@qq.com']/following-sibling::td[5]/child::div/child::div/child::span")
    public WebElementFacade deleteButton;

    @FindBy(xpath = "//span[@class='text-node-f2paac1o']")
    public WebElementFacade counterWindows;

    @FindBy(xpath = "//label[text()='Company Name']/following-sibling::div//input")
    public WebElementFacade inputCounterName;

    @FindBy(xpath = "//label[@class='lls-radio'][2]/span[@class='lls-radio__input']/span")
    public WebElementFacade downstreamCompanyButton;

    @FindBy(xpath = "//label[@class='lls-radio'][1]/span[@class='lls-radio__input']/span")
    public WebElementFacade upstreamCompanyButton;

    @FindBy(xpath = "//div[@class='btn-container center']//button[@class='lls-button lls-button--primary lls-design-btn btn-font-weight']/span")
    public WebElementFacade confirmButton;

    @FindBy(xpath = "//div[@class='lls-scrollbar']//span[text()='s4@qq.com']")
    public WebElementFacade selectEmail;

    @FindBy(xpath = "//div[@class='lls-select-dropdown__wrap lls-scrollbar__wrap']//li[6]")
    public WebElementFacade EmailElement;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//tbody//td[@data-key='f2jge6kt']")
    public List<WebElementFacade> contentList;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//td//span[@class='lls-tooltip item']")
    public List<WebElementFacade> companyNameList;

    @FindBy(xpath = "//div[@class='lls-design-container is-not-empty']/child::div/child::div[2]/child::div/child::div[5]//td[@data-key='f1581lib']")
    public List<WebElementFacade> deleteContentList;

    @FindBy(xpath = "//div[@class='lls-design-container is-not-empty']/div/div[2]/div/div[5]//tbody//button")
    public List<WebElementFacade> deleteBtnList;

    @FindBy(xpath = "//div[@class='lls-design-container is-not-empty']/div/div[2]/div/div[5]//tbody//button")
    public WebElementFacade deleteBtn;

    @FindBy(xpath = "//div[@class='lowcode-table-wrap']//tbody//td[@data-key='f0b2d00l']")
    public List<WebElementFacade> contentNum;

    @FindBy(xpath = "//span[text()='s4@qq.com']")
    public WebElementFacade newContent;

    @FindBy(xpath = "//span[contains(text(),'Create New Relationship')]")
    public WebElementFacade createNewRelationShipBtn;

    @FindBy(xpath = "//span[@class='single-line-text lls-container-row is-empty']/following-sibling::div//span[@class='lls-input__suffix']")
    public WebElementFacade companyNameSelectCheckBox;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span")
    public List<WebElementFacade> companyNameSelectList;

    @FindBy(xpath = "//button[@type='button']/span[contains(text(),'Confirm')]")
    public WebElementFacade confirmBtn;
}

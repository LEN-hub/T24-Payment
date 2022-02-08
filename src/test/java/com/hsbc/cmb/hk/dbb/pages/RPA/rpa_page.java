package com.hsbc.cmb.hk.dbb.pages.RPA;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class rpa_page extends PageObject {

    @FindBy(xpath = "//span[text()='Customers']/parent::div/i")
    public WebElementFacade Customers;

    @FindBy(xpath = "//span[text()='Contracts']/parent::div/following-sibling::div/div/span")
    public WebElementFacade ContractManagement;

    @FindBy(xpath = "//div[@data-key='f2ggi3np']//input")
    public WebElementFacade CompanyName;

    @FindBy(xpath = "//span[text()='Contract Management']")
    public WebElementFacade CompanyNameClickReset;

    @FindBy(xpath = "//span[@data-key='f266besj']//span")
    public WebElementFacade upload;

    @FindBy(xpath = "//i[@class='lls-icon-upload']")
    public WebElementFacade browse;

    //上传图片
    @FindBy(xpath = "//i[@class='lls-input__icon lls-icon-date']")
    public WebElementFacade icondata;

    @FindBy(xpath = "//div[@class='lls-picker-panel__sidebar']/button[1]")
    public WebElementFacade Data;


    @FindBy(xpath = "//div[@data-key='f3jt43aq']//span")
    public WebElementFacade confirms;

}

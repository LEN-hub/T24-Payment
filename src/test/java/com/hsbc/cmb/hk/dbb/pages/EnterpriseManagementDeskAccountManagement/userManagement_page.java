package com.hsbc.cmb.hk.dbb.pages.EnterpriseManagementDeskAccountManagement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class userManagement_page extends PageObject {
    @FindBy(xpath = "//div[@class='el-message-box__title']/span")
    public WebElementFacade popWindowsTitle;

    @FindBy(xpath = "//div[@class='el-message-box__btns']/button[2]")
    public WebElementFacade popWindowsOk;

    @FindBy(xpath = "//div[@class='ui-layout-header-aside-content']//li[6]//span")
    public WebElementFacade EnterpriseManagementDesk; //企业管理台

    @FindBy(xpath = "//div[@class='children-list']//p[4]//span")
    public WebElementFacade AccountManagement; //用户管理

    @FindBy(xpath = "//div[@aria-describedby='el-tooltip-4593']/img")
    public WebElementFacade theMenu; //菜单

    @FindBy(xpath = "//div[@id='el-tooltip-4593']/div/div[1]//div[@class='btn_box']")
    public WebElementFacade modifyInformation;  //信息修改

    @FindBy(xpath = "//label[@for='mobilePhoneNo']/following-sibling::div/div[2]/input")
    public WebElementFacade mobilePhoneNo; //修改电话

    @FindBy(xpath = "//div[@class='tree-box']/following-sibling::div/div[2]/div/div")
    public WebElementFacade clickNext;

    @FindBy(xpath = "//div[@class='function-box']/following-sibling::div/div[2]//div[@class='btn_box']")
    public WebElementFacade sumbits;

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade codeNext;  //TC码

//需要验证


//新增用户
    @FindBy(xpath = "//div[@class='ui-container-full__body']/div/div[2]/div/div")
    public WebElementFacade addUsers;

    @FindBy(xpath = "//label[@for='callNm']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade call; //称呼

    @FindBy(xpath = "//div[@class='el-select-dropdown el-popper']//li[1]/span")
    public WebElementFacade Mr;

    @FindBy(xpath = "//label[@for='userNm']/following-sibling::div//input")
    public WebElementFacade sendkeyName;

    @FindBy(xpath = "//label[@for='certfctTypeCd']/following-sibling::div/label[2]//span[@class='el-radio__inner']")
    public WebElementFacade clickPassport;

}

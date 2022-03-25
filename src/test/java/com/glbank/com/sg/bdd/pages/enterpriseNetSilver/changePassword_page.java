package com.glbank.com.sg.bdd.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class changePassword_page extends PageObject {

    @FindBy(xpath = "//label[@for='passwd']/following-sibling::div/div[1]/span")
    public WebElementFacade forgotPassword;

    @FindBy(xpath = "//label[@for='custNo']/following-sibling::div//input")
    public WebElementFacade inputCustomerNumber;

    //后管平台用户名输入框。
    @FindBy(xpath = "//input[@placeholder='用户名']")
    public WebElementFacade userName;

    @FindBy(xpath = "//input[@placeholder='密码']")
    public WebElementFacade password;

    @FindBy(xpath = "//span[text()='登录']")
    public WebElementFacade logonBtn;

    @FindBy(xpath = "//div[@class='el-submenu__title']//span[text()='客户中心']")
    public WebElementFacade customerCenter;

    @FindBy(xpath = "//span[text()='企业电子银行签约维护']")
    public WebElementFacade contractMaintenance;

    @FindBy(xpath = "//span[text()='企业电子银行签约维护']/parent::div/following-sibling::ul//span[text()='企业用户管理']")
    public WebElementFacade UserManagement;

    @FindBy(xpath = "//input[@placeholder='请输入企业客户号']")
    public WebElementFacade inputClientNumber;

    @FindBy(xpath = "//div[text()='查询']")
    public WebElementFacade selectBtn;

    @FindBy(xpath = "//div[@class='white-bg']/div[3]//div[@class='el-table__fixed-body-wrapper']//tr//button[@class='el-button el-button--text el-button--small']")
    public WebElementFacade check;

    @FindBy(xpath = "//form[@class='el-form demo-ruleForm']/div[5]/div[4]//tbody//td[9]/div/button/span[text()='详情']")
    public List<WebElementFacade> detailsBtn;

    @FindBy(xpath = "//div[@class='el-table__fixed-header-wrapper']//div[text()='授权级别']")
    public WebElementFacade AuthorizationLevel;

    @FindBy(xpath = "//span[text()='电子邮箱']/following-sibling::span")
    public WebElementFacade emailData;

    @FindBy(xpath = "//span[text()='手机号码']/following-sibling::span")
    public WebElementFacade iphoneNumber;

    @FindBy(xpath = "//span[text()='证件号码']/following-sibling::span")
    public WebElementFacade idNumber;

    @FindBy(xpath = "//span[text()='证件类型']/following-sibling::span")
    public WebElementFacade idType;

    @FindBy(xpath = "//div[text()='返回']")
    public WebElementFacade returnPage;

    @FindBy(xpath = "//div[@class='el-form-item__content']//label[@class='el-radio'][1]/span[1]")
    public WebElementFacade idCardBtn;//身份证

    @FindBy(xpath = "//div[@class='el-form-item__content']//label[@class='el-radio'][2]/span[1]")
    public WebElementFacade passPortBtn;//护照

    @FindBy(xpath = "//label[@for='certfctNo']/following-sibling::div//input")
    public WebElementFacade idCardInputBox;

    @FindBy(xpath = "//div[@class='iddbox login_input']//input")
    public WebElementFacade countryCode;

    @FindBy(xpath = "//ul[@class='flag_box-ul']/li")
    public WebElementFacade countryName;

    @FindBy(xpath = "//label[@for='mobilePhoneNo']/following-sibling::div//input")
    public WebElementFacade iphoneInputBox;

    @FindBy(xpath = "//div[@class='pwd-div']/form[1]/div[5]/div[1]/div/div")
    public WebElementFacade getCodeBtn;

    @FindBy(xpath = "//div[@class='codebox-wrapper']/div[2]/span")
    public WebElementFacade codeInputBox;

    //填验证码的框框
    @FindBy(xpath = "//div[@class='codebox']/span[1]")
    public WebElementFacade sendKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[2]")
    public WebElementFacade secondKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[3]")
    public WebElementFacade thirdKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[4]")
    public WebElementFacade fourKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[5]")
    public WebElementFacade fiveKeysBox;

    @FindBy(xpath = "//div[@class='codebox']/span[6]")
    public WebElementFacade sixKeysBox;

    @FindBy(xpath = "//label[@for='emailAddr']/following-sibling::div//input")
    public WebElementFacade emailInputBox;

    @FindBy(xpath = "//div[@class='pwd-div']//div[5]/div[2]//div[@class='btn_box']")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//form[@class='el-form out_form rest-pwd-form el-form--label-left']//div[@class='el-form-item el-form-item--medium'][1]//input")
    public WebElementFacade newPassword;

    @FindBy(xpath = "//form[@class='el-form out_form rest-pwd-form el-form--label-left']//div[@class='el-form-item el-form-item--medium'][2]//input")
    public WebElementFacade confirmNewPassword;

    @FindBy(xpath = "//form[@class='el-form out_form rest-pwd-form el-form--label-left']/div[3]//div[@class='btn_box']")
    public WebElementFacade confirmBtn;
}

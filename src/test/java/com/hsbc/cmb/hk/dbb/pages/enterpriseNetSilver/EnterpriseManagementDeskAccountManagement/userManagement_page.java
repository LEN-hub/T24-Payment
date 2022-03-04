package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class userManagement_page extends PageObject {
    @FindBy(xpath = "//div[@class='el-message-box__title']/span")
    public WebElementFacade popWindowsTitle;

    @FindBy(xpath = "//div[@class='el-message-box__btns']/button[2]")
    public WebElementFacade popWindowsOk;

    @FindBy(xpath = "//div[@class='ui-layout-header-aside-content']//li[6]//span")
    public WebElementFacade EnterpriseManagementDesk; //企业管理台

    @FindBy(xpath = "//div[@class='children-list']//p[4]//span")
    public WebElementFacade accountManagement; //用户管理

    @FindBy(xpath = "//div[@class='pagination']//slot/span")
    public WebElementFacade  record;  //点击空白处

    @FindBy(xpath = "//div[@class='el-table__fixed-body-wrapper']//tr[10]/td[7]/div/div/img")
    public WebElementFacade theMenu; //菜单

    @FindBy(xpath = "//div[@role='tooltip']/div/div[1]//div[@class='btn_box']")
    public WebElementFacade modifyInformation;  //信息修改

    @FindBy(xpath = "//label[@for='mobilePhoneNo']/following-sibling::div/div[2]/input")
    public WebElementFacade mobilePhoneNo; //修改电话

    @FindBy(xpath = "//div[@class='tree-box']/following-sibling::div/div[2]/div/div")
    public WebElementFacade clickNext;

    @FindBy(xpath = "//div[@class='function-box']/following-sibling::div/div[2]//div[@class='btn_box']")
    public WebElementFacade sumbits;

    @FindBy(xpath = "//div[text()='Next']")
    public WebElementFacade codeNext;  //TC码

    @FindBy(xpath = "//div[@class='codebox']/span[1]")
    public WebElementFacade firstTCCode;

    @FindBy(xpath = "//div[@class='codebox']/span[2]")
    public WebElementFacade secondTCCode;

    @FindBy(xpath = "//div[@class='codebox']/span[3]")
    public WebElementFacade thirdTCCode;

    @FindBy(xpath = "//div[@class='codebox']/span[4]")
    public WebElementFacade fourTCCode;

    @FindBy(xpath = "//div[@class='codebox']/span[5]")
    public WebElementFacade fiveTCCode;

    @FindBy(xpath = "//div[@class='codebox']/span[6]")
    public WebElementFacade sixTCCode;

    @FindBy(xpath = "//div[@class='codebox']/span[7]")
    public WebElementFacade sevenTCCode;

    @FindBy(xpath = "//div[@class='codebox']/span[8]")
    public WebElementFacade eightTCCode;

    @FindBy(xpath = "//div[@class='demo-tips']/div[4]//div[@class='btn_box']")
    public WebElementFacade clcikNextBtn;  //获取TC码后点击下一步

    @FindBy(xpath = "//div[@class='codebox']/span[1]")
    public WebElementFacade enterFirstTcCode;

    @FindBy(xpath = "//div[@class='codebox']/span[2]")
    public WebElementFacade enterSecondeTcCode;

    @FindBy(xpath = "//div[@class='codebox']/span[3]")
    public WebElementFacade enterThirdTcCode;

    @FindBy(xpath = "//div[@class='codebox']/span[4]")
    public WebElementFacade enterFourTcCode;

    @FindBy(xpath = "//div[@class='codebox']/span[5]")
    public WebElementFacade enterFiveTcCode;

    @FindBy(xpath = "//div[@class='codebox']/span[6]")
    public WebElementFacade enterSixTcCode;

    @FindBy(xpath = "//div[@class='step-box']/div[4]//div[@class='btn_box']")
    public WebElementFacade authenticateNowBtn;


//需要验证


//新增用户
    @FindBy(xpath = "//div[@class='ui-container-full__body']/div/div[2]/div/div")
    public WebElementFacade addUsers;

    @FindBy(xpath = "//label[@for='callNm']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade call; //称呼

    @FindBy(xpath = "//div[@class='el-select-dropdown el-popper']//li[1]/span")
    public WebElementFacade Mr;

    @FindBy(xpath = "//label[@for='userNm']/following-sibling::div//input")
    public WebElementFacade sendKeyName;

    @FindBy(xpath = "//label[@for='certfctTypeCd']/following-sibling::div/label[2]//span[@class='el-radio__inner']")
    public WebElementFacade clickPassport; //护照

    @FindBy(xpath = "//label[@for='certfctTypeCd']/following-sibling::div//div[1]//div[@class='inputWidth el-input el-input--medium']/input")
    public WebElementFacade PassportNumber; //输入护照

    @FindBy(xpath = "//label[@for='certfctTypeCd']")
    public WebElementFacade disappear;

    @FindBy(xpath = "//label[@for='certfctTypeCd']/following-sibling::div//div[2]//div/div/input")
    public WebElementFacade TimeLimit;  //输入护照期限

    @FindBy(xpath = "//label[@for='birthDate']/parent::div//input")
    public WebElementFacade birthday;  //输入

    @FindBy(xpath = "//div[@class='iddbox']//input")
    public WebElementFacade countries;  //国家

    @FindBy(xpath = "//ul[@class='flag_box-ul']/li[1]/div/span")
    public WebElementFacade chinese;

    @FindBy(xpath = "//div[@class='iddbox']/following-sibling::div/input")
    public WebElementFacade pNumber;

    @FindBy(xpath = "//div[@class='ui-button secondary common']/div/div")
    public WebElementFacade validation; //验证手机号

    @FindBy(xpath = "//div[@class='codebox']/span[1]")
    public WebElementFacade sendKeysBox; //填验证码的框框

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
    public WebElementFacade keysEmail;  //输入邮箱

    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']//tbody/tr/td[6]/div")
    public List<WebElementFacade> checkEmail;

    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']//tbody/tr/td[7]/div")
    public List<WebElementFacade> moreEdit;

    @FindBy(xpath = "//tr[@class='el-table__row']/td[5]/div")
    public List<WebElementFacade> status;

    @FindBy(xpath = "//ul[@class='el-pager']/li")
    public List<WebElementFacade> sumNum;

    @FindBy(xpath = "//div[@class='ui-button secondary common']//div[@class='btn_box']")
    public WebElementFacade validationEmail;  //验证邮箱

    @FindBy(xpath = "//div[@class='el-table__header-wrapper']//span[@class='el-checkbox__inner']")
    public WebElementFacade permissions;  //账户权限全选

    @FindBy(xpath = "//div[@class='tree-box']/following-sibling::div/div[2]//div[@class='btn_box']")
    public WebElementFacade clickNextOne;  //下一步和提交都能调用//调两遍


    @FindBy(xpath = "//div[@class='demo-tips']/div[4]//div[@class='btn_box']")
    public WebElementFacade clcikNextBtns;  //获取TC码后点击下一步***

    @FindBy(xpath = "//div[@class='trade-status']//div[2]")
    public WebElementFacade successful;

    @FindBy(xpath = "//div[@class='trade-status']//div[2]")
    public WebElementFacade successfulEnglish;
//停用此用户

   @FindBy(xpath = "//div[@role='tooltip']/div/div[4]//div[@class='btn_box']")
    public WebElementFacade stopUser; //停用用户

   @FindBy(xpath = "//div[@class='dialog-content']/span/div[1]//div[@class='btn_box']")
   public WebElementFacade sure; //确定

    @FindBy(xpath = "//div[@class='el-dialog__wrapper large-dialog middle-left']/div/div[2]/div[2]/span/button/span")
    public WebElementFacade complete; //操作成功，点击完成

    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']//tr[3]/td[5]/div")
    public WebElementFacade JudgeChinese;

    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']//tr[3]/td[5]/div")
    public WebElementFacade JudgeEnglish;



//启用此用户
   @FindBy(xpath = "//div[@role='tooltip']/div/div[3]//div[@class='btn_box']")
   public WebElementFacade startUser; //启动用户

    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']//tr[3]/td[5]/div")
    public WebElementFacade JudgesChinese;

    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']//tr[3]/td[5]/div")
    public WebElementFacade JudgesEnglish;



//用户注销

    @FindBy(xpath = "//div[@x-placement='bottom']/div/div[5]//div[@class='btn_box']")  //点击注销
    public WebElementFacade logOut;

}

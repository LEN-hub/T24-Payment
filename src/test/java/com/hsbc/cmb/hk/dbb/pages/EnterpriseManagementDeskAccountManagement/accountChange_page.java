package com.hsbc.cmb.hk.dbb.pages.EnterpriseManagementDeskAccountManagement;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class accountChange_page extends PageObject {

    @FindBy(xpath = "//div[@class='el-message-box__title']/span")
    public WebElementFacade popWindowsTitle;

    @FindBy(xpath = "//div[@class='el-message-box__btns']/button[2]")
    public WebElementFacade popWindowsOk;

    @FindBy(xpath = "//div[@class='ui-layout-header-aside-content']//li[6]//span")
    public WebElementFacade EnterpriseManagementDesk; //企业管理台

    @FindBy(xpath = "//div[@class='children-list']//p[3]//span")
    public WebElementFacade AccountManagement; //账户管理

    @FindBy(xpath = "//div[@class='ui-container-full__body']/div/div/following-sibling::div//img")
    public WebElementFacade ModifyList;  //修改列表

    @FindBy(xpath = "//div[@class='el-tooltip__popper is-light']/div/div[3]/div/div/div")
    public WebElementFacade Modify;  //修改点击

    @FindBy(xpath = "//div[@aria-label='checkbox-group']/label/following-sibling::label[2]/span/span")
    public WebElementFacade financial;//点击理财

    @FindBy(xpath = "//div[@class='el-table__header-wrapper']//span/span")
    public WebElementFacade numberList; //序号全选列表

    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']//tr[1]/td[1]//span/span")
    public WebElementFacade firstPeople; //第一个人选

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[3]/div[@class='el-col el-col-14']/div[2]/div")
    public WebElementFacade next;  //下一步

    @FindBy(xpath = "//div[@submitinfo='[object Object]']/div[2]/div[3]/div/div")
    public WebElementFacade submitChange; //提交

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


    //需要手机APP读取网页8位验证码，输入手机后，点击next，输入手机上的6位验证码，提交即成功；


//账户加挂
    @FindBy(xpath = "//div[@style='margin: 24px 16px 0px 0px;']/div/div")  //点击账户加挂
    public WebElementFacade linkAccount;

    @FindBy(xpath = "//i[@class='el-select__caret el-input__icon el-icon-arrow-up']")
    public WebElementFacade accountSelect; //下拉框

    @FindBy(xpath = "//div[@class='el-scrollbar']//li/span")
    public WebElementFacade accountChoose; //账户选择

    //选择理财，上面脚本直接引用

    @FindBy(xpath = "//div[@style='margin: 40px 0px 0px;']/div/div")
    public WebElementFacade submit1;//提交


    //CA账户开立
    @FindBy(xpath = "//div[@style='margin: 24px 0px 0px;']/div/div")
    public WebElementFacade accountOpening;  //点击账户开立

//引用上个脚本下拉框

    @FindBy(xpath = "//span[text()='Current Account']")
    public WebElementFacade CA;
//账户权限选择转账和理财
    @FindBy(xpath = "//div[@class='el-form-item is-required el-form-item--medium']/following-sibling::div//div[@role='group']/label[2]/span/span")
    public WebElementFacade transfer;

    @FindBy(xpath = "//div[@class='el-form-item is-required el-form-item--medium']/following-sibling::div//div[@role='group']/label[3]/span/span")
    public WebElementFacade chooseFinancial;

//选择下一步

    @FindBy(xpath = "//div[@class='row p15']//span[@class='el-checkbox__inner']")
    public WebElementFacade agree;

    @FindBy(xpath = "//div[@class='detail_page-container']/following-sibling::div[3]/div[2]/div/div")
    public WebElementFacade nextSubmit;



    //MCA账户开立

    @FindBy(xpath = "//span[text()='Multi-Currency Account']")
    public WebElementFacade MCA;
}

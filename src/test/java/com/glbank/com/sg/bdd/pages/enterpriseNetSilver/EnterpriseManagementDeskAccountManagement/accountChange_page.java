package com.glbank.com.sg.bdd.pages.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.List;

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

    @FindBy(xpath = "//div[@class='demo-tips']/div[4]//div[@class='btn_box']")
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
    public WebElementFacade clickNextBtn;  //获取TC码后点击下一步

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


//账户加挂

    @FindBy(xpath = "//div[@class='container-component']//div[@class='ui-button primary common'][1]/div/div")  //点击账户加挂
    public WebElementFacade linkAccount;

    @FindBy(xpath = "//i[@class='el-select__caret el-input__icon el-icon-arrow-up']")
    public WebElementFacade accountSelect; //下拉框

    @FindBy(xpath = "//div[@class='el-scrollbar']//li/span")
    public WebElementFacade accountChoose; //账户选择

    @FindBy(xpath = "//div[@style='margin: 40px 0px 0px;']/div/div")
    public WebElementFacade submit1;//提交


//CA账户开立

    @FindBy(xpath = "//div[@class='container-component']//div[@class='ui-button primary common'][2]/div/div")
    public WebElementFacade accountOpening;  //点击账户开立

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span")
    public List<WebElementFacade> CA;

    @FindBy(xpath = "//div[@class='el-radio-group']/label[1]/span[1]")
    public WebElementFacade selectCurrencySGD;  //点击账户开立

    @FindBy(xpath = "//div[@class='el-radio-group']/label[2]/span[1]")
    public WebElementFacade selectCurrencyCNY;  //点击账户开立

    @FindBy(xpath = "//div[@class='el-radio-group']/label[3]/span[1]")
    public WebElementFacade selectCurrencyUSD;  //点击账户开立

    @FindBy(xpath = "//div[@class='el-radio-group']/label[4]/span[1]")
    public WebElementFacade selectCurrencyHKD;  //点击账户开立

    @FindBy(xpath = "//div[@class='el-radio-group']/label[5]/span[1]")
    public WebElementFacade selectCurrencyEUR;  //点击账户开立

    @FindBy(xpath = "//div[@class='el-form-item is-required el-form-item--medium']/following-sibling::div//div[@role='group']/label[2]/span/span")
    public WebElementFacade transfer;//账户权限选择转账和理财

    @FindBy(xpath = "//div[@class='el-form-item is-required el-form-item--medium']/following-sibling::div//div[@role='group']/label[3]/span/span")
    public WebElementFacade chooseFinancial;

    @FindBy(xpath = "//div[@class='row p15']//span[@class='el-checkbox__inner']")
    public WebElementFacade agree;

    @FindBy(xpath = "//div[@class='row']//span[@class='el-checkbox__inner']")
    public WebElementFacade getAgree;

    @FindBy(xpath = "//div[@class='detail_page-container']/following-sibling::div[3]/div[2]/div/div")
    public WebElementFacade nextSubmit;


//MCA账户开立

    @FindBy(xpath = "//div[@class='el-checkbox-group']/label[2]/span[1]")
    public WebElementFacade mcaCNY; //选择MCA账户开立

    @FindBy(xpath = "//div[@class='el-checkbox-group']/label[3]/span[1]")
    public WebElementFacade mcaUSD; //选择MCA账户开立

    @FindBy(xpath = "//div[@class='el-checkbox-group']/label[4]/span[1]")
    public WebElementFacade mcaHKD; //选择MCA账户开立

    @FindBy(xpath = "//div[@class='el-checkbox-group']/label[5]/span[1]")
    public WebElementFacade mcaEUR; //选择MCA账户开立


//授权模式

    @FindBy(xpath = "//div[@class='children-list']//p[2]//span")
    public WebElementFacade Authorization;

    @FindBy(xpath = "//div[@class='el-col el-col-23']/div[4]/div/div")
    public WebElementFacade changeAuthorization;

    @FindBy(xpath = "//div[@id='mode-choose']/div/div/div[2]//img")
    public WebElementFacade singleASingle;  //单人授权

    @FindBy(xpath = "//div[@id='mode-choose']/div/div/div[3]//img")
    public WebElementFacade dualASingle;  //双人授权

    @FindBy(xpath = "//div[@id='mode-choose']/div/div/div[1]//img")
    public WebElementFacade aSingle;  //无授权

    @FindBy(xpath = "//div[@id='other-mode']//div[2]//div[@class='btn_box']")
    public WebElementFacade confirmBt;

    @FindBy(xpath = "//div[@class='dialog-content']//span/div[1]//div[@class='btn_box']")
    public WebElementFacade determine;

    @FindBy(xpath = "//div[@class='ui-button primary common is-block']//div[@class='btn_box']")
    public WebElementFacade secondaryAuthorization; //双人授权需要选择二级授权人员


//新增币种

    @FindBy(xpath = "//div[@x-placement='bottom']/div/div[1]//div[@class='btn_box']")
    public WebElementFacade currencyManagement;  //币种管理

    @FindBy(xpath = "//div[@class='detail_page-container']/following-sibling::div/div[3]//div[@class='btn_box']")
    public WebElementFacade addCurrency;  //新增币种

    @FindBy(xpath = "//div[@role='radiogroup']/label[1]/span[1]/span")
    public WebElementFacade selectCurrency; //选择要勾选的币种

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div/following-sibling::div//div[@class='ui-button primary common']/div/div")
    public WebElementFacade nextCurrency;   //点击下一步

    @FindBy(xpath = "//div[@class='detail_page-container']/following-sibling::div/div[2]//div[@class='btn_box']")
    public WebElementFacade submitCurrency; //提交

    @FindBy(xpath = "//div[@class='trade-status']//div[2]")
    public WebElementFacade waitinAauthorization;


    //删除币种

    @FindBy(xpath = "//div[@class='detail_page-container']/following-sibling::div/div[2]//div[@class='btn_box']")
    public WebElementFacade delCurrency;  //删除币种

    @FindBy(xpath = "//label[@for='delCurrency']/following-sibling::div//i")
    public WebElementFacade removeCurrencyBox; //点击删除币种下拉框

    @FindBy(xpath = "//div[@class='el-dialog__wrapper pdf-dialog']/following-sibling::div[3]/div/div[1]//li[1]/span")
    public WebElementFacade selectRemoveCurrency; //选择

    @FindBy(xpath = "//label[@for='delCurrency']/parent::div/following-sibling::div[1]//i")
    public WebElementFacade balanceToBox; //余额转入下拉框

    @FindBy(xpath = "//div[@class='el-dialog__wrapper pdf-dialog']/following-sibling::div[4]//ul/li[1]/span")
    public WebElementFacade selectCount;  //选择账户

    @FindBy(xpath = "//label[@for='delCurrency']/parent::div/following-sibling::div[2]//i")
    public WebElementFacade currencyBox;  //币种点击下拉框

    @FindBy(xpath = "//div[@class='el-dialog__wrapper pdf-dialog']/following-sibling::div[5]//ul/li[1]/span")
    public WebElementFacade selectCurrencyBt;  //选择币种

    @FindBy(xpath = "//div[contains(text(),'Total Number Of')]/parent::div/following-sibling::div[1]/div[1]//img")
    public WebElementFacade clickThreePoint;

    @FindBy(xpath = "//div[@x-placement=\"bottom\" or @x-placement=\"top\"]//div[text()='Detail']")
    public WebElementFacade clickDetail;

    @FindBy(xpath = "//div[text()='Account Details']")
    public WebElementFacade checkAccountDetails;

    @FindBy(xpath = "//div[@x-placement=\"bottom\" or @x-placement=\"top\"]//div[text()='Authority Management']")
    public WebElementFacade clickAuthorityManagement;

    @FindBy(xpath = "//div[contains(text(),'Next')]")
    public WebElementFacade clickNextButton;

    @FindBy(xpath = "//div[text()='Submit']")
    public WebElementFacade clickSubmitBtn;
}

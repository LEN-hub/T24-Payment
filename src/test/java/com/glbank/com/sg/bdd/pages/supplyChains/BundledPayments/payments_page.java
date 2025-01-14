package com.glbank.com.sg.bdd.pages.supplyChains.BundledPayments;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class payments_page extends PageObject{

    @FindBy(xpath = "//span[text()='Operations']")
    public WebElementFacade operationsList;  //放款列表

    @FindBy(xpath = "//span[text()='Request For Disbursement']")
    public WebElementFacade requestDisbursement;  //放款下拉框

    @FindBy(xpath ="//div[@data-key='f1ioscbb']/button/span")
    public WebElementFacade editGroup;   //新建组

    @FindBy(xpath ="//div[@data-key='f2dgniq3']//span/button[2]/span")
    public WebElementFacade Confirm;

   @FindBy(xpath ="//div[@data-key='f2a0g0cb']//input")
   public WebElementFacade RequesterOne;   //通过供应商筛选值放款的用户

   @FindBy(xpath = "//div[@data-key='f0en9ob2']//input")
   public WebElementFacade requestTian;

    @FindBy(xpath = "//div[@data-key='f224avg9']//input")
    public WebElementFacade requestParTian;

    @FindBy(xpath ="//label[text()='Requester']")  //空白处
    public WebElementFacade Reset;

    @FindBy(xpath ="//span[@data-key='f2r0o090']/button/span")
    public WebElementFacade assignToMe;  //筛选出来分配给我

    @FindBy(xpath ="//div[@aria-controls='pane-1']/span")
    public WebElementFacade AssignToMeS;  //点击分配给我列表

   @FindBy(xpath ="//div[@data-key='f0bvpsgo']//input")
    public WebElementFacade RequesterTwo;   //通过供应商筛选值

   @FindBy(xpath = "//div[@data-key='f0rtkmfs']//input")
    public WebElementFacade repaymentRequest;

    @FindBy(xpath = "//div[@data-key='f2i00scg']//input")
    public WebElementFacade parRepaymentRequest;

    @FindBy(xpath ="//span[@data-key='f21orqn5']//span")
    public  WebElementFacade Proceed;   //审核

    @FindBy(xpath = "//span[@data-key='f2se0b39']//span")
    public WebElementFacade proceedNew;

    @FindBy(xpath = "//span[@data-key='f2bv6j95']//span")
    public WebElementFacade proceedNew1;

    @FindBy(xpath ="//label[text()='Remittance Fee Paid by']/parent::div//span/span")
    public  WebElementFacade remittanceFeePaidby;

    @FindBy(xpath = "//div[@class='payment-request-component']/div[3]//tbody//td[17]//div[@class='lls-input']/input")
    public List<WebElementFacade> AdjustAmout;

    @FindBy(xpath ="//span[text()='SHA']")
    public  WebElementFacade SHA;

    @FindBy(xpath ="//label[@for='sellerReveiveBankName']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public  WebElementFacade SupplierBank;

    @FindBy(xpath ="//div[@class='lls-input lls-input--suffix is-focus']/following-sibling::div//li/span")
    public  WebElementFacade GLDB;

    @FindBy(xpath ="//label[text()='Account No.']/parent::div//span/span")
    public  WebElementFacade AccountNo;

    @FindBy(xpath ="//div[@class='lls-input lls-input--suffix is-focus']/following-sibling::div//li/span")
    public  WebElementFacade NUMBER;

    @FindBy(xpath ="//span[text()='Submit']")
    public  WebElementFacade Submit;

    @FindBy(xpath = "//div[@id='tab-2']/span")
    public WebElementFacade complete; //点击已完成核对

    @FindBy(xpath ="//div[@data-key='f1eqn01p']//input")
    public WebElementFacade Requester1;  //未分配界面通过买家筛选值


    //第二个

    @FindBy(xpath ="//span[text()='Request For Disbursement']/parent::div/following-sibling::div[1]/span")
    public  WebElementFacade ReviewDisbursement;  //点击查看付款

    @FindBy(xpath ="//div[@data-key='f2kk04pf']//input")
    public WebElementFacade Requester3;  //未分配界面通过买家筛选值

    @FindBy(xpath = "//span[@data-key='f29pjeiu']/button/span")
    public WebElementFacade assignToMe2;  //分配给我

    @FindBy(xpath = "//div[@data-key='f05m5m0n']//input")
    public WebElementFacade Requester5; //输入筛选值

    @FindBy(xpath ="//div[@class='btn-container center']/div[3]//span")
    public  WebElementFacade APPROVE;  //提交审批

    @FindBy(xpath = "//div[@data-key='f1l6svfn']//input")
    public WebElementFacade Requester6;  //未分配界面输入筛选值

    //第三个
    @FindBy(xpath ="//span[text()='Request For Disbursement']/parent::div/following-sibling::div[2]/span")
    public  WebElementFacade ConfirmDisbursement;  //付款请求确认

    @FindBy(xpath = "//div[@id='tab-1']/span")
    public WebElementFacade completed;

    @FindBy(xpath ="//div[@data-key='f3ksiueo']//input")
    public  WebElementFacade Requester4;  //已完成中输入筛选值，查看是否成功

 @FindBy(xpath ="//div[@data-key='f2q385s2']//input")
 public  WebElementFacade Requester12;

 //还款
    @FindBy(xpath = "//span[text()='Batch Repayment']")
    public WebElementFacade batchRepaymentBtn;

    @FindBy(xpath = "//span[text()='Partial Repayment Management']")
    public WebElementFacade parRepayMent;

    @FindBy(xpath = "//span[text()='Repayment Management']")
    public WebElementFacade repaymentTitle;

    @FindBy(xpath = "//td[@data-key='f0po7dup']")
    public List<WebElementFacade> requesterList;

    @FindBy(xpath = "//span[@data-key='f2uklkic']/button/span")
    public List<WebElementFacade> assignToMeList;

    @FindBy(xpath = "//span[@data-key='f1s5m0bn']/button/span")
    public List<WebElementFacade> parAssignToMeList;

    @FindBy(xpath = "//td[@data-key='f07v6rpo']")
    public List<WebElementFacade> RequestList;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//span[@data-key='f3tpnu1h']//span[contains(text(),'Proceed')]")
    public List<WebElementFacade> proceedList;

    @FindBy(xpath = "//div[@class='repayment-title']")
    public WebElementFacade repaymentDetail;

    @FindBy(xpath = "//div[@class='lls-input lls-input--suffix']//input[@class='lls-input__inner']")
    public WebElementFacade selectLabel;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//span")
    public WebElementFacade accountLabel;

    @FindBy(xpath = "//label[@for='actualRepayAmount']//following-sibling::div//input")
    public WebElementFacade repaymentAmount;

    @FindBy(xpath = "//div[@class='lls-form-item is-success is-required']/label[@for='receiveFee']//following-sibling::div")
    public WebElementFacade commission;

    @FindBy(xpath = "//div[@class='lls-date-editor lls-input lls-input--suffix lls-date-editor--date']/input")
    public WebElementFacade repaymentData;

    @FindBy(xpath = "//button[@class='lls-button lls-button--primary']/span")
    public WebElementFacade submitBtn;

    @FindBy(xpath = "//span[text()='Financing Reports']")
    public WebElementFacade FinReport;

    @FindBy(xpath = "//label[text()='Financing ID']/following-sibling::div//input")
    public WebElementFacade FinIDInput;

    @FindBy(xpath = "//span[text()='Report']")
    public WebElementFacade reportBtn;

    @FindBy(xpath = "//td[@data-key='f38lqoae']")
    public WebElementFacade PaymentReferenceID;

}

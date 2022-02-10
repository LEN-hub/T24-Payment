package com.hsbc.cmb.hk.dbb.pages.BundledPayments;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;
import java.util.List;

public class payments_page extends PageObject{

    @FindBy(xpath = "//span[text()='Operations']")
    public WebElementFacade operationsList;

    @FindBy(xpath = "//span[text()='Request For Disbursement']")
    public WebElementFacade requestDisbursement;

    @FindBy(xpath ="//div[@data-key='f1ioscbb']/button/span")
    public WebElementFacade editGroup;

    @FindBy(xpath ="//span[text()='Confirm']")
    public WebElementFacade Confirm;

   @FindBy(xpath ="//div[@data-key='f1vmapd3']//div/input")
   public WebElementFacade buyerS;   //通过买家筛选值

    @FindBy(xpath ="//p[@class='lls-form-item']//i")  //刷新
    public WebElementFacade Reset;

    @FindBy(xpath ="//span[@data-key='f2r0o090']/button/span")
    public WebElementFacade assignToMe;

    @FindBy(xpath ="//div[@aria-controls='pane-1']")
    public WebElementFacade AssignToMeS;

//    @FindBy(xpath ="//div[@data-key='f1vmapd3']//div/input")
//    public WebElementFacade buyerS;   //通过买家筛选值

    @FindBy(xpath ="//span[@data-key='f3oj1ki5']/button/span")
    public  WebElementFacade Proceed;

    @FindBy(xpath ="//*[text()='Remittance Fee Paid by']/parent::div//span/span")
    public  WebElementFacade remittanceFeePaidby;

    @FindBy(xpath ="////span[text()='SHA']")
    public  WebElementFacade SHA;

    @FindBy(xpath ="//*[text()='Supplier Bank']/parent::div//span/span")
    public  WebElementFacade SupplierBank;

    @FindBy(xpath ="//div[@class='lls-input lls-input--suffix is-focus']/following-sibling::div//li")
    public  WebElementFacade GLDB;

    @FindBy(xpath ="//*[text()='Account No.']/parent::div//span/span")
    public  WebElementFacade AccountNo;

    @FindBy(xpath ="//div[@class='lls-input lls-input--suffix is-focus']/following-sibling::div//li")
    public  WebElementFacade NUMBER;

    @FindBy(xpath ="//span[text()='Submit']")
    public  WebElementFacade Submit;

    //第二个

    @FindBy(xpath ="//span[text()='Request For Disbursement']/parent::div/following-sibling::div/span")
    public  WebElementFacade ReviewDisbursement;

    //通过买家筛选值
    @FindBy(xpath ="////span[@data-key='f21orqn5']/button/span")
    public  WebElementFacade PROCEEDS;

    @FindBy(xpath ="////div[@data-key='f2jule36']//span")
    public  WebElementFacade APPROVE;

//第三个
    @FindBy(xpath ="//span[text()='Confirm Disbursement']")
    public  WebElementFacade ConfirmDisbursement;


    @FindBy(xpath = "//span[text()='Batch Repayment']")
    public WebElementFacade batchRepaymentBtn;

    @FindBy(xpath = "//span[text()='Repayment Management']")
    public WebElementFacade repaymentTitle;

    @FindBy(xpath = "//td[@data-key='f0po7dup']")
    public List<WebElementFacade> requesterList;

    @FindBy(xpath = "//div[@class='lowcode-table-fixed-right']//span[@data-key='f2uklkic']//span")
    public List<WebElementFacade> assignToMeList;

    @FindBy(xpath = "//td[@data-key='f07v6rpo']")
    public List<WebElementFacade> RequestList;

    @FindBy(xpath = "//div[@class='lowcode-table-base']//span[@data-key='f3tpnu1h']//span[contains(text(),'Proceed')]")
    public List<WebElementFacade> proceedList;

    @FindBy(xpath = "//div[@class='repayment-title']")
    public WebElementFacade repaymentDetail;

    @FindBy(xpath = "//div[@class='lls-input lls-input--suffix']//input[@class='lls-input__inner']")
    public WebElementFacade selectLabel;

    @FindBy(xpath = "//div[@class='lls-form-item is-required']//div[@class='lls-select-dropdown lls-popper is-pasted']/div[@class='lls-scrollbar']")
    public WebElementFacade accountLabel;

    @FindBy(xpath = "//div[@class='lls-form-item is-success is-required']/label[@for='actualRepayAmount']//following-sibling::div")
    public WebElementFacade repaymentAmount;

    @FindBy(xpath = "//div[@class='lls-form-item is-success is-required']/label[@for='receiveFee']//following-sibling::div")
    public WebElementFacade commission;

    @FindBy(xpath = "//div[@class='lls-date-editor lls-input lls-input--suffix lls-date-editor--date']/input")
    public WebElementFacade repaymentData;

    @FindBy(xpath = "//button[@class='lls-button lls-button--primary']/span")
    public WebElementFacade submitBtn;

}

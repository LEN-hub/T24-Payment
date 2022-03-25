package com.glbank.com.sg.bdd.pages.supplyChains.ProductSettings;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class product_page extends PageObject {

    @FindBy(xpath = "//*[@id='app']//div[@class='lls-menu__content']/div[3]/div[@class='lls-submenu__title']/span")
    public WebElementFacade products;

    @FindBy(xpath = "//span[text()='Product List']")
    public WebElementFacade List;

    @FindBy(xpath = "//div[@class='btn-container flex-end']/div/button")
    public WebElementFacade addDrop;

    @FindBy(xpath = "//input[@autocomplete='off'=1]")
    public WebElementFacade name;

    @FindBy(xpath = "//div[contains(text(), 'Core product code')]/parent::label/following-sibling::div//input")
    public WebElementFacade code;

    @FindBy(xpath = "//label[contains(text(), 'Product Type')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Type;

    @FindBy(xpath = "//span[text()='Post Acceptance']")
    public WebElementFacade postAcc;

    @FindBy(xpath = "//input[@placeholder='Start date']")
    public WebElementFacade start;

    @FindBy(xpath = "//input[@placeholder='End date']")
    public WebElementFacade end;

    @FindBy(xpath = "//label[contains(text(), 'Underlying Docs Status')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Docs;

    @FindBy(xpath = "//span[text()='Accepted']")
    public WebElementFacade Accepted;

    @FindBy(xpath = "//label[contains(text(), 'Interest Paid By')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Paid;

    @FindBy(xpath = "//span[text()='Supplier']")
    public WebElementFacade seller;

    @FindBy(xpath = "//label[contains(text(), 'Interest Collected')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade colletced;

    @FindBy(xpath = "//span[text()='Discount']")
    public WebElementFacade discount;

    @FindBy(xpath = "//label[contains(text(), 'Repayment Mode')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Repayment;

    @FindBy(xpath = "//span[text()='Full Repayment']")
    public WebElementFacade FULL;

    @FindBy(xpath = "//div[contains(text(), '   Financing Ratio（p.a.）')]/parent::label/following-sibling::div//input")
    public WebElementFacade Ratio;

    @FindBy(xpath = "//label[contains(text(),'Recourse Term')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Term;

    @FindBy(xpath = "//span[text()='Without Recourse']")
    public WebElementFacade Without;

    @FindBy(xpath = "//label[contains(text(),'Need Buyer IPU')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade IPU;

    @FindBy(xpath = "//label[contains(text(),'Buyer MOU')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade MOU;

    @FindBy(xpath = "//body/child::div[10]//li[2]")
    public WebElementFacade one;

    @FindBy(xpath = "//body/child::div[11]/child::div[1]//li[2]")
    public WebElementFacade two;

    @FindBy(xpath = "//label[contains(text(),'Limit Allocation')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Limit;

    @FindBy(xpath = "//span[text()=\"Both Supplier's and Buyer's\"]")
    public WebElementFacade Both;

    @FindBy(xpath = "//div[@class='btn-container center']/div[3]/button/span")
    public WebElementFacade submit;

    @FindBy(xpath = "//div[@data-key='f1tp2hln']//input")    //点击查看是否创建成功
    public WebElementFacade ProductNameBth;                                      //输入创建好的名称

    @FindBy(xpath = "//span[text()='Product Management']")        //点击这个刷新
    public WebElementFacade refresh;

    @FindBy(xpath = "//td[@data-key='f2e7uikt']") //显示成功
    public WebElementFacade ActiveBth;

    @FindBy(xpath = "//span[text()='Quote List']")  //第二个脚本
    public WebElementFacade clickQuoteList;

    @FindBy(xpath = "//div[@class='btn-container flex-end']//button/span")
    public WebElementFacade clickCreateQuoto;

    @FindBy(xpath = "//label[text()='Product Name']/following-sibling::div//span[@class='lls-input__suffix-inner']")
    public WebElementFacade productName;

    @FindBy(xpath = "//span[text()='Product Management']")
    public WebElementFacade productManagerTitle;

    @FindBy(xpath = "//span[text()='Create Quote']")
    public WebElementFacade createquoteTitle;

    @FindBy(xpath = "//body/div[2]//li/span")
    public List<WebElementFacade> productNameList;

    @FindBy(xpath = "//label[contains(text(),'Funder')]/following-sibling::div//input/following-sibling::span/span")
    public WebElementFacade Funder;

    @FindBy(xpath = "//span[contains(text(),'Green Link Digital Bank')]")
    public WebElementFacade GLB;

    @FindBy(xpath = "//div[@data-key=\"f1hnbv2c\"]//span/child::span")       //supplier  供应商选择点击下拉框
    public WebElementFacade supplier;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span")      //供应商列表，可删除数据
    public List<WebElementFacade> supplierSelectList;         //选择供应商数据

    @FindBy(xpath = "//div[@data-key='f266mn95']/child::div//span/span")
    public WebElementFacade Buyer;


    @FindBy(xpath = " //div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span")     //所选的值与供应商对应,所以不能用固定值
    public List<WebElementFacade> BuyerSelectList;    //买方选择列表

    @FindBy(xpath = "//label[contains(text(),'Currency')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade Currency;

    @FindBy(xpath = "//span[contains(text(),'SGD')]")
    public WebElementFacade SGD;

    @FindBy(xpath = "//label[contains(text(),'Quotation Mode')]/following-sibling::div//input/following-sibling::span")
    public WebElementFacade QuotationMode;

    @FindBy(xpath = "//span[contains(text(),'Fixed interest rate')]")
    public WebElementFacade Fixed;

    @FindBy(xpath = "//div[@data-key='f3rqjfgt']//input")
    public WebElementFacade InterestRate;

    @FindBy(xpath = "//div[@data-key='f3ph01q9']//input")
    public WebElementFacade InterestRateOverdue;

    @FindBy(xpath = "//div[@data-key='f2n6huih']//i")
    public WebElementFacade FeePaidBy;

    @FindBy(xpath = "//span[text()='Buyer']")
    public WebElementFacade FeePaidByBuyer;

    @FindBy(xpath = "//div[@data-key='f2u5j11h']//i")
    public WebElementFacade FeeCollectedat;

    @FindBy(xpath = "//span[text()='Discount']")
    public WebElementFacade FeeCollectedatDiscount;

    @FindBy(xpath = "//div[@data-key='f22cbj94']//i")
    public WebElementFacade FeeCalculatedby;

    @FindBy(xpath = "//span[text()='Proportional Rate']")
    public WebElementFacade ProportionalRate;

    @FindBy(xpath = "//div[@data-key='f1so67fp']//input")
    public WebElementFacade FeeRatE;

    @FindBy(xpath = "//div[@data-key='f1cbem8c']//input")
    public WebElementFacade InterestRateExtension;

    @FindBy(xpath = "//div[@data-key='f225jvve']//input")
    public WebElementFacade PlatformServiceFeeRate;

    @FindBy(xpath = "//div[@data-key='f3106953']//span")
    public WebElementFacade SubmitOne;

    //第三个

    @FindBy(xpath = " //*[@id=\"app\"]/div//div[1]/div[2]/div/div[3]/div[2]/div[3]/div/div[2]/div/span")
    //div[@class='lls-menu-item is-active']/span")
    public WebElementFacade ProductProfileC;

    @FindBy(xpath = "//div[@data-key='f0k782n4']/button/span")
    public WebElementFacade CreatAddProductProfile;

    @FindBy(xpath = "//div[@data-key='f14ftav7']//span/span")  //选择供应商,需改动
    public WebElementFacade clientName;

    @FindBy(xpath = "//div[@data-key='f16ldena']//span/span")  //第一个脚本里创建的产品名称
    public WebElementFacade ProductNAME;

    //选择供应商对应买方名字，引用第二个脚本里的数据，需改动

    @FindBy(xpath = "//div[@data-key='f2khb5s7']//span/span")
    public WebElementFacade FunderOe;

    @FindBy(xpath = "//div[@x-placement='bottom-start']//span")
    public WebElementFacade FunDeronGLB;

    @FindBy(xpath = "//div[@data-key='f2msdh8u']//input")
    public WebElementFacade BuyerOne;

    @FindBy(xpath = "//div[@data-key='f3rv4d71']//i")
    public WebElementFacade FinancingMode;

    @FindBy(xpath = "//span[text()='Manual financing']")
    public WebElementFacade FinancingModeManual;

    @FindBy(xpath = "//div[@data-key='f16qkp7l']//span/span")
    public WebElementFacade RefundInterest;

    @FindBy(xpath = "//span[text()='N']")
    public WebElementFacade RefundInterestN;

    @FindBy(xpath = "//div[@data-key='f2dvgd1f']//input")
    public WebElementFacade EstimatedFinancingTenor;

    @FindBy(xpath = "//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span")
    public List<WebElementFacade> buyerList;

    @FindBy(xpath = "//div[@data-key='f21qf3bf']//input")
    public WebElementFacade GracePeriod;

    @FindBy(xpath = "//div[@data-key='f3d1nljn']//span")
    public WebElementFacade Confirm;



    //登录供应商门户查看、
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-refresh']")
    public WebElementFacade clickRefreshBtn;

    @FindBy(xpath = "//div[@class='tab-pane message-body active']//h2")
    public WebElementFacade emailVerificationCode;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@placeholder='Enter email']")
    public WebElementFacade GLDBEmailInput;

    @FindBy(xpath = "//div[@class='lls-form-item__content']//input[@type='password']")
    public WebElementFacade GLDBEmailPassword;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/button")
    public WebElementFacade sendCodeBtn;

    @FindBy(xpath = "//div[@id='message-list']/button[1]//span[text()='Green Link Digital Bank - Verification Code']")
    public WebElementFacade thirdEmail;

    @FindBy(xpath = "//div[@class='lls-input-group__append']/preceding-sibling::input")
    public WebElementFacade inputSendCode;

    @FindBy(xpath = "//input[@placeholder='Enter Company ID']")
    public WebElementFacade enterCompanyId;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElementFacade GLDBEmailLoginBtn;




}
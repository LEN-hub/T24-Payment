package com.hsbc.cmb.hk.dbb.pages.ProductSettings;

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

    @FindBy(xpath = "//span[text()='The Seller Pays Interest']")
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

    @FindBy(xpath = "//span[text()='Quote List']")  //第二个
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

    @FindBy(xpath = "//div[@data-key=\"f1hnbv2c\"]//span/child::span")       //supplier  供应商选择
    public WebElementFacade supplier;

    @FindBy(xpath = "//div[@data-key='f266mn95']/child::div//span/span")
    public WebElementFacade Buyer;

    @FindBy(xpath = "//span[text()='121321']")     //所选的值与供应商对应,所以不能用固定值
    public WebElementFacade BuyerKey;

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

    @FindBy(xpath = "//span[text()='Seller']")
    public WebElementFacade FeePaidBySeller;

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

    @FindBy(xpath = "//div[@data-key='f14ftav7']//span/span")
    public WebElementFacade clientName;

    //选择供应商

    @FindBy(xpath = "//div[@data-key='f16ldena']//span/span")
    public WebElementFacade ProductName;

    //选择供应商对应的名字

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

    @FindBy(xpath = "//div[@data-key='f2dvgd1f']//input")
    public WebElementFacade EstimatedFinancingTenor;

    @FindBy(xpath = "//div[@data-key='f21qf3bf']//input")
    public WebElementFacade GracePeriod;


}
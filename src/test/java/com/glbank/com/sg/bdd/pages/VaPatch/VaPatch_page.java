package com.glbank.com.sg.bdd.pages.VaPatch;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.util.List;

public class VaPatch_page extends PageObject {

    @FindBy(xpath = "//p[text()='Customer Notification Platform ']" )
    public WebElementFacade CNPSystem;

    @FindBy(xpath = "//div[contains(text(),\"Favorite\")]")
    public WebElementFacade CNPTitle;

    @FindBy(xpath = "//p[text()='cps']" )
    public WebElementFacade CPSSystem;

    @FindBy(xpath = "//h1[text()='CreditLens™']")
    public WebElementFacade CPSTitle;

    @FindBy(xpath = "//p[text()='DFT']" )
    public WebElementFacade DFTSystem;

    @FindBy(xpath = "//h1[text()='GLDB DFT']")
    public WebElementFacade DFTTitle;

    @FindBy(xpath = "//p[text()='Online Banking']" )
    public WebElementFacade EBKSystem;

    @FindBy(xpath = "//span[text()='Welcome message']")
    public WebElementFacade EBKTitle;

    @FindBy(xpath = "//p[text()='E-Signature and Contract Management System']" )
    public WebElementFacade ESCSystem;

    @FindBy(xpath = "//span[text()='Contract Management']")
    public WebElementFacade ESCTitle;

    @FindBy(xpath = "//p[text()='E-Statement System']" )
    public WebElementFacade ESTSystem;

    @FindBy(xpath = "//div[contains(text(),\"Favorite\")]")
    public WebElementFacade ESTTitle;

    @FindBy(xpath = "//p[text()='Image Management System']" )
    public WebElementFacade IMSSystem;

    @FindBy(xpath = "//div[contains(text(),\"Favorite\")]")
    public WebElementFacade IMSTitle;

    @FindBy(xpath = "//p[text()='Supply Chain Finance']" )
    public WebElementFacade SCFSystem;

    @FindBy(xpath = "//span[text()='Contract Management']")
    public WebElementFacade SCFTitle;

    @FindBy(xpath = "//p[text()='Supply Chain Finance-JOB']" )
    public WebElementFacade SCFJOBSystem;

    @FindBy(xpath = "//b[text()='Scheduling Center']")
    public WebElementFacade SCFJOBTitle;

    @FindBy(xpath = "//p[text()='Big Data Platform']" )
    public WebElementFacade SmartBISystem;

    @FindBy(xpath = "//span[text()='Homepage']")
    public WebElementFacade SmartBITitle;

    @FindBy(xpath = "//td[text()='Logout']")
    public WebElementFacade ISOTitle;

    @FindBy(xpath = "//button[text()='Continue']")
    public WebElementFacade continueBtn;

    @FindBy(xpath = "//p[text()='Login to USO Server']")
    public WebElementFacade loginTitle;

    @FindBy(xpath = "//div[text()='To Be Signed']")
    public WebElementFacade ToBeSignedBtn;

    @FindBy(xpath = "//span[text()='To be signed']")
    public List<WebElementFacade> ToBeSignedTitle;

    @FindBy(xpath = "//div[text()='Signing In Progress']")
    public WebElementFacade SigningInProgressBtn;

    @FindBy(xpath = "//span[text()='Signing in progress']")
    public List<WebElementFacade> SigningInProgressTitle;

    @FindBy(xpath = "//div[text()='Signing Completed']")
    public WebElementFacade SigningCompletedBtn;

    @FindBy(xpath = "//span[text()='Signing completed']")
    public List<WebElementFacade> SigningCompletedTitle;

    @FindBy(xpath = "//div[text()='Signing Failed ']")
    public WebElementFacade SigningFailedBtn;

    @FindBy(xpath = "//span[text()='Signing failed']")
    public List<WebElementFacade> SigningFailedTitle;

    @FindBy(xpath = "//span[text()='Template Management']/parent::a")
    public WebElementFacade TemplateManagementBtn;

    @FindBy(xpath = "//span[text()='Create template']")
    public WebElementFacade TemplateManagementTitle;

    @FindBy(xpath = "//span[text()='View details']")
    public WebElementFacade SeeBtnPageTitle;

    @FindBy(xpath = "//span[text()='Download complete!']")
    public WebElementFacade DownloadBtnPageTitle;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade SearchBtn;

    @FindBy(xpath = "//button[@type='submit']/following-sibling::button")
    public WebElementFacade ResetBtn;

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[1]/td[5]")
    public WebElementFacade contractID;

    @FindBy(id = "contractId")
    public WebElementFacade contractIDInput;

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[1]/td[5]")
    public WebElementFacade contractIDTwo;

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[2]/td[5]")
    public WebElementFacade SecondContractID;

    @FindBy(xpath = "//span[@class='ant-checkbox']")
    public List<WebElementFacade> checkbox;

    @FindBy(xpath = "//span[text()='Batch download']/parent::button")
    public WebElementFacade BatchDownloadBtn;
}

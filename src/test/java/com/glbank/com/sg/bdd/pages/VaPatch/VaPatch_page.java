package com.glbank.com.sg.bdd.pages.VaPatch;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

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
}

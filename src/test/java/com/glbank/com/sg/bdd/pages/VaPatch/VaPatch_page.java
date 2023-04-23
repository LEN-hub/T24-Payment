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

    @FindBy(xpath = "//span[text()='Home']")
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

    @FindBy(xpath = "//div[text()='Summary']")
    public WebElementFacade ISOBackStageTitle;

    @FindBy(xpath = "//div[text()='Logout']")
    public WebElementFacade logoutBtn;

    @FindBy(xpath = "//button[text()='Logout']")
    public WebElementFacade logoutBtnConfirm;

    @FindBy(xpath = "//div[text()='Login Id']")
    public WebElementFacade ISOLogoutTitle;

    @FindBy(xpath = "//td[text()='User & Segment']")
    public WebElementFacade userSegment;

    @FindBy(xpath = "//td[text()='User']")
    public WebElementFacade userTitle;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElementFacade createUser;

    @FindBy(xpath = "//div[text()='*User Id:']/parent::td/following-sibling::td[1]/input")
    public WebElementFacade UserId;

    @FindBy(xpath = "//div[text()='*User Id:']/parent::td/following-sibling::td[3]/input")
    public WebElementFacade UserName;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElementFacade saveBtn;

    @FindBy(xpath = "//button[text()='Reset Password']")
    public WebElementFacade ResetPwd;

    @FindBy(xpath = "//div[text()='New Password']/parent::td/parent::tr/following-sibling::tr[1]//input")
    public WebElementFacade NewPassword;

    @FindBy(xpath = "//div[text()='New Password']/parent::td/parent::tr/following-sibling::tr[3]//input")
    public WebElementFacade ConfirmNewPassword;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElementFacade okBtn;

    @FindBy(xpath = "//div[text()='Login Accounts']")
    public WebElementFacade loginAccounts;

    @FindBy(xpath = "//button[text()='Edit']")
    public WebElementFacade editBtn;

    @FindBy(xpath = "//td[text()='SystemPasswordBasic']/following-sibling::td[4]/select")
    public WebElementFacade ForceChangePwd;

    @FindBy(xpath = "//option[text()='No']")
    public WebElementFacade ForceChangeNoBtn;

    @FindBy(id = "form-username")
    public WebElementFacade userNameInputbox;

    @FindBy(id = "form-password")
    public WebElementFacade passwordInputbox;

    @FindBy(xpath = "//tr[@align='center']//button[@type='submit' ]")
    public WebElementFacade clickLogonBtn;

    @FindBy(xpath = "//tr[@class='EvenRows']//input[@class='gwt-TextBox']")
    public WebElementFacade inputUserId;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElementFacade search;

    @FindBy(xpath = "//td[@class='hyperlinklikeText']")
    public WebElementFacade clickUserId;

    @FindBy(xpath = "//div[text()='SAML Application Privilege']")
    public WebElementFacade SAMLPage;

    @FindBy(xpath = "//button[text()='Add']")
    public WebElementFacade addBtn;

    @FindBy(xpath = "//tr[@class='OddRows']//select[@class='gwt-ListBox']")
    public WebElementFacade SAMLServiceProvider;

    @FindBy(xpath = "//option[text()='SCF-JOB']")
    public WebElementFacade SCF_JOB;

    @FindBy(xpath = "//div[text()='Search User Result']")
    public WebElementFacade selectTitle;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElementFacade deleteBtn;

    @FindBy(xpath = "//p[text()='Login verification failed.']")
    public WebElementFacade loginFiledTitle;

    @FindBy(xpath = "//thead[@class='ant-table-thead']/following-sibling::tbody/tr[1]/td[1]//span")
    public WebElementFacade TemplateName;

    @FindBy(id = "templateName")
    public WebElementFacade TemplateNameInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade SubmitBtn;

    @FindBy(xpath = "//button[@type='button']")
    public WebElementFacade TemplateManagementResetBtn;

    @FindBy(xpath = "//thead[@class='ant-table-thead']/following-sibling::tbody/tr[1]/td[5]/span/a[1]")
    public WebElementFacade TemplateSeeBtn;

    @FindBy(xpath = "//thead[@class='ant-table-thead']/following-sibling::tbody/tr[1]/td[5]/span/a[2]")
    public WebElementFacade DeactivateBtn;

    @FindBy(xpath = "//thead[@class='ant-table-thead']/following-sibling::tbody/tr[1]/td[5]/span/a[3]")
    public WebElementFacade templateDeleteBtn;

    @FindBy(xpath = "//thead[@class='ant-table-thead']/following-sibling::tbody/tr[1]/td[5]/span/a[5]")
    public WebElementFacade journalBtn;

    @FindBy(xpath = "//thead[@class='ant-table-thead']/following-sibling::tbody/tr[1]/td[5]/span/a[3]")
    public WebElementFacade copyTemplateBtn;

    @FindBy(xpath = "//thead[@class='ant-table-thead']/following-sibling::tbody/tr[1]/td[5]/span/a[4]")
    public WebElementFacade UseTemplateBtn;

    @FindBy(xpath = "//span[text()='Serial number']")
    public WebElementFacade journalTitle;

    @FindBy(xpath = "//div[text()='Contract view']")
    public WebElementFacade contractView;

    @FindBy(xpath = "//span[text()='Create template']/parent::button")
    public WebElementFacade createTemplate;

    @FindBy(xpath = "//span[text()='Next']/parent::button")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//div[@role='tablist']/div[1]/button")
    public WebElementFacade InitiateContratBtn;

    @FindBy(xpath = "//div[text()='we support Batch initiation contract with template']")
    public WebElementFacade initiationWithTemplateBtn;

    @FindBy(xpath = "//span[text()='confirm submission']/parent::button")
    public WebElementFacade confirmTemplateBtn;

    @FindBy(xpath = "//span[text()='Confirm initiation']/parent::button")
    public WebElementFacade ConfirmInitiationBtn;

    @FindBy(xpath = "//span[text()='Confirm submission']/parent::button")
    public WebElementFacade UseTemplateConfirmBtn;

    @FindBy(xpath = "//span[text()='Enable now']/parent::button")
    public WebElementFacade EnableNow;

    @FindBy(xpath = "//span[text()='deactivate now']/parent::button")
    public WebElementFacade deactivateBtn;

    @FindBy(xpath = "//span[text()='confirm']/parent::button")
    public WebElementFacade templateConfirmBtn;

    @FindBy(xpath = "//span[@class='ant-form-item-children']/input")
    public WebElementFacade CopyTemplateName;

    @FindBy(xpath = "//input[@placeholder='Please enter the signatory name']")
    public WebElementFacade SignatoryName;

    @FindBy(xpath = "//input[@placeholder='Please enter the signatory email']")
    public WebElementFacade SignatoryEmail;

    @FindBy(xpath = "//input[@placeholder='Please enter keyword']")
    public WebElementFacade SignatoryPlace;

    @FindBy(xpath = "//span[text()='Add signatory']/parent::button")
    public WebElementFacade AddSignatoryBtn;

    @FindBy(id = "canvas_3")
    public WebElementFacade canvas;

    @FindBy(id = "canvas_4")
    public WebElementFacade RequestsStatisticsCanvas;

    @FindBy(xpath = "//div[text()='Requests Statistics']")
    public WebElementFacade RequestsStatistics;

    @FindBy(xpath = "//div[@class='ant-pro-global-header']/div/span[1]/span[1]")
    public WebElementFacade logoutAgo;

    @FindBy(xpath = "//li[text()='Logout ']")
    public WebElementFacade DFTLogoutBtn;

    @FindBy(xpath = "//span[text()='OK']/parent::button")
    public WebElementFacade DFTLogoutOkBtn;

    @FindBy(xpath = "//span[text()='Project Management']/parent::a/parent::li")
    public WebElementFacade ProjectManagementBtn;

//   定位 第一个SystemID
    @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[1]/td[2]")
    public WebElementFacade FirstSystemId;

//    定位第二个SystemID
    @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[2]/td[2]")
    public WebElementFacade SecondSystemId;

    //   定位 第一个SystemName
    @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[1]/td[3]")
    public WebElementFacade FirstSystemName;

    @FindBy(xpath = "//input[@placeholder='please input system id']")
    public WebElementFacade inputSystemId;

    @FindBy(xpath = "//input[@placeholder='please input syste name']")
    public WebElementFacade inputSystemName;

    @FindBy(xpath = "//span[text()='Query']/parent::button")
    public WebElementFacade DFTQueryBtn;

    @FindBy(xpath = "//span[text()='Reset']/parent::button")
    public WebElementFacade DFTResetBtn;

    @FindBy(xpath = "//span[text()='Transfer Management']/parent::span/parent::span/parent::div")
    public WebElementFacade TransferManagementBtn;

    @FindBy(xpath = "//span[text()='Transfer Record']/parent::a/parent::li/parent::ul")
    public WebElementFacade TransferRecordBtn;

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[1]/td[2]")
    public WebElementFacade TranId;

    @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[1]/td[3]")
    public WebElementFacade transmitLeg;

    @FindBy(xpath = "//input[@placeholder='请输入传输ID']")
    public WebElementFacade inputTranId;

    @FindBy(xpath = "//input[@placeholder='请输入发送方']")
    public WebElementFacade inputTransmitLeg;

    @FindBy(xpath = "//span[text()='查 询']/parent::button")
    public WebElementFacade queryTranBtn;

    @FindBy(xpath = "//span[text()='重 置']/parent::button")
    public WebElementFacade ResetTranBtn;

}

package com.glbank.com.sg.bdd.steps.supplyChains.bingdingRelationship;

import com.glbank.com.sg.bdd.pages.supplyChains.bingdingRelationship.relationship_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class relationship_step extends ScenarioSteps {
    private relationship_page relationship_page;
    private BDDUtil bddUtil;
    public static String envTag;


    @Step
    public void clickCustomerMapping_btn(){
        relationship_page.customerMapping.click();
    }

    @Step
    public void getClickCustomersMenu(){
        relationship_page.clickCustomersMenu.click();
    }

    @Step
    public void CustomerMappingPage(){
        assertEquals("Relationship Management",relationship_page.checkMappingPage.getText());
    }

    @Step
    public void clickSearchCompanyBox(){
        relationship_page.SearchCompanyBox.click();
    }

    @Step
    public void getSearchCompanyInput(String value) {
        relationship_page.SearchCompanyBox.sendKeys(value);
        relationship_page.findButton.click();
    }

    @Step
    public void createNewCounterPage() {
        bddUtil.sleep(4);
        bddUtil.scrollWindowToElement(relationship_page.deleteButton);
        assertEquals("Create New Counterparty",relationship_page.createNewCounter.getText());
    }

    @Step
    public void clickDeleteButton(){
        bddUtil.scrollWindowToElement(relationship_page.deleteButton);
        relationship_page.deleteButton.click();
    }

    @Step
    public void clickCreateNewCounterButton(){
        bddUtil.sleep(3);
        relationship_page.createNewCounter.click();
    }

    @Step
    public void counterWindows(){
        assertEquals("Counterparty",relationship_page.counterWindows.getText());
    }

    @Step
    public void clickCounterNameBox(){
        bddUtil.sleep(3);
        relationship_page.inputCounterName.click();
    }

    @Step
    public void inputCounterNameBox(){
//        relationship_page.inputCounterName.sendKeys(value);
//        bddUtil.scrollWindowToElement(relationship_page.selectEmail);
        relationship_page.EmailElement.click();

    }
    @Step
    public void contentList(){
        List<WebElementFacade> roles = relationship_page.contentList;
        List<WebElementFacade> editBtn = relationship_page.editButton;
        for(int i =0; i<8; i++){
            if (roles.get(i).getText().equals("Buyer")) {
                editBtn.get(i).click();
                break;
            }
        }

    }

    @Step
    public void deleteCompany(){
        List<WebElementFacade> roles = relationship_page.deleteContentList;
        List<WebElementFacade> deleteBtn = relationship_page.deleteBtnList;
        for (int i = 0; i < 10;i++){
            if (roles != null) {
                String content = roles.get(i).getText();
                bddUtil.scrollWindowToElement(relationship_page.deleteBtn);
                deleteBtn.get(i).click();
                bddUtil.sleep(2);
                relationship_page.createNewCounter.click();
                relationship_page.inputCounterName.sendKeys(content);
                bddUtil.scrollWindowToElement(relationship_page.find(By.xpath("//span[text()='" + content + "']")));
                relationship_page.find(By.xpath("//span[text()='" + content + "']")).click();
                relationship_page.downstreamCompanyButton.click();
                relationship_page.confirmButton.click();
                break;
            }
        }

    }

    @Step
    public void clickDownstreamCompanyButton(){
        relationship_page.downstreamCompanyButton.click();
    }

    @Step
    public void clickConfirmButton(){
        relationship_page.confirmButton.click();
    }

    @Step
    public void createNewSupplierRelationShip(){
       String textValue = FileUtils.LastReadFileInput3("companyData");
        relationship_page.createNewRelationShipBtn.click();
        relationship_page.companyNameSelectCheckBox.click();
        bddUtil.sleep(2);
        bddUtil.clickByJS(relationship_page.find(By.xpath("//span[text()='"+textValue+"']")));
//        bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//span[text()='\"+textValue+\"']")));
//        bddUtil.find(By.xpath("//span[text()='"+textValue+"']")).click();
        relationship_page.confirmBtn.click();
//        List<WebElementFacade> textValue = relationship_page.companyNameSelectList;
//        for (int i = 0; i< textValue.size(); i++){
//            if (FileUtils.LastReadFileInput3("companyData").equals(textValue.get(i).getText())){
//                bddUtil.scrollWindowToElement(textValue.get(i)).click();
//                relationship_page.confirmBtn.click();
//                break;
//            }

        }

    @Step
    public void createNewBuyerRelationShip(){
        relationship_page.createNewRelationShipBtn.click();
        relationship_page.companyNameSelectCheckBox.click();
        String buyerName = FileUtils.LastReadFileInput3("buyer");
        bddUtil.sleep(2);
        relationship_page.inputCompanyName.sendKeys(buyerName);
        bddUtil.clickByJS(relationship_page.find(By.xpath("//span[text()='"+buyerName+"']")));
//        bddUtil.find(By.xpath("//span[text()='"+buyerName+"']")).click();
        relationship_page.confirmBtn.click();
//        List<WebElementFacade> textValue = relationship_page.companyNameSelectList;
//        for (int i = 0; i< textValue.size(); i++){
//            if (FileUtils.LastReadFileInput3("buyer").equals(textValue.get(i).getText())){
//                bddUtil.scrollWindowToElement(textValue.get(i)).click();
//                relationship_page.confirmBtn.click();
//                break;
//            }
//        }
    }

    @Step
    public void supplierList(){
        List<WebElementFacade> companyName = relationship_page.companyNameList;
        List<WebElementFacade> editBtn = relationship_page.editButton;
        for(int i =0; i<companyName.size(); i++){
            if (companyName.get(i).getText().equals("Supplier")) {
                editBtn.get(i).click();
                break;
            }
        }
        bddUtil.sleep(2);
    }

    @Step
    public void deleteCompanyOnSupplier(){
        List<WebElementFacade> roles = relationship_page.deleteContentList;
        List<WebElementFacade> deleteBtn = relationship_page.deleteBtnList;
        for (int i = 0; i < roles.size();i++){
            if (roles != null) {
                String content = roles.get(i).getText();
                bddUtil.scrollWindowToElement(relationship_page.deleteBtn);
                deleteBtn.get(i).click();
                bddUtil.sleep(2);
                relationship_page.createNewCounter.click();
                relationship_page.inputCounterName.sendKeys(content);
                bddUtil.scrollWindowToElement(relationship_page.find(By.xpath("//span[text()='" + content + "']")));
                relationship_page.find(By.xpath("//span[text()='" + content + "']")).click();
                relationship_page.downstreamCompanyButton.click();
                relationship_page.confirmButton.click();
                break;
            }
        }
        bddUtil.sleep(3);
    }

    @Step
    public void insertBuyerInformation(){
        relationship_page.inputCounterName.click();
        String buyerName = FileUtils.LastReadFileInput3("buyer");
        bddUtil.clickByJS(relationship_page.find(By.xpath("//span[text()='"+buyerName+"']")));
//        bddUtil.find(By.xpath("//span[text()='"+buyerName+"']")).click();
//        List<WebElementFacade> textValue = relationship_page.companyNameSelectList;
//        for (int i = 0; i < textValue.size(); i++) {
//            if (FileUtils.LastReadFileInput3("buyer").equals(textValue.get(i).getText())){
//                bddUtil.scrollWindowToElement(textValue.get(i)).click();
//                relationship_page.downstreamCompanyButton.click();
//                relationship_page.confirmBtn.click();
//                break;
//            }
//        }
                relationship_page.downstreamCompanyButton.click();
                relationship_page.confirmBtn.click();
        bddUtil.sleep(5);
    }

    @Step
    public void insertSupplierInformation(){
        relationship_page.inputCounterName.click();
//        String rtn = FileUtils.FileInput3("companyData");
        String companyDataName = FileUtils.LastReadFileInput3("companyData");
        relationship_page.inputCompanyName.sendKeys(companyDataName);
        bddUtil.clickByJS(relationship_page.find(By.xpath("//span[text()='"+companyDataName+"']")));
        relationship_page.upstreamCompanyButton.click();
        relationship_page.confirmBtn.click();
        bddUtil.sleep(4);
        relationship_page.backBtn.click();
        bddUtil.sleep(4);
        relationship_page.searchCompany.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        relationship_page.titleText.click();
        bddUtil.sleep(5);
    }

}

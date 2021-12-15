package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

public class FamilyImmigrationStatusPage extends Utility {

private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//label[normalize-space()='Yes']")
    WebElement yes;

    @CacheLookup
    @FindBy (xpath = "//label[normalize-space()='No']")
    WebElement no;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver,this);
    }

    public void selectImmigrationStatus(String status){

        switch(status.trim()){

            case "Yes":
                pmClickOnElement(yes);
                log.info("Selecting immigration status"+yes.toString());
                break;

            case "No":
                pmClickOnElement(no);
                log.info("Selecting immigration status"+no.toString());
                break;

        }


    }

    public void clickNextStepButton(){
        pmClickOnElement(nextStepButton);
        log.info("Clicking on continue button : "+nextStepButton.toString());
    }

}

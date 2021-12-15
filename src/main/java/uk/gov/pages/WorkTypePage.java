package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

import java.util.List;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//div [@class='govuk-radios']//div//label")
    List<WebElement> selectJobTypeList;


    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    public void selectJobType(String job){
        for(WebElement jobType:selectJobTypeList){
            if(jobType.getText().equalsIgnoreCase(job)){
                pmClickOnElement(jobType);
                log.info("Selecting job type : "+jobType);
                break;
            }
        }
    }

    public void clickNextStepButton(){
        pmClickOnElement(nextStepButton);
        log.info("Clicking on next step button : "+nextStepButton.toString());
    }
}

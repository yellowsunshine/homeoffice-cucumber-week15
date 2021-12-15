package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
   @FindBy (xpath = "//div[@class='govuk-radios']//label")
   List<WebElement> reasonForVisitList;


    @CacheLookup
    @FindBy (xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement nextStepButton;


    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectReasonForVisit(String reason){

               for(WebElement reason1 : reasonForVisitList){
            if(reason1.getText().equalsIgnoreCase(reason)){
               pmwaitWithThreadSleep(10);
                reason1.click();

                break;
            }
            log.info("Selecting reason for visit list : "+reasonForVisitList.toString());
        }


        }


            public void clickNextButton(){

            pmClickOnElement(nextStepButton);
            log.info("Clicking on next step button : "+nextStepButton.toString());
        }
}

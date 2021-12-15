package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    public StartPage() {
        PageFactory.initElements(driver,this);
    }

    public void clickStartNow(){
        pmClickOnElement(startNowButton);
        log.info("Clicking on start now button : "+startNowButton.toString());
    }

}

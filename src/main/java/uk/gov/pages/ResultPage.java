package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//div[@id='result-info']//div[@data-module='track-results' and @data-flow-name='check-uk-visa']//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;



    public ResultPage() {
        PageFactory.initElements(driver,this);
    }

    public String getResultMessage(){

        String result = pmGetTextFromElement(resultMessage);
        log.info("Getting result message : "+result);

        return result;
    }

    public void confirmResultMessage(String expectedMessage){

        if (getResultMessage().equalsIgnoreCase(expectedMessage)){
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
        log.info("Verifying result message : "+expectedMessage);
    }

}

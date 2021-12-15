package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

public class DurationOfStayPage extends Utility {

private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='6 months or less']")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='longer than 6 months']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectLengthOfStay(String moreOrLess) {

        switch (moreOrLess) {
            case "6 months or less":
                pmClickOnElement(lessThanSixMonths);
                log.info("Selecting length of stay : "+lessThanSixMonths.getText());
                break;

            case "longer than 6 months":
                pmClickOnElement(moreThanSixMonths);
                log.info("Selecting length of stay : "+moreThanSixMonths.getText());
                break;

        }


    }


    public void clickNextStepButton() {
        pmClickOnElement(nextStepButton);
        log.info("Clicking on continue button : "+nextStepButton.toString());
    }
}

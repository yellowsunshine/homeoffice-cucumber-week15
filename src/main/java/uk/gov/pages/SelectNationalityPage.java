package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.gov.utility.Utility;

public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public SelectNationalityPage() {

        PageFactory.initElements(driver,this);
    }

    public void selectNationality(String nationality){
        pmSelectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
        log.info("Selecting nationality from dropdown menu : "+nationality);
    }

    public void clickNextStepButton(){
        pmClickOnElement(nextStepButton);
        log.info("Clicking on next step button : "+nextStepButton.toString());
    }


}

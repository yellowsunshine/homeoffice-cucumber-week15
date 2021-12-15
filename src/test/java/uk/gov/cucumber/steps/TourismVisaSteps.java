package uk.gov.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.pages.ReasonForTravelPage;
import uk.gov.pages.ResultPage;
import uk.gov.pages.SelectNationalityPage;
import uk.gov.pages.StartPage;
import uk.gov.utility.Utility;

public class TourismVisaSteps extends Utility {
    @Given("^User clicks on 'Start now' button$")
    public void userClicksOnStartNowButton() {
        new StartPage().clickStartNow();
    }

    @When("^User selects a nationality as \"([^\"]*)\" from dropdown$")
    public void userSelectsANationalityAsFromDropdown(String nationality)  {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("^User clicks on 'Continue' button$")
    public void userClicksOnContinueButton() {
        pmwaitWithThreadSleep(10);
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("^User selects reason as \"([^\"]*)\" radio button$")
    public void userSelectsReasonAsRadioButton(String reason)  {

        new ReasonForTravelPage().selectReasonForVisit(reason);
    }


    @Then("^User can see \"([^\"]*)\" message$")
    public void userCanSeeMessage(String message) {
        new ResultPage().confirmResultMessage(message.trim());
    }


}

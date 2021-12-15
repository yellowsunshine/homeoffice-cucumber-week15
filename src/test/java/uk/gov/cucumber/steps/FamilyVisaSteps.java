package uk.gov.cucumber.steps;

import cucumber.api.java.en.And;
import uk.gov.pages.FamilyImmigrationStatusPage;

public class FamilyVisaSteps {
    @And("^User selects \"([^\"]*)\" for partner immigration status question$")
    public void userSelectsForPartnerImmigrationStatusQuestion(String status)  {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }
}

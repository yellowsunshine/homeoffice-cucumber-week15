package uk.gov.cucumber.steps;

import cucumber.api.java.en.And;
import uk.gov.pages.DurationOfStayPage;
import uk.gov.pages.WorkTypePage;

public class WorkVisaSteps {
    @And("^User selects duration of stay as \"([^\"]*)\" radio button$")
    public void userSelectsDurationOfStayAsRadioButton(String stayDuration)  {
       new DurationOfStayPage().selectLengthOfStay(stayDuration);
    }

    @And("^User selects job type as \"([^\"]*)\" radio button$")
    public void userSelectsJobTypeAsRadioButton(String jobType)  {
        new WorkTypePage().selectJobType(jobType);
    }
}

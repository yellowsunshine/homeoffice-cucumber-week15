Feature: Tourism visa check
  Australian citizen coming for tourism, can go to website and see if visa needed to come to uk

  @Sanity @Regression
  Scenario: Australian tourist can verify visa requirement successfully
    Given   User clicks on 'Start now' button
    When    User selects a nationality as "Australia" from dropdown
    And     User clicks on 'Continue' button
    And     User selects reason as "Tourism or visiting family and friends" radio button
    And     User clicks on 'Continue' button
    Then    User can see "You will not need a visa to come to the UK" message

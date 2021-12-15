Feature: UK visa check for work
  A test to check if Chilean citizen needs visa to come and work in UK for longer than 6 months

  @Regression
  Scenario: Chilean can verify visa requirement successfully
    Given   User clicks on 'Start now' button
    When    User selects a nationality as "Chile" from dropdown
    And     User clicks on 'Continue' button
    And     User selects reason as "Work, academic visit or business" radio button
    And     User clicks on 'Continue' button
    And     User selects duration of stay as "longer than 6 months" radio button
    And     User clicks on 'Continue' button
    And     User selects job type as "Health and care professional" radio button
    And     User clicks on 'Continue' button
    Then    User can see "You need a visa to work in health and care" message

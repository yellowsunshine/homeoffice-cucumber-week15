Feature: Visa check for partner or family
  A test to check if Colombian citizen requires visa to join partner or family for a long stay
@Smoke @Regression
  Scenario: Columbian can check family visa requirement successfully
    Given   User clicks on 'Start now' button
    When    User selects a nationality as "Colombia" from dropdown
    And     User clicks on 'Continue' button
    And     User selects reason as "Join partner or family for a long stay" radio button
    And     User clicks on 'Continue' button
    And     User selects "Yes" for partner immigration status question
    And     User clicks on 'Continue' button
    Then    User can see "You’ll need a visa to join your family or partner in the UK" message
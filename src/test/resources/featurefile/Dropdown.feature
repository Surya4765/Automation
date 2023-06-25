Feature: Handling dropdowns

  @DropdownValidation
  Scenario: To handle the dropdown
    Given User launch the browser and navigate to URL
    When User selects the specific dropdown value
    And User iterates the dropdown value

    @DynamicdropValidation
  Scenario: To handle the dropdown
    Given User launch the browser and navigate to URL
    When User selects the dynamic dropdown value
    And User iterates the dropdown value


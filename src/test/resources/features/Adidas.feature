Feature: Web automation checks
  US: Test framework capabilities

  @tay
  Scenario: Verify SDET can automate this scenario
    Given user id on the webpage
    When user navigates product categories-Phones, Labtops and Monitors
    And user navigates to Labtop-adds Sony vaio i5 to cart
    And user adds Dell i7 8gb to cart
    And user navigates to cart- deletes Dell i7 8bg from cart
    And user clicks place order
    And user fills out form
    And user clicks purchase
    Then Capture and log id and amount
    Then assert purchase amount equals expected
    Then user click ok


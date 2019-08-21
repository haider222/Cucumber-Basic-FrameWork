Feature: Search items
  Scenario: searching different items
    Given I am on correct web page "http://demowebshop.tricentis.com/login"
    Then  I verify Title of page "Demo Web Shop Login"
    When I enter username "fdsa@gmail.com"
    And  I enter password "asdfasdf"
    And  I click on Login Button
    Then I login successfuly verify login email "fdsa@gmail.com"
    When I enter "mobile" in search field
    And  I click on search icon
    Then I see message "No products were found that matched your criteria."
    And I close browser

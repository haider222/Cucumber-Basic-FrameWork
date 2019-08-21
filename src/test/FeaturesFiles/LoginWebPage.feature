Feature: Verification of login webpage elements and successful login
  Scenario: Verification of login Webpage elements
    Given I am on correct web page "http://demowebshop.tricentis.com/login"
    Then  I verify Title of page "Demo Web Shop Login"
    When I enter username "fdsa@gmail.com"
    And  I enter password "asdfasdf"
    And  I click on Login Button
    Then I login successfuly verify login email "fdsa@gmail.com"
    And I close browser

    Scenario: Verify user cannot login if password is incorrect and error message
      Given I am on correct web page "http://demowebshop.tricentis.com/login"
      Then  I verify Title of page "Demo Web Shop Login"
      When I enter username "fdsa@gmail.com"
      And  I enter password "asdfasdfs"
      And  I click on Login Button
      Then I verify message of unsuccesfull "Login was unsuccessful. Please correct the errors and try again."
      And I verify error message for wrong password "The credentials provided are incorrect"
      And I close browser


  Scenario: Verify user cannot login if Email is incorrect and Error message
    Given I am on correct web page "http://demowebshop.tricentis.com/login"
    Then  I verify Title of page "Demo Web Shop Login"
    When I enter username "ilyasd123@gmail.com"
    And  I enter password "asdfasdfs"
    And  I click on Login Button
    Then I verify message of unsuccesfull "Login was unsuccessful. Please correct the errors and try again."
    And I verify error message for wrong email "No customer account found"
    And I close browser




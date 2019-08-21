Feature: Add items in shopping cart

  Background: add smart phone into shopping cart
    Given I am on correct web page "http://demowebshop.tricentis.com/login"
    Then  I verify Title of page "Demo Web Shop Login"
    When I enter username "fdsa@gmail.com"
    And  I enter password "asdfasdf"
    And  I click on Login Button
    Then I login successfuly verify login email "fdsa@gmail.com"

  @sanityTest @EndtoEnd
  Scenario: I mouse hover
   When I mouse hover on "ELECTRONICS"
    And I close browser

  @Regression @smoketest
  Scenario: I click on cell phones
    When I mouse hover on "ELECTRONICS"
    Then I click on "Cell phones" from the drop down menu
    And List of Mobile phones appear
    And I close browser


  @EndtoEND @Regression @sanityTest
  Scenario: I add smart phone to add cart
    When I mouse hover on "ELECTRONICS"
    Then I click on "Cell phones" from the drop down menu
    And List of Mobile phones appear
    Then I select a smart phone with prize "100,00"
    And I close browser


  @EndtoEND @Regression @smoketest @sanityTest
    Scenario: I see bar notification messafe
    When I mouse hover on "ELECTRONICS"
    Then I click on "Cell phones" from the drop down menu
    And List of Mobile phones appear
    Then I select a smart phone with prize "100,00"
    And I see a bar notification with message "The product has been added to your shopping cart"
    And I close browser

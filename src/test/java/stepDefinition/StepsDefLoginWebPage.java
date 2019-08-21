package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjectPattern.LoginPageElements;

import java.io.IOException;

public class StepsDefLoginWebPage  {

    LoginPageElements loginPageElements;
    TestContext testContext;

  public StepsDefLoginWebPage(TestContext context) throws IOException {
      testContext = context;
      loginPageElements = testContext.getPageObjectManager().getLoginPageElements();
  }


    @Given("I am on correct web page \"([^\"]*)\"$")
    public void i_am_on_correct_web_page(String pageTitle) throws IOException {

        loginPageElements.navigateToHomePage();
    }

    @Then("I verify Title of page \"([^\"]*)\"$")
    public void i_verify_Title_of_page(String pageTitle) {
        Assert.assertEquals("Demo Web Shop Login", pageTitle);
    }

    @When("I enter username \"([^\"]*)\"$")
    public void i_enter_username(String userName) {
        loginPageElements.setUserName(userName);
    }

    @When("I enter password \"([^\"]*)\"$")
    public void i_enter_password(String password) {
       loginPageElements.setPassword(password);
    }

    @When("I click on Login Button")
    public void i_click_on_Login_Button() {

       loginPageElements.setLoginButton();
    }

    @Then("I login successfuly verify login email \"([^\"]*)\"$")
    public void i_login_successfuly_verify_login_email(String expectedEmail) {
        loginPageElements.verifyEmail(expectedEmail);
    }

    @Then("I verify message of unsuccesfull \"([^\"]*)\"$")
    public void i_verify_message_of_unsuccesfull(String actualErrorMessage) {
        loginPageElements.setActualUnsuccessfulMessage(actualErrorMessage);
    }

    @Then("I verify error message for wrong password \"([^\"]*)\"$")
    public void i_verify_error_message_for_wrong_password(String actualErrorMessageForPassword) {
        loginPageElements.setActualErrorMessage(actualErrorMessageForPassword);
    }

    @Then("I verify error message for wrong email \"([^\"]*)\"$")
    public void i_verify_error_message_for_wrong_email(String actualErrorMessageForEmail) {
       loginPageElements.setActualErrorMessage(actualErrorMessageForEmail);
    }


    @Then("I close browser")
    public void i_close_browser() {
      testContext.getWebDriverManager().closeDriver();
    }
}

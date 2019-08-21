package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.WebDriverManager;
import pageObjectPattern.AddItemToCartPageElement;
import utilities.Log;

import java.io.IOException;

public class ItemAddCartPageObjPtrn {

    TestContext testContext;
    AddItemToCartPageElement addItemToCartPageElement;
    WebDriverManager webDriverManager;

    public ItemAddCartPageObjPtrn(TestContext context) throws IOException {
        testContext = context;
        addItemToCartPageElement = testContext.getPageObjectManager().getAddItemToCartPageElement();
        webDriverManager = new WebDriverManager();
    }

    @When("I mouse hover on \"([^\"]*)\"$")
    public void i_mouse_hover_on(String mouseHovrElement)

    {
       addItemToCartPageElement.getMouseHover(mouseHovrElement);
    }

    @Then("I click on \"([^\"]*)\" from the drop down menu")
    public void i_click_on_from_the_drop_down_menu(String cellPhones) {
       addItemToCartPageElement.clickOnCellPhones(cellPhones);
    }

    @Then("List of Mobile phones appear")
    public void list_of_Mobile_phones_appear() {
     addItemToCartPageElement.setListOfMobileAppearlist();
    }

    @Then("I select a smart phone with prize \"([^\"]*)\"$")
    public void i_select_a_smart_phone_with_prize(String string) {
        Log.info(string);
    }

    @Then("I see a bar notification with message \"([^\"]*)\"$")
    public void i_see_a_bar_notification_with_message(String string) {
        Log.info(string);

    }

}

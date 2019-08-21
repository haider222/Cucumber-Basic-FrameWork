package stepDefinition;

import com.cucumber.listener.Reporter;
import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import pageObjectPattern.SearchItemsPageObject;

import java.io.IOException;

public class SearchItems {

   TestContext testContext;
    SearchItemsPageObject searchItemsPageObject;

    public SearchItems(TestContext context) throws IOException {
        testContext = context;
        searchItemsPageObject= testContext.getPageObjectManager().getSearchItemsPageObject();
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        if (scenario.getName().equals("Some scenario name")) {
            Reporter.assignAuthor("Muhammad ilyas");
        }
    }

    @When("I enter \"([^\"]*)\" in search field")
    public void i_enter_in_search_field(String searchItem) {
       searchItemsPageObject.setSearchField(searchItem);
    }

    @When("I click on search icon")
    public void i_click_on_search_icon() {
        searchItemsPageObject.setSearchFieldButton();
    }

    @Then("I see message \"([^\"]*)\"$")
    public void i_see_message(String expectedsearchResultMessage) {
       searchItemsPageObject.setSearchResult(expectedsearchResultMessage);
    }

//    @After(order = 1)
//    public void afterScenario(Scenario scenario) {
//        if (scenario.isFailed()) {
//            String screenshotName = scenario.getName().replaceAll(" ", "_");
//            try {
//                File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
//
//                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
//                Files.copy(sourcePath, destinationPath);
//                Reporter.addScreenCaptureFromPath(destinationPath.toString());
//            } catch (IOException e) {
//            }
//        }
//    }

}



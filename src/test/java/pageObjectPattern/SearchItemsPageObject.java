package pageObjectPattern;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchItemsPageObject {

    public SearchItemsPageObject(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.XPATH, using = "//*[@id='small-searchterms']")
    private WebElement searchField;

    public void setSearchField(String searchAValue){
        searchField.sendKeys(searchAValue);
    }

    @FindBy(how = How.XPATH, using = "//*[@value='Search']")
    private WebElement searchFieldButton;

    public void setSearchFieldButton(){
        searchFieldButton.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@class='search-results']/strong")
    private WebElement searchResult;

    public void setSearchResult(String actualSearchResultValue){
        Assert.assertEquals(actualSearchResultValue, searchResult.getText());
    }






}

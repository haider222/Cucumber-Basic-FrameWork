package managers;


import org.openqa.selenium.WebDriver;
import pageObjectPattern.AddItemToCartPageElement;
import pageObjectPattern.LoginPageElements;
import pageObjectPattern.SearchItemsPageObject;

import java.io.IOException;

public class PageObjectManager {
    WebDriver driver;
    AddItemToCartPageElement addItemToCartPageElement;
    LoginPageElements loginPageElements;
    SearchItemsPageObject searchItemsPageObject;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public AddItemToCartPageElement getAddItemToCartPageElement(){
        if(addItemToCartPageElement == null){
            addItemToCartPageElement = new AddItemToCartPageElement(driver);
            return addItemToCartPageElement;
        }
        else
            return addItemToCartPageElement;
    }

    public LoginPageElements getLoginPageElements() throws IOException {
        if(loginPageElements == null){
            loginPageElements = new LoginPageElements(driver);
            return loginPageElements;
        }
        else
            return loginPageElements;
    }

    public SearchItemsPageObject getSearchItemsPageObject(){
        if(searchItemsPageObject ==null){
            searchItemsPageObject = new SearchItemsPageObject(driver);
            return searchItemsPageObject;
        }
        else
            return searchItemsPageObject;

    }
}

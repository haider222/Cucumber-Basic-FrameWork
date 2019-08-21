package pageObjectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.Log;

public class AddItemToCartPageElement {

    WebDriver driver;
    public AddItemToCartPageElement(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    @FindBy(how = How.XPATH, using = "//*[@class='top-menu']/li[3]")
    private WebElement mouseHoverOnElectronics;

    @FindBy(how = How.XPATH, using = "//*[@class='top-menu']/li[3]//ul/li[2]")
    private WebElement CellPhones;

    @FindBy(how = How.XPATH, using = "//*[@class='product-grid']")
    private WebElement ListOfMobileAppear;

    public void getMouseHover(String mouseHoverElement)
    {
        if(mouseHoverElement.equals(mouseHoverOnElectronics.getText()))
        {
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverOnElectronics).build().perform();
        }
    }
    public void clickOnCellPhones(String cellPhones)
    {
        if (cellPhones.equals(CellPhones.getText()))
        {
            CellPhones.click();
        }
    }

    public void setListOfMobileAppearlist(){
        if(ListOfMobileAppear.isDisplayed()){
            Log.info("List of mobile phones appear successfully");
        }
    }

}

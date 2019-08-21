package pageObjectPattern;

import managers.FileReaderManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPageElements {
    WebDriver driver;

    public LoginPageElements(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void navigateToHomePage() throws IOException {
        driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());

    }

    @FindBy(how = How.XPATH, using = "//*[@class='inputs'][1]/input")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//*[@class='inputs'][2]/input")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@class='button-1 login-button']")
    private WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@class='header-links']//ul/li[1]")
    private WebElement actualUserEmail;

    @FindBy(how = How.XPATH, using = "//*[@class='validation-summary-errors']/ul/li")
    private WebElement actualErrorMessage;

    @FindBy(how = How.XPATH, using = "//*[@class='validation-summary-errors']/span")
    private WebElement actualUnsuccessfulMessage;

    public void setUserName(String userName1){
        userName.sendKeys(userName1);
    }

    public void setPassword(String password1){
        password.sendKeys(password1);
    }

    public void setLoginButton(){
        loginButton.click();
    }

    public void verifyEmail(String expectedEmail){
        Assert.assertEquals(expectedEmail,actualUserEmail.getText());
    }

    public void setActualErrorMessage(String expectedErrorMessage){
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage.getText());
    }

    public void setActualUnsuccessfulMessage(String expectedUnsuccessfulMessage){
        Assert.assertEquals(expectedUnsuccessfulMessage,actualUnsuccessfulMessage.getText());
    }



}

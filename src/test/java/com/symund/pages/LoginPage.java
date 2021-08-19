package com.symund.pages;

import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

   LoginPage loginPage = new LoginPage();

    @FindBy(className = "password-with-toggle")
    public WebElement password;

    @FindBy(xpath = "//*[@id='user' or @name='user']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='submit-form' ]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='warning wrongPasswordMsg']")
    public WebElement wrongUsernameMessage;

    @FindBy(xpath = "//*[@id='lost-password']")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//*[@src='/core/img/actions/toggle.svg']")
    public WebElement eyeButton;

    @FindBy(xpath = "//*[@id='reset-password-submit']")
    public WebElement resetButton;



    public void loginUsername(String userName) {
        loginPage.username.sendKeys(userName);
    }

    public void loginPassword(String passWord) {
        loginPage.password.sendKeys(passWord);
    }
}

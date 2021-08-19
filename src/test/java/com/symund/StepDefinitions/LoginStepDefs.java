package com.symund.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import org.junit.Assert;


public class LoginStepDefs {
    @Given("the user on the login page")
    public void theUserOnTheLoginPage() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @And("clicks the login button")
    public void clicksTheLoginButton() {

        new LoginPage().loginButton.click();
    }


    @Then("user should see {string} message")
    public void userShouldSeeMessage(String expectedMessage) {
        System.out.println("expectedMessage =" + expectedMessage);
        BrowserUtils.waitFor(2);
    }

    @And("user should not be able to login")
    public void userShouldNotBeAbleToLogin() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertNotEquals("Dashboard",actualTitle);


    }


    @Then("user should be able to see {string} button")
    public void userShouldBeAbleToSeeButton(String ExpectedButton) {


    }




    @Then("user should be able to reset the password")
    public void userShouldBeAbleToResetThePassword() {
    }


    @When("user enters blank {string} or {string}")
    public void userEntersBlankOr(String username, String password) {






    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Then("the user should see valid placeholders should be seen on related inputboxes")
    public void theUserShouldSeeValidPlaceholdersShouldBeSeenOnRelatedInputboxes() {

    }



    @And("clicks on eye button which is right side on password button")
    public void clicksOnEyeButtonWhichIsRightSideOnPasswordButton() {
        new LoginPage().eyeButton.click();


    }

    @Then("user should be able to see password explicity")
    public void userShouldBeAbleToSeePasswordExplicity() {
        LoginPage loginPage = new LoginPage();


    }

    @Then("user should be able to see password with dots format as deafult")
    public void userShouldBeAbleToSeePasswordWithDotsFormatAsDeafult() {
    }



    @When("the user enters username and password")
    public void theUserEntersUsernameAndPassword() {
    }

    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String arg0, String arg1) {

    }

    @And("clicks on reset password button")
    public void clicksOnResetPasswordButton() {
        new LoginPage().resetButton.click();

    }

    @When("user clicks on forgot password")
    public void userClicksOnForgotPassword() {
        new LoginPage().forgotPasswordButton.click();



    }

    @Then("user should be able to see reset password button")
    public void userShouldBeAbleToSeeResetPasswordButton() {
        LoginPage loginPage = new LoginPage();
      Assert.assertTrue(loginPage.resetButton.isDisplayed());

    }

    @When("user enters username")
    public void userEntersUsername() {
        String userName = ConfigurationReader.get("username");
        LoginPage loginPage = new LoginPage();
        loginPage.loginUsername(userName);

    }

    @When("user enters password")
    public void userEntersPassword() {
        String passWord = ConfigurationReader.get("password");
        LoginPage loginPage = new LoginPage();
        loginPage.loginPassword(passWord);

    }
}

package com.symund.StepDefinitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs {
    @Given("user on login page")
    public void userOnLoginPage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("user clicks on go back one page button")
    public void userClicksOnGoBackOnePageButton() {
    }

    @Then("user should not go to home page")
    public void userShouldNotGoToHomePage() {
        String expectedTitle = "Dashboard";

        BrowserUtils.waitFor(2);
        Assert.assertNotEquals(Driver.get().getTitle(), expectedTitle);
    }

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        String userName = ConfigurationReader.get("username");
        String passWord = ConfigurationReader.get("password");
        LoginPage loginPage = new LoginPage();
        loginPage.loginUsername(userName);
        loginPage.loginPassword(passWord);
    }

    @When("user click user avatar")
    public void userClickUserAvatar() {
        new DashboardPage().userNameicon.click();

    }

    @And("click log out button")
    public void clickLogOutButton() {
        new DashboardPage().logOutLink.click();
    }

    @Then("user should be logged out")
    public void userShouldBeLoggedOut() {

    }
}

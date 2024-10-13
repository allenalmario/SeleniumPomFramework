package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utils.SeleniumFactory;

@Slf4j
public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("user navigates to login screen")
    public void user_navigates_to_login_screen() {
        loginPage.navigateToLoginPage();
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
        loginPage.fillUsernameField(SeleniumFactory.config.getProperty("username"));
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.fillInPasswordField(SeleniumFactory.config.getProperty("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginButton();
    }
    @Then("user should be on the home page")
    public void user_should_be_on_the_home_page() {
        Assert.assertTrue(productsPage.assertOnProductsPage());
    }
    @When("user enters a invalid username as {string}")
    public void user_enters_a_invalid_username_as(String invalid_username) {
        loginPage.fillUsernameField(invalid_username);
    }
    @When("user enters a invalid password as {string}")
    public void user_enters_a_invalid_password_as(String invalid_password) {
        loginPage.fillInPasswordField(invalid_password);
    }
    @Then("user should should see an error message on the login screen")
    public void user_should_should_see_an_error_message_on_the_login_screen() {
        loginPage.assertLoginError();
    }
    @When("user clicks on hamburger menu")
    public void user_clicks_on_hamburger_menu() {
        productsPage.clickOnHamburgerMenu();
    }

    @When("user clicks on logout link")
    public void user_clicks_on_logout_link() {
        productsPage.clickLogoutLink();
    }

    @Then("user should be on the login page")
    public void user_should_be_on_the_login_page() {
        Assert.assertEquals(loginPage.assertOnLoginPage(), SeleniumFactory.config.getProperty("baseurl"));
    }
}
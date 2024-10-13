package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;
import utils.SeleniumFactory;

import static utils.SeleniumFactory.openPage;

@Log
public class LoginPage extends BasePage {

    By username_field = By.id("user-name");
    By password_field = By.id("password");
    By login_button = By.id("login-button");
    By login_error = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");

    public void navigateToLoginPage() {
        log.info("Navigating to: " + SeleniumFactory.config.getProperty("baseurl"));
        openPage(SeleniumFactory.config.getProperty("baseurl"));
    }

    public void fillUsernameField(String username) {
        log.info("Filling Username field");
        type(username_field, username);
    }

    public void fillInPasswordField(String password) {
        log.info("Filling Password field");
        type(password_field, password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login button");
        click(login_button);
    }

    public boolean assertLoginError() {
        log.info("Asserting login error shows after logging in with invalid username and password on Login Page");
        return isElementPresent(login_error);
    }

    public String assertOnLoginPage() {
        log.info("Asserting on Login page");
        return returnPageUrl();
    }
}

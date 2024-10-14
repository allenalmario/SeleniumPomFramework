package base;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

import static utils.SeleniumFactory.getDriver;

@Log
public class BasePage {

    By hamburger_menu = By.id("react-burger-menu-btn");
    By logout_link = By.xpath("//a[@id='logout_sidebar_link']");
    By cart_link = By.xpath("//a[@class='shopping_cart_link']");

    public static WebDriver driver;

    public BasePage() {
        driver = getDriver();
    }

    public void click(By element) {
        try {
            driver.findElement(element).click();
        } catch (Throwable t) {
            Assert.fail(t.getMessage());
        }
    }

    public boolean isElementPresent(By element) {
        try {
            driver.findElement(element).isDisplayed();
            return true;
        } catch (Throwable t) {
            return false;
        }

    }

    public void type(By element, String value) {
        try {
            driver.findElement(element).sendKeys(value);
        } catch (Throwable t) {
            Assert.fail(t.getMessage());
        }
    }

    public String returnPageUrl() {
        return driver.getCurrentUrl();
    }

    public void waitFor() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void clickOnHamburgerMenu() {
        log.info("Clicking on Hamburger Menu");
        click(hamburger_menu);
    }

    public void clickLogoutLink() {
        log.info("Clicking on Logout link");
        waitFor();
        click(logout_link);
    }

    public void clickOnCartLink() {
        log.info("Clicking on Cart link");
        click(cart_link);
    }

    public String getElementText(By element) {
        log.info("Extracting text from element: " + element.toString());
        String textExtracted = driver.findElement(element).getText();
        log.info("Text Extracted: " + textExtracted);
        return textExtracted;
    }
}
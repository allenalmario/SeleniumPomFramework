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
    public static By sauce_labs_backpack_link = By.id("item_4_title_link");
    public static By sauce_labs_bolt_tshirt_link = By.id("item_1_title_link");
    public static By sauce_labs_bike_light_link = By.id("item_0_title_link");
    public static By sauce_labs_tshirt_red_link = By.id("item_3_title_link");
    public static By sauce_labs_onesie_add_to_cart_button = By.id("add-to-cart-sauce-labs-onesie");
    public static By sauce_labs_fleece_jacket_add_to_cart_button = By.id("add-to-cart-sauce-labs-fleece-jacket");
    public static By sauce_labs_onesie_remove_button = By.id("remove-sauce-labs-onesie");
    public static By sauce_labs_fleece_jacket_remove_button = By.id("remove-sauce-labs-fleece-jacket");
    public static By sauce_labs_tshirt_red_remove_button = By.id("remove-test.allthethings()-t-shirt-(red)");
    public static By product_page_remove_button = By.id("remove");
    public static By product_page_add_to_cart_button = By.id("add-to-cart");

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
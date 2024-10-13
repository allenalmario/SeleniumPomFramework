package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

import static utils.SeleniumFactory.getDriver;

public class BasePage {

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

}

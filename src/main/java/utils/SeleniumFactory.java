package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SeleniumFactory {

    public static WebDriver driver;
    public static Properties config = new Properties();
    private static FileInputStream inputStream;

    private SeleniumFactory() {

        try {
            inputStream = new FileInputStream("src/main/resources/config.properties");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            config.load(inputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Boolean headlessValue = Boolean.parseBoolean(config.getProperty("headless"));

        if (headlessValue) {
            switch (config.getProperty("browser")) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--headless=new");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--headless=new");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--headess=new");
                    driver = new EdgeDriver(edgeOptions);
                    break;
                default:
                    throw new IllegalArgumentException("Browser type not supported: " + config.getProperty("browser"));
            }
        }
        else {
            switch (config.getProperty("browser")) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Browser type not supported: " + config.getProperty("browser"));
            }
        }
    }

    public static void setupDriver() {
        new SeleniumFactory();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static void closeDriver() {
        if(driver!=null) {
            driver.close();
            driver.quit();
        }
    }
}

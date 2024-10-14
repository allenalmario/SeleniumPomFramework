package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;
import utils.SeleniumFactory;

@Log
public class InformationPage extends BasePage {

    By first_name_field = By.id("first-name");
    By last_name_field = By.id("last-name");
    By zip_code_field = By.id("postal-code");
    By continue_button = By.id("continue");

    public void fillFirstNameField() {
        log.info("Filling out First Name field");
        type(first_name_field, SeleniumFactory.config.getProperty("first_name"));
    }

    public void fillLastNameField() {
        log.info("Filling out Last Name field");
        type(last_name_field, SeleniumFactory.config.getProperty("last_name"));
    }

    public void fillZipCodeField() {
        log.info("Filling out Zip Code field");
        type(zip_code_field, SeleniumFactory.config.getProperty("zip_code"));
    }

    public void clickOnContinueButton() {
        log.info("Clicking on Continue button");
        click(continue_button);
    }

}

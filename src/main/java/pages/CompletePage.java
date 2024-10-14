package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;

@Log
public class CompletePage extends BasePage {

    By orderConfirmationText = By.xpath("//h2[normalize-space()='Thank you for your order!']");

    public String extractOrderConfirmationText() {
        log.info("Extracting Thank you message");
        return getElementText(orderConfirmationText);
    }

}

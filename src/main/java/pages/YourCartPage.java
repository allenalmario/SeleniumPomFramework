package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;

@Log
public class YourCartPage extends BasePage {

    By item_name = By.xpath("//div[@class='inventory_item_name']");
    By cart_quantity = By.xpath("//div[@class='cart_quantity']");
    By checkout_button = By.id("checkout");

    public String extractCartItemText() {
        log.info("Extracting cart item name text");
        return getElementText(item_name);
    }

    public String extractCartItemQuantity() {
        log.info("Extracting cart item quantity");
        return getElementText(cart_quantity);
    }

    public void clickOnCheckOutButton() {
        log.info("Clicking on Checkout button");
        click(checkout_button);
    }

}

package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;

@Log
public class ProductPage extends BasePage {

    By product_page_add_to_cart_button = By.id("add-to-cart");

    public void clickOnAddToCartButton() {
        log.info("Clicking on Add to Cart button");
        click(product_page_add_to_cart_button);
    }

}

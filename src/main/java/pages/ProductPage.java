package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;

@Log
public class ProductPage extends BasePage {

    By product_page_add_to_cart_button = By.id("add-to-cart");
    By back_to_products_link = By.id("back-to-products");

    public void clickOnAddToCartButton() {
        log.info("Clicking on Add to Cart button");
        click(product_page_add_to_cart_button);
    }

    public void clickOnBackToProductsLink() {
        log.info("Clicking on Back to Products link");
        click(back_to_products_link);
    }

}

package stepDefinitions;

import io.cucumber.java.en.And;
import pages.ProductPage;

public class ProductPageStepDefinitions {

    ProductPage productPage = new ProductPage();

    @And("user clicks on Add to Cart button")
    public void user_clicks_on_add_to_cart_button() {
        productPage.clickOnAddToCartButton();
    }

    @And("user clicks on Cart link")
    public void user_clicks_on_cart_link() {
        productPage.clickOnCartLink();
    }
}

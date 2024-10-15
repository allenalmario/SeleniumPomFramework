package stepDefinitions;

import io.cucumber.java.en.And;
import pages.ProductsPage;

public class ProductsPageStepDefinitions {

    ProductsPage productsPage = new ProductsPage();

    @And("user clicks on {string} item")
    public void userClicksOnItem(String item) {
        if (item.equals("Sauce Labs Backpack")) {
            productsPage.clickOnSauceLabsBackpack();
        }
        else if (item.equals("Sauce Labs Bolt T-Shirt")) {
            productsPage.clickOnSauceLabsBoltTshirtLink();
        }
    }
}

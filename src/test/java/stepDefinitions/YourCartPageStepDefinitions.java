package stepDefinitions;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.YourCartPage;

public class YourCartPageStepDefinitions {

    YourCartPage yourCartPage = new YourCartPage();

    @And("user ensures the item name is {string}")
    public void userEnsuresTheItemNameIs(String itemName) {
        Assert.assertEquals(yourCartPage.extractCartItemText(), itemName);
    }

    @And("user ensures the item quantity is correct")
    public void userEnsuresTheItemQuantityIsCorrect() {
        Assert.assertEquals(Integer.parseInt(yourCartPage.extractCartItemQuantity()), 1);
    }

    @And("user clicks on Checkout button")
    public void userClicksOnCheckoutButton() {
        yourCartPage.clickOnCheckOutButton();
    }
}

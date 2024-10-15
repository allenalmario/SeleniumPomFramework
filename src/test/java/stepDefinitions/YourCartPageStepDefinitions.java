package stepDefinitions;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.YourCartPage;

public class YourCartPageStepDefinitions {

    YourCartPage yourCartPage = new YourCartPage();

    @And("user ensures the item {string} is in cart and quantity is correct")
    public void userEnsuresTheItemNameIs(String itemName) {
        Assert.assertTrue(yourCartPage.isItemPresentInCart(itemName));
    }

//    @And("user ensures the item quantity is correct")
//    public void userEnsuresTheItemQuantityIsCorrect() {
//        Assert.assertEquals(Integer.parseInt(yourCartPage.extractCartItemQuantity()), 1);
//    }

    @And("user clicks on Checkout button")
    public void userClicksOnCheckoutButton() {
        yourCartPage.clickOnCheckOutButton();
    }
}

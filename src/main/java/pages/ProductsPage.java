package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;

@Log
public class ProductsPage extends BasePage {

    By products_page_title = By.className("title");
    By sauce_labs_backpack_link = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");

    public boolean assertOnProductsPage() {
        log.info("Asserting page is on Products Page");
        return isElementPresent(products_page_title);
    }

    public void clickOnSauceLabsBackpack() {
        log.info("Clicking on Sauce Labs Backpack link");
        click(sauce_labs_backpack_link);
    }

}

package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;

@Log
public class ProductsPage extends BasePage {

    By products_page_title = By.className("title");
    By hamburger_menu = By.id("react-burger-menu-btn");
    By logout_link = By.xpath("//a[@id='logout_sidebar_link']");


    public boolean assertOnProductsPage() {
        log.info("Asserting page is on Products Page");
        return isElementPresent(products_page_title);
    }

    public void clickOnHamburgerMenu() {
        log.info("Clicking on Hamburger Menu");
        click(hamburger_menu);
    }

    public void clickLogoutLink() {
        log.info("Clicking on Logout link");
        waitFor();
        click(logout_link);
    }

}

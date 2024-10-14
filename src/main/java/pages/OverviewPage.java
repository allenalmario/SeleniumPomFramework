package pages;

import base.BasePage;
import lombok.extern.java.Log;
import org.openqa.selenium.By;

@Log
public class OverviewPage extends BasePage {

    By finish_button = By.id("finish");

    public void clickFinishButton() {
        log.info("Clicking on Finish button");
        click(finish_button);
    }

}

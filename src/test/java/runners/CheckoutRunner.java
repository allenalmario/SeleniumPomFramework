package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/features/Checkout.feature"}, glue={"stepDefinitions"}, plugin=
        {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CheckoutRunner extends AbstractTestNGCucumberTests {
}

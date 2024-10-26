package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.java.Log;
import utils.SeleniumFactory;

@Log
public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        log.info("~~~~~~~~~~~~~~~~~~~~SETUP~~~~~~~~~~~~~~~~~~~~");
        log.info("Starting Test Scenario: " + scenario.getName().toUpperCase());
        SeleniumFactory.setupDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        log.info("~~~~~~~~~~~~~~~~~~~~TEARDOWN~~~~~~~~~~~~~~~~~~~~");
        log.info("Test Complete, Result: " + scenario.getStatus());
        if (scenario.isFailed()) {
            log.info(scenario.getName() + " HAS FAILED!");
        }
        SeleniumFactory.closeDriver();
    }

}
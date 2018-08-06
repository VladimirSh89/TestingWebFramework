package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        format = {"json:target/Cucumber/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = {"com.steps"})

public class TestRunner {
}

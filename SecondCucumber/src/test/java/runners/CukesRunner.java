package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json", "html:target/cucumber-pretty"},
        glue = "step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@Google"
)

public class CukesRunner {
}

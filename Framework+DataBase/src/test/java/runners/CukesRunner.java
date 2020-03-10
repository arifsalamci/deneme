package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/JsonReport.html",
        glue = "step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@SingleStudent"
)

public class CukesRunner {

}

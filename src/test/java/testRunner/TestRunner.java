package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/FeaturesFiles",
        glue = "stepDefinition"
       // plugin = {"pretty","html:test-output"},
       // monochrome = true,
       // dryRun = false,
       // strict = true
       // tags = {"@EndtoEND, @Regression, @smoketest, @sanityTest"}
)
public class TestRunner {

}

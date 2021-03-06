package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
   features = "src/main/resources/feature",
        glue = "stepDefinitions",
        plugin = {"json:target/cucumber.json"},
        tags = "@smoke")
public class TestRunner extends AbstractTestNGCucumberTests {
}

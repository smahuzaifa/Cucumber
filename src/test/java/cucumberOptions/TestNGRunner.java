package cucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {
    //AbstractTestNGCucumberTests is the class that gives life for the runner


}

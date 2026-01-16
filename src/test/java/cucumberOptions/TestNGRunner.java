package cucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome = true,plugin ={"pretty","html:target/cucumber.html",
"json:target/cucumber.json"}/*, tags = "@RegressionTest and @SmokeTest"*/)
//dryRun = true , this compiles and is used to check if all test cases or statements have
//associated step definitions
public class TestNGRunner extends AbstractTestNGCucumberTests {
    //AbstractTestNGCucumberTests is the class that gives life for the runner


}

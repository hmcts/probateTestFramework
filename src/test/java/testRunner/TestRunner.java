package testRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/java/features",
        glue = {"cucumber" }
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

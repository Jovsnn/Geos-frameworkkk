package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Feature",
		glue = "Stepdef")
public class Testrunners extends AbstractTestNGCucumberTests {

}

package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HRMDataDriven.feature",
				 glue="stepdef",
				 publish=true
		         )
public class HRMDatadrivenRunner {

}

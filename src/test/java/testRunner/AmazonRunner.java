package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 *single scenario  : tags="@Bestseller"
 *multiple scenario: tags="@Bestseller or @Mobiles"    //here we used or operator
 *skip any one scenario: tags="not @Mobiles" 
 *skip multiple scenario: tags="not @ignore"     //here we write these @ignore in feature file what ever if you want to ignore
 *to run all the scenario: tags="@All"
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Amazon.feature",
				 glue="stepdef",
				 tags="@All",
				 publish=true)
public class AmazonRunner {

}
package stepdef;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Registersteps {

WebDriver driver;
@Given("open opencart application with register page")
public void open_opencart_application_with_register_page() {
   driver =new ChromeDriver();
   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
}

@When("user enter valid dataset")
public void user_enter_valid_dataset(DataTable Table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	
	List <List<String>>data=Table.cells();
	//data.get(1) for row .get(0) for column
	driver.findElement(By.id("input-firstname")).sendKeys(data.get(1).get(0));
	driver.findElement(By.id("input-lastname")).sendKeys(data.get(1).get(1));
	driver.findElement(By.name("email")).sendKeys(data.get(1).get(2));
	driver.findElement(By.name("telephone")).sendKeys(data.get(1).get(3));
	driver.findElement(By.name("password")).sendKeys(data.get(1).get(4));
	driver.findElement(By.name("confirm")).sendKeys(data.get(1).get(5));

}

@When("user clicks on radio button")
public void user_clicks_on_radio_button() {
    driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
    
}

@When("user select privacy policy checkbox")
public void user_select_privacy_policy_checkbox() {
  driver.findElement(By.name("agree")).click();
}

@When("user clicks on continue button")
public void user_clicks_on_continue_button() {
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
}

@Then("user should able to register into application")
public void user_should_able_to_register_into_application() {
 
	System.out.println("user is registered!");
}	
	
}

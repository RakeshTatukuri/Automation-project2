package stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartLoginsteps {

	WebDriver driver;

	@Given("open opencart login page")
	public void open_opencart_login_page() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials(DataTable Table) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		/*
		 * There are two ways to read the data from the table either from map or list
		 */
		// passing 2 string object
		List<Map<String, String>> data = Table.asMaps(String.class, String.class);

		/*
		 * in map key is nothing but column name | email | password |-->keys |
		 * jaisriram123@gmail.com | sriram123 |-->values
		 */

		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(data.get(0).get("password"));

	}

	@Then("user should be able to login into opencart application")
	public void user_should_be_able_to_login_into_opencart_application() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}

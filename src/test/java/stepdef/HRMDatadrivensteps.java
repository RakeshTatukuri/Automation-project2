package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMDatadrivensteps {

WebDriver driver;
@Given("open hrm application")
public void open_hrm_application() {
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
   driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("user enters username {string} and enters password {string}")
public void user_enters_username_and_enters_password(String un, String pwd) {
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pwd);
	
}

@When("user click on login button from hrm page")
public void user_click_on_login_button_from_hrm_page() {
    
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("as per test data for valid dataset user should be able to login")
public void as_per_test_data_for_valid_dataset_user_should_be_able_to_login() {
    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"login failed");
    System.out.println("Login successfull");
	
}
}
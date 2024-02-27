package stepdef;

import java.time.Duration;

import org.testng.Assert;

import Hooksdemo.BrowserSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMSteps {

	//WebDriver driver;//global variable
	WebDriver driver=BrowserSetup.getdriver();
	
@Given("open CRM application")
public void open_crm_application() {
  /* driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
   driver.navigate().to("https://automationplayground.com/crm/");
   */
}

@When("user click on sign in link")
public void user_click_on_sign_in_link() {
   driver.findElement(By.id("SignIn")).click();
   
}

@Then("sign in page should open")
public void sign_in_page_should_open() {
    Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Test fail");
    System.out.println("page open...Test pass!");
}

@When("user enters email {string} and password {string}")
public void user_enters_email_and_password(String email, String pwd) {
    driver.findElement(By.id("email-id")).sendKeys(email);
    driver.findElement(By.id("password")).sendKeys(pwd);
}

@When("user clicks on submit button")
public void user_clicks_on_submit_button() {
    driver.findElement(By.id("submit-id")).click();
}

@Then("for valid data user should be able to login")
public void for_valid_data_user_should_be_able_to_login() {
   Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"login fail");
   System.out.println("login completed");
}
 
}

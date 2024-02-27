package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesteps {
	
WebDriver driver;
@Given("open google application")
public void open_google_application() {
	 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
}

@When("I capture current title of page")
public void i_capture_current_title_of_page() {
	  System.out.println("Title is "+driver.getTitle());

}

@Then("Title should match with google")
public void title_should_match_with_google() {
	Assert.assertTrue(driver.getTitle().contains("Google"),"Title not match");
	System.out.println("Title matched");
}

@When("I enter valid keyword {string} into search box")
public void i_enter_valid_keyword_into_search_box(String data) {
	   driver.findElement(By.id("APjFqb")).sendKeys(data,Keys.ENTER);

}

@Then("I should get valid search result")
public void i_should_get_valid_search_result() {
	   System.out.println("current url "+driver.getCurrentUrl());

}
}
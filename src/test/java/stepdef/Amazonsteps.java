package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Amazonsteps {

WebDriver driver;
@Given("open amazon home page")
public void open_amazon_home_page() {
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=16183222341932413325&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007742&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
}

@When("user capture current title of home page")
public void user_capture_current_title_of_home_page() {
	System.out.println("Title is "+driver.getTitle());

}

@Then("title should matched with home page title")
public void title_should_matched_with_home_page_title() {
    Assert.assertTrue(driver.getTitle().contains("Online"),"Title not matched");
    System.out.println("Home page Title is matched");
}

@When("user open bestsellers page")
public void user_open_bestsellers_page() {
   driver.findElement(By.partialLinkText("Best Sellers")).click();
   
}

@When("user capture current title of bestsellers")
public void user_capture_current_title_of_bestsellers() {
   System.out.println("Title is "+driver.getTitle());
}

@Then("title should match with bestsellers page title")
public void title_should_match_with_bestsellers_page_title() {
    Assert.assertTrue(driver.getTitle().contains("Bestsellers"),"Title not matched");
    System.out.println("bestsellers title  is matched");
}

@When("user open mobiles page")
public void user_open_mobiles_page() {
    driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
}

@When("user capture current title of mobiles")
public void user_capture_current_title_of_mobiles() {
    System.out.println("Title is"+driver.getTitle());
}

@Then("title should match with mobiles page title")
public void title_should_match_with_mobiles_page_title() {
    Assert.assertTrue(driver.getTitle().contains("Mobile Phones"),"Title not matched");
    System.out.println("mobile  title is matched");
}

@When("user open todaysdeal page")
public void user_open_todaysdeal_page() {
   driver.findElement(By.partialLinkText("Today's Deals")).click();
}

@When("user capture current title of todaysdeal")
public void user_capture_current_title_of_todaysdeal() {
    System.out.println("Title is "+driver.getTitle());
}

@Then("title should match with todaysdeal page title")
public void title_should_match_with_todaysdeal_page_title() {
    Assert.assertTrue(driver.getTitle().contains("Deals"),"Title not matched");
    System.out.println("Todays deal tile is matched");
}

}
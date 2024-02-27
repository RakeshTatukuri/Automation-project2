package Hooksdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks {

	public WebDriver driver;
	@Before
	public void setup()
	{
	driver=	BrowserSetup.setdriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(110));
	 driver.navigate().to("https://automationplayground.com/crm/");
	}
	//hooks are only set up for precondition
	@Before("@login")
	public void pageopen()
	{
		 driver.findElement(By.id("SignIn")).click();
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}
	
}

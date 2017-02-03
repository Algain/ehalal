package ToolsQA.Mavendemoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class viewpageTest {

	@Test
	public void TestFireFox() throws InterruptedException{
	// turn off htmlunit warnings
	java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
	java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);

	System.out.println("Testing");
	
	//System.setProperty("webdriver.gecko.driver", "./geckodriver\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	//WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	
	//Run Headless
	WebDriver driver = new HtmlUnitDriver();
	driver.get("http://admin.ehalal.com/supplier/login");
	System.out.println("Title of the page "+ driver.getTitle());
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("algain@theflyingcoders.com");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("Abcd1234");
	
	Thread.sleep(2000);
	
	WebElement login = driver.findElement(By.id("login_submit"));
	login.click();
	Thread.sleep(2000);
	
	System.out.println("Login Successful");
	
	driver.get("http://admin.ehalal.com/supplier/logout");
	
	System.out.println("Log Off");
	driver.quit();
	}
}

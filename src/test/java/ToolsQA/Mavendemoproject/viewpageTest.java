package ToolsQA.Mavendemoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class viewpageTest {

	@Test
	public void TestFireFox(){
		
	System.out.println("Testing");
	
	//System.setProperty("webdriver.gecko.driver", "./geckodriver\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	//WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	
	//Run Headless
	WebDriver driver = new HtmlUnitDriver();
	driver.get("http://admin.ehalal.com/supplier/login");
	System.out.println("Title of the page "+ driver.getTitle());
	driver.quit();
	}
}

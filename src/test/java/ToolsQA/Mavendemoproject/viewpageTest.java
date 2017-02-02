package ToolsQA.Mavendemoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class viewpageTest {

	@Test
	public void TestFireFox(){
	System.out.println("Testing");
	
	System.setProperty("webdriver.gecko.driver", "F:\\geckodriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://admin.ehalal.com/supplier/login");
	driver.quit();
	}
}

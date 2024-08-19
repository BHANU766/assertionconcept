package com.assertionconcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertfalse {
       
	   protected static String url="https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
	   WebDriver driver;

@BeforeSuite 
public void startchromebrowser() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}	

@BeforeMethod
public void openurl() {
	  driver.get(url);
}

@Test
public void testassertfalse() {
	boolean verifytitle=driver.getTitle().equalsIgnoreCase("Selenium Practice - Student");
	Assert.assertFalse(verifytitle);
}

@AfterSuite
public void closechromebrowser() {
	  driver.quit();
}


}

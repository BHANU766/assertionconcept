package com.assertionconcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserttrue {
         
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
public void testasserttrue() {
	WebElement hobbiesfield=driver.findElement(By.id("hobbies"));
	Assert.assertTrue(hobbiesfield.isDisplayed());
}

@AfterSuite
public void closechromebrowser() {
	  driver.quit();
}


}

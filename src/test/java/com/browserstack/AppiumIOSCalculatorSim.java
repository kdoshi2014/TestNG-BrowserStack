package com.browserstack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Individual sessions for each test
public class AppiumIOSCalculatorSim {
	
	WebDriver driver;
	File app;

	@BeforeMethod(alwaysRun=true)
	public void setUp() throws Exception
	{
		System.out.println("I am in setup");
		

		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("app", "/Users/kalpesh/Desktop/Calculator1.app");
        capabilities.setCapability("browserName", "");
        capabilities.setCapability("automationName" ,  "XCUITest");
		
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}

	@Test
	public void addition() throws Exception {
		
		System.out.println("I am in addition");
        
	      WebElement insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeApplication[@name=\"Calculator1\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      WebElement insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeApplication[@name=\"Calculator1\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeButton[@name=\"+\"]")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.xpath("//XCUIElementTypeStaticText[2]")).getText()) == 15.0);

	}
	
	@Test
	public void subtraction() throws Exception {
		
		System.out.println("I am in subtraction");
        
	      WebElement insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeApplication[@name=\"Calculator1\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      WebElement insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeApplication[@name=\"Calculator1\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeButton[@name=\"-\"]")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.xpath("//XCUIElementTypeStaticText[2]")).getText()) == 5.0);

	}
	
	@Test
	public void multiplication() throws Exception {
		
		System.out.println("I am in multiplication");
        
	      WebElement insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeApplication[@name=\"Calculator1\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      WebElement insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeApplication[@name=\"Calculator1\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeButton[@name=\"x\"]")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.xpath("//XCUIElementTypeStaticText[2]")).getText()) == 50.0);

	}
	
	@Test
	public void division() throws Exception {
		
		System.out.println("I am in division");
        
	      WebElement insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeApplication[@name=\"Calculator1\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      WebElement insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeApplication[@name=\"Calculator1\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeButton[@name=\"/\"]")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.xpath("//XCUIElementTypeStaticText[2]")).getText()) == 2.0);

	}
	
	
    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }

}
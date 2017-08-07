package com.browserstack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
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


public class AppiumAndroidCalculatorBrowserStack {
	
	AppiumDriver driver;
	File app;

	@BeforeMethod(alwaysRun=true)
	public void setUp() throws Exception
	{
		System.out.println("I am in setup");

		
		//app = new File("/Applications/Official/AppAutomate/Calculator/calculator.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("realMobile", true);
        capabilities.setCapability("device", "Samsung Galaxy S7");
        capabilities.setCapability("app", "bs://7916f88a2b461d80dff2d5b7edff745a5e51c201");
        capabilities.setCapability("project", "KalpeshAppiumProject");
        capabilities.setCapability("build", "KalpeshAppiumBuild");
        capabilities.setCapability("name", "KalpeshAppiumTest");
        capabilities.setCapability("browserstack.debug", "true");
        capabilities.setCapability("deviceOrientation", "portrait");
		
		//capabilities.setCapability("no-reset", "true");
		//capabilities.setCapability("full-reset", "False");

		//capabilities.setCapability("platformName", "iOS");
		//capabilities.setCapability("udid", “UDID of device“);
		//capabilities.setCapability("bundleId", “app bundle id“);
		//capabilities.setCapability("showIOSLog", true);
		
		//capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver(new URL("https://username:accesskey@hub.browserstack.com/wd/hub"), capabilities);
	}
	
	
	@Test
	public void calctests() throws Exception {
		
		WebElement insertTextElement1;
		WebElement insertTextElement2;
		WebElement clearElement;
		
		System.out.println("I am in addition");
		
	      insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp1")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp2")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnadd")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.id("com.example.kalpesh.calculator:id/result")).getText()) == 15.0);
        
	     
	     Thread.sleep(2000);
	     clearElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnclr")));
	      clearElement.click();
	      
		     System.out.println("I am subtraction");
	      
	      
	      insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp1")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp2")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement subElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnsub")));
	          subElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.id("com.example.kalpesh.calculator:id/result")).getText()) == 5.0);
	     
	     Thread.sleep(2000);
	     clearElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnclr")));
	      clearElement.click();
	      
	      System.out.println("I am division");
	      
	      
	      insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp1")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp2")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement divElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btndiv")));
	          divElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.id("com.example.kalpesh.calculator:id/result")).getText()) == 2.0);
	     
	     Thread.sleep(2000);
	     clearElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnclr")));
	      clearElement.click();   
	      
	      System.out.println("I am in multiplication");
	      
	      
	      insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp1")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp2")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement mulElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnmul")));
	          mulElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.id("com.example.kalpesh.calculator:id/result")).getText()) == 50.0);
	     
	     Thread.sleep(2000);
	     clearElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnclr")));
	      clearElement.click();
		
	}
	
	
	/*@Test
	public void addition() throws Exception {
		
	      WebElement insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp1")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      WebElement insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp2")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnadd")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.id("com.example.kalpesh.calculator:id/result")).getText()) == 15.0);
        
	     
	     Thread.sleep(2000);
	     WebElement clearElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnclr")));
	      clearElement.click();
	     
	     System.out.println("I am in addition");

	}
	
	
	@Test
	public void subtraction() throws Exception {
		
	      WebElement insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp1")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      WebElement insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp2")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnsub")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.id("com.example.kalpesh.calculator:id/result")).getText()) == 5.0);
	     
	     Thread.sleep(2000);
	     WebElement clearElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnclr")));
	      clearElement.click();
	     
	     System.out.println("I am subtraction");

	}
	
	
	@Test
	public void division() throws Exception {
		
	      WebElement insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp1")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      WebElement insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp2")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btndiv")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.id("com.example.kalpesh.calculator:id/result")).getText()) == 2.0);
	     
	     Thread.sleep(2000);
	     WebElement clearElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnclr")));
	      clearElement.click();
	     
	     System.out.println("I am division");

	}
	
	
	@Test
	public void multiplication() throws Exception {
		
	      WebElement insertTextElement1 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp1")));
	          insertTextElement1.sendKeys("10");
	          
	    Thread.sleep(2000);
	    
	      WebElement insertTextElement2 = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/editOp2")));
	          insertTextElement2.sendKeys("5");
	          
	    Thread.sleep(2000);
	    
	      WebElement addElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnmul")));
	          addElement.click();
	          
	     Thread.sleep(2000);
	     
	     Assert.assertTrue(Double.parseDouble(driver.findElement(By.id("com.example.kalpesh.calculator:id/result")).getText()) == 50.0);
	     
	     Thread.sleep(2000);
	     WebElement clearElement = new WebDriverWait(driver, 30).until(
	              ExpectedConditions.elementToBeClickable(By.id("com.example.kalpesh.calculator:id/btnclr")));
	      clearElement.click();
	     
	     System.out.println("I am in multiplication");

	}*/
	
    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }

}
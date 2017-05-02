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
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AppiumTest {

	//@Test
	public void test1() throws MalformedURLException {

		//File appDir = new File("/Users/kalpesh/Desktop");
        //File app = new File(appDir, "app-debug.apk");
        
        AppiumDriver driver;
		
		// Create object of DesiredCapabilities class and specify android
		// platform
		/*DesiredCapabilities capabilities = DesiredCapabilities.android();
		
		capabilities.setCapability("device","Android");

        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformName","Android");
        
        capabilities.setCapability("app", app.getAbsolutePath());
        
        capabilities.setCapability("appPackage", "com.example.kalpesh.omgandroid");
        
        capabilities.setCapability("appActivity", "com.example.kalpesh.omgandroid.MainActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		WebDriver driver = new AndroidDriver(url, capabilities);*/
        
        DesiredCapabilities capabilities = new DesiredCapabilities();

        /* These are the capabilities we must provide to run our test on TestObject */
        capabilities.setCapability("testobject_api_key", "2B97A2EF61344DA3BDFC16FA2BD23413");
        capabilities.setCapability("testobject_device", "LG_Nexus_5X_real");

        /* The driver will take care of establishing the connection, so we must provide
        * it with the correct endpoint and the requested capabilities. */
        driver = new AndroidDriver(new URL("http://appium.testobject.com/wd/hub"), capabilities);
        
		
		driver.findElement(By.name("Button")).click();

		driver.quit();

	}

}
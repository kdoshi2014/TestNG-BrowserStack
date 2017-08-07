package com.browserstack;

import java.io.File;
import java.io.IOException;
 
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class BrowserMobProxy {
	public static WebDriver driver;
	public static BrowserMobProxyServer server;
 
	@BeforeClass
	public void setup() throws Exception {
		
    	//System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
    	//System.setProperty("webdriver.chrome.logfile", "/Applications/chromedriver.log");
		
		//System.setProperty("webdriver.safari.noinstall", "true");
		System.setProperty("webdriver.safari.driver","/usr/bin/safaridriver");
 
		server = new BrowserMobProxyServer();
		server.start();
		server.getPort();
		Proxy proxy = ClientUtil.createSeleniumProxy(server);

		
		DesiredCapabilities seleniumCapabilities = new DesiredCapabilities();
		seleniumCapabilities.setCapability(CapabilityType.PROXY, proxy);
		
		driver = new SafariDriver(seleniumCapabilities);
		
	}
 
	@Test
	public void teknosa_test1() throws InterruptedException {
 
		server.newHar("teknosa.har");
		 
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");

		

	}
 
	@AfterClass
	public void shutdown() {
		try {
	        
			// Get the HAR data
			Har har = server.getHar();
			File harFile = new File("/Applications/teknosa_test.har");
			har.writeTo(harFile);
 
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		driver.quit();
		server.stop();
	}
}

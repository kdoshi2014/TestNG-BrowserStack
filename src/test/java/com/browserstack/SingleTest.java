package com.browserstack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.browserstack.common.Waiter;

public class SingleTest extends BrowserStackTestNGTest {
    
    
    /*
     * This is the test to check whether the live session is opened successfully
     * To run the test in a single browser run it using the single.testng.xml. Add/modify the capabilities in single.conf.json
     * To run the test in parallel in multiple browsers run it using parallel.testng.xml. Add/modify the capabilities in parallel.conf.json
     */
	@Test
    public void testLogin() throws Exception {
    	
		Waiter _waiter = new Waiter(driver);
		//Step 1: Open the BrowserStack site
    	driver.get("https://www.browserstack.com/");
    	driver.manage().window().maximize();
    	_waiter.waitForMe(By.linkText("Sign in"), 5);
    	
    	//Step 2: Search for Sign In link and click on it
    	driver.findElement(By.linkText("Sign in")).click();
        Assert.assertTrue(driver.getPageSource().contains("Sign in"));
        /*_waiter.waitForMe(By.id("user_email_login"), 5);
        
        //Step 3: Enter the email and password and click on Sign in button
        driver.findElement(By.id("user_email_login")).sendKeys("kalpesh@browserstack.com");
        driver.findElement(By.id("user_password")).sendKeys("kalpesh81");
        driver.findElement(By.id("user_submit")).click(); 
        
	    //Step 4: Click on cross icon on the Local installation pop up
        if(driver.findElements( By.id("skip-local-installation") ).size() != 0)
        {
        	driver.findElement(By.id("skip-local-installation")).click(); 
        	Thread.sleep(5000);
        }
        
        //Step 5: Select the browser you want to open live session for and click on it
	    driver.findElement(By.xpath("//*[@id=\"rf-browsers\"]/div/div[2]/div[4]/ul/li[1]/a")).click(); 
	    _waiter.waitForMe(By.id("dock"), 10);
        
        //Step 6: Check whether the live session was successful by checking the title of the Live session page
        Assert.assertEquals("Dashboard", driver.getTitle());*/

    }
}

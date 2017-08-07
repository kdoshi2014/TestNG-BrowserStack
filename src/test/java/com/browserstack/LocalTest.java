package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalTest extends BrowserStackTestNGTest {

    /*
     * This is a simple test to run an automate test on Local server
     * To run this test use local.testng.xml
     */
	@Test
    public void test() throws Exception {
        
		driver.get("http://localhost/dashboard/");
        Assert.assertTrue(driver.getPageSource().contains("Apache Friends"));
        System.out.println(driver.manage().logs().get("chrome"));
    }
}

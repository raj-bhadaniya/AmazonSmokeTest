package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LocalTestExecution {
	
	public static RemoteWebDriver driver;
	
	@Test
	
	public void OpenChromeBrowser() throws MalformedURLException, InterruptedException
	{
	//Step 1 set up the URL for the Selenium Grid
		
	String url = "http://54.209.57.94:4444/wd/hub";
				
	//Step 2 is to set up the chrome options for launching Chrome browser
				
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
				
	//Step 3 - Create a Map interface and define the build and name of the test
				
	/*Map<String,Object> cloudOption = new HashMap();
				
	cloudOption.put("build", "Smoke Test");
	cloudOption.put("name", "Chrome Smoke Test");
				
	options.setCapability("cloud-options", cloudOption);*/
	
	driver = new RemoteWebDriver(new URL(url), options);
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();

	Thread.sleep(10000);
		
	String URL = driver.getCurrentUrl();
	String title = driver.getTitle();
	
	System.out.println(URL);
	System.out.println(title);

	Thread.sleep(10000);
	
	driver.quit();
	
	
	
	}

}

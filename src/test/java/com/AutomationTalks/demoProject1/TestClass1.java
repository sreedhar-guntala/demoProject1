package com.AutomationTalks.demoProject1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	public WebDriver driver;
	
	public static final String USERNAME = "sreenaths1";
	public static final String AUTOMATE_KEY = "pnKHmQxF61d7HGXtyUdY";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@BeforeMethod
	public void launchDriver() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Firefox");
	    caps.setCapability("browser_version", "60.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "7");
	    caps.setCapability("resolution", "1024x768");
	    
	    driver = new RemoteWebDriver(new URL(URL), caps);
		
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1()
	{
		driver.navigate().to("http://www.google.co.uk");
		System.out.println("Test1 Title is" + driver.getTitle());
	}
	
	@Test
	public void Test2()
	{
		driver.navigate().to("http://www.google.co.uk");
		System.out.println("Test2 Title is" + driver.getTitle());
	}
	
	@Test
	public void Test3()
	{
		driver.navigate().to("http://www.google.co.uk");
		System.out.println("Test3 Title is" + driver.getTitle());
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
}

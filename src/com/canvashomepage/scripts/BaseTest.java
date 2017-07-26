package com.canvashomepage.scripts;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.collect.ImmutableMap;
import com.library.Generic;

public class BaseTest 
{
	public WebDriver driver;
	
@BeforeMethod
public void preCondition()
{
	
	String browser=Generic.getConfigData("BROWSER");
	if(browser.equals("GC"))
	{
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(capabilities);
	}
	else if(browser.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", "./exe/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	
	String url=Generic.getConfigData("URL");
	driver.get(url);
	driver.navigate().refresh();
}
@AfterMethod
public void postCondition()
{
	driver.quit();
	System.out.println("Browsers are closed");
}
}

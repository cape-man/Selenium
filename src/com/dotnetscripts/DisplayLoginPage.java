package com.dotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayLoginPage extends BaseTest
{
	String status="N.A";
	long starttime = (new Date()).getTime();
@Test
public void testDisplayLoginPage()
{
	try
	{
	driver.findElement(By.linkText("Log in")).click();
	System.out.println("clicked on login link");
	Reporter.log("clicked on login link");
	if(driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed())
	{
		status="Pass";
		System.out.println("login button is displayed");
		Reporter.log("login button is displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("login button is not displayed");
		Reporter.log("login button is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD1_dotnetApplication","Display Login Page","Login button should be displayed in Login Page",status,(new Date()).getTime(),"1","Login Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("2", testdetails);
	}
	catch(NoSuchElementException e)
	{
		status="Failed";
		System.out.println("login button is not displayed");
		Reporter.log("login button is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
		long endtime = (new Date()).getTime();
		long Duration = endtime-starttime;
		Object[] testdetails=new Object[]{"TD1_dotnetApplication","Display Login Page","Login button should be displayed in Login Page",status,(new Date()).getTime(),"1","Login Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
		testresult.put("2", testdetails);
	}
}
}

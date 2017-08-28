package com.dotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayRegisterPage2 extends BaseTest
{
	String status="N.A";
	long starttime = (new Date()).getTime();
@Test
public void testDisplayRegisterPage()
{
	try
	{
	driver.findElement(By.linkText("Register")).click();
	System.out.println("clicked on register link");
	Reporter.log("clicked on register link");
	if(driver.findElement(By.xpath("//input[@value='Register']")).isDisplayed())
	{
		status="Pass";
		System.out.println("register button is displayed");
		Reporter.log("register button is displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("register button is not displayed");
		Reporter.log("register button is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD12_dotnetApplication","Display Register Page-2","Register button should be displayed in Register Page",status,(new Date()).getTime(),"3","Register Module-2","SIT","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("13", testdetails);
	}
	catch(NoSuchElementException e)
	{
		status="Failed";
		System.out.println("register button is not displayed");
		Reporter.log("register button is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
		long endtime = (new Date()).getTime();
		long Duration = endtime-starttime;
		Object[] testdetails=new Object[]{"TD12_dotnetApplication","Display Register Page-2","Register button should be displayed in Register Page",status,(new Date()).getTime(),"3","Register Module-2","SIT","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
		testresult.put("13", testdetails);
	}
}
}

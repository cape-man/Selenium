package com.dotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayAboutPage2 extends BaseTest
{
	String status="N.A";
	long starttime = (new Date()).getTime();
@Test
public void testDisplayAboutPage()
{
	try
	{
	driver.findElement(By.linkText("About")).click();
	System.out.println("clicked on about link");
	Reporter.log("clicked on about link");
	if(driver.findElement(By.xpath("//p[text()='� 2017 - My ASP.NET Applicatio']")).isDisplayed())
	{
		status="Pass";
		System.out.println("Footer is displayed");
		Reporter.log("Footer is displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	else
	{
		status="Failed";
		System.out.println("Footer is not displayed");
		Reporter.log("Footer is not displayed");
		System.out.println("**************************************************");
		Reporter.log("**************************************************");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD9_dotnetApplication","Display About Page-2","Footer should be displayed in About page",status,(new Date()).getTime(),"3","About Module-2","SIT","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("10", testdetails);
}
catch(NoSuchElementException e)
{
	status="Failed";
	System.out.println("Footer is not displayed");
	Reporter.log("Footer is not displayed");
	System.out.println("**************************************************");
	Reporter.log("**************************************************");
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD9_dotnetApplication","Display About Page-2","Footer should be displayed in About page",status,(new Date()).getTime(),"3","About Module-2","SIT","1.4.0",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("10", testdetails);
}
}
}

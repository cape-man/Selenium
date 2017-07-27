package com.dotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayAboutPage extends BaseTest
{
@Test
public void testDisplayAboutPage()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("About")).click();
	System.out.println("clicked on about link");
	Reporter.log("clicked on about link");
	String status="N.A";
	if(driver.findElement(By.xpath("//p[text()='© 2017 - My ASP.NET Application']")).isDisplayed())
	{
		status="Pass";
		System.out.println("Footer is displayed");
		Reporter.log("Footer is displayed");
	}
	else
	{
		status="Failed";
		System.out.println("Footer is not displayed");
		Reporter.log("Footer is not displayed");
	}
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	Object[] testdetails=new Object[]{"TD4_dotnetApplication","Display About Page","Footer should be displayed in About page",status,(new Date()).getTime(),"1","About Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("5", testdetails);
}
}

package com.dotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DisplayContactPage1 extends BaseTest
{
@Test
public void testDisplayContactPage1()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Contact")).click();
	System.out.println("clicked on contact link");
	Reporter.log("clicked on contact link");
	String status="N.A";
	if(driver.findElement(By.xpath("//p[text()='© 2018 - My ASP.NET Application']")).isDisplayed())
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
	Object[] testdetails=new Object[]{"TD6_dotnetApplication","Display Contact Page-1","Footer should be displayed in Contact page",status,(new Date()).getTime(),"2","Contact Module-1","Dev","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("7", testdetails);
}
}

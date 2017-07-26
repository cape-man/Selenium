package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class CreateTag extends BaseTest
{
@Test
public void testCreateTag()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Tags']")).click();
	driver.findElement(By.linkText("Create New Tag")).click();
	driver.findElement(By.id("Name")).sendKeys("Tag Name");
	driver.findElement(By.id("Slug")).sendKeys("TagSlug");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully created Tag.']")).isDisplayed())
	{
		status="Pass";
	}
	else
	{
		status="Failed";
	}
	Object[] testdetails=new Object[]{"TD4_dotnetApplication","Create Tag","User should be able to create a tag",status,(new Date()).getTime(),"1","Create Tag Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("5", testdetails);
}
}

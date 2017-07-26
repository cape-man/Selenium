package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class EditTag extends BaseTest
{
@Test
public void testEditTag()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Tags']")).click();
	driver.findElement(By.xpath("//td[contains(text(),'Tag Name')]/..//a[text()='Edit']")).click();
	driver.findElement(By.id("Name")).clear();
	driver.findElement(By.id("Name")).sendKeys("Tag Name Updated");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully updated Tag.']")).isDisplayed())
	{
		status="Pass";
	}
	else
	{
		status="Failed";
	}
	Object[] testdetails=new Object[]{"TD5_dotnetApplication","Edit Tag","User should be able to edit the tag",status,(new Date()).getTime(),"1","Edit Tag Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("6", testdetails);
}
}

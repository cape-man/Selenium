package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class EditPost extends BaseTest 
{
@Test
public void testEditPost()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Posts']")).click();
	driver.findElement(By.xpath("//td[contains(text(),'Post Title')]/..//a[text()='Edit']")).click();
	driver.findElement(By.id("Title")).clear();
	driver.findElement(By.id("Title")).sendKeys("Post Title Updated");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully updated Post.']")).isDisplayed())
	{
		status="Pass";
	}
	else
	{
		status="Failed";
	}
	
	Object[] testdetails=new Object[]{"TD2_dotnetApplication","Edit Post","User should be able to edit the post",status,(new Date()).getTime(),"1","Edit Post Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("3", testdetails);
}
}

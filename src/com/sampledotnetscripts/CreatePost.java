package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class CreatePost extends BaseTest
{
@Test
public void testCreatePost()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Posts']")).click();
	driver.findElement(By.linkText("Create New Post")).click();
	driver.findElement(By.id("Title")).sendKeys("Post Title");
	driver.findElement(By.id("Content")).sendKeys("Post Content");
	Select select1=new Select(driver.findElement(By.id("Bloggers_SelectedValue")));
	select1.selectByValue("1");
	Select select2=new Select(driver.findElement(By.id("UserChosenTags_FinalSelection")));
	select2.selectByValue("1");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully created Post.']")).isDisplayed())
	{
		status="Pass";
	}
	else
	{
		status="Failed";
	}
	Object[] testdetails=new Object[]{"TD1_dotnetApplication","Create Post","User should be able to create a new post",status,(new Date()).getTime(),"1","Create Post Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("2", testdetails);
}
}

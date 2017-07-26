package com.sampledotnetscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class DeletePost extends BaseTest
{
@Test
public void testDeletePost()
{
	long starttime = (new Date()).getTime();
	driver.findElement(By.linkText("Sync database")).click();
	driver.findElement(By.xpath("//a[text()='Sync database']/..//a[text()='Posts']")).click();
	driver.findElement(By.xpath("//td[contains(text(),'Post Title Updated')]/..//a[text()='Delete']")).click();
	long endtime = (new Date()).getTime();
	long Duration = endtime-starttime;
	String status="N.A";
	if(driver.findElement(By.xpath("//div[text()='Successfully deleted Post.']")).isDisplayed())
	{
		status="Pass";
	}
	else
	{
		status="Failed";
	}
	Object[] testdetails=new Object[]{"TD3_dotnetApplication","Delete Post","User should be able to delete the post",status,(new Date()).getTime(),"1","Delete Post Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
	testresult.put("4", testdetails);
}
}

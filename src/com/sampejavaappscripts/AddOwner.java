package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class AddOwner extends BaseTest
{
@Test
public void testAddOwner() throws InterruptedException
{
	//driver.get("http://cape-vm-four.southeastasia.cloudapp.azure.com:8088/");
	driver.findElement(By.xpath("//span[text()='Find owners']")).click();
	driver.findElement(By.linkText("Add Owner")).click();
	driver.findElement(By.id("firstName")).sendKeys("firstname");
	driver.findElement(By.id("lastName")).sendKeys("lastname");
	driver.findElement(By.id("address")).sendKeys("address");
	driver.findElement(By.id("city")).sendKeys("city");
	driver.findElement(By.id("telephone")).sendKeys("12345");
	driver.findElement(By.xpath("//button[text()='Add Owner']")).click();
	
String status = "N.A";
	if(driver.findElement(By.xpath("//b[text()='firstname lastname']")).isDisplayed())
	{
		status = "Pass";
	}
		else
	{
			status = "Failed";
	}
	
	Object testDetails []	= new Object[]{"TD1_Pet Application","Add Owner","User should be able to add Owner",status,(new Date()).getTime(),"1","Add Owner Module","Production","1.3","Duration","Google Chrome","Windows 10","SriHarsha Gadepalli"};

	testresult.put("2",testDetails);
}
}

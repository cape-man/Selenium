package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class EditOwner extends BaseTest
{
@Test
public void testEditOwner() throws InterruptedException
{
		//driver.get("http://cape-vm-four.southeastasia.cloudapp.azure.com:8088/");
		driver.findElement(By.xpath("//span[text()='Find owners']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lastname");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		driver.findElement(By.linkText("firstname lastname")).click();
		driver.findElement(By.xpath("//a[@href='11/edit']")).click();
		driver.findElement(By.id("address")).clear();
		driver.findElement(By.id("address")).sendKeys("address updated");
		driver.findElement(By.xpath("//button[text()='Update Owner']")).click();
		String status = "N.A";
		if(driver.findElement(By.xpath("//td[text()='address updated']")).isDisplayed())
		{
			status = "Pass";
		}
			else
		{
				status = "Failed";
		}
		
		Object testDetails []	= new Object[]{"TD2_Pet Application","Edit Owner","User should be able to edit Owner",status,(new Date()).getTime(),"1","Edit Owner Module","Production","1.3","Duration","Google Chrome","Windows 10","SriHarsha Gadepalli"};
		testresult.put("3",testDetails);
	}
}


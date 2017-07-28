package com.sampejavaappscripts;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class EditOwner extends BaseTest
{
@Test
public void testEditOwner() throws InterruptedException
{
		long starttime = (new Date()).getTime();
		driver.findElement(By.xpath("//span[text()='Find owners']")).click();
		System.out.println("clicked on find owners");
		Reporter.log("clicked on find owners");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lastname");
		System.out.println("entered last name in search field");
		Reporter.log("entered last name in search field");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		System.out.println("clicked on find owner submit button");
		Reporter.log("clicked on find owner submit button");
		driver.findElement(By.linkText("firstname lastname")).click();
		System.out.println("clicked on name link");
		Reporter.log("clicked on name link");
		driver.findElement(By.xpath("//a[@href='11/edit']")).click();
		System.out.println("clicked on edit owner");
		Reporter.log("clicked on edit owner");
		driver.findElement(By.id("address")).clear();
		System.out.println("cleared the address field");
		Reporter.log("cleared the address field");
		driver.findElement(By.id("address")).sendKeys("address updated");
		System.out.println("entered updated address");
		Reporter.log("entered updated address");
		driver.findElement(By.xpath("//button[text()='Update Owner']")).click();
		System.out.println("clicked on update owner submit button");
		Reporter.log("clicked on update owner submit button");
		String status = "N.A";
		if(driver.findElement(By.xpath("//td[text()='address updated']")).isDisplayed())
		{
			status = "Pass";
			System.out.println("owner details are updated successfully");
			Reporter.log("owner details are updated successfully");
		}
			else
		{
			status = "Failed";
			System.out.println("owner details are not updated");
			Reporter.log("owner details are not updated");
		}
		long endtime = (new Date()).getTime();
		long Duration = endtime-starttime;
		Object testDetails []	= new Object[]{"TD2_JavaPetApplication","Edit Owner","User should be able to Edit owner",status,(new Date()).getTime(),"1","Edit Owner Module","Production","1.3",Duration,"Google Chrome","Windows 10","SriHarsha Gadepalli"};
		testresult.put("3",testDetails);
	}
}


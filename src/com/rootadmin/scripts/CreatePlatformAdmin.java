package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminPlatformAdmin;
import com.canvashomepage.scripts.BaseTest;

public class CreatePlatformAdmin extends BaseTest
{
@Test
public void testCreatePlatformAdmin()
{
	System.out.println("******************************CreatePlatformAdmin******************************");
	Reporter.log("******************************CreatePlatformAdmin******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminPlatformAdmin rootadminplatformadmin=new RootAdminPlatformAdmin(driver);
	rootadminplatformadmin.createPlatformAdmin();
	Boolean av=driver.findElement(By.xpath("//td[text()='autoroot']")).isDisplayed();
	Boolean ev=true;
	Assert.assertEquals(av, ev);
	System.out.println("******************************CreatePlatformAdmin******************************");
	Reporter.log("******************************CreatePlatformAdmin******************************");
}
}

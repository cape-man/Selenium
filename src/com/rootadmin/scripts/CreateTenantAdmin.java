package com.rootadmin.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;
import com.library.Generic;

public class CreateTenantAdmin extends BaseTest
{
@Test
public void testCreateTenantAdmin()
{
	System.out.println("******************************CreateTenantAdmin******************************");
	Reporter.log("******************************CreateTenantAdmin******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	//rootadminmanagetenant.createTenant();
	rootadminmanagetenant.createTenantAdmin();
	Assert.assertEquals(driver.findElement(By.xpath("//td[text()='autoadmin']")).isDisplayed(), true);
	System.out.println("******************************CreateTenantAdmin******************************");
	Reporter.log("******************************CreateTenantAdmin******************************");
}
}

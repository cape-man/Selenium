package com.roles.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.Common;
import com.POM.HomePage;
import com.POM.TenantAdminManageTenant;
import com.POM.TenantUserProject;
import com.canvashomepage.scripts.BaseTest;

public class DesignerCanViewActivity extends BaseTest
{
@Test
public void testDesignerCanViewActivity()
{
	System.out.println("******************************DesignerCanViewActivity******************************");
	Reporter.log("******************************DesignerCanViewActivity******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.convertUserToDesigner();
	Common common=new Common(driver);
	common.logOut();
	homepage.validLogIn();
	TenantUserProject tenantuserproject=new TenantUserProject(driver);
	tenantuserproject.clickProject();
	tenantuserproject.clickCanvas("Automation Canvas");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickViewActivity();
	Boolean av=driver.findElement(By.xpath("//div[text()='ACTIVITY']")).isDisplayed();
	System.out.println(driver.findElement(By.xpath("//div[text()='ACTIVITY']")).isDisplayed()+",Activity label name is displayed");
	Reporter.log(driver.findElement(By.xpath("//div[text()='ACTIVITY']")).isDisplayed()+",Activity label name is displayed");
	canvas.closeViewActivity();
	Boolean ev=true;
	common.logOut();
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToDesigner();
	Assert.assertEquals(av, ev);
	System.out.println("******************************DesignerCanViewActivity******************************");
	Reporter.log("******************************DesignerCanViewActivity******************************");
}
}

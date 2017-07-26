package com.rootadmin.scripts;

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
	System.out.println("******************************CreatePlatformAdmin******************************");
	Reporter.log("******************************CreatePlatformAdmin******************************");
}
}

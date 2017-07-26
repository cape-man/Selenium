package com.rootadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class ChangeTenantStatusToInactive extends BaseTest
{
@Test
public void testChangeTenantStatusToInactive()
{
	System.out.println("******************************ChangeTenantStatusToInactive******************************");
	Reporter.log("******************************ChangeTenantStatusToInactive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.makeTenantInactive();
	System.out.println("******************************ChangeTenantStatusToInactive******************************");
	Reporter.log("******************************ChangeTenantStatusToInactive******************************");
}
}

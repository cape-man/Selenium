package com.rootadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class ChangeTenantStatusToActive extends BaseTest
{
@Test
public void testChangeTenantStatusToActive()
{
	System.out.println("******************************ChangeTenantStatusToActive******************************");
	Reporter.log("******************************ChangeTenantStatusToActive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.makeTenantActive();
	System.out.println("******************************ChangeTenantStatusToActive******************************");
	Reporter.log("******************************ChangeTenantStatusToActive******************************");
}
}

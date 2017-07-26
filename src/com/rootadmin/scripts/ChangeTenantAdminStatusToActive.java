package com.rootadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class ChangeTenantAdminStatusToActive extends BaseTest
{
@Test
public void testChangeTenantAdminStatusToActive()
{
	System.out.println("******************************ChangeTenantAdminStatusToActive******************************");
	Reporter.log("******************************ChangeTenantAdminStatusToActive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
	rootadminmanagetenant.makeTenantAdminActive();
	System.out.println("******************************ChangeTenantAdminStatusToActive******************************");
	Reporter.log("******************************ChangeTenantAdminStatusToActive******************************");
}
}

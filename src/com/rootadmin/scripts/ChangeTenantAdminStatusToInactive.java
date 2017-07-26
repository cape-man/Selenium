package com.rootadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class ChangeTenantAdminStatusToInactive extends BaseTest
{
	@Test
	public void ChangeTenantAdminStatusToInactive()
	{
		System.out.println("******************************ChangeTenantAdminStatusToInactive******************************");
		Reporter.log("******************************ChangeTenantAdminStatusToInactive******************************");
		HomePage homepage=new HomePage(driver);
		homepage.rootadminLogin();
		RootAdminManageTenant rootadminmanagetenant=new RootAdminManageTenant(driver);
		rootadminmanagetenant.makeTenantAdminInactive();
		System.out.println("******************************ChangeTenantAdminStatusToInactive******************************");
		Reporter.log("******************************ChangeTenantAdminStatusToInactive******************************");
	}
}

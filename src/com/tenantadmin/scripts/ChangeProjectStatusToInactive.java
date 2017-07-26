package com.tenantadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageProject;
import com.canvashomepage.scripts.BaseTest;

public class ChangeProjectStatusToInactive extends BaseTest
{
@Test
public void testChangeProjectStatusToInactive()
{
	System.out.println("******************************ChangeProjectStatusToInactive******************************");
	Reporter.log("******************************ChangeProjectStatusToInactive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.makeProjectInactive();
	System.out.println("******************************ChangeProjectStatusToInactive******************************");
	Reporter.log("******************************ChangeProjectStatusToInactive******************************");
}
}

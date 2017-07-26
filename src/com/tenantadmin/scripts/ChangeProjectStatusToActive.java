package com.tenantadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageProject;
import com.canvashomepage.scripts.BaseTest;

public class ChangeProjectStatusToActive extends BaseTest 
{
@Test
public void testChangeProjectStatusToActive()
{
	System.out.println("******************************ChangeProjectStatusToActive******************************");
	Reporter.log("******************************ChangeProjectStatusToActive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.makeProjectActive();
	System.out.println("******************************ChangeProjectStatusToActive******************************");
	Reporter.log("******************************ChangeProjectStatusToActive******************************");
}
}

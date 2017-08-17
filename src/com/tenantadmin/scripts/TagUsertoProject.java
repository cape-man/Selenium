package com.tenantadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.TenantAdminManageProject;
import com.POM.TenantAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class TagUsertoProject extends BaseTest
{
@Test
public void testTagUsertoProject()
{
	System.out.println("******************************TagUsertoProject******************************");
	Reporter.log("******************************TagUsertoProject******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageProject tenantadminmanageproject=new TenantAdminManageProject(driver);
	tenantadminmanageproject.tagUsertoProject();
	System.out.println("Successfully tagged user to project");
	Reporter.log("Successfully tagged user to project");
	System.out.println("******************************TagUsertoProject******************************");
	Reporter.log("******************************TagUsertoProject******************************");
}
}

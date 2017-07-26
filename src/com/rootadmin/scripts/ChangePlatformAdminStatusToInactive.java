package com.rootadmin.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.POM.RootAdminPlatformAdmin;
import com.canvashomepage.scripts.BaseTest;

public class ChangePlatformAdminStatusToInactive extends BaseTest
{
@Test
public void testChangePlatformAdminStatusToInactive()
{
	System.out.println("******************************ChangePlatformAdminStatusToInactive******************************");
	Reporter.log("******************************ChangePlatformAdminStatusToInactive******************************");
	HomePage homepage=new HomePage(driver);
	homepage.rootadminLogin();
	RootAdminPlatformAdmin rootadminplatformadmin=new RootAdminPlatformAdmin(driver);
	rootadminplatformadmin.makePlatformAdminInactive();
	System.out.println("******************************ChangePlatformAdminStatusToInactive******************************");
	Reporter.log("******************************ChangePlatformAdminStatusToInactive******************************");
}
}

package com.compose.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.Compose;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DragApplicationServerComponent extends BaseTest
{
@Test
public void testDragApplicationServerComponent() throws AWTException, InterruptedException
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Compose compose=new Compose(driver);
	compose.clickInfrastructureComponents();
	compose.dragApplicationServerComponent();
}
}

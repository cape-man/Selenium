package com.compose.scripts;

import org.testng.annotations.Test;

import com.POM.TenantUserProject;
import com.POM.Compose;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DragWebserverComponent extends BaseTest
{
@Test
public void testDragWebserverComponent()
{
	HomePage homepage=new HomePage(driver);
	TenantUserProject canvashomepage=new TenantUserProject(driver);
	Compose canvaslogicalview=new Compose(driver);
	homepage.validLogIn();
	driver.get("http://13.76.97.211/cape-webapp/index.html#/main/project-info/canvas-list/PRJ-009172");
	canvashomepage.clickCanvas("Automation Canvas");
	canvaslogicalview.clickInfrastructureComponents();
	canvaslogicalview.dragWebserverComponent();
}
}

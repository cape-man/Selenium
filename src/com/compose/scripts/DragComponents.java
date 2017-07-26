package com.compose.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.Compose;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DragComponents extends BaseTest
{
@Test
public void testDragComponents() throws AWTException, InterruptedException
{
	System.out.println("******************************DragComponents******************************");
	Reporter.log("******************************DragComponents******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Compose compose=new Compose(driver);
	compose.clickBuildAutomation();
	compose.dragCICDComponent();
	compose.dragBuildtoolComponent();
	compose.dragVersionControlComponent();
	compose.dragCodeQualityComponent();
	compose.clickInfrastructureComponents();
	compose.dragApplicationServerComponent();
	System.out.println("******************************DragComponents******************************");
	Reporter.log("******************************DragComponents******************************");
}
}

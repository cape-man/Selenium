package com.boilerplate.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class SavAsGlobalBoilerPlate extends BaseTest
{
@Test
public void testSaveAsGlobalBoilerPlate()
{
	System.out.println("******************************SavAsGlobalBoilerPlate******************************");
	Reporter.log("******************************SavAsGlobalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	Canvas canvas=new Canvas(driver);
	canvashomepage.clickProjectLink();
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	canvas.clickDropdownButton();
	canvas.clickSaveasBoilerplate();
	canvas.saveAsGlobalBoilerplate();
	System.out.println("******************************SavAsGlobalBoilerPlate******************************");
	Reporter.log("******************************SavAsGlobalBoilerPlate******************************");
}
}

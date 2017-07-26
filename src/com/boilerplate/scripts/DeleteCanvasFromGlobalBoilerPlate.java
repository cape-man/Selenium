package com.boilerplate.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.Canvas;
import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DeleteCanvasFromGlobalBoilerPlate extends BaseTest
{
@Test
public void testDeleteCanvasFromGlobalBoilerPlate()
{
	System.out.println("******************************DeleteCanvasFromGlobalBoilerPlate******************************");
	Reporter.log("******************************DeleteCanvasFromGlobalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	Canvas canvas=new Canvas(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Use as Canvas");
	canvas.clickDropdownButton();
	canvas.DeleteCanvas();
	System.out.println("******************************DeleteCanvasFromGlobalBoilerPlate******************************");
	Reporter.log("******************************DeleteCanvasFromGlobalBoilerPlate******************************");
}
}

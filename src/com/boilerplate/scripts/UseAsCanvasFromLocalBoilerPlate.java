package com.boilerplate.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.Canvas;
import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class UseAsCanvasFromLocalBoilerPlate extends BaseTest
{
@Test
public void testUseAsCanvasFromLocalBoilerPlate()
{
	System.out.println("******************************UseAsCanvasFromLocalBoilerPlate******************************");
	Reporter.log("******************************UseAsCanvasFromLocalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickLocalBoilerplateLink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.UseAsCanvas();
	System.out.println("******************************UseAsCanvasFromLocalBoilerPlate******************************");
	Reporter.log("******************************UseAsCanvasFromLocalBoilerPlate******************************");
}
}

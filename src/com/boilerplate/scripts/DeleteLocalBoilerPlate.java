package com.boilerplate.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.Canvas;
import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DeleteLocalBoilerPlate extends BaseTest
{
@Test
public void testDeleteLocalBoilerPlate()
{
	System.out.println("******************************DeleteLocalBoilerPlate******************************");
	Reporter.log("******************************DeleteLocalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickLocalBoilerplateLink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.clickDeleteBoilerplate();
	System.out.println("******************************DeleteLocalBoilerPlate******************************");
	Reporter.log("******************************DeleteLocalBoilerPlate******************************");
}
}

package com.boilerplate.scripts;

import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.Canvas;
import com.POM.CanvasHomePage;
import com.POM.Common;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;
import com.rootadmin.scripts.RootAdminLogin;

public class SaveasBoilerplateAndUseasCanvas extends BaseTest
{
@Test
public void testSaveasBoilerPlateAndUseasCanvas()
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Canvas canvas=new Canvas(driver);
	canvas.clickDropdownButton();
	canvas.clickSaveasBoilerplate();
	canvas.saveAsLocalBoilerplate();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickLocalBoilerplateLink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.UseAsCanvas();
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Use as Canvas");
	canvas.clickDropdownButton();
	canvas.deleteCanvas();
	boilerplate.clickLocalBoilerplateLink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.clickDeleteBoilerplate();
	
	canvashomepage.clickProjectLink();
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	canvas.clickDropdownButton();
	canvas.clickSaveasBoilerplate();
	canvas.saveAsGlobalBoilerplate();
	boilerplate.clickGlobalBoilerplatelink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.UseAsCanvas();
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Use as Canvas");
	canvas.clickDropdownButton();
	canvas.deleteCanvas();
	Common common=new Common(driver);
	common.logOut();
	HomePage home=new HomePage(driver);
	home.rootadminLogin();
	boilerplate.clickGlobalBoilerplatelink();
	boilerplate.openBoilerplate();
	boilerplate.clickDropdownButton();
	boilerplate.clickDeleteBoilerplate();
	
}
}

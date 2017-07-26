package com.provision.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.POM.Provision;
import com.canvashomepage.scripts.BaseTest;

public class ClickProvisiontab extends BaseTest
{
@Test
public void testClickProvisiontab() throws AWTException
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Provision provision=new Provision(driver);
	provision.clickProvisiontab();
}
}

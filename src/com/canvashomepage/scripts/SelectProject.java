package com.canvashomepage.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.HomePage;

public class SelectProject extends BaseTest
{
	@Test
public void testClickProject() throws AWTException
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	canvashomepage.clickProject();
}
}

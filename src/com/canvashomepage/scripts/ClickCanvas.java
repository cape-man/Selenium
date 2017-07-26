package com.canvashomepage.scripts;

import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.HomePage;

public class ClickCanvas extends BaseTest
{
@Test
public void testClickCanvas()
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	canvashomepage.clickCanvas("Automation Canvas");
}
}

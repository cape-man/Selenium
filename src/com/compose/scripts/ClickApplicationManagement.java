package com.compose.scripts;

import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.Compose;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class ClickApplicationManagement extends BaseTest
{
@Test
public void testClickApplicationManagement()
{
	HomePage homepage=new HomePage(driver);
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	Compose canvaslogicalview=new Compose(driver);
	homepage.validLogIn();
	canvashomepage.clickCanvas("Automation Canvas");
	canvaslogicalview.clickApplicationManagement();
}
}

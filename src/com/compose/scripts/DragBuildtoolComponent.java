package com.compose.scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.Compose;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class DragBuildtoolComponent extends BaseTest
{
@Test
public void testDragBuildtoolComponent() throws AWTException, InterruptedException
{
	HomePage homepage=new HomePage(driver);
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	Compose canvaslogicalview=new Compose(driver);
	homepage.validLogIn();
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	canvaslogicalview.clickBuildAutomation();
	canvaslogicalview.dragBuildtoolComponent();
	
}
}

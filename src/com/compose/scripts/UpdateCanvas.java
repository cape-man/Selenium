package com.compose.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class UpdateCanvas extends BaseTest
{
@Test
public void testUpdateCanvas()
{
	System.out.println("******************************UpdateCanvas******************************");
	Reporter.log("******************************UpdateCanvas******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	canvashomepage.clickProject();
	canvashomepage.editCanvas();
	Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Automation Canvas Updated']")).isDisplayed(), true);
	System.out.println("******************************UpdateCanvas******************************");
	Reporter.log("******************************UpdateCanvas******************************");
}
}

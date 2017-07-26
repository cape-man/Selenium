package com.compose.scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.canvashomepage.scripts.BaseTest;

public class CreateCanvas extends BaseTest
{
@Test
public void testCreateCanvas()
{
	System.out.println("******************************CreateCanvas******************************");
	Reporter.log("******************************CreateCanvas******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	canvashomepage.clickProject();
	canvashomepage.createCanvas();
	Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Automation Canvas']")).isDisplayed(), true);
	System.out.println("******************************CreateCanvas******************************");
	Reporter.log("******************************CreateCanvas******************************");
}
}

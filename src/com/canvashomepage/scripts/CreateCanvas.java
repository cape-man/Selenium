package com.canvashomepage.scripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.library.Generic;

public class CreateCanvas extends BaseTest
{
@Test
public void testCreateCanvas() throws AWTException
{
	HomePage homepage=new HomePage(driver);
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	homepage.validLogIn();
	canvashomepage.clickProject();
	//WebDriverWait wait2=new WebDriverWait(driver, 120);
	//wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='create-canvas-button btn btn-primary btn-md']"))));
	canvashomepage.createCanvas();
	//Assert.assertTrue(driver.findElement(By.xpath("//p[text()='"+Generic.readExcelData("CanvasName", 0, 0)+"']")).isDisplayed());
}
}
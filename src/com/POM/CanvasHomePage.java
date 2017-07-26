package com.POM;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.library.Generic;

public class CanvasHomePage 
{
//@FindBy(xpath="//button[@class='create-canvas-button btn btn-primary btn-md']")
@FindBy(xpath="//button[@ng-click='canvaslistCtrl.createCanvas()']")
private WebElement createcanvasbutton;

@FindBy(xpath="//input[@placeholder='Enter Canvas Name']")
private WebElement canvasnametextbox;

@FindBy(xpath="//textarea[@placeholder='Enter Canvas Description']")
private WebElement canvasdescriptiontextbox;

@FindBy(xpath="//textarea[@placeholder='Enter Canvas Description*']")
private WebElement updatecanvasdescriptiontextbox;

@FindBy(xpath="//button[@class='btn btn-sm btn-primary pull-right m-t-n-xs add-canvas-btn cstm-action-button ladda-button']")
private WebElement createcanvassubmitbutton;

@FindBy(xpath="//button[@class='btn btn-sm btn-primary pull-right m-t-n-xs edit-canvas-btn cstm-action-button ladda-button']")
private WebElement updatecanvassubmitbutton;

//@FindBy(xpath="//img[@src='assets/images/left-menu/canvas.svg']")
@FindBy(xpath="//ul[@id='side-menu']/li[2]")
private WebElement projectlink;

@FindBy(xpath="//p[text()='Automation Canvas']/..//img[@role='button']")
private WebElement automationcanvaseditbutton;

@FindBy(xpath="//p[text()='Automation Canvas Updated']/..//img[@role='button']")
private WebElement automationcanvasupdatededitbutton;

private WebDriver driver;

public CanvasHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public void createCanvas()
{
	try 
	{
	createcanvasbutton.click();
	System.out.println("clicked on create canvas button");
	Reporter.log("clicked on create canvas button");
	canvasnametextbox.sendKeys(Generic.readExcelData("CanvasName", 0, 0));
	System.out.println("entered canvas name");
	Reporter.log("entered canvas name");
	canvasdescriptiontextbox.sendKeys(Generic.readExcelData("CanvasName", 0, 0));
	System.out.println("entered canvas description");
	Reporter.log("entered canvas description");
	createcanvassubmitbutton.click();
	System.out.println("clicked on create canvas submit button");
	Reporter.log("clicked on create canvas submit button");
	System.out.println("Step3:Successfully created canvas with name Automation Canvas");
	Reporter.log("Step3:Successfully created canvas with name Automation Canvas");
	Thread.sleep(4000);
	} 
	catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void editCanvas()
{
	try {
	automationcanvaseditbutton.click();
	System.out.println("clicked on edit button of canvas");
	Reporter.log("clicked on edit button of canvas");
	canvasnametextbox.clear();
	canvasnametextbox.sendKeys("Automation Canvas Updated");
	System.out.println("entered canvas name");
	Reporter.log("entered canvas name");
	updatecanvasdescriptiontextbox.clear();
	updatecanvasdescriptiontextbox.sendKeys("Automation Canvas Updated");
	System.out.println("entered canvas description");
	Reporter.log("entered canvas description");
	updatecanvassubmitbutton.click();
	System.out.println("updated canvas details");
	Reporter.log("updated canvas details");
	Thread.sleep(4000);
	automationcanvasupdatededitbutton.click();
	System.out.println("clicked on edit button");
	Reporter.log("clicked on edit button");
	canvasnametextbox.clear();
	canvasnametextbox.sendKeys("Automation Canvas");
	updatecanvassubmitbutton.click();
	System.out.println("reverted back the canvas name to Automation Canvas");
	Reporter.log("reverted back the canvas name to Automation Canvas");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickProject()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(projectlink).moveToElement(driver.findElement(By.xpath("//a[text()='"+Generic.readExcelData("ProjectName", 0, 0)+"']"))).click().build().perform();
	System.out.println("clicked on project: Automation Project");
	Reporter.log("clicked on project: Automation Project");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickCanvas(String canvasname)
{
	//driver.findElement(By.xpath("//p[text()='"+Generic.readExcelData("CanvasName", 0, 0)+"']")).click();
	driver.findElement(By.xpath("//p[text()='"+canvasname+"']")).click();
	//Reporter.log("Step3:Clicked on canvas "+"\""+Generic.readExcelData("CanvasName", 0, 0)+"\"");
	//System.out.println("Step3:Clicked on canvas "+"\""+Generic.readExcelData("CanvasName", 0, 0)+"\"");
	Reporter.log("Step3:Clicked on canvas "+canvasname);
	System.out.println("Step3:Clicked on canvas "+canvasname);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickProjectLink()
{
	projectlink.click();
	System.out.println("clicked on project tab");
}
}

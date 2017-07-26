package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.library.Generic;

public class Canvas 
{
@FindBy(xpath="//button[@type='button']")
private WebElement dropdownbutton;

@FindBy(xpath="//button[@title='Save as Boilerplate']")
private WebElement saveasboilerplate;

@FindBy(id="boilerplateName")
private WebElement boilerplatename;

@FindBy(xpath="//textarea[@placeholder='Enter description']")
private WebElement boilerplatedescription;

@FindBy(xpath="(//input[@name='boilerplate-type'])[1]")
private WebElement localboilerplatetype;

@FindBy(xpath="//button[@type='submit']")
private WebElement saveboilerplatesubmitbutton;

@FindBy(xpath="(//input[@name='boilerplate-type'])[2]")
private WebElement globalboilerplatetype;

@FindBy(xpath="//button[@title='Delete Canvas']")
private WebElement deletebutton;

@FindBy(xpath="//button[text()='Yes']")
private WebElement deleteconfirmbutton;

public Canvas(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickDropdownButton()
{
	try 
	{
	dropdownbutton.click();
	System.out.println("clicked on dropdown button");
	Reporter.log("clicked on dropdown button");
	Thread.sleep(2000);
	} 
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void clickSaveasBoilerplate()
{
	saveasboilerplate.click();
	System.out.println("clicked on Save as Boiler Plate link");
	Reporter.log("clicked on Save as Boiler Plate link");
}

public void saveAsLocalBoilerplate()
{
	try
	{
	boilerplatename.sendKeys(Generic.readExcelData("BoilerPlateName",0,0));
	System.out.println("entered boiler plate name");
	Reporter.log("entered boiler plate name");
	boilerplatedescription.sendKeys(Generic.readExcelData("BoilerPlateName",0,0));
	System.out.println("entered boiler plate description");
	Reporter.log("entered boiler plate description");
	localboilerplatetype.click();
	System.out.println("selected local radio button");
	Reporter.log("selected local radio button");
	Thread.sleep(2000);
	saveboilerplatesubmitbutton.click();
	System.out.println("clicked on save button");
	Reporter.log("clicked on save button");
	System.out.println("Step4:Saved the canvas as Local Boiler Plate: "+Generic.readExcelData("BoilerPlateName",0,0));
	Reporter.log("Step4:Saved the canvas as Local Boiler Plate: "+Generic.readExcelData("BoilerPlateName",0,0));
	Thread.sleep(8000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public void saveAsGlobalBoilerplate()
{
	try
	{
	boilerplatename.sendKeys(Generic.readExcelData("BoilerPlateName",0,0));
	System.out.println("entered boiler plate name");
	Reporter.log("entered boiler plate name");
	boilerplatedescription.sendKeys(Generic.readExcelData("BoilerPlateName",0,0));
	System.out.println("entered boiler plate description");
	Reporter.log("entered boiler plate description");
	globalboilerplatetype.click();
	System.out.println("selected global radiobutton");
	Reporter.log("selected global radiobutton");
	Thread.sleep(2000);
	saveboilerplatesubmitbutton.click();
	System.out.println("clicked on submit button");
	Reporter.log("clicked on submit button");
	System.out.println("Step9:Saved the canvas as Global Boiler Plate: "+Generic.readExcelData("BoilerPlateName",2,0));
	Reporter.log("Step9:Saved the canvas as Global Boiler Plate: "+Generic.readExcelData("BoilerPlateName",2,0));
	Thread.sleep(8000);
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void DeleteCanvas()
{
try
{
	deletebutton.click();
	System.out.println("clicked on delete canvas link");
	Reporter.log("clicked on delete canvas link");
	Thread.sleep(2000);
	deleteconfirmbutton.click();
	System.out.println("clicked yes on delete canvas confirm pop up");
	Reporter.log("clicked yes on delete canvas confirm pop up");
	Thread.sleep(6000);
	System.out.println("Step5: Canvas deleted successfully");
	Reporter.log("Step5: Canvas deleted successfully");
}
catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}

package com.POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RootAdminPlatformAdmin 
{
	@FindBy(xpath="//ul[@id='side-menu']/li[5]")
	private WebElement platformlink;
	
	@FindBy(xpath="//a[text()='Admin']")
	private WebElement adminlink;
	
	@FindBy(xpath="//button[@class='create-user-button btn btn-md']")
	private WebElement createadminbutton;
	
	@FindBy(xpath="//input[@name='adminsName']")
	private WebElement namefield;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement useridfield;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailfield;
	
	@FindBy(xpath="//input[@ng-model='updateAdminsCtrl.password']")
	private WebElement passwordfield;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	private WebElement confirmpasswordfield;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement createadminsubmitbutton;
	
	@FindBy(xpath="//td[text()='autoroot']/..//button[@class='cstm-btn']")
	private WebElement autorooteditbutton;
	
	@FindBy(xpath="//span[@class='bootstrap-switch-label']")
	private WebElement statusbutton;
	
	private WebDriver driver;
	
	
	
public RootAdminPlatformAdmin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}


public void createPlatformAdmin()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(platformlink).moveToElement(adminlink).click().build().perform();
	System.out.println("navigated to root admin platform admin page");
	Reporter.log("navigated to root admin platform admin page");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,250)", "");
	Thread.sleep(2000);
	/*createadminbutton.click();
	System.out.println("clicked on Create Admin button");
	Reporter.log("clicked on Create Admin button");
	namefield.sendKeys("Automation Root");
	System.out.println("entered platform admin name");
	Reporter.log("entered platform admin name");
	useridfield.sendKeys("autoroot");
	System.out.println("entered platform admin userid");
	Reporter.log("entered platform admin userid");
	emailfield.sendKeys("autoroot@mindtree.com");
	System.out.println("entered platform admin email id");
	Reporter.log("entered platform admin email id");
	passwordfield.sendKeys("Autoroot12");
	System.out.println("entered platform admin password");
	Reporter.log("entered platform admin password");
	confirmpasswordfield.sendKeys("Autoroot12");
	System.out.println("entered platform admin confirm password");
	Reporter.log("entered platform admin confirm password");
	createadminsubmitbutton.click();
	System.out.println("clicked on create platform admin submit button");
	Reporter.log("clicked on create platform admin submit button");
	Thread.sleep(2000);*/
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void editPlatformAdmin()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(platformlink).moveToElement(adminlink).click().build().perform();
	System.out.println("navigated to root admin platform admin page");
	Reporter.log("navigated to root admin platform admin page");
	autorooteditbutton.click();
	System.out.println("clicked on edit button of platform admin");
	Reporter.log("clicked on edit button of platform admin");
	namefield.clear();
	namefield.sendKeys("Automation Root Updated");
	System.out.println("entered updated name of platform admin");
	Reporter.log("entered updated name of platform admin");
	emailfield.clear();
	emailfield.sendKeys("autorootupdated@mindtree.com");
	System.out.println("entered updated email id for platform admin");
	Reporter.log("entered updated email id for platform admin");
	createadminsubmitbutton.click();
	System.out.println("clicked on update button");
	Reporter.log("clicked on update button");
	Thread.sleep(4000);
	autorooteditbutton.click();
	namefield.clear();
	namefield.sendKeys("Automation Root");
	createadminsubmitbutton.click();
	System.out.println("reverted platform admin name back to Automation Root");
	Reporter.log("reverted platform admin name back to Automation Root");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void makePlatformAdminInactive()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(platformlink).moveToElement(adminlink).click().build().perform();
	System.out.println("navidated to root admin platform admin page");
	Reporter.log("navidated to root admin platform admin page");
	autorooteditbutton.click();
	System.out.println("clicked on edit button of platform admin");
	Reporter.log("clicked on edit button of platform admin");
	Thread.sleep(2000);
	statusbutton.click();
	System.out.println("changed the status of platform admin from Active to Inactive");
	Reporter.log("changed the status of platform admin from Active to Inactive");
	Thread.sleep(2000);
	createadminsubmitbutton.click();
	System.out.println("clicked on Update button");
	Reporter.log("clicked on Update button");
	Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void makePlatformAdminActive()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(platformlink).moveToElement(adminlink).click().build().perform();
	System.out.println("navidated to root admin platform admin page");
	Reporter.log("navidated to root admin platform admin page");
	autorooteditbutton.click();
	System.out.println("clicked on edit button of platform admin");
	Reporter.log("clicked on edit button of platform admin");
	Thread.sleep(2000);
	statusbutton.click();
	System.out.println("changed the status of platform admin from Inactive to Active");
	Reporter.log("changed the status of platform admin from Inactive to Active");
	Thread.sleep(2000);
	createadminsubmitbutton.click();
	System.out.println("clicked on Update button");
	Reporter.log("clicked on Update button");
	Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void changePasswordForPlatformAdmin()
{
	try {
	Actions actions=new Actions(driver);
	actions.moveToElement(platformlink).moveToElement(adminlink).click().build().perform();
	System.out.println("navidated to root admin platform admin page");
	Reporter.log("navidated to root admin platform admin page");
	autorooteditbutton.click();
	System.out.println("clicked on edit button of platform admin");
	Reporter.log("clicked on edit button of platform admin");
	Thread.sleep(2000);
	passwordfield.sendKeys("Autoroot123");
	System.out.println("entered new password for platform admin");
	Reporter.log("entered new password for platform admin");
	createadminsubmitbutton.click();
	System.out.println("clicked on Update button");
	Reporter.log("clicked on Update button");
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

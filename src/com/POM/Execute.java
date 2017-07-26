package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Execute 
{
	@FindBy(linkText="EXECUTE")
	private WebElement executelink;
	
	@FindBy(xpath="//div[@id='excutionViewdrawer']/*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g'][5]/*[name()='g'][1]/*[name()='g'][4]/*[name()='g'][2]/*[name()='image']")
	private WebElement jenkinshamburger;
	
	public Execute(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickExecuteTab()
	{
		try 
		{
		executelink.click();
		System.out.println("clicked on execute tab");
		Reporter.log("clicked on execute tab");
		Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickJenkinsHamburger()
	{
		jenkinshamburger.click();
		System.out.println("clicked on jenkins hamburger");
		Reporter.log("clicked on jenkins hamburger");
	}
}

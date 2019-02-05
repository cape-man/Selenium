package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Analyze 
{
	@FindBy(linkText="ANALYZE")
	private WebElement analyzelink;
	
	
	public Analyze(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//Constructor Initialization
	}
	
	
	public void clickAnalyzeTab()
	{
		analyzelink.click();
		System.out.println("clicked on analyze tab");
		Reporter.log("clicked on analyze tab");
	}
	
	public Boolean isAnalyzeTabEnabled()
	{
		boolean a = analyzelink.isEnabled();
		return a;
	}
}

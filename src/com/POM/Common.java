package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common 

{
@FindBy(xpath="//img[@class='img-circle profile-pic cstm-pos-profile-pic']")
//@FindBy(xpath="//span[@title='Automation User']")
private WebElement profileimage;

@FindBy(xpath="//a[@ng-click='mainCtrl.logOut()']")
private WebElement logoutlink;

public Common(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public void logOut()
{
	try {
	profileimage.click();
	System.out.println("clicked on profile image");
	Thread.sleep(2000);
	logoutlink.click();
	System.out.println("clicked on logout link");
} 
	catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}

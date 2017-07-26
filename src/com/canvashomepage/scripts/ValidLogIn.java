package com.canvashomepage.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.HomePage;

public class ValidLogIn extends BaseTest
{
@Test
public void testvalidlogIn()
{
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Assert.assertTrue(driver.getCurrentUrl().contains("main"));
}
}

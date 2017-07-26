package com.rootadmin.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.canvashomepage.scripts.BaseTest;

public class ScrollDown extends BaseTest
{
@Test
public void testScrollDown()
{
	driver.get("https://www.linkedin.com/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,250)", "");
}
}

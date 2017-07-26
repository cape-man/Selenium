package com.provision.scripts;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.CanvasHomePage;
import com.POM.HomePage;
import com.POM.Provision;
import com.canvashomepage.scripts.BaseTest;

public class DragVMConnectwithUbuntu extends BaseTest
{
@Test
public void testDragVMConnectUbuntuServer() throws AWTException
{
	System.out.println("******************************DragVMConnectwithUbuntu******************************");
	Reporter.log("******************************DragVMConnectwithUbuntu******************************");
	HomePage homepage=new HomePage(driver);
	homepage.validLogIn();
	CanvasHomePage canvashomepage=new CanvasHomePage(driver);
	canvashomepage.clickProject();
	canvashomepage.clickCanvas("Automation Canvas");
	Provision provision=new Provision(driver);
	provision.clickProvisiontab();
	provision.clickVirtualMachineslink();
	provision.dragVMConnectUbuntuServer();
	System.out.println("******************************DragVMConnectwithUbuntu******************************");
	Reporter.log("******************************DragVMConnectwithUbuntu******************************");
}
}

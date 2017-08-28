package com.dotnetscripts;

import java.util.ArrayList;
import java.util.Base64;

import org.testng.TestNG;

import com.Jira.CreateIssue;
import com.Jira.TestApi;

public class CallTestNG {
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		ArrayList<String> suite = new ArrayList<String>();
		suite.add("testng.xml");
		testng.setTestSuites(suite);
		testng.run();
		CreateIssue createIssue = new CreateIssue();
		String url = args[0];  
		String header = args[1];
		String testCaseUrl = args[2];
		String jiraUrl = args[3];
		String jiraUsername = args[4];
		String jiraPassword = args[5];
		String jiraIssueType = args[6];
		String jiraEncodedProjectName = args[7];
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(jiraEncodedProjectName);
		String jiraProjectName = new String(decodedByteArray);
		TestApi testapi = new TestApi();
		createIssue.setJiraIssueType(jiraIssueType);
		createIssue.setJiraPassword(jiraPassword);
		createIssue.setJiraProjectName(jiraProjectName);
		createIssue.setJiraUrl(jiraUrl);
		createIssue.setJiraUsername(jiraUsername);
		createIssue.setTestCaseUrl(testCaseUrl);
		createIssue.setClazz("com.mindtree.cape.engine.test_automation.service.SeleniumHybridFrameworkServiceImpl");
		try {
			testapi.createJiraIssues(url, header, createIssue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.dotnetscripts;

import com.Jira.TestApi;

import java.util.ArrayList;

import org.testng.TestNG;

import com.Jira.CreateIssue;

public class CallTestNG {
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		ArrayList<String> suite = new ArrayList<String>();
		suite.add("D:\\CAPE\\DotNet-Project\\testng.xml");
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
		String jiraProjectName = args[7];
		TestApi testapi = new TestApi();
		createIssue.setJiraIssueType(jiraIssueType);
		createIssue.setJiraPassword(jiraPassword);
		createIssue.setJiraProjectName(jiraProjectName);
		createIssue.setJiraUrl(jiraUrl);
		createIssue.setJiraUsername(jiraUsername);
		createIssue.setTestCaseUrl(testCaseUrl);
		try {
			testapi.createJiraIssues(url, header, createIssue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

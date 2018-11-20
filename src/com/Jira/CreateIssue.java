package com.Jira;

public class CreateIssue {

	public String getTestReportUrl() {
		return testReportUrl;
	}





	public void setTestReportUrl(String testReportUrl) {
		this.testReportUrl = testReportUrl;
	}





	public String getIssueTrackerUrl() {
		return issueTrackerUrl;
	}





	public void setIssueTrackerUrl(String issueTrackerUrl) {
		this.issueTrackerUrl = issueTrackerUrl;
	}





	public String getIssueTrackerUsername() {
		return issueTrackerUsername;
	}





	public void setIssueTrackerUsername(String issueTrackerUsername) {
		this.issueTrackerUsername = issueTrackerUsername;
	}





	public String getIssueTrackerPassword() {
		return issueTrackerPassword;
	}





	public void setIssueTrackerPassword(String issueTrackerPassword) {
		this.issueTrackerPassword = issueTrackerPassword;
	}





	public String getIssueType() {
		return issueType;
	}





	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}





	public String getProjectName() {
		return projectName;
	}





	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}





	public String getTestFramework() {
		return testFramework;
	}





	public void setTestFramework(String testFramework) {
		this.testFramework = testFramework;
	}





	public String getJiraIssueSummary() {
		return jiraIssueSummary;
	}





	public void setJiraIssueSummary(String jiraIssueSummary) {
		this.jiraIssueSummary = jiraIssueSummary;
	}





	public String getJiraIssueDescription() {
		return jiraIssueDescription;
	}





	public void setJiraIssueDescription(String jiraIssueDescription) {
		this.jiraIssueDescription = jiraIssueDescription;
	}





	public String getClazz() {
		return clazz;
	}


	String testReportUrl;
	String issueTrackerUrl;
	String issueTrackerUsername;
	String issueTrackerPassword;
	String issueType;
	String projectName;
	String jiraIssueSummary;
	String jiraIssueDescription;
	String testFramework;
	String customFields = "";
	String assignee = "";
	String issueTracker = "Jira";
	String inProgressStatusList = "To Do, In Progress";
	String clazz = "com.mindtree.cape.engine.gateway.service.testautomation.TestAutomationServiceImpl";
	String action = "createIssues";
}


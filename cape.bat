java -jar dotnetproject.jar
curl -k -X POST   https://capedev.mindtree.com/api/engine/service/execute    -H "authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjYXBlZGV2Lm1pbmR0cmVlLmNvbSIsInNjcCI6WyI5MDAwIiwiOTAxMCIsIjkwMjAiXSwidXBuIjoiQVBQMzFlZGU0ZjQ0YzVhNDhhMzljNmVlMGIwMGU0MzI2NTQiLCJ1bmlxdWVfbmFtZSI6IkFQUDMxZWRlNGY0NGM1YTQ4YTM5YzZlZTBiMDBlNDMyNjU0IiwidmFsaWRfdXB0byI6MTU5MzE2Nzc2OCwibmJmIjoxNTMyNDI4NTcyLCJhcGlLZXkiOnRydWUsImlzcyI6ImNhcGVkZXYubWluZHRyZWUuY29tIiwibmFtZSI6ImNhcGUtc2VydmljZSIsImV4cCI6MTU5MzE2Nzc2OCwiaWF0IjoxNTMyNDI4NTcyLCJzdGF0dXMiOiJBY3RpdmUifQ.I65noL-Yzqqsg2hAQrRQkEF30oRr6Cyj7EfRGZw2fEE"   -H "cache-control: no-cache"   -H "content-type: application/json"   -d "{ \"testReportUrl\":\"http://cape-win.southeastasia.cloudapp.azure.com:8000/TestReports/TestResult.xls\",\"issueTrackerUrl\":\"https://cape-project.atlassian.net/\",\"issueTrackerUsername\":\"boban.abraham@mindtree.com\", \"issueTrackerPassword\":\"jira2018@CAPE\", \"issueType\":\"Bug\",\"projectName\":\"PetClinic\", \"customFields\":\"\", \"assignee\":\"\", \"issueTracker\":\"Jira\",   \"inProgressStatusList\":\"To Do, In Progress\",\"clazz\":\"com.mindtree.cape.engine.gateway.service.testautomation.TestAutomationServiceImpl\", \"action\":\"createIssues\",\"testFramework\":\"Selenium\"}"

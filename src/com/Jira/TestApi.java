package com.Jira;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestApi {
	public void createJiraIssues(String url, String header,
			CreateIssue createIssue) throws Exception {

		Client client = null;
		
		client = RestUtil.createClient();
		WebResource webResource = client.resource(url);
		
		//Object to JSON in String
		ClientResponse response = webResource.header("authorization","Bearer "+header)
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class,createIssue);
		response.bufferEntity();
		if(response.getStatus()==200 || response.getStatus()==201)
		{
			System.out.println("Issue created succcesfully in Jira");
		}
		else
			System.out.println("Failed : Unable to create issue");
	}

}

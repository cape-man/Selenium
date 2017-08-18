package com.Jira;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestApi {
	public String createJiraIssues(String url, String header,
			CreateIssue createIssue) throws Exception {

		Client client = null;
		String responseData;

		client = RestUtil.createClient();
		WebResource webResource = client.resource(url);
		ObjectMapper mapper = new ObjectMapper();
		
		//Object to JSON in String
		String jsonInString = mapper.writeValueAsString(createIssue);
		ClientResponse response = webResource.header("authorization","Bearer "+header)
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class,jsonInString);
		responseData = response.getEntity(String.class);
		System.out.println(responseData);
		return responseData;

	}

}

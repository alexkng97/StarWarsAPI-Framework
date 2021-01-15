package com.sparta.alex.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectionManagerTest {
	ConnectionManager connectionManager = new ConnectionManager("https://swapi.dev/api/");


	@Test
	@DisplayName("Successful connection status code")
	void successfulConnectionStatusCode() {
		Assertions.assertEquals(200, connectionManager.getStatusCode());
	}

	@Test
	@DisplayName("Response server")
	void responseServer() {
		Assertions.assertEquals("nginx/1.16.1", connectionManager.getResponseServer());
	}

	@Test
	@DisplayName("Get date of response")
	void getDateOfResponse() {
		System.out.println(connectionManager.getResponseDate());

	}

	@Test
	@DisplayName("Search headers initial test")
	void searchHeadersInitialTest() {
		Assertions.assertEquals(connectionManager.getResponseServer(),connectionManager.searchResponseHeaders("server"));
	}

	@Test
	@DisplayName("Get http version method test")
	void getHttpVersionMethodTest() {
		Assertions.assertEquals("HTTP_2", connectionManager.getHttpVersion());

	}

	@Test
	@DisplayName("json file test")
	void jsonFileTest() {
		ConnectionManager test= new ConnectionManager("https://swapi.dev/api/people/1/");
		System.out.println(test.getJSONFile());
	}

}

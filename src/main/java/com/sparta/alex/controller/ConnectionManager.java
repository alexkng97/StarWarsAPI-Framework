package com.sparta.alex.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {

	private static final String BASE_URL = "https://swapi.dev/api/";

	HttpResponse httpResponse = null;
	HttpClient httpClient = HttpClient.newHttpClient();

	HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASE_URL)).build();

	public ConnectionManager(){
		try{
			httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		}catch(InterruptedException | IOException e){
			e.printStackTrace();
		}

	}

	public int getStatusCode(){
		return httpResponse.statusCode();
	}



}

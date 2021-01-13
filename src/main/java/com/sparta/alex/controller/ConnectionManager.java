package com.sparta.alex.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class ConnectionManager {

	private static final String BASE_URL = "https://swapi.dev/api/";

	HttpResponse httpResponse = null;
	HttpClient httpClient = HttpClient.newHttpClient();
	HttpRequest httpRequest;
	HttpHeaders httpHeaders = null;
	private Map<String, List<String>> headersMap;

	public ConnectionManager(){
		try{
			httpRequest = HttpRequest.newBuilder().uri(URI.create(BASE_URL)).build();
			httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			httpHeaders = httpResponse.headers();

			headersMap = httpHeaders.map();

		}catch(InterruptedException | IOException e){
			e.printStackTrace();
		}

	}

	public int getStatusCode(){
		return httpResponse.statusCode();
	}

	public Map<String, List<String>> getResponseHeaders(){
		return headersMap;
	}

	public void printAllResponseHeaders(){
		headersMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
	}

	public String getResponseServer(){
		return searchResponseHeaders("server");
	}

	public String getResponseDate(){
		return searchResponseHeaders("date");
	}

	public String searchResponseHeaders(String header){
		header= header.toLowerCase();
		List<String> allValues = httpHeaders.allValues(header);
		return allValues.toString().replace('[',' ').replace(']', ' ').trim();

	}




}

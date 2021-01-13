package com.sparta.alex.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.alex.model.PeopleDTO;

import java.io.IOException;

public class Injector {
	private static String BASE_URL = ConnectionManager.BASE_URL;
	ObjectMapper objectMapper;
	PeopleDTO peopleDTO;
	ConnectionManager connectionManager;


	public Injector(){
		objectMapper = new ObjectMapper();

	}

	public PeopleDTO injectIntoPeople(String id){
		String url = BASE_URL + "people/" + id +"/";
		peopleDTO = new PeopleDTO();
		connectionManager = new ConnectionManager(url);

		try {
			peopleDTO = objectMapper.readValue(connectionManager.httpResponse.body(), PeopleDTO.class);

		}catch (IOException e){
			e.printStackTrace();
		}
		return peopleDTO;
	}


}

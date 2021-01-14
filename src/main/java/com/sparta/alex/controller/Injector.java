package com.sparta.alex.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.alex.model.PeopleDTO;
import com.sparta.alex.model.PlanetsDTO;

import java.io.IOException;

public class Injector {
	private static String BASE_URL = ConnectionManager.BASE_URL;

	public Injector() { }

	public static int getIDFromURL(String url){
		String split [] = url.split("/");
		return Integer.parseInt(split[5]);
	}

	public static PeopleDTO injectIntoPeople(int id) {
		String url = BASE_URL + "people/" + id + "/";
		ObjectMapper objectMapper = new ObjectMapper();
		PeopleDTO peopleDTO = new PeopleDTO();
		ConnectionManager connectionManager = new ConnectionManager(url);

		try {
			peopleDTO = objectMapper.readValue(connectionManager.httpResponse.body(), PeopleDTO.class);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return peopleDTO;
	}

	public static PlanetsDTO injectIntoPlanets(int id) {
		String url = BASE_URL + "planets/" + id + "/";
		PlanetsDTO planetsDTO = new PlanetsDTO();
		ConnectionManager connectionManager = new ConnectionManager(url);
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			planetsDTO = objectMapper.readValue(connectionManager.httpResponse.body(), PlanetsDTO.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return planetsDTO;

	}


}

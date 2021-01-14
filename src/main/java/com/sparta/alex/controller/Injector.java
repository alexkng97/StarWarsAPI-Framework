package com.sparta.alex.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.alex.model.*;

import java.io.IOException;

public class Injector {
	private static String BASE_URL = ConnectionManager.BASE_URL;

	public Injector() {
	}

	public static int getIDFromURL(String url) {
		String split[] = url.split("/");
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

	public static FilmsDTO injectIntoFilms(int id) {
		String url = BASE_URL + "films/" + id + "/";
		FilmsDTO filmsDTO = new FilmsDTO();
		ConnectionManager connectionManager = new ConnectionManager(url);
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			filmsDTO = objectMapper.readValue(connectionManager.httpResponse.body(), FilmsDTO.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return filmsDTO;
	}

	public static SpeciesDTO injectIntoSpecies(int id) {
		String url = BASE_URL + "species/" + id + "/";
		SpeciesDTO speciesDTO = new SpeciesDTO();
		ConnectionManager connectionManager = new ConnectionManager(url);
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			speciesDTO = objectMapper.readValue(connectionManager.httpResponse.body(), SpeciesDTO.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return speciesDTO;
	}

	public static VehiclesDTO injectIntoVehicle(int id) {
		String url = BASE_URL + "vehicles/" + id + "/";
		VehiclesDTO vehiclesDTO = new VehiclesDTO();
		ConnectionManager connectionManager = new ConnectionManager(url);
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			vehiclesDTO = objectMapper.readValue(connectionManager.httpResponse.body(), VehiclesDTO.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return vehiclesDTO;
	}

	public static StarshipsDTO injectIntoStarships(int id) {
		String url = BASE_URL + "starships/" + id + "/";
		StarshipsDTO starshipsDTO = new StarshipsDTO();
		ConnectionManager connectionManager = new ConnectionManager(url);
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			starshipsDTO = objectMapper.readValue(connectionManager.httpResponse.body(), StarshipsDTO.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return starshipsDTO;
	}


}

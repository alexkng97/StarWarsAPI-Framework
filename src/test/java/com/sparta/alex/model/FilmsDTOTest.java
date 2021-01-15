package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilmsDTOTest {

	@Test
	@DisplayName("Getting the first film")
	void gettingTheFirstFilm() {
		Assertions.assertEquals("A New Hope", Injector.injectIntoFilms(1).getTitle());
	}

	@Test
	@DisplayName("Why is episode id different from url id")
	void whyIsEpisodeIdDifferentFromUrlId() {
		Assertions.assertEquals(4, Injector.injectIntoFilms(1).getEpisode_id());
	}

	@Test
	@DisplayName("Get list of characters in the best star wars film")
	void getListOfCharactersInTheBestStarWarsFilm() {
		System.out.println(Injector.injectIntoFilms(2).getCharacters().toString());
	}

	@Test
	@DisplayName("Get list of planets in revenge of the sith")
	void getListOfPlanetsInRevengeOfTheSith() {
		System.out.println(Injector.injectIntoFilms(6).getPlanets().toString());

	}

	@Test
	@DisplayName("Get list of vehicles in new hope")
	void getListOfVehiclesInNewHope() {
		System.out.println(Injector.injectIntoFilms(1).getVehicles().toString());

	}

	@Test
	@DisplayName("list of starships in new hope")
	void listOfStarshipsInNewHope() {
		System.out.println(Injector.injectIntoFilms(1).getStarships());
	}

	@Test
	@DisplayName("list of species in attack of the clones")
	void listOfSpeciesInAttackOfTheClones() {
		System.out.println(Injector.injectIntoFilms(5).getSpecies());
	}
}

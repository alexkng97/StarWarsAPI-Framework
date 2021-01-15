package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InjectorTest {

	@Test
	@DisplayName("testing inject by url people")
	void testingInjectByUrlPeople() {
		PeopleDTO luke = (PeopleDTO) Injector.injectByURL("https://swapi.dev/api/people/1/");
		Assertions.assertEquals("Luke Skywalker", luke.getName());
	}

	@Test
	@DisplayName("Inject by url Planets")
	void injectByUrlPlanets() {
		PlanetsDTO planet = (PlanetsDTO) Injector.injectByURL("https://swapi.dev/api/planets/1/");
		Assertions.assertEquals("Tatooine", planet.getName());

	}

	@Test
	@DisplayName("inject by url films")
	void injectByUrlFilms() {
		FilmsDTO film = (FilmsDTO) Injector.injectByURL("https://swapi.dev/api/films/2/");
		Assertions.assertEquals("The Empire Strikes Back" , film.getTitle());
	}
}

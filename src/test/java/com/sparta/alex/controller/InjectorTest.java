package com.sparta.alex.controller;

import com.sparta.alex.model.BaseDTO;
import com.sparta.alex.model.FilmsDTO;
import com.sparta.alex.model.PeopleDTO;
import com.sparta.alex.model.PlanetsDTO;
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

	@Test
	@DisplayName("injecting into base")
	void injectingIntoBase() {
		BaseDTO base = Injector.injectIntoBase("https://swapi.dev/api/people/");
		System.out.println(base.getCount());
	}

	@Test
	@DisplayName("base injection by url")
	void baseInjectionByUrl() {
		BaseDTO base = (BaseDTO) Injector.injectByURL("https://swapi.dev/api/people/");
		System.out.println(base.getCount());

	}


}

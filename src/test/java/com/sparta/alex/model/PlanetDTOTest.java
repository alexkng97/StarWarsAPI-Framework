package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanetDTOTest {

	@Test
	@DisplayName("If planet 1 is tatooine")
	void ifPlanet1IsTatooine() {
		Assertions.assertEquals("Tatooine", Injector.injectIntoPlanets(1).getName());

	}

	@Test
	@DisplayName("who lives on tatooine")
	void whoLivesOnTatooine() {
		System.out.println(Injector.injectIntoPlanets(1).getResidents());

	}

	@Test
	@DisplayName("why was cloud city only in one film")
	void whyWasCloudCityOnlyInOneFilm() {
		System.out.println(Injector.injectIntoPlanets(6).getFilms());
	}


}

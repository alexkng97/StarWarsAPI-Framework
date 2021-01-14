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


}

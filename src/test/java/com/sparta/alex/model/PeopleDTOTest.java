package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PeopleDTOTest {

	@Test
	@DisplayName("Testing Luke")
	void testingLuke() {
		//Injector injector = new Injector();
		Assertions.assertEquals("Luke Skywalker", Injector.injectIntoPeople(1).getName());
	}

	@Test
	@DisplayName("Lukes eye color is blue")
	void lukesEyeColorIsBlue() {
		Assertions.assertEquals("blue", Injector.injectIntoPeople(1).getEye_color());
	}

	@Test
	@DisplayName("testing what is stored in homeworld")
	void testingWhatIsStoredInHomeworld() {
		//System.out.println(Injector.injectIntoPeople(1).getHomeworld());
		Assertions.assertEquals("Tatooine", Injector.injectIntoPeople(1).getHomeworld());

	}

	@Test
	@DisplayName("R2D2 has a homeworld?")
	void r2D2HasAHomeworld() {
		Assertions.assertEquals("Naboo", Injector.injectIntoPeople(3).getHomeworld());

	}

	@Test
	@DisplayName("R2D2 films")
	void r2D2Films() {
		System.out.println(Injector.injectIntoPeople(3).getFilms().toString());;

	}

	@Test
	@DisplayName("what does empty species return")
	void whatDoesEmptySpeciesReturn() {
		System.out.println(Injector.injectIntoPeople(5).getSpecies());

	}

	@Test
	@DisplayName("r2d2 species")
	void r2D2Species() {
		System.out.println(Injector.injectIntoPeople(3).getSpecies().toString());
	}

	@Test
	@DisplayName("vehicles test")
	void vehiclesTest() {
		System.out.println(Injector.injectIntoPeople(1).getVehicles().toString());

	}

	@Test
	@DisplayName("can R2D2 drive")
	void canR2D2Drive() {
		Assertions.assertEquals(0, Injector.injectIntoPeople(3).getVehicles().size());
	}

	@Test
	@DisplayName("Lukes Starships")
	void lukesStarships() {
		System.out.println(Injector.injectIntoPeople(1).getStarships().toString());

	}

}

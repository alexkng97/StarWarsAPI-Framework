package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SpeciesDTOTest {

	@Test
	@DisplayName("Testing get name")
	void testingGetName() {
		Assertions.assertEquals("Wookie", Injector.injectIntoSpecies(3).getName());
	}

	@Test
	@DisplayName("testing humans homeworld")
	void testingHumansHomeworld() {
		Assertions.assertEquals("Coruscant", Injector.injectIntoSpecies(1).getHomeworld());

	}

	@Test
	@DisplayName("Sad droids do not have a homeworld")
	void sadDroidsDoNotHaveAHomeworld() {
		Assertions.assertNull(Injector.injectIntoSpecies(2).getHomeworld());

	}

	@Test
	@DisplayName("Get Droid Names")
	void getDroidNames() {
		System.out.println(Injector.injectIntoSpecies(2).getPeople());
	}

	@Test
	@DisplayName("I thought luke skywalker was human")
	void iThoughtLukeSkywalkerWasHuman() {
		System.out.println(Injector.injectIntoSpecies(1).getPeople());
	}

	@Test
	@DisplayName("films with droids")
	void filmsWithDroids() {
		System.out.println(Injector.injectIntoSpecies(2).getFilms());
	}
}

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
}

package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PeopleDTOTest {

	@Test
	@DisplayName("Testing Luke")
	void testingLuke() {
		Injector injector = new Injector();
		Assertions.assertEquals("Luke Skywalker", injector.injectIntoPeople(1).getName());
	}

	@Test
	@DisplayName("testing what is stored in homeworld")
	void testingWhatIsStoredInHomeworld() {
		Injector injector = new Injector();
		System.out.println(injector.injectIntoPeople(1).getHomeworld());

	}

}

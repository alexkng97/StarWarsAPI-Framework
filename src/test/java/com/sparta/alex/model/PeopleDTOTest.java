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
		Assertions.assertEquals("Luke Skywalker",injector.injectIntoPeople("1").getName());
	}
}

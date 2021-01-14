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
}

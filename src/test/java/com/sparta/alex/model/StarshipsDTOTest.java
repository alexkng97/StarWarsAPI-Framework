package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StarshipsDTOTest {
	@Test
	@DisplayName("test injection and get name")
	void testInjectionAndGetName() {
		Assertions.assertEquals("Jedi starfighter", Injector.injectIntoStarships(48).getName());
	}

	@Test
	@DisplayName("test MGLT")
	void testMglt() {
		StarshipsDTO jediStar = Injector.injectIntoStarships(48);
		System.out.println(jediStar.getMGLT());
		System.out.println(jediStar.getUrl());
	}


}

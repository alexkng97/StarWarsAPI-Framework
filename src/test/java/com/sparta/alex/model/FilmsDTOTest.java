package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilmsDTOTest {

	@Test
	@DisplayName("Getting the first film")
	void gettingTheFirstFilm() {
		Assertions.assertEquals("A New Hope", Injector.injectIntoFilms(1).getTitle());
	}

	@Test
	@DisplayName("Why is episode id different from url id")
	void whyIsEpisodeIdDifferentFromUrlId() {
		Assertions.assertEquals(4, Injector.injectIntoFilms(1).getEpisode_id());
	}
}

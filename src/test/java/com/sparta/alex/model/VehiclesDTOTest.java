package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VehiclesDTOTest {

	@Test
	@DisplayName("test for get name")
	void testForGetName() {
		Assertions.assertEquals("Imperial Speeder Bike", Injector.injectIntoVehicle(30).getName());
	}

	@Test
	@DisplayName("Who drives the speeder bike?")
	void whoDrivesTheSpeederBike() {
		System.out.println(Injector.injectIntoVehicle(30).getPilots());

	}

	@Test
	@DisplayName("vehicle with no pilots")
	void vehicleWithNoPilots() {
		System.out.println(Injector.injectIntoVehicle(54).getPilots());
	}

	@Test
	@DisplayName("get films that this vehicle was in")
	void getFilmsThatThisVehicleWasIn() {
		System.out.println(Injector.injectIntoVehicle(50).getFilms());
	}

}

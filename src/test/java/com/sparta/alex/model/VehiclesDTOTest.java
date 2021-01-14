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
}

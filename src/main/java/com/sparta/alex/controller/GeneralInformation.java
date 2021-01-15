package com.sparta.alex.controller;

public class GeneralInformation {

	public static int getNumberOfPeople(){
		return Injector.injectIntoBase("https://swapi.dev/api/people/").getCount();

	}

	public static int getNumberOfFilms(){
		return Injector.injectIntoBase("https://swapi.dev/api/films/").getCount();
	}

	public static int getNumberOfPlanets(){
		return Injector.injectIntoBase("https://swapi.dev/api/planets/").getCount();
	}

	public static int getNumberOfSpecies(){
		return Injector.injectIntoBase("https://swapi.dev/api/species/").getCount();
	}

	public static int getNumberOfStarships(){
		return Injector.injectIntoBase("https://swapi.dev/api/starships/").getCount();
	}

	public static int getNumberOfVehicles(){
		return Injector.injectIntoBase("https://swapi.dev/api/vehicles/").getCount();

	}

}

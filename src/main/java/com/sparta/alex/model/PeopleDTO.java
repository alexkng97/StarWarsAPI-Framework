package com.sparta.alex.model;

import java.util.List;

public class PeopleDTO {

	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private PlanetsDTO homeworld;
	private List<FilmsDTO> films;
	private List<SpeciesDTO> species;
	private List<VehiclesDTO> vehicles;
	private List<StarshipsDTO> starships;
	private String created;
	private String edited;
	private String url;

	public PeopleDTO() {
	}
}

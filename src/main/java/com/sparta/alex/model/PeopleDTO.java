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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getSkin_color() {
		return skin_color;
	}

	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}

	public String getEye_color() {
		return eye_color;
	}

	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PlanetsDTO getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(PlanetsDTO homeworld) {
		this.homeworld = homeworld;
	}

	public List<FilmsDTO> getFilms() {
		return films;
	}

	public void setFilms(List<FilmsDTO> films) {
		this.films = films;
	}

	public List<SpeciesDTO> getSpecies() {
		return species;
	}

	public void setSpecies(List<SpeciesDTO> species) {
		this.species = species;
	}

	public List<VehiclesDTO> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<VehiclesDTO> vehicles) {
		this.vehicles = vehicles;
	}

	public List<StarshipsDTO> getStarships() {
		return starships;
	}

	public void setStarships(List<StarshipsDTO> starships) {
		this.starships = starships;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;

import java.util.ArrayList;
import java.util.List;

public class PeopleDTO extends DTO {

	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
	private List<String> films;
	private List<String> species;
	private List<String> vehicles;
	private List<String> starships;
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

	public String getHomeworld() {
		if (homeworld != null) {
			return Injector.injectIntoPlanets(Injector.getIDFromURL(homeworld)).getName();
		}
		return homeworld;
	}

	public PlanetsDTO getHomeworldAsDTO() {
		PlanetsDTO result = new PlanetsDTO();
		if (homeworld != null) {
			result = Injector.injectIntoPlanets(Injector.getIDFromURL(homeworld));
		}

		return result;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}

	public List<String> getFilms() {
		List<String> filmTitles = new ArrayList<>();
		for (String filmURL : films) {
			filmTitles.add(Injector.injectIntoFilms(Injector.getIDFromURL(filmURL)).getTitle());
		}

		return filmTitles;
	}

	public List<FilmsDTO> getFilmsAsDTO() {
		List<FilmsDTO> filmsList = new ArrayList<>();
		for (String filmURL : films) {
			filmsList.add(Injector.injectIntoFilms(Injector.getIDFromURL(filmURL)));
		}
		return filmsList;
	}

	public void setFilms(List<String> films) {
		this.films = films;
	}

	public List<String> getSpecies() {
		if (species.size() > 0) {
			List<String> speciesName = new ArrayList<>();
			for (String speciesURL : species) {
				speciesName.add(Injector.injectIntoSpecies(Injector.getIDFromURL(speciesURL)).getName());
			}

			return speciesName;
		}
		return species;
	}

	public List<SpeciesDTO> getSpeciesAsDTO() {
		List<SpeciesDTO> speciesDTOs = new ArrayList<>();
		if (species.size() > 0) {
			for (String speciesURL : species) {
				speciesDTOs.add(Injector.injectIntoSpecies(Injector.getIDFromURL(speciesURL)));
			}
		}
		return speciesDTOs;
	}

	public void setSpecies(List<String> species) {
		this.species = species;
	}

	public List<String> getVehicles() {
		if (vehicles.size() > 0) {
			List<String> vehiclesName = new ArrayList<>();
			for (String vehiclesURL : vehicles) {
				vehiclesName.add(Injector.injectIntoVehicle(Injector.getIDFromURL(vehiclesURL)).getName());
			}

			return vehiclesName;
		}
		return vehicles;
	}

	public List<VehiclesDTO> getVehiclesAsDTO() {
		List<VehiclesDTO> vehiclesDTOs = new ArrayList<>();
		if (vehicles.size() > 0) {
			for (String vehiclesURL : vehicles) {
				vehiclesDTOs.add(Injector.injectIntoVehicle(Injector.getIDFromURL(vehiclesURL)));
			}
		}
		return vehiclesDTOs;
	}

	public void setVehicles(List<String> vehicles) {
		this.vehicles = vehicles;
	}

	public List<String> getStarships() {
		if (starships.size() > 0) {
			List<String> starshipsName = new ArrayList<>();
			for (String starshipsURL : starships) {
				starshipsName.add(Injector.injectIntoStarships(Injector.getIDFromURL(starshipsURL)).getName());
			}

			return starshipsName;
		}
		return starships;
	}

	public List<StarshipsDTO> getStarshipsAsDTO() {
		List<StarshipsDTO> starshipsName = new ArrayList<>();
		if (starships.size() > 0) {
			for (String starshipsURL : starships) {
				starshipsName.add(Injector.injectIntoStarships(Injector.getIDFromURL(starshipsURL)));
			}
		}
		return starshipsName;
	}

	public void setStarships(List<String> starships) {
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

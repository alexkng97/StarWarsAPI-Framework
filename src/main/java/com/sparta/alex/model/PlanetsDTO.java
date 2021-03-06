package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;

import java.util.ArrayList;
import java.util.List;

public class PlanetsDTO extends DTO {

	private String name;
	private String rotation_period;
	private String orbital_period;
	private String diameter;
	private String climate;
	private String gravity;
	private String terrain;
	private String surface_water;
	private String population;
	private List<String> residents;
	private List<String> films;
	private String created;
	private String edited;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRotation_period() {
		return rotation_period;
	}

	public void setRotation_period(String rotation_period) {
		this.rotation_period = rotation_period;
	}

	public String getOrbital_period() {
		return orbital_period;
	}

	public void setOrbital_period(String orbital_period) {
		this.orbital_period = orbital_period;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getSurface_water() {
		return surface_water;
	}

	public void setSurface_water(String surface_water) {
		this.surface_water = surface_water;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public List<String> getResidents() {
		if(residents.size() > 0){
			List<String> residentNames = new ArrayList<>();
			for(String residentsURL: residents){
				residentNames.add(Injector.injectIntoPeople(Injector.getIDFromURL(residentsURL)).getName());
			}

			return residentNames;
		}
		return residents;
	}

	public List<PeopleDTO> getResidentsAsDTO(){
		List<PeopleDTO> characterNames = new ArrayList<>();
		if (residents.size() > 0) {
			for (String peopleURL : residents) {
				characterNames.add(Injector.injectIntoPeople(Injector.getIDFromURL(peopleURL)));
			}
		}
		return characterNames;
	}


	public void setResidents(List<String> residents) {
		this.residents = residents;
	}

	public List<String> getFilms() {
		if(films.size() > 0) {
			List<String> filmTitles = new ArrayList<>();
			for (String filmURL : films) {
				filmTitles.add(Injector.injectIntoFilms(Injector.getIDFromURL(filmURL)).getTitle());
			}

			return filmTitles;
		}
		return films;
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

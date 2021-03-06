package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;

import java.util.ArrayList;
import java.util.List;

public class VehiclesDTO extends DTO {

	private String name;
	private String model;
	private String manufacturer;
	private String cost_in_credits;
	private String length;
	private String max_atmosphering_speed;
	private String crew;
	private String passengers;
	private String cargo_capacity;
	private String consumables;
	private String vehicle_class;
	private List<String> pilots;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCost_in_credits() {
		return cost_in_credits;
	}

	public void setCost_in_credits(String cost_in_credits) {
		this.cost_in_credits = cost_in_credits;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getMax_atmosphering_speed() {
		return max_atmosphering_speed;
	}

	public void setMax_atmosphering_speed(String max_atmosphering_speed) {
		this.max_atmosphering_speed = max_atmosphering_speed;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public String getCargo_capacity() {
		return cargo_capacity;
	}

	public void setCargo_capacity(String cargo_capacity) {
		this.cargo_capacity = cargo_capacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public String getVehicle_class() {
		return vehicle_class;
	}

	public void setVehicle_class(String vehicle_class) {
		this.vehicle_class = vehicle_class;
	}

	public List<String> getPilots() {
		if(pilots.size() > 0){
			List<String> pilotNames = new ArrayList<>();
			for(String pilotsURL: pilots){
				pilotNames.add(Injector.injectIntoPeople(Injector.getIDFromURL(pilotsURL)).getName());
			}

			return pilotNames;
		}
		return pilots;
	}

	public List<PeopleDTO> getPilotsAsDTO() {
		List<PeopleDTO> characterNames = new ArrayList<>();
		if (pilots.size() > 0) {
			for (String peopleURL : pilots) {
				characterNames.add(Injector.injectIntoPeople(Injector.getIDFromURL(peopleURL)));
			}
		}
		return characterNames;
	}

	public void setPilots(List<String> pilots) {
		this.pilots = pilots;
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

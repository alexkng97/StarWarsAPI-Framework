package com.sparta.alex.model ;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.alex.controller.Injector;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarshipsDTO{

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

	private String hyperdrive_rating;

	@JsonProperty("mglt")
	private String MGLT;

	private String starship_class;

	private List<String> pilots;

	private List<String> films;

	private String created;

	private String edited;

	private String url;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return this.model;
	}
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	public String getManufacturer(){
		return this.manufacturer;
	}
	public void setCost_in_credits(String cost_in_credits){
		this.cost_in_credits = cost_in_credits;
	}
	public String getCost_in_credits(){
		return this.cost_in_credits;
	}
	public void setLength(String length){
		this.length = length;
	}
	public String getLength(){
		return this.length;
	}
	public void setMax_atmosphering_speed(String max_atmosphering_speed){
		this.max_atmosphering_speed = max_atmosphering_speed;
	}
	public String getMax_atmosphering_speed(){
		return this.max_atmosphering_speed;
	}
	public void setCrew(String crew){
		this.crew = crew;
	}
	public String getCrew(){
		return this.crew;
	}
	public void setPassengers(String passengers){
		this.passengers = passengers;
	}
	public String getPassengers(){
		return this.passengers;
	}
	public void setCargo_capacity(String cargo_capacity){
		this.cargo_capacity = cargo_capacity;
	}
	public String getCargo_capacity(){
		return this.cargo_capacity;
	}
	public void setConsumables(String consumables){
		this.consumables = consumables;
	}
	public String getConsumables(){
		return this.consumables;
	}
	public void setHyperdrive_rating(String hyperdrive_rating){
		this.hyperdrive_rating = hyperdrive_rating;
	}
	public String getHyperdrive_rating(){
		return this.hyperdrive_rating;
	}
	public void setMGLT(String MGLT){
		this.MGLT = MGLT;
	}
	public String getMGLT(){
		return this.MGLT;
	}
	public void setStarship_class(String starship_class){
		this.starship_class = starship_class;
	}
	public String getStarship_class(){
		return this.starship_class;
	}
	public void setPilots(List<String> pilots){
		this.pilots = pilots;
	}
	public List<String> getPilots(){
		if(pilots.size() > 0){
			List<String> pilotNames = new ArrayList<>();
			for(String pilotsURL: pilots){
				pilotNames.add(Injector.injectIntoPeople(Injector.getIDFromURL(pilotsURL)).getName());
			}

			return pilotNames;
		}
		return pilots;
	}
	public void setFilms(List<String> films){
		this.films = films;
	}
	public List<String> getFilms(){
		if(films.size() > 0) {
			List<String> filmTitles = new ArrayList<>();
			for (String filmURL : films) {
				filmTitles.add(Injector.injectIntoFilms(Injector.getIDFromURL(filmURL)).getTitle());
			}

			return filmTitles;
		}
		return films;
	}
	public void setCreated(String created){
		this.created = created;
	}
	public String getCreated(){
		return this.created;
	}
	public void setEdited(String edited){
		this.edited = edited;
	}
	public String getEdited(){
		return this.edited;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
}

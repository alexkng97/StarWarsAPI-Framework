package com.sparta.alex.model;

import com.sparta.alex.controller.Injector;

import java.util.ArrayList;
import java.util.List;

public class FilmsDTO extends DTO {

	private String title;
	private int episode_id;
	private String opening_crawl;
	private String director;
	private String producer;
	private String release_date;
	private List<String> characters;
	private List<String> planets;
	private List<String> starships;
	private List<String> vehicles;
	private List<String> species;
	private String created;
	private String edited;
	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEpisode_id() {
		return episode_id;
	}

	public void setEpisode_id(int episode_id) {
		this.episode_id = episode_id;
	}

	public String getOpening_crawl() {
		return opening_crawl;
	}

	public void setOpening_crawl(String opening_crawl) {
		this.opening_crawl = opening_crawl;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public List<String> getCharacters() {
		if (characters.size() > 0) {
			List<String> characterNames = new ArrayList<>();
			for (String peopleURL : characters) {
				characterNames.add(Injector.injectIntoPeople(Injector.getIDFromURL(peopleURL)).getName());
			}

			return characterNames;
		}
		return characters;
	}

	public List<PeopleDTO> getCharactersAsDTO() {
		List<PeopleDTO> characterNames = new ArrayList<>();
		if (characters.size() > 0) {
			for (String peopleURL : characters) {
				characterNames.add(Injector.injectIntoPeople(Injector.getIDFromURL(peopleURL)));
			}
		}
		return characterNames;
	}

	public void setCharacters(List<String> characters) {
		this.characters = characters;
	}

	public List<String> getPlanets() {
		if (planets.size() > 0) {
			List<String> planetNames = new ArrayList<>();
			for (String planetsURL : planets) {
				planetNames.add(Injector.injectIntoPlanets(Injector.getIDFromURL(planetsURL)).getName());
			}

			return planetNames;
		}
		return planets;
	}

	public List<PlanetsDTO> getPlanetsAsDTOs() {
		List<PlanetsDTO> planetNames = new ArrayList<>();
		if (planets.size() > 0) {
			for (String planetsURL : planets) {
				planetNames.add(Injector.injectIntoPlanets(Injector.getIDFromURL(planetsURL)));
			}
		}
		return planetNames;
	}

	public void setPlanets(List<String> planets) {
		this.planets = planets;
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

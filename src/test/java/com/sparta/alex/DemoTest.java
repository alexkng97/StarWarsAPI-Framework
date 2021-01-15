package com.sparta.alex;

import com.sparta.alex.controller.ConnectionManager;
import com.sparta.alex.controller.GeneralInformation;
import com.sparta.alex.controller.Injector;
import com.sparta.alex.model.FilmsDTO;
import com.sparta.alex.model.PeopleDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class DemoTest {
	
	@Nested
	public class ConnectionInformation{
		ConnectionManager connectionManager = new ConnectionManager(ConnectionManager.BASE_URL);

		@Test
		@DisplayName("Status code")
		void statusCode() {
			System.out.println(connectionManager.getStatusCode());
			Assertions.assertEquals(200, connectionManager.getStatusCode());
		}

		@Test
		@DisplayName("Http version")
		void httpVersion() {
			System.out.println(connectionManager.getHttpVersion());
			Assertions.assertEquals("HTTP_2", connectionManager.getHttpVersion());
		}

		@Test
		@DisplayName("Searching Response Headers")
		void searchingResponseHeaders() {
			System.out.println(connectionManager.searchResponseHeaders("server"));
			
			Assertions.assertEquals("nginx/1.16.1", connectionManager.searchResponseHeaders("server"));
		}

		@Test
		@DisplayName("get JSON file")
		void getJsonFile() {
			System.out.println(connectionManager.getJSONFile());
		}
	}
	
	
	@Nested
	public class GeneralInformationTest{
		@Test
		@DisplayName("Getting number of people in API")
		void gettingNumberOfPeopleInApi() {
			System.out.println(GeneralInformation.getNumberOfPeople());
		}

		@Test
		@DisplayName("Getting number of vehicles ")
		void gettingNumberOfVehicles() {
			System.out.println(GeneralInformation.getNumberOfVehicles());
		}
	}

	@Nested
	public class Injections{

		@Test
		@DisplayName("first method of injection")
		void firstMethodOfInjection() {
			PeopleDTO luke = Injector.injectIntoPeople(1);
			System.out.println(luke.getName());
			System.out.println(luke.getEye_color());
		}

		@Test
		@DisplayName("second method of injection")
		void secondMethodOfInjection() {
			PeopleDTO r2 = Injector.injectIntoPeople(Injector.getIDFromURL("https://swapi.dev/api/people/3/"));
			System.out.println(r2.getName());
			System.out.println(r2.getBirth_year());
		}

		@Test
		@DisplayName("Third method")
		void thirdMethod() {
			PeopleDTO luke = (PeopleDTO) Injector.injectByURL("https://swapi.dev/api/people/1/");
			System.out.println(luke.getName());
		}

		@Test
		@DisplayName("Best film injection")
		void bestFilmInjection() {
			FilmsDTO bestFilm = (FilmsDTO) Injector.injectByURL("https://swapi.dev/api/films/2/");
			System.out.println(bestFilm.getTitle());
		}

		@Test
		@DisplayName("Default getters")
		void defaultGetters() {
			PeopleDTO obiWan = Injector.injectIntoPeople(10);
			System.out.println(obiWan.getFilms().toString());
		}

		@Test
		@DisplayName("Getters as DTO")
		void gettersAsDto() {
			System.out.println(Injector.injectIntoPeople(1).getHomeworldAsDTO().getClimate());
		}

		@Test
		@DisplayName("Chaining")
		void chaining() {
			System.out.println(Injector.injectIntoPeople(1).getFilmsAsDTO().get(0).getPlanetsAsDTOs().get(1)
					.getResidentsAsDTO().get(0).getVehiclesAsDTO().get(0).getFilmsAsDTO().get(0).getTitle());



			
			//Getting Luke, first film he appears in (new hope), getting the second planet that appears(alderaan)
			//getting the first resident (leia), getting her only vehicle (speeder bike) and getting that film.
		}

	}


}

package application.testData;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//import model.MovieDB;

public class SampleJson {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String jsonData = "[{\"name\":\"mkyong\", \"age\":37}, {\"name\":\"fong\", \"age\":38}]";
		String personData = "[\r\n" + 
				"   {\r\n" + 
				"      \"firstName\":\"John\",\r\n" + 
				"      \"lastName\":\"Doe\",\r\n" + 
				"      \"age\":29,\r\n" + 
				"      \"address\":{\r\n" + 
				"         \"street\":\"100 Elm Way\",\r\n" + 
				"         \"city\":\"Foo City\",\r\n" + 
				"         \"state\":\"NJ\",\r\n" + 
				"         \"zipCode\":\"01234\"\r\n" + 
				"      },\r\n" + 
				"      \"isMale\":true\r\n" + 
				"   },\r\n" + 
				"   {\r\n" + 
				"      \"firstName\":\"Jane\",\r\n" + 
				"      \"lastName\":\"Doe\",\r\n" + 
				"      \"age\":27,\r\n" + 
				"      \"address\":{\r\n" + 
				"         \"street\":\"200 Boxer Road\",\r\n" + 
				"         \"city\":\"Bar City\",\r\n" + 
				"         \"state\":\"NJ\",\r\n" + 
				"         \"zipCode\":\"09876\"\r\n" + 
				"      },\r\n" + 
				"      \"isMale\":false\r\n" + 
				"   }\r\n" + 
				"]";
		
		String squadTeamData ="{\r\n" + 
				"  \"squadName\": \"Super hero squad\",\r\n" + 
				"  \"homeTown\": \"Metro City\",\r\n" + 
				"  \"formed\": 2016,\r\n" + 
				"  \"secretBase\": \"Super tower\",\r\n" + 
				"  \"active\": true,\r\n" + 
				"  \"members\": {\r\n" + 
				"    \"123\":{\r\n" + 
				"      \"name\": \"Molecule Man\",\r\n" + 
				"      \"age\": 29,\r\n" + 
				"      \"secretIdentity\": \"Dan Jukes\",\r\n" + 
				"      \"powers\": [\r\n" + 
				"        \"Radiation resistance\",\r\n" + 
				"        \"Turning tiny\",\r\n" + 
				"        \"Radiation blast\"\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"	 \"245\":{\r\n" + 
				"      \"name\": \"Molecule Man\",\r\n" + 
				"      \"age\": 29,\r\n" + 
				"      \"secretIdentity\": \"Dan Jukes\",\r\n" + 
				"      \"powers\": [\r\n" + 
				"        \"Radiation resistance\",\r\n" + 
				"        \"Turning tiny\",\r\n" + 
				"        \"Radiation blast\"\r\n" + 
				"      ]\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"  }\r\n" + 
				"}";
		
		String movieData = "{\r\n" + 
				"  \"adult\": false,\r\n" + 
				"  \"backdrop_path\": \"/pCUdYAaarKqY2AAUtV6xXYO8UGY.jpg\",\r\n" + 
				"  \"belongs_to_collection\": null,\r\n" + 
				"  \"budget\": 63000000,\r\n" + 
				"  \"genres\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 18,\r\n" + 
				"      \"name\": \"Drama\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"homepage\": \"http://www.foxmovies.com/movies/fight-club\",\r\n" + 
				"  \"id\": 550,\r\n" + 
				"  \"imdb_id\": \"tt0137523\",\r\n" + 
				"  \"original_language\": \"en\",\r\n" + 
				"  \"original_title\": \"Fight Club\",\r\n" + 
				"  \"overview\": \"A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \\\"fight clubs\\\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.\",\r\n" + 
				"  \"popularity\": 37.154,\r\n" + 
				"  \"poster_path\": \"/oqhuGSl6gp22rIRo52IouPhV4hl.jpg\",\r\n" + 
				"  \"production_companies\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 508,\r\n" + 
				"      \"logo_path\": \"/7PzJdsLGlR7oW4J0J5Xcd0pHGRg.png\",\r\n" + 
				"      \"name\": \"Regency Enterprises\",\r\n" + 
				"      \"origin_country\": \"US\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 711,\r\n" + 
				"      \"logo_path\": \"/tEiIH5QesdheJmDAqQwvtN60727.png\",\r\n" + 
				"      \"name\": \"Fox 2000 Pictures\",\r\n" + 
				"      \"origin_country\": \"US\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 20555,\r\n" + 
				"      \"logo_path\": \"/hD8yEGUBlHOcfHYbujp71vD8gZp.png\",\r\n" + 
				"      \"name\": \"Taurus Film\",\r\n" + 
				"      \"origin_country\": \"DE\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 54051,\r\n" + 
				"      \"logo_path\": null,\r\n" + 
				"      \"name\": \"Atman Entertainment\",\r\n" + 
				"      \"origin_country\": \"\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 54052,\r\n" + 
				"      \"logo_path\": null,\r\n" + 
				"      \"name\": \"Knickerbocker Films\",\r\n" + 
				"      \"origin_country\": \"US\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 25,\r\n" + 
				"      \"logo_path\": \"/qZCc1lty5FzX30aOCVRBLzaVmcp.png\",\r\n" + 
				"      \"name\": \"20th Century Fox\",\r\n" + 
				"      \"origin_country\": \"US\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 4700,\r\n" + 
				"      \"logo_path\": \"/A32wmjrs9Psf4zw0uaixF0GXfxq.png\",\r\n" + 
				"      \"name\": \"The Linson Company\",\r\n" + 
				"      \"origin_country\": \"\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"production_countries\": [\r\n" + 
				"    {\r\n" + 
				"      \"iso_3166_1\": \"DE\",\r\n" + 
				"      \"name\": \"Germany\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"iso_3166_1\": \"US\",\r\n" + 
				"      \"name\": \"United States of America\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"release_date\": \"1999-10-15\",\r\n" + 
				"  \"revenue\": 100853753,\r\n" + 
				"  \"runtime\": 139,\r\n" + 
				"  \"spoken_languages\": [\r\n" + 
				"    {\r\n" + 
				"      \"iso_639_1\": \"en\",\r\n" + 
				"      \"name\": \"English\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"Released\",\r\n" + 
				"  \"tagline\": \"Mischief. Mayhem. Soap.\",\r\n" + 
				"  \"title\": \"Fight Club\",\r\n" + 
				"  \"video\": false,\r\n" + 
				"  \"vote_average\": 8.4,\r\n" + 
				"  \"vote_count\": 19644\r\n" + 
				"}";
		ObjectMapper mappper = new ObjectMapper();
	//	Person[] str =  mappper.readValue(jsonData, Person[].class);
	//	List<Person> person = Arrays.asList(mappper.readValue(jsonData, Person[].class));
	//	List<Person> person = (List<Person>) mappper.readValue(jsonData, Object.class);
	//	List<Person> person = mappper.readValue(personData, new TypeReference<List<Person>>() {});
	//	System.out.println(mappper.writeValueAsString(person));
		
		// SquadTeam
		
	//	SquadTeam squadTeams = mappper.readValue(squadTeamData, SquadTeam.class);
//		MovieDB movieDB = mappper.readValue(movieData, MovieDB.class);
		
//		System.out.println(mappper.writeValueAsString(movieDB));
		
	
	}

}

package application.controller;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.SetSimpleValueTypeSecondPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.BelongsToCollection;
import application.model.Genres;
import application.model.MovieDB;
import application.model.ProductionCompanies;
import application.model.ProductionCountries;
import application.model.SpokenLanguage;
import application.response.BelongsToCollectionResponse;
import application.response.GenresResponse;
import application.response.MovieDBResponse;
import application.response.ProductionCompaniesResponse;
import application.response.ProductionCountriesResponse;
import application.response.SpokenLanguageResponse;
import application.service.MovieService;

//import service.MovieService;

@RestController
@RequestMapping("/api")
public class MovieDBController {
	
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value = "/movie/{id}",method = RequestMethod.POST)
	public void updateMovieDetails(@RequestBody MovieDB movieDB,@PathVariable Integer id) {
		movieService.saveMovieDetails(movieDB);
		
	
	}
	
	@RequestMapping(value = "/movie/movieDetails/{id}",method = RequestMethod.GET)
	public MovieDBResponse getMovieDetails(@PathVariable Integer id) {		
		MovieDB movieFromDB = movieService.getMovieById(id);
		MovieDBResponse movieDBResponse = new MovieDBResponse();
		movieDBResponse.setAdult(movieFromDB.getAdult());
		movieDBResponse.setBackdrop_path(movieFromDB.getBackdrop_path());
		buildBelongsToCollection(movieDBResponse, movieFromDB);
		movieDBResponse.setBudget(movieFromDB.getBudget());
		buildGenres(movieDBResponse, movieFromDB);
		movieDBResponse.setHomepage(movieFromDB.getHomepage());
		movieDBResponse.setImdb_id(movieFromDB.getImdb_id());
		movieDBResponse.setOriginal_language(movieFromDB.getOriginal_language());
		movieDBResponse.setOriginal_title(movieFromDB.getOriginal_title());
		movieDBResponse.setOverview(movieFromDB.getOverview());
		movieDBResponse.setPopularity(movieFromDB.getPopularity());
		movieDBResponse.setPoster_path(movieFromDB.getPoster_path());
		buildProductionCompanies(movieDBResponse,movieFromDB);
		buildProductionCountries(movieDBResponse,movieFromDB);
		movieDBResponse.setRelease_date(movieFromDB.getRelease_date());
		movieDBResponse.setRevenue(movieFromDB.getRevenue());
		movieDBResponse.setRuntime(movieFromDB.getRuntime());
		buildSpokenLanguage(movieDBResponse,movieFromDB);
		movieDBResponse.setStatus(movieFromDB.getStatus());
		movieDBResponse.setTagline(movieFromDB.getTagline());
		movieDBResponse.setTitle(movieFromDB.getTitle());
		movieDBResponse.setVideo(movieFromDB.getVideo());
		movieDBResponse.setVote_average(movieFromDB.getVote_average());
		movieDBResponse.setVote_count(movieFromDB.getVote_count());
		
		return movieDBResponse;
	
	}

	private void buildBelongsToCollection(MovieDBResponse movieDBResponse, MovieDB movieFromDB) {
		BelongsToCollectionResponse belongsToCollectionResponse = new BelongsToCollectionResponse();
		BelongsToCollection str = movieFromDB.getBelongs_to_collection();
		belongsToCollectionResponse.setBackdrop_path(str.getBackdrop_path());
		belongsToCollectionResponse.setId(str.getId());
		belongsToCollectionResponse.setName(str.getName());
		belongsToCollectionResponse.setPoster_path(str.getPoster_path());
		
		movieDBResponse.setBelongsToCollectionResponse(belongsToCollectionResponse);
		
	}

	private void buildSpokenLanguage(MovieDBResponse movieDBResponse, MovieDB movieFromDB) {
		// TODO Auto-generated method stub
		List<SpokenLanguageResponse> spokenLanguageResponse = new ArrayList<>();
		for(SpokenLanguage sl : movieFromDB.getSpoken_languages()) {
			SpokenLanguageResponse slr = new SpokenLanguageResponse();
			slr.setIso_639_1(sl.getIso_639_1());
			slr.setName(sl.getName());
			slr.setSpokenLanguageId(sl.getSpokenLanguageId());
			spokenLanguageResponse.add(slr);
		}
		movieDBResponse.setSpoken_languages(spokenLanguageResponse);
		
	}

	private void buildProductionCountries(MovieDBResponse movieDBResponse, MovieDB movieFromDB) {
		List<ProductionCountriesResponse> productionCountriesResponse = new ArrayList<>();
		for(ProductionCountries pc : movieFromDB.getProduction_countries()) {
			ProductionCountriesResponse productionCountries = new ProductionCountriesResponse();
			productionCountries.setIso_3166_1(pc.getIso_3166_1());
			productionCountries.setName(pc.getName());
			productionCountries.setProductionCountriesId(pc.getProductionCountriesId());
			productionCountriesResponse.add(productionCountries);
		}
		movieDBResponse.setProduction_countries(productionCountriesResponse);
		
	}

	private void buildProductionCompanies(MovieDBResponse movieDBResponse, MovieDB movieFromDB) {
		List<ProductionCompaniesResponse> productionCompaniesResponses = new ArrayList<>();
		for(ProductionCompanies pc : movieFromDB.getProduction_companies()) {
			ProductionCompaniesResponse pcr = new ProductionCompaniesResponse();
			pcr.setLogo_path(pc.getLogo_path());
			pcr.setName(pc.getName());
			pcr.setOrigin_country(pc.getOrigin_country());
			pcr.setProductionCompaniesId(pc.getProductionCompaniesId());
			
			productionCompaniesResponses.add(pcr);
		}
		movieDBResponse.setProduction_companies(productionCompaniesResponses);
		
		
	}

	private void buildGenres(MovieDBResponse movieDBResponse, MovieDB movieFromDB) {
		List<GenresResponse> genres = new ArrayList<GenresResponse>();
		
		for(Genres g : movieFromDB.getGenres()) {
			GenresResponse genresResponse = new GenresResponse();
			genresResponse.setGenreId(g.getGenreId());
			genresResponse.setName(g.getName());
			genres.add(genresResponse);
		}
		
		movieDBResponse.setGenres(genres);
		
	}
	
}

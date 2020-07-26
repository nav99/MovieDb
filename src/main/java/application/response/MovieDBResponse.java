package application.response;

import java.util.List;

import application.model.BelongsToCollection;

public class MovieDBResponse {

	private Integer movieId;
	private String adult;
	private String backdrop_path;
	private BelongsToCollectionResponse belongsToCollectionResponse;
	private String budget;
	private List<GenresResponse> genres;
	private String homepage;

	private String imdb_id;
	private String original_language;
	private String original_title;
	private String overview;
	private Double popularity;

	public String getOriginal_title() {
		return original_title;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	private String poster_path;
	private List<ProductionCompaniesResponse> production_companies;
	private List<ProductionCountriesResponse> production_countries;
	private String release_date;
	private Double revenue;
	private Integer runtime;
	private List<SpokenLanguageResponse> spoken_languages;
	private String status;
	private String tagline;
	private String title;
	private String video;
	private String vote_average;
	private String vote_count;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getAdult() {
		return adult;
	}

	public void setAdult(String adult) {
		this.adult = adult;
	}

	public String getBackdrop_path() {
		return backdrop_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public List<GenresResponse> getGenres() {
		return genres;
	}

	public void setGenres(List<GenresResponse> genres) {
		this.genres = genres;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getImdb_id() {
		return imdb_id;
	}

	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Double getPopularity() {
		return popularity;
	}

	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public List<ProductionCompaniesResponse> getProduction_companies() {
		return production_companies;
	}

	public void setProduction_companies(List<ProductionCompaniesResponse> production_companies) {
		this.production_companies = production_companies;
	}

	public List<ProductionCountriesResponse> getProduction_countries() {
		return production_countries;
	}

	public void setProduction_countries(List<ProductionCountriesResponse> production_countries) {
		this.production_countries = production_countries;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public List<SpokenLanguageResponse> getSpoken_languages() {
		return spoken_languages;
	}

	public void setSpoken_languages(List<SpokenLanguageResponse> spoken_languages) {
		this.spoken_languages = spoken_languages;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getVote_average() {
		return vote_average;
	}

	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}

	public String getVote_count() {
		return vote_count;
	}

	public void setVote_count(String vote_count) {
		this.vote_count = vote_count;
	}

	public BelongsToCollectionResponse getBelongsToCollectionResponse() {
		return belongsToCollectionResponse;
	}

	public void setBelongsToCollectionResponse(BelongsToCollectionResponse belongsToCollectionResponse) {
		this.belongsToCollectionResponse = belongsToCollectionResponse;
	}

	

	
		
	
}

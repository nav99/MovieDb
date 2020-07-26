package application.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name ="movies")
public class MovieDB {
	
	private Integer movieId;
	private String adult;
	private String backdrop_path;
	private BelongsToCollection belongs_to_collection;
	private String budget;
	private List<Genres> genres;
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
	private List<ProductionCompanies> production_companies;
	private List<ProductionCountries> production_countries;
	private String release_date;
	private Double revenue;
	private Integer runtime;
	private List<SpokenLanguage> spoken_languages;
	private String status;
	private String tagline;
	private String title;
	private String video;
	private String vote_average;
	private String vote_count;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="movieId",nullable = false)
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	
	@Column(name="adult")
	public String getAdult() {
		return adult;
	}
	
	public void setAdult(String adult) {
		this.adult = adult;
	}
	@Column(name="backdrop_path")
	public String getBackdrop_path() {
		return backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "movieDB")
	public BelongsToCollection getBelongs_to_collection() {
		return belongs_to_collection;
	}
	public void setBelongs_to_collection(BelongsToCollection belongs_to_collection) {
		this.belongs_to_collection = belongs_to_collection;
	}
	@Column(name="budget")
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "movieDB")
	@Column(name="genres")
	public List<Genres> getGenres() {
		return genres;
	}
	public void setGenres(List<Genres> genres) {
		this.genres = genres;
	}
	@Column(name="homepage")
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	
	@Column(name="imdb_id")
	public String getImdb_id() {
		return imdb_id;
	}
	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}
	@Column(name="original_language")
	public String getOriginal_language() {
		return original_language;
	}
	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}
	@Column(name="overview" , length = 2500 )
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	@Column(name="popularity")
	public Double getPopularity() {
		return popularity;
	}
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}
	@Column(name="poster_path")
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "movieDB")
	@Column(name="production_companies")
	public List<ProductionCompanies> getProduction_companies() {
		return production_companies;
	}
	public void setProduction_companies(List<ProductionCompanies> production_companies) {
		this.production_companies = production_companies;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "movieDB")
	@Column(name="production_countries")
	public List<ProductionCountries> getProduction_countries() {
		return production_countries;
	}
	public void setProduction_countries(List<ProductionCountries> production_countries) {
		this.production_countries = production_countries;
	}
	@Column(name="release_date")
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	@Column(name="revenue")
	public Double getRevenue() {
		return revenue;
	}
	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}
	@Column(name="runtime")
	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}
	

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "movieDB")
	@Column(name="spoken_languages")
	public List<SpokenLanguage> getSpoken_languages() {
		return spoken_languages;
	}
	public void setSpoken_languages(List<SpokenLanguage> spoken_languages) {
		this.spoken_languages = spoken_languages;
	}
	@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="tagline")
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	@Column(name="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name="video")
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	@Column(name="vote_average")
	public String getVote_average() {
		return vote_average;
	}
	public void setVote_average(String vote_average) {
		this.vote_average = vote_average;
	}
	@Column(name="vote_count")
	public String getVote_count() {
		return vote_count;
	}
	public void setVote_count(String vote_count) {
		this.vote_count = vote_count;
	}
	
	

}

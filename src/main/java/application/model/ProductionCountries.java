package application.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="production_countries")
public class ProductionCountries {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="production_countries_id")
	private Integer productionCountriesId;
	
	private String iso_3166_1;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "movieId" , nullable = false)
	private MovieDB movieDB;
	
	
	public MovieDB getMovieDB() {
		return movieDB;
	}
	public void setMovieDB(MovieDB movieDB) {
		this.movieDB = movieDB;
	}
	public String getIso_3166_1() {
		return iso_3166_1;
	}
	public void setIso_3166_1(String iso_3166_1) {
		this.iso_3166_1 = iso_3166_1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getProductionCountriesId() {
		return productionCountriesId;
	}
	public void setProductionCountriesId(Integer productionCountriesId) {
		this.productionCountriesId = productionCountriesId;
	}

}

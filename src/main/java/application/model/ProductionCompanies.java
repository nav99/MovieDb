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
@Table(name="production_companies")
public class ProductionCompanies {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="production_companies_id")
	private Integer productionCompaniesId;
	
	private String logo_path;
	private String name;
	private String origin_country;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "movieId" , nullable = false)
	private MovieDB movieDB;
	
	
	public Integer getProductionCompaniesId() {
		return productionCompaniesId;
	}
	public void setProductionCompaniesId(Integer productionCompaniesId) {
		this.productionCompaniesId = productionCompaniesId;
	}
	public MovieDB getMovieDB() {
		return movieDB;
	}
	public void setMovieDB(MovieDB movieDB) {
		this.movieDB = movieDB;
	}
	public String getLogo_path() {
		return logo_path;
	}
	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin_country() {
		return origin_country;
	}
	public void setOrigin_country(String origin_country) {
		this.origin_country = origin_country;
	}
	
	

}

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
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name="spoken_language")
public class SpokenLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="spoken_language_id")
	private Integer spokenLanguageId;
	
	private String iso_639_1;
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "movieId" , nullable = false)
	private MovieDB movieDB;
	
	
	public Integer getSpokenLanguageId() {
		return spokenLanguageId;
	}
	public void setSpokenLanguageId(Integer spokenLanguageId) {
		this.spokenLanguageId = spokenLanguageId;
	}
	public MovieDB getMovieDB() {
		return movieDB;
	}
	public void setMovieDB(MovieDB movieDB) {
		this.movieDB = movieDB;
	}
	public String getIso_639_1() {
		return iso_639_1;
	}
	public void setIso_639_1(String iso_639_1) {
		this.iso_639_1 = iso_639_1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

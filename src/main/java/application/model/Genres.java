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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="genres")
public class Genres {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="genreId")
	private int genreId;
	
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "movieId" , nullable = false)
	private MovieDB movieDB;
	
	
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MovieDB getMovieDB() {
		return movieDB;
	}
	public void setMovieDB(MovieDB movieDB) {
		this.movieDB = movieDB;
	}
	

}

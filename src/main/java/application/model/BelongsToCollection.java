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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "belongs_to_collection")
public class BelongsToCollection {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="belongsToCollectionId")
	private int belongsToCollectionId;
	
	private int id;
	private String name;
	private String poster_path;
	private String backdrop_path;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "movieId" , nullable = false)
	private MovieDB movieDB;
	
	
	public MovieDB getMovieDB() {
		return movieDB;
	}
	public void setMovieDB(MovieDB movieDB) {
		this.movieDB = movieDB;
	}
	public int getBelongsToCollectionId() {
		return belongsToCollectionId;
	}
	public void setBelongsToCollectionId(int belongsToCollectionId) {
		this.belongsToCollectionId = belongsToCollectionId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}
	public String getBackdrop_path() {
		return backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	
	
}

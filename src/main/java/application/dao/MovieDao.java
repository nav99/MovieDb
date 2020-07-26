package application.dao;

import application.model.MovieDB;

public interface MovieDao {
	
	public void saveMovieDetails(MovieDB movieDB);
	public MovieDB getMovieById(int movieId);

}

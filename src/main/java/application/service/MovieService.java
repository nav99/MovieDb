package application.service;

import application.model.MovieDB;

public interface MovieService {
	void saveMovieDetails(MovieDB movieDB);
	public MovieDB getMovieById(int movieId);

}

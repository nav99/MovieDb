package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import application.dao.MovieDao;
import application.model.MovieDB;

@Service("movieService")
@Transactional

public class MovieServiceImpl implements MovieService{
	@Autowired MovieDao movieDao;

	@Override
	public void saveMovieDetails(MovieDB movieDB) {
		// TODO Auto-generated method stub
		movieDao.saveMovieDetails(movieDB);
		
	}

	@Override
	public MovieDB getMovieById(int movieId) {
		
		return movieDao.getMovieById(movieId);
	}
	
	

}

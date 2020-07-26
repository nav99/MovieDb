package application.dao;



import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Hibernate;
import 	org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import application.model.BelongsToCollection;
import application.model.Genres;
import application.model.MovieDB;
import application.model.ProductionCompanies;
import application.model.ProductionCountries;
import application.model.SpokenLanguage;

@Transactional
@Repository("movieDao")
public class MovieDaoImpl implements MovieDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	 private EntityManager entityManager;

	@Override
	public void saveMovieDetails(MovieDB movieDB) {
		// TODO Auto-generated method stub
		Session session =  sessionFactory.getCurrentSession();
		List<Genres> genres = movieDB.getGenres();
		for(Genres g : genres) {
			g.setMovieDB(movieDB);
		}
		
		List<ProductionCompanies> pcs = movieDB.getProduction_companies();
		
		for(ProductionCompanies g : pcs) {
			g.setMovieDB(movieDB);
		}
		
		List<ProductionCountries> pcs1 = movieDB.getProduction_countries();
		
		for(ProductionCountries g : pcs1) {
			g.setMovieDB(movieDB);
		}
		
		List<SpokenLanguage> pcs2 = movieDB.getSpoken_languages();
		
		for(SpokenLanguage g : pcs2) {
			g.setMovieDB(movieDB);
		}
		
		BelongsToCollection belongsToCollection = movieDB.getBelongs_to_collection();
		belongsToCollection.setMovieDB(movieDB);
 		session.saveOrUpdate(movieDB);
	}

	@Override
	public MovieDB getMovieById(int movieId) {
		Session currentSession = sessionFactory.getCurrentSession();
		MovieDB movieDB =currentSession.find(MovieDB.class, movieId);
		Hibernate.initialize(movieDB.getGenres());
		Hibernate.initialize(movieDB.getProduction_companies());
		Hibernate.initialize(movieDB.getProduction_countries());
		Hibernate.initialize(movieDB.getSpoken_languages());
		Hibernate.initialize(movieDB.getBelongs_to_collection());
		return movieDB;
		
	}

}

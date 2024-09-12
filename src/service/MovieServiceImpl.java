package service;

import Java15.Model.Genre;
import Java15.Model.Movie;
import dao.MovieDao;
import dao.MovieDaoService;

import java.time.LocalDate;
import java.util.List;

public class MovieServiceImpl implements MovieService{

    MovieDao movieDao = new MovieDaoService();
    @Override
    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

    @Override
    public List<Movie> findMovieByFullNameOrPartName(String name) {
        return movieDao.findMovieByFullNameOrPartName(name);
    }

    @Override
    public List<Movie> findMovieByActorName(String actorName) {
        return movieDao.findMovieByActorName(actorName);
    }

    @Override
    public List<Movie> findMovieByYear(LocalDate year) {
        return movieDao.findMovieByYear(year);
    }

    @Override
    public List<Movie> findMovieByProducer(String producerFullName) {
        return movieDao.findMovieByProducer(producerFullName);
    }

    @Override
    public List<Movie> findByGenre(Genre genre) {
        return movieDao.findByGenre(genre);
    }

    @Override
    public String findRoleByRoleAndMoveName(String actorFillName, String movieName) {
        return movieDao.findRoleByRoleAndMoveName(actorFillName,movieName);
    }

}

package dao;

import Java15.Model.Genre;
import Java15.Model.Movie;

import java.time.LocalDate;
import java.util.List;

public interface MovieDao {
    List<Movie> getAllMovies();
    List<Movie> findMovieByFullNameOrPartName(String name);
    List<Movie> findMovieByActorName(String actorName);
    List<Movie> findMovieByYear(LocalDate year);
    List<Movie> findMovieByProducer(String producerFullName);
    List<Movie> findByGenre(Genre genre);
    String findRoleByRoleAndMoveName(String actorFillName,String movieName);
}

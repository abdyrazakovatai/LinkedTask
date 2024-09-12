package dao;

import DateBase.DateBase;
import Java15.Model.Actor;
import Java15.Model.Genre;
import Java15.Model.Movie;

import java.time.LocalDate;
import java.util.*;

public class MovieDaoService implements MovieDao {
    @Override
    public List<Movie> getAllMovies() {
        return DateBase.movies;
    }

    @Override
    public List<Movie> findMovieByFullNameOrPartName(String name) {
        List<Movie> movie = new LinkedList<>();
        if (name != null && !name.isEmpty()) {
            try {
                for (Movie movies : DateBase.movies) {
                    if (movies.getName().toLowerCase().contains(name.toLowerCase())) {
                        movie.add(movies);
                    }
                }
                if (movie.isEmpty()) {
                    System.out.println("Такого кино нет");
                }
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        } else System.out.println("Имя путое");
        return movie;
    }

    @Override
    public List<Movie> findMovieByActorName(String actorName) {
        LinkedList<Movie> movie = new LinkedList<>();
        if (actorName != null && !actorName.isEmpty()) {
            try {
                for (Movie movies : DateBase.movies) {
                    for (Actor actor : movies.getActors()) {
                        if (actor.getActorFullName().toLowerCase().contains(actorName)) {
                            movie.add(movies);
                        }
                    }
                }
                if (movie.isEmpty()) {
                    System.out.println("Поле пустое! ");
                }
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        } else System.out.println("Поле пустое пожайлуста заполните!");
        return movie;
    }

    @Override
    public List<Movie> findMovieByYear(LocalDate year) {
        List<Movie> moviesByYear = new LinkedList<>();
        try {
            if (!year.equals(null)) {
                for (Movie movie : DateBase.movies) {
                    if (movie.getYear().getYear()==(year.getYear())) {
                        moviesByYear.add(movie);
                    }
                }
            }
            if (moviesByYear.isEmpty() && 1900 < LocalDate.now().getYear()) {
                System.out.println("Фильмы с указанным годом не найдены.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        return moviesByYear;
    }


    @Override
    public List<Movie> findMovieByProducer(String producerFullName) {
        LinkedList<Movie> movie = new LinkedList<>();
        if (producerFullName != null && !producerFullName.isEmpty()) {
            try {
                for (Movie movies : DateBase.movies) {
                    if (movies.getProducer().getFirstName().contains(producerFullName)) {
                        movie.add(movies);
                    }
                }
                if (producerFullName.isEmpty()) {
                    System.out.println("Поле пустое");
                }
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        } else System.out.println("Поле пустое пожайлуста заполните!");
        return movie;
    }

    @Override
    public List<Movie> findByGenre(Genre genre) {
        LinkedList<Movie> movie = new LinkedList<>();
        for (Movie movies : DateBase.movies) {
            if (movies.getGenre().equals(genre)) {
                System.out.println("Найден фильм по запросу: " + movies);
            }
        }
        return movie;
    }

    @Override
    public String findRoleByRoleAndMoveName(String movieName, String actorFullName) {
        for (Movie movie : DateBase.movies) {
            if (movie.getName().contains(movieName)) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getActorFullName().contains(actorFullName)) {

                        return  "Роль: " + actor.getRole();

                    }
                }
            }
        }
        return "Не найден";
    }
}

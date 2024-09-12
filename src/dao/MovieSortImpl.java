package dao;

import DateBase.DateBase;
import Java15.Model.Movie;

import java.util.Collections;
import java.util.Comparator;

public class MovieSortImpl implements MovieSortAble{
    @Override
    public void sortMovieByName(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("asc")) {
            Collections.sort(DateBase.movies, Comparator.comparing(movie -> movie.getName()));
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            Collections.sort(DateBase.movies, Comparator.comparing(Movie::getName));
        }
    }

    @Override
    public void sortByYear(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("asc")) {
            Collections.sort(DateBase.movies, Comparator.comparing(Movie::getYear));
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            Collections.sort(DateBase.movies, Comparator.comparing(Movie::getYear).reversed());
        }
    }


    @Override
    public void sortByProducer(String nameOrLastName) {
        if (nameOrLastName.equalsIgnoreCase("name")) {
            Collections.sort(DateBase.movies, Comparator.comparing(movie -> movie.getProducer().getFirstName()));
        } else if (nameOrLastName.equalsIgnoreCase("last Name")) {
            Collections.sort(DateBase.movies, Comparator.comparing(movie -> movie.getProducer().getLastName()));
        }
    }
}

package dao;

public interface MovieSortAble {
    void sortMovieByName(String ascOrDesc);
    void sortByYear(String ascOrDesc);
    void sortByProducer(String nameOrLastName);
}

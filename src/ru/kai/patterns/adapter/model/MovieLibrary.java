package ru.kai.patterns.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {
    private static final MovieLibrary instance = new MovieLibrary();
    private final List<Movie> movies = new ArrayList<>();

    public static MovieLibrary getInstance() {
        return instance;
    }


    public void addMovie(Movie movie) {
        movies.add(movie);

    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public Movie getMovie(String movieTitle) {
        return null;
    }
}

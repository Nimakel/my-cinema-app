package com.cinema.dao;

import java.util.List;
import java.util.Optional;
import com.cinema.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}

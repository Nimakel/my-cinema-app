package com.cinema.dao.impl;

import com.cinema.dao.AbstractDao;
import com.cinema.dao.MovieDao;
import com.cinema.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}

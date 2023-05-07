package com.cinema.service.mapper.impl;

import com.cinema.dto.request.MovieRequestDto;
import com.cinema.dto.response.MovieResponseDto;
import com.cinema.model.Movie;
import com.cinema.service.mapper.RequestDtoMapper;
import com.cinema.service.mapper.ResponseDtoMapper;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper implements RequestDtoMapper<MovieRequestDto, Movie>,
        ResponseDtoMapper<MovieResponseDto, Movie> {
    @Override
    public Movie mapToModel(MovieRequestDto dto) {
        Movie movie = new Movie();
        movie.setTitle(dto.getTitle());
        movie.setDescription(dto.getDescription());
        return movie;
    }

    @Override
    public MovieResponseDto mapToDto(Movie movie) {
        MovieResponseDto responseDto = new MovieResponseDto();
        responseDto.setId(movie.getId());
        responseDto.setTitle(movie.getTitle());
        responseDto.setDescription(movie.getDescription());
        return responseDto;
    }
}

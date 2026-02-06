package com.example.movie.api;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
	private final List<Movie> movies = new ArrayList<>();

    public Movie addMovie(Movie movie) {
        movies.add(movie);
        return movie;
    }

    public Movie getMovieById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

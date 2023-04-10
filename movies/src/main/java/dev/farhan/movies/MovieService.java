package dev.farhan.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired(required = true)
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){

        List<Movie> all = movieRepository.findAll();
        return all;
    }
}

package com.harshit.movies.Service;

import com.harshit.movies.Models.Movie;
import com.harshit.movies.Repository.MovieRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {


    public Optional<Movie> movieById(ObjectId id){
        return repo.findById(id);
    };
    @Autowired
    private MovieRepo repo;
    public List<Movie> allMovies(){
        return repo.findAll();
    }


    public Optional<Movie> movieByImdbId(String imdbId) {
        return repo.findMovieByImdbId(imdbId);
    }
}

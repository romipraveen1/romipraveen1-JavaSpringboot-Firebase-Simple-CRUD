package com.example.movie.controller;

import com.example.movie.entity.Movie;
import com.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/getMovieDetails")
    public Movie getPatient(@RequestParam String name ) throws InterruptedException, ExecutionException {
        return movieService.getMovieDetails(name);
    }

    @PostMapping("/createMovie")
    public String createPatient(@RequestBody Movie movie ) throws InterruptedException, ExecutionException {
        return movieService.saveMovieDetails(movie);
    }
}

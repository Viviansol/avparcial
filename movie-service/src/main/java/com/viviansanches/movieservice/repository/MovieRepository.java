package com.viviansanches.movieservice.repository;

import com.ronilsonalves.movieservice.dto.MovieDTO;
import com.ronilsonalves.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findAllByGenre(String genre);
}

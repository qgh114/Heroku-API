package com.example.herokurestapi.repositories;

import com.example.herokurestapi.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}

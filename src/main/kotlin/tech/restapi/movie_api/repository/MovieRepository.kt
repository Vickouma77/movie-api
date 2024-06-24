package tech.restapi.movie_api.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import tech.restapi.movie_api.entity.Movie

interface MovieRepository: CrudRepository<Movie, Int> {

    @Query(value = "SELECT m  FROM Movie as m")
    fun getAllMovies(): List<Movie>
}
package tech.restapi.movie_api.repository

import org.springframework.data.repository.CrudRepository
import tech.restapi.movie_api.entity.Movie

interface MovieRepository: CrudRepository<Movie, Int>
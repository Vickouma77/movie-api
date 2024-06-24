package tech.restapi.movie_api.service

import tech.restapi.movie_api.dto.MovieDTO

interface MovieService {

    fun createMovie(movieDTO: MovieDTO): MovieDTO

    fun getMovies(): List<MovieDTO>
}
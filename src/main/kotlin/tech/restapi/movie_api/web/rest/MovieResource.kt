package tech.restapi.movie_api.web.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import tech.restapi.movie_api.dto.MovieDTO
import tech.restapi.movie_api.service.MovieService

@RestController
class MovieResource(
    private val movieService: MovieService
) {

    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): MovieDTO{
        return movieService.createMovie(movieDTO)
    }

    @GetMapping
    fun getMovies(): ResponseEntity<List<MovieDTO>> =
        ResponseEntity.ok(movieService.getMovies())
}
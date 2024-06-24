package tech.restapi.movie_api.service

import org.springframework.stereotype.Service
import tech.restapi.movie_api.dto.MovieDTO
import tech.restapi.movie_api.repository.MovieRepository
import tech.restapi.movie_api.utils.mapper.MovieMapper

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        val movie = movieMapper.toEntity(movieDTO)
        movieRepository.save(movie)
        return movieMapper.fromEntity(movie)
    }

    override fun getMovies(): List<MovieDTO> {
        val movies = movieRepository.getAllMovies()

        return movies.map {
            movieMapper.fromEntity(it)
        }
    }
}
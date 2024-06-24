package tech.restapi.movie_api.utils.mapper

// import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import tech.restapi.movie_api.dto.MovieDTO
import tech.restapi.movie_api.entity.Movie

@Service
class MovieMapper: Mapper<MovieDTO, Movie> {

    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
        entity.id,
        entity.name,
        entity.rating
    )

    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
    )
}
package tech.restapi.movie_api.utlis.mapper

interface Mapper<D, E> {

    fun fromEntity(entity: E): D
    fun toEntity(domain: D): E
}
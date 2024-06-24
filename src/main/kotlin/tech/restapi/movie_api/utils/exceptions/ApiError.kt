package tech.restapi.movie_api.utils.exceptions

import org.springframework.http.HttpStatus

data class ApiError(
    private val _message: String?,
    val status: HttpStatus = HttpStatus.BAD_REQUEST,
    val code: Int = status.value()
) {
    val message
        get() = _message ?: "Something went wrong"
}

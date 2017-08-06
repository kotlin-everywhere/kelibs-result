package com.minek.kotlin.everywhere.kelibs.result

@Suppress("unused")
sealed class Result<out E, out T>

fun <E, T, T1> Result<E, T>.map(mapper: (T) -> T1): Result<E, T1> {
    return when (this) {
        is Ok -> Ok<E, T1>(mapper(this.value))
        is Err -> this.of()
    }
}

fun <E, T, T1> Result<E, T>.andThen(mapper: (T) -> Result<E, T1>): Result<E, T1> {
    return when (this) {
        is Ok -> mapper(this.value)
        is Err -> this.of()
    }
}

data class Ok<out E, out T>(val value: T) : Result<E, T>()

fun <T> ok(value: T): Result<*, T> {
    return Ok<Any, T>(value)
}

data class Err<out E, out T>(val error: E) : Result<E, T>()

fun <E> err(error: E): Result<E, *> {
    return Err<E, Any>(error)
}

private fun <E, T, T1> Err<E, T>.of(): Err<E, T1> {
    @Suppress("UNCHECKED_CAST")
    return this as Err<E, T1>
}

@file:Suppress("unused")

package com.minek.kotlin.everywhere.kelibs.result

sealed class Result<out E, out T>

data class Ok<out E, out T>(val value: T) : Result<E, T>()
data class Err<out E, out T>(val error: E) : Result<E, T>()

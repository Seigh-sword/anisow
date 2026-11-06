package com.xo.anilab.core

/**
 * Every network-backed screen shows one of three states. [data] survives a
 * reload so a refresh can keep the previous content on screen.
 */
sealed interface Resource<out T> {

    val data: T?
    val message: String?

    data class Loading<T>(override val data: T? = null) : Resource<T> {
        override val message: String? = null
    }

    data class Success<T>(override val data: T) : Resource<T> {
        override val message: String? = null
    }

    data class Failure<T>(
        override val message: String? = null,
        override val data: T? = null,
    ) : Resource<T>
}

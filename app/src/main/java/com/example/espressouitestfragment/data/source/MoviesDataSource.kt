package com.example.espressouitestfragment.data.source

import com.example.espressouitestfragment.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?

    fun getMovies(): List<Movie>
}

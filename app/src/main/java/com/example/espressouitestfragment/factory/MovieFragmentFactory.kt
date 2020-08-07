package com.example.espressouitestfragment.factory

import androidx.fragment.app.FragmentFactory
import com.bumptech.glide.request.RequestOptions
import com.example.espressouitestfragment.data.source.MoviesDataSource
import com.example.espressouitestfragment.ui.DirectorsFragment
import com.example.espressouitestfragment.ui.MovieDetailFragment
import com.example.espressouitestfragment.ui.MovieListFragment
import com.example.espressouitestfragment.ui.StarActorsFragment

class MovieFragmentFactory(
    private val moviesDataSource: MoviesDataSource? = null
) : FragmentFactory(){
    private val TAG: String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            MovieListFragment::class.java.name -> {
                if (moviesDataSource != null) {
                    MovieListFragment(moviesDataSource)
                } else {
                    super.instantiate(classLoader, className)
                }
            }

            MovieDetailFragment::class.java.name -> {
                if(moviesDataSource != null){
                    MovieDetailFragment(moviesDataSource)
                }
                else{
                    super.instantiate(classLoader, className)
                }
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }

}
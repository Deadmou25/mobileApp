package com.example.mobileapp.Interface
import com.example.mobileapp.Model.Movie
import retrofit2.Call
import retrofit2.http.GET
interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}
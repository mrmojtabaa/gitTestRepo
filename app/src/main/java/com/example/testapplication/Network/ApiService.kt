package com.example.testapplication.Network

import com.example.testapplication.Repo
import io.reactivex.Completable
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface GitHubService {

    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Single<List<Repo>>


    @PUT("users/{user}/repos")
    fun sendtestData(@Body() data: List<Repo>): Completable

}
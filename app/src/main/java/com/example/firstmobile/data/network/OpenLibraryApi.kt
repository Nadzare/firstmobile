package com.example.firstmobile.data.network

import android.R
import com.example.firstmobile.data.model.SearchResponse
import retrofit2.Response
import retrofit2.http.Query
import retrofit2.http.GET


interface OpenLibraryApi {
    @GET("search.json")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("limit") limit: Int
    ): Response<SearchResponse>
}
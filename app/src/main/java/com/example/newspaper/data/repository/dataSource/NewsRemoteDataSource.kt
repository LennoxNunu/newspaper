package com.example.newspaper.data.repository.dataSource

import com.example.newspaper.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country:String,page:Int): Response<APIResponse>
}
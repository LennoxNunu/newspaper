package com.example.newspaper.data.repository.dataSourceImpl

import com.example.newspaper.data.api.NewsAPIService
import com.example.newspaper.data.model.APIResponse
import com.example.newspaper.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
    private val page:Int) :NewsRemoteDataSource {
        override suspend fun getTopHeadlines(): Response<APIResponse> {
            return newsAPIService.getTopHeadlines(country,page)
    }

}
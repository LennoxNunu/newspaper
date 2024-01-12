package com.example.newspaper.domain.usecase

import com.example.newspaper.data.model.APIResponse
import com.example.newspaper.data.util.Resource
import com.example.newspaper.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute( country: String, page:Int): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines(country,page)
    }
}
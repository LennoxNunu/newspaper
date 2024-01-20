package com.example.newspaper.domain.usecase

import com.example.newspaper.data.model.APIResponse
import com.example.newspaper.data.util.Resource
import com.example.newspaper.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
        return newsRepository.getSearchedNews(country,searchQuery,page)
    }
}
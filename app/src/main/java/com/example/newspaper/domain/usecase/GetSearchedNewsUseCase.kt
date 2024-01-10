package com.example.newspaper.domain.usecase

import com.example.newspaper.data.model.APIResponse
import com.example.newspaper.data.util.Resource
import com.example.newspaper.domain.repository.NewsRepository

class GetSearchedNewsUseCase (private val newsRepository: NewsRepository){
    suspend fun execute(searchQuery:String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}
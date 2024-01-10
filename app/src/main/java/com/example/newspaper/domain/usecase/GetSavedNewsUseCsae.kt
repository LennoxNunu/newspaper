package com.example.newspaper.domain.usecase

import com.example.newspaper.data.model.Article
import com.example.newspaper.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCsae(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}
package com.example.newspaper.domain.usecase

import com.example.newspaper.data.model.Article
import com.example.newspaper.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.saveNews(article)
}
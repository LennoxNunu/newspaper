package com.example.newspaper.presentation.di

import com.example.newspaper.domain.repository.NewsRepository
import com.example.newspaper.domain.usecase.GetNewsHeadlinesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Singleton
    @Provides
    fun provideGetNewsHeadlinesUseCase(
        newsRepository: NewsRepository
    ): GetNewsHeadlinesUseCase {
        return GetNewsHeadlinesUseCase(newsRepository)
    }
}
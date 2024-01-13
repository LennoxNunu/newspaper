package com.example.newspaper.presentation.di

import com.example.newspaper.data.repository.NewsRepositoryImpl
import com.example.newspaper.data.repository.dataSource.NewsRemoteDataSource
import com.example.newspaper.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }

}
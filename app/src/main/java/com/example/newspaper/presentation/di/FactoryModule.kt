package com.example.newspaper.presentation.di

import android.app.Application
import com.example.newspaper.domain.usecase.GetNewsHeadlinesUseCase
import com.example.newspaper.domain.usecase.GetSearchedNewsUseCase
import com.example.newspaper.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
    fun provideNewsViewModelFactory(
        application: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            application,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase
        )
    }
}
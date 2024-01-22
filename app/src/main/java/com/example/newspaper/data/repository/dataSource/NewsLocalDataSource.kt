package com.example.newspaper.data.repository.dataSource

import com.example.newspaper.data.model.Article

interface NewsLocalDataSource {
    suspend fun saveArticleToDB(article: Article)
}
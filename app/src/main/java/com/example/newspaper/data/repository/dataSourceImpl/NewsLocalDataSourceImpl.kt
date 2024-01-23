package com.example.newspaper.data.repository.dataSourceImpl

import com.example.newspaper.data.db.ArticleDAO
import com.example.newspaper.data.model.Article
import com.example.newspaper.data.repository.dataSource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(
    private val articleDAO: ArticleDAO
) : NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
        return articleDAO.getAllArticles()
    }

}
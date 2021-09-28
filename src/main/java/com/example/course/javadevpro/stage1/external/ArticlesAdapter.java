package com.example.course.javadevpro.stage1.external;

import com.example.course.javadevpro.stage1.domain.article.ArticleProvider;
import com.example.course.javadevpro.stage1.domain.model.Articles;
import com.example.course.javadevpro.stage1.external.http.NewsApiClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ArticlesAdapter implements ArticleProvider {

    private NewsApiClient client;

    @Override
    public Articles getArticles(String country, String category) {
        return client.getArticles(country, category);
    }
}
package com.example.course.javadevpro.stage1.domain;

import com.example.course.javadevpro.stage1.domain.article.ArticleProvider;
import com.example.course.javadevpro.stage1.domain.file.FileProvider;
import com.example.course.javadevpro.stage1.domain.model.Articles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ArticleFacade {

    private FileProvider fileProvider;
    private ArticleProvider articleProvider;

    public Articles getArticles(String country, String category) {
        return articleProvider.getArticles(country, category);
    }

    public void saveArticles(Articles articles, String name) {
        fileProvider.saveArticles(articles, name);
    }
}

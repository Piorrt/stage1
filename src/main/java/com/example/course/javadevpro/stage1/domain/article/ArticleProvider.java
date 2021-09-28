package com.example.course.javadevpro.stage1.domain.article;

import com.example.course.javadevpro.stage1.domain.model.Articles;

public interface ArticleProvider {

    Articles getArticles(String country, String category);
}

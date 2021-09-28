package com.example.course.javadevpro.stage1.domain.file;

import com.example.course.javadevpro.stage1.domain.model.Articles;

public interface FileProvider {

    void saveArticles(Articles articles, String name);
}

package com.example.course.javadevpro.stage1.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Articles {

    String status;
    Integer totalResults;
    List<Article> articles;

    public String toStringFile() {
        StringBuilder sb = new StringBuilder();
        articles
            .forEach(article -> sb.append(article.toStringFile() + "\n"));
        return sb.toString();
    }
}
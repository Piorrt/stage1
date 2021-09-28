package com.example.course.javadevpro.stage1.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    Source source;
    String author;
    String title;
    String description;
    String url;
    String urlToImage;
    String content;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Article: ");
        sb.append("\n\t" + source.toString());
        sb.append("\n\tAuthor: " + author);
        sb.append("\n\tTitle: " + title);
        sb.append("\n\tDescription: " + description);
        sb.append("\n\tUrl: " + url);
        sb.append("\n\tUrlToImage: " + urlToImage);
        sb.append("\n\tContent: " + content);
        return sb.toString();
    }

    public String toStringFile(){
        return title + ":"+ description + ":" + author;

    }

}
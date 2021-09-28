package com.example.course.javadevpro.stage1;

import com.example.course.javadevpro.stage1.domain.ArticleFacade;
import com.example.course.javadevpro.stage1.domain.model.Articles;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Slf4j
@SpringBootApplication
public class Stage1Application {

    private static final String BASE_PACKAGE = "com.example.course.javadevpro";

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BASE_PACKAGE)) {
            var articleFacade = applicationContext.getBean(ArticleFacade.class);
            Articles articles = articleFacade.getArticles("pl", "business");
            articleFacade.saveArticles(articles, "articles");
        }
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
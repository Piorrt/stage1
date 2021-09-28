package com.example.course.javadevpro.stage1.external.http;

import com.example.course.javadevpro.stage1.domain.model.Articles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@AllArgsConstructor
public class NewsApiClient {

    private RestTemplate restTemplate;

    public Articles getArticles(String country, String category) {
        URI newsApiUri = UriComponentsBuilder.fromUriString("https://newsapi.org")
            .path("/v2/top-headlines")
            .queryParam("country", country)
            .queryParam("category", category)
            .queryParam("apiKey", "xxx")
            .build()
            .toUri();
        return restTemplate.getForObject(newsApiUri, Articles.class);
    }
}
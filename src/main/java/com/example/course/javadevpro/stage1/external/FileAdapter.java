package com.example.course.javadevpro.stage1.external;

import com.example.course.javadevpro.stage1.domain.file.FileProvider;
import com.example.course.javadevpro.stage1.domain.model.Articles;
import com.example.course.javadevpro.stage1.external.file.FileRecorder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
@AllArgsConstructor
public class FileAdapter implements FileProvider {

    private FileRecorder recorder;

    @Override
    public void saveArticles(Articles articles, String name) {
        try {
            recorder.saveArticles(articles, name);
        } catch (IOException e) {
            log.warn("Save file failed {}", e);
        }
    }

}
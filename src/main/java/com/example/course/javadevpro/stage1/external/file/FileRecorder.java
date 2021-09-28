package com.example.course.javadevpro.stage1.external.file;

import com.example.course.javadevpro.stage1.domain.model.Articles;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
@Component
public class FileRecorder {

    public void saveArticles(Articles articles, String name) throws IOException {
        String fileName = name + ".txt";
        File file = new File(fileName);
        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(articles.toStringFile());
        writer.close();
    }
}
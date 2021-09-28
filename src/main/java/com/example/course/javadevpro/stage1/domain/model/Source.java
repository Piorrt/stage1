package com.example.course.javadevpro.stage1.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Source {
    String id;
    String name;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Source: ");
        sb.append("\n\t\tId: " + id);
        sb.append("\n\t\tName: " + name);
        return sb.toString();
    }
}
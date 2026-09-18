package dev.skirtty.lab1.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryRequest {

    private Long id;
    private String name;
    private String slug;
    private String description;
    private Long sortOrder;
    private LocalDateTime createdAt;

}

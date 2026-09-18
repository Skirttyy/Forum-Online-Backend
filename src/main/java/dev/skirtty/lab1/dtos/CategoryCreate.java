package dev.skirtty.lab1.dtos;

import lombok.Data;

@Data
public class CategoryCreate {

    private String name;
    private String description;
    private String slug;
    private Long sortOrder;
}

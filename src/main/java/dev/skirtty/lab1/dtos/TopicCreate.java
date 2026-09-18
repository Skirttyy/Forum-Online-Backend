package dev.skirtty.lab1.dtos;

import lombok.Data;

@Data
public class TopicCreate {

    private Long categoryId;
    private Long userId;
    private String title;
    private boolean isPinned;
    private boolean isLocked;

}

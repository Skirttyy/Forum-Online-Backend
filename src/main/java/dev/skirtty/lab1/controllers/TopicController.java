package dev.skirtty.lab1.controllers;

import dev.skirtty.lab1.dtos.TopicCreate;
import dev.skirtty.lab1.services.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/topics")
@AllArgsConstructor
public class TopicController {

    private final TopicService topicService;

    @PostMapping("/create")
    public ResponseEntity<TopicCreate> create (@RequestBody TopicCreate topicCreate) {
        return ResponseEntity.ok(topicService.create(topicCreate));
    }
}

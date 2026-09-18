package dev.skirtty.lab1.services;

import dev.skirtty.lab1.dtos.TopicCreate;
import dev.skirtty.lab1.models.Topic;
import dev.skirtty.lab1.repositories.CategoryRepository;
import dev.skirtty.lab1.repositories.TopicRepository;
import dev.skirtty.lab1.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    public TopicCreate create(TopicCreate topicCreate) {

        Topic topic = new Topic();
        topic.setCategory(categoryRepository.findById(topicCreate.getCategoryId()).orElseThrow(() -> new RuntimeException("Category id not found!")));
        topic.setUser(userRepository.findById(topicCreate.getUserId()).orElseThrow(() -> new RuntimeException("User id not found!")));
        topic.setTitle(topicCreate.getTitle());
        topic.setPinned(topicCreate.isPinned());
        topic.setLocked(topicCreate.isLocked());

        topicRepository.save(topic);

        return topicCreate;
    }
}

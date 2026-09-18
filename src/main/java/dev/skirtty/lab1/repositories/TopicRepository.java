package dev.skirtty.lab1.repositories;

import dev.skirtty.lab1.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}

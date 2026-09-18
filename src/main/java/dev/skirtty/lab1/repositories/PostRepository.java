package dev.skirtty.lab1.repositories;

import dev.skirtty.lab1.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

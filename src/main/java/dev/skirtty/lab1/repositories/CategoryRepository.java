package dev.skirtty.lab1.repositories;

import dev.skirtty.lab1.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

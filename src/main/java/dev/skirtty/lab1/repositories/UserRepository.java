package dev.skirtty.lab1.repositories;

import dev.skirtty.lab1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

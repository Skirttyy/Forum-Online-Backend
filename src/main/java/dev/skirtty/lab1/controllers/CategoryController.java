package dev.skirtty.lab1.controllers;

import dev.skirtty.lab1.dtos.CategoryCreate;
import dev.skirtty.lab1.dtos.CategoryRequest;
import dev.skirtty.lab1.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/{id}")
    public ResponseEntity<CategoryRequest> get (@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.get(id));
    }

    @PostMapping("/create")
    public ResponseEntity<CategoryCreate> create (@RequestBody CategoryCreate categoryCreate) {
        return ResponseEntity.ok(categoryService.create(categoryCreate));
    }

}

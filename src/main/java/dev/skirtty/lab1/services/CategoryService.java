package dev.skirtty.lab1.services;

import dev.skirtty.lab1.dtos.CategoryCreate;
import dev.skirtty.lab1.dtos.CategoryRequest;
import dev.skirtty.lab1.models.Category;
import dev.skirtty.lab1.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryCreate create(CategoryCreate categoryCreate) {

        Category category = new Category();
        category.setName(categoryCreate.getName());
        category.setDescription(categoryCreate.getDescription());
        category.setSlug(categoryCreate.getSlug());
        category.setSort_order(categoryCreate.getSortOrder());

        categoryRepository.save(category);

        System.out.println(categoryCreate);
        System.out.println(category);

        return categoryCreate;
    }

    public CategoryRequest get(Long id) {

        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category not found!"));
        CategoryRequest categoryRequest = new CategoryRequest();

        categoryRequest.setId(category.getId());
        categoryRequest.setName(category.getName());
        categoryRequest.setSlug(category.getSlug());
        categoryRequest.setDescription(category.getDescription());
        categoryRequest.setSortOrder(category.getSort_order());
        categoryRequest.setCreatedAt(category.getCreatedAt());

        return categoryRequest;
    }
}

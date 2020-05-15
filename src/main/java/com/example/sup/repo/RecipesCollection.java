package com.example.sup.repo;

import com.example.sup.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RecipesCollection extends JpaRepository<Recipe, Long> {
    List<Recipe> findByAuthor(String author);
}
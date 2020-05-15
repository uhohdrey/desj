package com.example.sup.repo;

import com.example.sup.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipesCollection extends JpaRepository<Recipe, Long> {

}
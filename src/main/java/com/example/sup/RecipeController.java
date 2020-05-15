package com.example.sup;

import com.example.sup.exception.RecipeIdMismatchException;
import com.example.sup.exception.RecipeNotFoundException;
import com.example.sup.model.Recipe;
import com.example.sup.repo.RecipesCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private RecipesCollection repository;

    @RequestMapping("/recettes")
    public Iterable all() {
        return repository.findAll();
    }

    @RequestMapping("/recettes/{id}")
    public Recipe findOne(@PathVariable Long id) {
        Recipe recipe = repository.findById(id)
                .orElseThrow(RecipeNotFoundException::new);
        recipe.setVisits(recipe.getVisits() + 1);
        repository.save(recipe);

        return recipe;
    }

    @RequestMapping("/recettes/author/{author}")
    public List<Recipe> findByAuthor(@PathVariable String author) {
        return  repository.findByAuthor(author);
    }

    @PostMapping("/recettes")
    @ResponseStatus(HttpStatus.CREATED)
    public Recipe create(@RequestBody Recipe recipe) {
        return repository.save(recipe);
    }

    @DeleteMapping("/recettes/{id}")
    public void delete(@PathVariable Long id) {
        repository.findById(id)
                .orElseThrow(RecipeNotFoundException::new);
        repository.deleteById(id);
    }

    @PutMapping("/recettes/{id}")
    public Recipe updateBook(@RequestBody Recipe recipe, @PathVariable Long id) {
        if (recipe.getId() != id) {
            throw new RecipeIdMismatchException();
        }
        repository.findById(id)
                .orElseThrow(RecipeNotFoundException::new);
        return repository.save(recipe);
    }
}


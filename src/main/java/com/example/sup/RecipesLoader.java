package com.example.sup;

import com.example.sup.model.Recipe;
import com.example.sup.repo.RecipesCollection;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecipesLoader {
    @Bean
    CommandLineRunner initDatabase(RecipesCollection repository) {
        return args -> {
            System.out.println("Lets spice things up a bit!");
            System.out.println(repository.save(new Recipe("Pain aux bananes", "Mona", 4)));
            System.out.println(repository.save(new Recipe("Muffin aux bananes", "Lisa", 5)));
            System.out.println(repository.save(new Recipe("Ptits muffins aux benanes", "Smile", 3)));
        };
    }
}

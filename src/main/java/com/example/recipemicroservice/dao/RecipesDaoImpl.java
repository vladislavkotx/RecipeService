package com.example.recipemicroservice.dao;

import com.example.recipemicroservice.models.IncomingRequest;
import com.example.recipemicroservice.models.Recipe;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RecipesDaoImpl implements RecipesDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Recipe> getFilteredRecipesFromDatabase(IncomingRequest incomingRequest) {
        List<Recipe> list = entityManager
                .createQuery("from Recipe")
                .getResultList();
//                .createQuery("select * from Recipe where Recipe.time = ?1")
//                .setParameter(1, incomingRequest.getCookingTime())
        return list;
    }







    @EventListener(ContextRefreshedEvent.class)
    public void saveRecipes() {
        for (int i = 0; i < 10; i++) {
            Recipe recipe = Recipe.builder()
                    .name("Pancake" + i)
                    .build();
            this.saveRecipe(recipe);
        }
    }

    public void saveRecipe(Recipe recipe) {
        entityManager.persist(recipe);
    }
}

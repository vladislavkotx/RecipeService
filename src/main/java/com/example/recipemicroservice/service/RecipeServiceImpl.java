package com.example.recipemicroservice.service;

import com.example.recipemicroservice.dao.RecipesDao;
import com.example.recipemicroservice.models.IncomingRequest;
import com.example.recipemicroservice.models.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    RecipesDao recipesDao;

    @Autowired
    SortRecipesService sortRecipesService;

    @Override
    public List<Recipe> getSortedRecipeListWithFilters(IncomingRequest incomingRequest) {
        List<Recipe> filteredRecipesFromDatabase = recipesDao.getFilteredRecipesFromDatabase(incomingRequest);
        sortRecipesService.sort(filteredRecipesFromDatabase);
        return filteredRecipesFromDatabase;
    }
}

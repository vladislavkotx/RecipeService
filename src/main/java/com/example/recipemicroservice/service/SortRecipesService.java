package com.example.recipemicroservice.service;

import com.example.recipemicroservice.models.Recipe;

import java.util.List;

public interface SortRecipesService {
    void sort(List<Recipe> recipeList);
}

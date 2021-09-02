package com.example.recipemicroservice.service;

import com.example.recipemicroservice.models.IncomingRequest;
import com.example.recipemicroservice.models.Recipe;

import java.util.List;


public interface RecipeService {
    List<Recipe> getSortedRecipeListWithFilters(IncomingRequest incomingRequest);
}

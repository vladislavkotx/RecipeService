package com.example.recipemicroservice.dao;

import com.example.recipemicroservice.models.IncomingRequest;
import com.example.recipemicroservice.models.Recipe;

import java.util.List;

public interface RecipesDao {
    List<Recipe> getFilteredRecipesFromDatabase(IncomingRequest incomingRequest);
}

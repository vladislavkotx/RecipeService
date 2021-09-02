package com.example.recipemicroservice.controllers;

import com.example.recipemicroservice.models.IncomingRequest;
import com.example.recipemicroservice.models.Recipe;
import com.example.recipemicroservice.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/api/yo")
    public List<Recipe> hello(@RequestBody IncomingRequest incomingRequest) {
//    public List<Recipe> hello() {
        List<Recipe> recipeListWithFilters = recipeService.getSortedRecipeListWithFilters(incomingRequest);
        return recipeListWithFilters;
    }

    @GetMapping("/api/hi")
    public String hello2() {
        return "hi";
    }
}

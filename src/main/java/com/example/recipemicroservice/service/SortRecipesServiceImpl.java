package com.example.recipemicroservice.service;

import com.example.recipemicroservice.models.Recipe;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SortRecipesServiceImpl implements SortRecipesService {

    @Override
    public void sort(List<Recipe> recipeList) {

    }
}

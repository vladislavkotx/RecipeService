package com.example.recipemicroservice.models;

import com.example.recipemicroservice.enums.CookingTime;
import com.example.recipemicroservice.enums.Rating;
import com.example.recipemicroservice.enums.UsingFridge;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class IncomingRequest {
    CookingTime cookingTime;
    Rating rating;
    UsingFridge usingFridge;
    List<String> products;
}

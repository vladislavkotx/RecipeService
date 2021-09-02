package com.example.recipemicroservice.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
//@NamedQuery(name = "getAllpersons",query = "from person p where p.balance>:balance")
public class Recipe {

    @Id
    @GeneratedValue
    private int id;
    private int balance;
    private String name;

    public Recipe(String name) {
        this.name = name;
    }
}
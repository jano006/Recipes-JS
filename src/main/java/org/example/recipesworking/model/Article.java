package org.example.recipesworking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long articleId;

    private String name;
    private int amountInGram;
    private int caloriesPerGram;

    public int getCalories(int amountInGram) {
        return caloriesPerGram * amountInGram;
    }

    public Article(String name, int amountInGram, int caloriesPerGram) {
        this.name = name;
        this.amountInGram = amountInGram;
        this.caloriesPerGram = caloriesPerGram;
    }
}

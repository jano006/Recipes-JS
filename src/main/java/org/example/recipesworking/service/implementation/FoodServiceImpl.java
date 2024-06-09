package org.example.recipesworking.service.implementation;

import lombok.RequiredArgsConstructor;
import org.example.recipesworking.model.Article;
import org.example.recipesworking.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService{

    private final ArticleRepository articleRepository;

    @Override
    public Integer caloriesFromMeal(HashMap<Long,Integer> meal){
        Integer calories = 0;

      for (var m : meal.entrySet()) {
          Long articleId = m.getKey();
          Integer grams = m.getValue();

          calories += getCaloriesFromArticle(articleId,grams);
      }
        return calories;

    }

    private Integer getCaloriesFromArticle(Long articleId, Integer grams){
        Article article = articleRepository.getReferenceById(articleId);

        return article.getCalories(grams);
    }
}

package org.example.recipesworking.service.implementation;

import org.example.recipesworking.model.Article;
import org.example.recipesworking.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImp implements ArticleService {
    @Override
    public List<Article> findAllByBasketId(Long baskedId) {
        return List.of();
    }
}

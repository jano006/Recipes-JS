package org.example.recipesworking.service;

import org.example.recipesworking.model.Article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {
    List<Article> findAllByBasketId(Long baskedId);
}

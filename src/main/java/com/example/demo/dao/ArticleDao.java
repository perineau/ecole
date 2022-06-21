package com.example.demo.dao;

import com.example.demo.model.Article;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDao {

    private String titre;
    private String description;
    private String core;

    public static ArticleDao fromArticle(Article article){
        var articleDao = new ArticleDao();
        return articleDao.core(article.getCore()).description(article.getDescription()).core(article.getCore());
    }
}

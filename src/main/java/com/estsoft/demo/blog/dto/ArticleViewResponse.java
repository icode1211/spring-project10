package com.estsoft.demo.blog.dto;

import com.estsoft.demo.blog.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ArticleViewResponse {
    private Long id;
    private String title;
    private String content;

    public ArticleViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}

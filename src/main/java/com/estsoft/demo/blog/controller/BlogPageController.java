package com.estsoft.demo.blog.controller;

import com.estsoft.demo.blog.dto.ArticleViewResponse;
import com.estsoft.demo.blog.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BlogPageController {

    private final BlogService blogService;

    public BlogPageController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/articles")
    public String getArticles(Model model) {
        List<ArticleViewResponse> articleList = blogService.findArticles()
                .stream().map(ArticleViewResponse::new)
                .toList();

        model.addAttribute("articles", articleList);
        return "articleList";   // html 페이지
    }
}

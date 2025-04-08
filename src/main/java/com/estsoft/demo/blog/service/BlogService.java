package com.estsoft.demo.blog.service;

import com.estsoft.demo.blog.Article;
import com.estsoft.demo.blog.dto.AddArticleRequest;
import com.estsoft.demo.blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Article saveArticle(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findArticles() {
        return blogRepository.findAll();
    }

    public Article findArticle(Long id) {
        return blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not exists id: " + id));
    }

    public void deleteArticle(Long id) {
        blogRepository.deleteById(id);   // delete from article where id = ${id}
    }
}

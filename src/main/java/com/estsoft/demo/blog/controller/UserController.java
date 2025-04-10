package com.estsoft.demo.blog.controller;

import com.estsoft.demo.blog.dto.AddUserRequest;
import com.estsoft.demo.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public String signup(@ModelAttribute AddUserRequest request) {
        userService.signup(request);  // 사용자 정보 저장
        return "redirect:login";     // /login 화면으로 redirection
    }
}

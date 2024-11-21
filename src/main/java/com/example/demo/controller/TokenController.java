package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest http) {
        return (CsrfToken) http.getAttribute("_csrf");
    }

}

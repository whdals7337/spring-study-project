package com.spring.study.project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class I18nController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
package com.spring.study.project.controller;

import com.spring.study.project.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("")
    public String hello() {
        helloService.sayHello();
        helloService.sayBye();
        return "hello";
    }
}

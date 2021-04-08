package com.spring.study.project.service;

import com.spring.study.project.annotation.LogAopByAnnotation;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void sayHello() {
        System.out.println("hello");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogAopByAnnotation
    public void sayBye() {
        System.out.println("bye");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

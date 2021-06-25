package com.spring.study.project.web.api;

import com.spring.study.project.web.dto.BookRequest;
import com.spring.study.project.web.dto.BookResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BookController {

    @PostMapping("/book")
    public BookResponse save(@RequestBody @Valid BookRequest bookRequest) {
        return new BookResponse(1L, bookRequest.getName(), bookRequest.getPrice());
    }
}

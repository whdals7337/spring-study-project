package com.spring.study.project.exception;

public class TestException extends RuntimeException{
    private static final String MESSAGE = "테스트 예외입니다.";

    public TestException() {
        super(MESSAGE);
    }
}

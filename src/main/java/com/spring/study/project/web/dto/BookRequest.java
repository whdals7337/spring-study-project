package com.spring.study.project.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequest {

    @NotBlank(message = "책이름을 입력해주세요.")
    private String name;

    @NotNull(message = "책 가격을 입력해주세요.")
    private Integer price;
}

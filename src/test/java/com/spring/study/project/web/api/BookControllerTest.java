package com.spring.study.project.web.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.study.project.web.dto.BookRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void bookTest() throws Exception {
        String url = "http://localhost:" + port + "/book";
        String book = objectMapper.writeValueAsString(new BookRequest("데일", 10000));

        mockMvc.perform(post(url)
                .content(book)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id").value(1L))
                .andExpect(jsonPath("name").value("데일"))
                .andExpect(jsonPath("price").value(10000));
    }

    @Test
    void bookValidTest() throws Exception {
        String url = "http://localhost:" + port + "/book";
        String book = objectMapper.writeValueAsString(new BookRequest("", null));

        mockMvc.perform(post(url)
                .content(book)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }
}
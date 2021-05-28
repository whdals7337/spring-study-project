package com.spring.study.project.service;

import com.spring.study.project.domain.entity.test.TestObject;
import com.spring.study.project.repository.TestObjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestObjectServiceTest {

    @Autowired
    TestObjectService testObjectService;

    @Autowired
    TestObjectRepository testObjectRepository;

    @Test
    public void transactionTest() throws Exception {
        TestObject testObject = new TestObject("자식");
        testObjectService.transactionTest(testObject);

        List<TestObject> all = testObjectRepository.findAll();

        System.out.println(all.size());
        for (TestObject object : all) {
            System.out.println(object);
        }
    }
}
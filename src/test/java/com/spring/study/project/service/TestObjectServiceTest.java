package com.spring.study.project.service;

import com.spring.study.project.domain.entity.test.TestObject;
import com.spring.study.project.exception.TestException;
import com.spring.study.project.repository.TestObjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void TestExceptionTest() {
        TestException thrown = assertThrows(TestException.class, () -> testObjectService.throwException(1));
        assertEquals("테스트 예외입니다.", thrown.getMessage());
    }
}
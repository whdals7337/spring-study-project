package com.spring.study.project.service;

import com.spring.study.project.domain.entity.test.TestObject;
import com.spring.study.project.exception.TestException;
import com.spring.study.project.repository.TestObjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TestObjectService {

    private final TransactionService transactionService;

    private final TestObjectRepository testObjectRepository;

    public void transactionTest(TestObject testObject) {
        //log.info("currentTransactionName : {}",
            //TransactionSynchronizationManager.getCurrentTransactionName());
        //testObjectRepository.save(new TestObject("부모"));
        transactionService.service(testObject);
    }

    public void throwException(int call) {
        if(call == 1) {
            throw new TestException();
        }
    }
}

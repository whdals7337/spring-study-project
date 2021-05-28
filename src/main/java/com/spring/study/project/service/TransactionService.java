package com.spring.study.project.service;

import com.spring.study.project.domain.entity.test.TestObject;
import com.spring.study.project.repository.TestObjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
@Slf4j
@RequiredArgsConstructor
public class TransactionService {

    private final TestObjectRepository testObjectRepository;

    @Transactional(propagation = Propagation.SUPPORTS)
    public void service(TestObject testObject) {
        log.info("currentTransactionName : {}",
                TransactionSynchronizationManager.getCurrentTransactionName());
        testObjectRepository.save(testObject);
    }
}

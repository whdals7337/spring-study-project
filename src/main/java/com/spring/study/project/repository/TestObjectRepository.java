package com.spring.study.project.repository;

import com.spring.study.project.domain.entity.test.TestObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestObjectRepository extends JpaRepository<TestObject, Long> {
}

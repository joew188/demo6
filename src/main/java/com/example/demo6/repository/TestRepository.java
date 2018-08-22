package com.example.demo6.repository;
import com.example.demo6.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestModel, Long> {
    TestModel findByName(String name);
}

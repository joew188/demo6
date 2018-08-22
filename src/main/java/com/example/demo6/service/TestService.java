package com.example.demo6.service;

import com.example.demo6.model.TestModel;
import com.example.demo6.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
@Service
public class TestService {
    private final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Transactional
    public TestModel findByName(String name){
        return testRepository.findByName(name);
    }
}

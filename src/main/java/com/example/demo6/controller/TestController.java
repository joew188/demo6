package com.example.demo6.controller;

import com.example.demo6.model.TestModel;
import com.example.demo6.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/")
    String hello() {
        return "Hello Sprint Boot!";
    }
    @CrossOrigin
    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    @ResponseBody
    public TestModel getTest(@PathVariable("id") Long id) {
        return testService.findByName("IT");
    }
}

package com.vidhan.test_snake.service;

import com.vidhan.test_snake.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestConfig testConfig;

    public void printConfigs() {
        System.out.println(testConfig.getFirstValue());
        System.out.println(testConfig.getSecondValue());
        System.out.println(testConfig.getDefaultEncoding());
    }
}

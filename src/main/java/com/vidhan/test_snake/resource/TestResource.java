package com.vidhan.test_snake.resource;

import com.vidhan.test_snake.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestResource {

    @Autowired
    private TestService testService;
    @GetMapping(value = "/hello")
    public  String helloWorld() {
        testService.printConfigs();
        return "Hello Snake Yaml Test";
    }
}

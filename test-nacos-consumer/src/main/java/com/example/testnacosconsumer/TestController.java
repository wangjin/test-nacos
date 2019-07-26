package com.example.testnacosconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jin.Wang
 * @version 1.0
 * @date 2019-07-26 16:49
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/test")
    public String test() {
        return testService.test();
    }
}

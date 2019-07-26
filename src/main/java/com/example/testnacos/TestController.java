package com.example.testnacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jin.Wang
 * @version 1.0
 * @date 2019-07-21 11:07
 */
@RestController
@RefreshScope
public class TestController {


    @Value(value = "${teststr:default}")
    private String testStr;

    @GetMapping(value = "/test")
    public String test() {
        return testStr;
    }
}

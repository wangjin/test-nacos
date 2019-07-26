package com.example.testnacosconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jin.Wang
 * @version 1.0
 * @date 2019-07-26 16:47
 */
@FeignClient("test-nacos-service")
public interface TestService {

    @GetMapping(value = "/test")
    String test();
}

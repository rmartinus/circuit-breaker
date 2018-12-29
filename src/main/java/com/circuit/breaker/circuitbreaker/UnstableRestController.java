package com.circuit.breaker.circuitbreaker;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnstableRestController {

    public UnstableRestController() {
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public ResponseEntity<String> hello() {
        if (RandomUtils.nextInt(100) > 50) {
            throw new RuntimeException("bad request");
        }
        return ResponseEntity.ok("world!");
    }

    public ResponseEntity<String> fallback() {
        return ResponseEntity.ok("fallback!");
    }
}

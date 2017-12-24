package com.fengymi.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hzfym
 * 2017-10-18 09:22
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/name")
    public String name(@RequestParam(value = "name") String name){
        return "hello " + name + ", now port:" + port;
    }

}

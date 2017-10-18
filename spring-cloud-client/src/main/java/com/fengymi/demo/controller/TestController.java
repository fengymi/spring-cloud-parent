package com.fengymi.demo.controller;

import com.fengymi.demo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hzfym
 * 2017-10-16 10:47
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public String test(String key){
        return testService.hello(key);
    }
}

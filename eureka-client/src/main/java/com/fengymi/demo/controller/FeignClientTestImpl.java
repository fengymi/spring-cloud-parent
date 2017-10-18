package com.fengymi.demo.controller;

import org.springframework.stereotype.Component;

/**
 * @author hzfym
 * 2017-10-18 14:08
 *
 * 断路器实现
 */
@Component
public class FeignClientTestImpl implements FeignClientTest {
    @Override
    public String hello(String name) {
        return "sorry "+name;
    }
}

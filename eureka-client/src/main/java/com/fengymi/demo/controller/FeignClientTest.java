package com.fengymi.demo.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hzfym
 * 2017-10-18 10:38
 */
@FeignClient(name = "eureka")
public interface FeignClientTest {

    /**
     * 测试
     * @param name 输入的名称
     * @return 测试
     */
    @RequestMapping(value = "/test/name")
    String hello(@RequestParam(value = "name") String name);
}

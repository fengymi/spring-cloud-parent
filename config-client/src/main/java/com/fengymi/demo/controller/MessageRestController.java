package com.fengymi.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hzfym
 * 2017-10-17 10:42
 */
@RefreshScope
@RestController
public class MessageRestController {

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return this.message;
    }
}

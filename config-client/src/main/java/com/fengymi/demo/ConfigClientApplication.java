package com.fengymi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author hzfym
 * 2017-10-16 10:44
 */
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
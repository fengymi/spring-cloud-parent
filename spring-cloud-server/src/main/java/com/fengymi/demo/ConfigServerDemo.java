package com.fengymi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author hzfym
 * 2017-10-16 11:51
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerDemo {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerDemo.class,args);
    }
}

package com.fengymi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hzfym
 * 2017-10-17 12:05
 */
@RestController
public class ServiceInstanceRestController {

    @Value("${spring.application.name}")
    private String applicationName;

    private final FeignClientTest feignClientTest;
    private final DiscoveryClient discoveryClient;

    @Autowired
    public ServiceInstanceRestController(FeignClientTest feignClientTest, DiscoveryClient discoveryClient) {
        this.feignClientTest = feignClientTest;
        this.discoveryClient = discoveryClient;
    }


    @GetMapping(value = "/test/name")
    public String hello(@RequestParam(value = "name") String name){
        return feignClientTest.hello(name);
    }

    @GetMapping(value = "/client{number}")
    public String client(@PathVariable(value = "number") String number){
        System.out.println("client : " + number);
        return applicationName;
    }

    @GetMapping(value = "/{everything}")
    public String everything(@PathVariable(value = "everything") String everything){
        System.out.println(applicationName + ":" + everything);
        return applicationName;
    }

    @GetMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        System.out.println("start");

        List<ServiceInstance> serviceInstances = this.discoveryClient.getInstances(applicationName);

        System.out.println("end");
        return serviceInstances;
    }
}

package com.fengymi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hzfym
 * 2017-10-17 12:05
 */
@RestController
public class ServiceInstanceRestController {

    private final DiscoveryClient discoveryClient;

    @Autowired
    public ServiceInstanceRestController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        System.out.println("start");

        List<ServiceInstance> serviceInstances = this.discoveryClient.getInstances(applicationName);

        System.out.println("end");
        return serviceInstances;
    }
}
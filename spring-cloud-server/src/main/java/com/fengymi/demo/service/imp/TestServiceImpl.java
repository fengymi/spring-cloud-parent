package com.fengymi.demo.service.imp;

import com.fengymi.demo.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author hzfym
 * 2017-10-17 15:36
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String hello(String key) {
        System.out.println(key);
        return key + System.currentTimeMillis();
    }
}

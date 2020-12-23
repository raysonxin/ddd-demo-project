package com.example.demo.dubbo.provider;

import com.example.demo.api.HelloServiceI;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class HelloServiceImpl implements HelloServiceI {
    @Override
    public String sayHello(String name) {
        return null;
    }
}

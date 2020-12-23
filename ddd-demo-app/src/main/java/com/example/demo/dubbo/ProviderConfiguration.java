package com.example.demo.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.example.demo.dubbo.provider")
@PropertySource("classpath:/dubbo-provider.properties")
public class ProviderConfiguration {
}

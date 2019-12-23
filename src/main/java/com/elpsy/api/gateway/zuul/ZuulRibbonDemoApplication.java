package com.elpsy.api.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulRibbonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulRibbonDemoApplication.class, args);
    }

}

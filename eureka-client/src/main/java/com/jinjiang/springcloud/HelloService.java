package com.jinjiang.springcloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Laoer on 16/8/8.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    private final static String SERVICE_URL = "http://hello-service/hello/";

    @HystrixCommand(fallbackMethod = "fallbackHello")
    public String execHello(String name) {
        return restTemplate.getForObject(SERVICE_URL + name, String.class);
    }

    private String fallbackHello(String name) {
        return "EXEC Hello ERROR" + name;
    }
}

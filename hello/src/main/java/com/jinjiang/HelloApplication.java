package com.jinjiang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
@SpringBootApplication
@EnableDiscoveryClient
public class HelloApplication {

    private static final Logger logger = LoggerFactory.getLogger(HelloApplication.class);

//    @Bean
//    AlwaysSampler alwaysSampler() {
//        return new AlwaysSampler();
//    }


//    @ResponseBody
//    @RequestMapping(value = "/hello/{name}")
//    public String hello(@PathVariable(value = "name") String name) {
//        logger.info("Message log:" + name);
//        return "Hello " + message + name;
//    }

//    @ResponseBody
//    @RequestMapping(value = "/msg/{msg}")
//    public String message(@PathVariable(value = "msg") String msg) {
//        HelloMsg helloMsg = new HelloMsg("Tim", msg);
//        msgSource.sendMessage(helloMsg);
//        return "Msg sent";
//    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}

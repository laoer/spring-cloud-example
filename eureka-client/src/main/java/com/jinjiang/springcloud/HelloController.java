package com.jinjiang.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Laoer on 16/8/8.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/say/{name}")
    public String sayHello(@PathVariable(value = "name") String name) {
        return helloService.execHello(name);
    }

}

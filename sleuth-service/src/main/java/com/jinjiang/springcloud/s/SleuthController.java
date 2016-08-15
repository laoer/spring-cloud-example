package com.jinjiang.springcloud.s;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Laoer on 16/8/15.
 */
@RestController
public class SleuthController {

    @RequestMapping(value = "/track/{name}")
    public String trackHello(@PathVariable(value = "name") String name) {
        return "Hello : " + name;
    }

}

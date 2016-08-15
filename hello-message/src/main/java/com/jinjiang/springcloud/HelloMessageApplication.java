package com.jinjiang.springcloud;

import com.jinjiang.HelloMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableDiscoveryClient
@Controller
public class HelloMessageApplication {

    @Autowired
    MsgSource msgSource;

	public static void main(String[] args) {
		SpringApplication.run(HelloMessageApplication.class, args);
	}

    @ResponseBody
    @RequestMapping(value = "/msg/{msg}")
    public String message(@PathVariable(value = "msg") String msg) {
        HelloMsg helloMsg = new HelloMsg("Tim", msg);
        msgSource.sendMessage(helloMsg);
        return "Msg sent";
    }
}

package com.jinjiang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Laoer on 16/8/19.
 */
@Controller
public class HelloController {

    //    @Autowired
//    MsgSource msgSource;

    @Value("${message}")
    String message;

    @ResponseBody
    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return "Hello " + message + name;
    }

    @ResponseBody
    @RequestMapping(value = "/msg/{msg}")
    public String message(@PathVariable(value = "msg") String msg) {
//        HelloMsg helloMsg = new HelloMsg("Tim", msg);
//        msgSource.sendMessage(helloMsg);
        return "Msg sent";
    }

    @ResponseBody
    @RequestMapping(value = "/pass")
    public String password() {
        boolean result = BCrypt.checkpw("zhouhuan", "$2a$10$4adATFb9HJFsy4NjHw614e/fCJSmpSV0DTnUNlgHbeuZZPbdu/dfG");
        String password = BCrypt.hashpw("zhouhuan", BCrypt.gensalt());
        System.out.println(password);
        return String.valueOf(result);
    }


}

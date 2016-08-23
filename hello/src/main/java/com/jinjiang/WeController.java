package com.jinjiang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Laoer on 16/8/23.
 */

@Controller
public class WeController {

    @ResponseBody
    @RequestMapping(value = "/sess", method = RequestMethod.GET)
    public String we(HttpSession session) {
        String name = (String) session.getAttribute("name");
        Long time = (Long) session.getAttribute("time");
        return name + " " + time;
    }

}

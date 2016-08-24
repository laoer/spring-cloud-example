package com.jinjiang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Laoer on 16/8/23.
 */

@Controller
public class WeController extends BaseController {

    @ResponseBody
    @RequestMapping(value = "/sess", method = RequestMethod.GET)
    public String we(HttpServletRequest request) {
        String name = (String) this.getSessionAttribute(request, "name");
        Long time = (Long) this.getSessionAttribute(request, "time");
        return name + " " + time;
    }

}

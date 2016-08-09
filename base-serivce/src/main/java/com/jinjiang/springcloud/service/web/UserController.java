package com.jinjiang.springcloud.service.web;

import com.jinjiang.springcloud.service.domain.User;
import com.jinjiang.springcloud.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Laoer on 16/8/8.
 */
//@Controller
@RestController
@RequestMapping(value = "/service/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    //@ResponseBody
    @RequestMapping("/{userId}")
    public User get(@PathVariable("userId") Long userID) {
        return userRepository.findUserById(userID);
    }

    @RequestMapping("/all")
    public List<User> queryUsers() {
        return userRepository.queryUsers();
    }

}

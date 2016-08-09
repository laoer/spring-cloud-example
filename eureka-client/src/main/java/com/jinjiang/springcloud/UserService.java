package com.jinjiang.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Laoer on 16/8/9.
 */
@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    private final static String SERVICE_URL = "http://base-service/service/user/";

    public UserDto findUserById(Long id) {
        UserDto u = restTemplate.getForObject(SERVICE_URL + id.toString(), UserDto.class);
        System.out.println(u);
        return u;
    }

}

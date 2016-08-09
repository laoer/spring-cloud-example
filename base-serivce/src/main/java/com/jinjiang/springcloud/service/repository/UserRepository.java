package com.jinjiang.springcloud.service.repository;

import com.jinjiang.springcloud.service.domain.User;
import com.jinjiang.springcloud.service.mapper.UserMapper;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Laoer on 16/8/8.
 */
@Repository
public class UserRepository {

    @Autowired
    UserMapper userMapper;

    public User findUserById(Long id) {
        return userMapper.findById(id);
    }

    public List<User> queryUsers() {
        return userMapper.queryUsers();
    }

}

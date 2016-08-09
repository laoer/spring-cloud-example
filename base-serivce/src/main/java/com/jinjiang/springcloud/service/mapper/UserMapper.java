package com.jinjiang.springcloud.service.mapper;

import com.jinjiang.springcloud.service.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Laoer on 16/8/8.
 */
@Mapper
public interface UserMapper {

    public User findById(Long id);

    public List<User> queryUsers();

}

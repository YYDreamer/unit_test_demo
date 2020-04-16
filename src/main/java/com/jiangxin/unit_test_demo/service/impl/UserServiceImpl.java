package com.jiangxin.unit_test_demo.service.impl;

import com.jiangxin.unit_test_demo.entity.User;
import com.jiangxin.unit_test_demo.mapper.UserMapper;
import com.jiangxin.unit_test_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangxinJava
 * @date 2020/4/15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(int id){
        return userMapper.getUser(id);
    }

    @Override
    public void addUser(User user){
        userMapper.addUser(user);
    }

    @Override
    public void deleteUser(int id){
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

}

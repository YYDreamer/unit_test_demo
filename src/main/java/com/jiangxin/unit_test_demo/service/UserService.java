package com.jiangxin.unit_test_demo.service;

import com.jiangxin.unit_test_demo.entity.User;

/**
 * @author jiangxinJava
 * @date 2020/4/16
 */
public interface UserService {
    User getUser(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);
}

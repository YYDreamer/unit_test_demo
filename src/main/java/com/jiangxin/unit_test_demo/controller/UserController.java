package com.jiangxin.unit_test_demo.controller;

import com.jiangxin.unit_test_demo.entity.User;
import com.jiangxin.unit_test_demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangxinJava
 * @date 2020/4/15
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("get/{id}")
    public String getUser(@PathVariable int id) {
        return userServiceImpl.getUser(id).toString();
    }

    @RequestMapping("add")
    public void addUser(@RequestBody User user) {
       userServiceImpl.addUser(user);
    }

    @RequestMapping("delete/{id}")
    public void deleteUser(@PathVariable int id) {
        userServiceImpl.deleteUser(id);
    }

    @RequestMapping("update")
    public void updateUser(@RequestBody User user) {
        userServiceImpl.updateUser(user);
    }
}

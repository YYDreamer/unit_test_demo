package com.jiangxin.unit_test_demo.mapper;

import com.jiangxin.unit_test_demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author jiangxinJava
 * @date 2020/4/15
 */
@Repository
public interface UserMapper {

    User getUser(@Param("id") int id);

    void addUser(User user);

    void deleteUser(@Param("id") int id);

    void updateUser(User user);

}

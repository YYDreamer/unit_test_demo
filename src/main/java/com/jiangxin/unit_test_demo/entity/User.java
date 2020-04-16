package com.jiangxin.unit_test_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jiangxinJava
 * @date 2020/4/15
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String realName;
}

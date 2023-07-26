package com.itcast.mapper;

import com.itcast.pojo.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: name
 * @Date: 2023/07/25/3:15 PM
 * @Description:
 */
public interface UserMapper {

    List<User> selectAll();

}

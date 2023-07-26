package com.itcast.pojo;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: name
 * @Date: 2023/07/25/2:35 PM
 * @Description:
 */

@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String addr;
}

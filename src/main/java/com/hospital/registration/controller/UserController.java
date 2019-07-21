package com.hospital.registration.controller;

import com.hospital.registration.entities.User;
import com.hospital.registration.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: registration
 * @description: UserController
 * @author: Lucas
 * @create: 2019/06/25 15:40
 */
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/queryUser")
    public List<User> queryUsers(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}

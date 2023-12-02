package com.example.myproject.service.impl;

import com.example.myproject.mapper.UserMapper;
import com.example.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public int getUserAccount(String mailbox){
        return userMapper.GetUserAccount(mailbox);
    }
    public String getUserPassword(String mailbox){
        return userMapper.GetUserPassword(mailbox);
    }
    public int insertUser(String mailbox,String password){
        int flag = userMapper.GetUserAccount(mailbox);
        if (flag == 0) {
            return userMapper.InsertUser(mailbox, password);
        }
        else {
            return 0;
        }
    }
}

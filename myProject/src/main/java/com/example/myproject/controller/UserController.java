package com.example.myproject.controller;

import com.example.myproject.pojo.Result;
import com.example.myproject.pojo.User;
import com.example.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Result GetUserAccount(String mailbox){
        System.out.println("查询指定邮箱的账户");
        int account = userService.getUserAccount(mailbox);
        if(account == 1)
        return Result.success(1);
        else{
            return Result.error("用户不存在");
        }
    }

    @GetMapping("/password")
    public Result GetUserPassword(String mailbox,String password){
        System.out.println("查询指定邮箱对应密码");
        String TruePassword = userService.getUserPassword(mailbox);
        if (TruePassword.equals(password)){
            return Result.success(true);
        } else {
            return Result.success(false);
        }
    }

    @PostMapping("/addUser")
    //JSON接收参数
    public Result InsertUser(@RequestBody User user){
        System.out.println("插入指定用户");
        String mailbox = user.getMailbox();
        String password = user.getPassword();
        int flag = userService.insertUser(mailbox, password);
        if (flag == 1){
            return Result.success(1);
        }
        else {
            return Result.error("用户已存在。");
        }
    }
}

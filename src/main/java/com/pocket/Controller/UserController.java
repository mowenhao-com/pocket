package com.pocket.Controller;


import com.pocket.Data.UserData;
import com.pocket.Service.UserService;
import com.pocket.Utile.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    //使用账号密码登录
    @GetMapping("/loginAndUserName")
    R loginAndUserName(String userName , String password){

        if (userName.isEmpty() || password.isEmpty()){
            return R.error(400,"账号密码不能为空！");
        }

        UserData userData = userService.loginAndUserName(userName,password);
        if (userData!=null){
            return R.data(userData);
        }

        return R.error(400,"账号或密码错误！");
    }
}

package com.pocket.Controller;


import com.pocket.Data.UserData;
import com.pocket.Service.UserService;
import com.pocket.Utile.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    private static int index=50;

    @Resource
    private UserService userService;
    @ResponseBody
    @PostMapping("/loginAndUserName")
    R loginAndUserName(UserData userData){
        System.out.println(userData.getUserName()+"========"+userData.getPassword());
        System.out.println("-----------");
        if (userService.loginAndUserName(userData)!=null){
            System.out.println("登陆成功");
        }
        return R.data(userService.loginAndUserName(userData));


    }

    @ResponseBody
    @PostMapping("/test")
    void test(){
        index--;
        System.out.println(index--);
    }

}

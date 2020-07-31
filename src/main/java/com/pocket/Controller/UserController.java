package com.pocket.Controller;


import com.pocket.Data.UserData;
import com.pocket.Service.UserService;
import com.pocket.Utile.Base64Encrypt;
import com.pocket.Utile.R;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Enumeration;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    //使用账号密码登录
    @GetMapping("/loginAndUserName")
    R loginAndUserName(String userName , String password, HttpSession session){
        password =  Base64Encrypt.encode(password.getBytes());//加密
        //String str2=new String(base64.decode(str1));
        //        System.out.println("str2:"+str2); 解密

        if (userName.isEmpty() || password.isEmpty()){
            return R.error(400,"账号密码不能为空！");
        }

        UserData userData = userService.loginAndUserName(userName,password);

      if (userData!=null){
          session.setAttribute("user",userData);
            return R.data(userData);
        }

        return R.error(400,"账号或密码错误！");
    }

    @GetMapping("/logout")
    R logout(HttpSession session){
        session.invalidate();
        return R.ok("退出成功");
    }

    @GetMapping("/input")
    R input(HttpSession session){
        String name;
        UserData userData = (UserData) session.getAttribute("user");
        if (userData == null ){
            name = "空";
        }else {
            name = userData.getName();
        }

        return R.data(name+"访问资源");
    }
}

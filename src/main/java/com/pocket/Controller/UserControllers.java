package com.pocket.Controller;


import com.pocket.Data.UserData;
import com.pocket.Service.UserService;
import com.pocket.Utile.Base64Encrypt;
import com.pocket.Utile.R;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/andy")
public class UserControllers {

    @Resource
    private UserService userService;


    //使用账号密码登录
    @PostMapping("/jio")
    R loginAndUserName(String userName, String Psaaword){


        return R.data("manager");
    }
    @PostMapping("/login")
    R login(String userName, String password ,HttpSession session){
        System.out.println("fafafaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

       // password =  Base64Encrypt.encode(password.getBytes());//加密
        //String str2=new String(base64.decode(str1));
        //        System.out.println("str2:"+str2); 解密

        if (userName.isEmpty() || password.isEmpty()){
            return R.error(400,"账号密码不能为空！");
        }

        UserData userData = userService.loginAndUserName(userName,password);

        if (userData!=null){
            UserDetails userDetails = User.withUsername("22253431155").password("123456").authorities("p1").build();
            session.setAttribute("user",userDetails);
            return R.data(userDetails);
        }

        return R.error(400,"账号或密码错误！");

    }


}


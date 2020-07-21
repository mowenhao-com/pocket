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

    @GetMapping("/index")
    String index(){
        return "index";
    }
    @ResponseBody
    @GetMapping("/index1")
    String index1(){
        return "index";
    }
}

package com.pocket.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class view {
    @RequestMapping("/login")
    String login(){
        return "login";
    }
}

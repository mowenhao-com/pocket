package com.pocket.Utile;

import com.pocket.Data.UserData;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //定义用户信息服务
//    public UserData userData(){
//
//
//        return userData();
//    }

    //密码编码器
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    //安全拦截机制
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests()
                .antMatchers("/user/**").authenticated()//拦截的请求
                .anyRequest().permitAll();//除了拦截的请求其他的通过
            //    .and().formLogin()//允许表单登录
            // .successForwardUrl("");//自定义登陆成功的页面地址
    }
}

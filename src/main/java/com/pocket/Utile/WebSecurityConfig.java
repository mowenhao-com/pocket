package com.pocket.Utile;

import com.pocket.Data.UserData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //定义用户信息服务
//    @Bean
//    public UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("22253431155").password("123456").authorities("p1").build());
//        manager.createUser(User.withUsername("22253431153").password("123456").authorities("p2").build());
//        return manager;
//    }

    //密码编码器
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    //安全拦截机制
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.csrf().disable()//屏蔽CSRF控制   跨域
                .authorizeRequests()

                .antMatchers("/user/logout").hasAuthority("p1")
                .antMatchers("/user/input").hasAuthority("p2")
                .antMatchers("/user/**").authenticated()//拦截的请求

                .anyRequest().permitAll()//除了拦截的请求其他的通过
                .and().
                formLogin()//允许表单登录
                .loginPage("/view/login")//自定义登录页面
                 //.loginProcessingUrl("/andy/login")//登录方法  controller
                .successForwardUrl("/andy/jio");//自定义登陆成功的页面地址
    }
}

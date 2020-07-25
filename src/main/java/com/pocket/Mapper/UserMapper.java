package com.pocket.Mapper;

import com.pocket.Data.UserData;

import com.pocket.Utile.R;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
    //添加token
    int addToken(@Param("userData") UserData userData);
    //使用账号密码登录
    UserData loginAndUserName(@Param("userName") String userName,@Param("password") String password);

}

package com.pocket.Service;

import com.pocket.Bize.UserBiz;
import com.pocket.Data.UserData;
import com.pocket.Mapper.UserMapper;
import com.pocket.Utile.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService implements UserBiz {

    @Resource
    private UserMapper userMapper;
    @Override
    public UserData loginAndUserName(UserData userData) {
        return userMapper.loginAndUserName(userData);
    }

    @Override
    public int addToken(UserData userData) {
        return userMapper.addToken(userData);
    }
}

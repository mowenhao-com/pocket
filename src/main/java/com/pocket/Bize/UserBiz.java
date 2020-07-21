package com.pocket.Bize;

import com.pocket.Data.UserData;
import com.pocket.Utile.R;
import org.apache.ibatis.annotations.Param;

public interface UserBiz {
    UserData loginAndUserName(UserData userData);
    int addToken( UserData userData);
}

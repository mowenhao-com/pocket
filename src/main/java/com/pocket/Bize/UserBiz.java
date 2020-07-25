package com.pocket.Bize;

import com.pocket.Data.UserData;
import com.pocket.Utile.R;
import org.apache.ibatis.annotations.Param;

public interface UserBiz {
    int addToken( UserData userData);
    UserData loginAndUserName(String userName, String password);

}

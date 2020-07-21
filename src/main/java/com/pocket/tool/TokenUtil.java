package com.pocket.tool;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.pocket.Data.UserData;

import java.util.Date;

public class TokenUtil {
    private static final long EXPIRE_TIME= 15*60*1000;
    private static final String TOKEN_SECRET="token123";  //密钥盐
    /**
     * 签名生成
     * @param user
     * @return
     */
    public static String sign(UserData user){

        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("username", user.getUserName())
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法。
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (Exception e){
            e.printStackTrace();
        }
        return token;
//eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJhdXRoMCIsImV4cCI6MTU5NTIyODA1MCwidXNlcm5hbWUiOiJmZ2F1c2hkamFzIn0.AMougOr9Y2V__1jf9hzZfbSEpb7UMV2oi4aMu1V4MZg
    }

    public static void main(String[] args) {
        UserData userData = new UserData();
        userData.setUserName("fgaushdjas");
        String token = sign(userData);
        System.out.println("token=   "+token);
        verify(token);
    }


    /**
     * 签名验证
     * @param token
     * @return
     */
    public static boolean verify(String token){


        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println("认证通过：");
            System.out.println("issuer: " + jwt.getIssuer());
            System.out.println("username: " + jwt.getClaim("username").asString());
            System.out.println("过期时间：      " + jwt.getExpiresAt());
            return true;
        } catch (Exception e){
            return false;
        }

    }

}

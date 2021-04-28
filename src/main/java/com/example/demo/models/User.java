package com.example.demo.models;
import java.io.Serializable;


/**
 * @Auther: yuewenbo971@hellobike.com
 * @Date: 2021/3/4 15:03
 * @Description:
 */

public class User implements Serializable {

    Long id;
    /**
     * 用户名
     */

    String userName;

    String password;
}
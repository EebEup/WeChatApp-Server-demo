package com.mnz.wechatappserverdemo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Classname User
 * @Author MNZ
 * @Date 2022/3/25 11:37 AM
 * @Description
 **/
@Data
@Getter
@Setter

public class User {
    String name;
    String password;
    public User(String name, String password){
        this.name=name;
        this.password=password;
    }


}

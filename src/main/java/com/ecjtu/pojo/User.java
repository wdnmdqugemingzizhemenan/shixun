package com.ecjtu.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String tel;
    private String role;
    private String workPic;

    public User(String username, String tel, String role) {
        this.username = username;
        this.tel = tel;
        this.role = role;
    }
}

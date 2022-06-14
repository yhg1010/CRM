package com.backend.entity;
 
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:39
 */
public class Baseinfo {
    private Integer id;
    private String username;
    private String phone;
    private String realName;
    private String email;
    //private String realName;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setMale(String username) {
        this.username = username;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    // public String getRealName() {
    //     return realName;
    // }
 
    // public void setRealName(String realName) {
    //     this.realName = realName;
    // }
 
    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

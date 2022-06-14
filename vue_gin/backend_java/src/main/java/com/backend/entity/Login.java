package com.backend.entity;
 
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:39
 */
public class Login {
    private Integer id;
    private String username;
    private String pwd;
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
 
    public String getPwd() {
        return pwd;
    }
 
    public void setPwd(String pwd) {
        this.pwd = pwd;
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
                ", male='" + username + '\'' +
                ", name='" + pwd + '\'' +
                '}';
    }
}
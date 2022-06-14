package com.backend.entity;

public class Users {
    private Integer id;
    private String userName;
    private String phone;
    private String email;
    private String realName;
    private String department;
    private String job;
    private String role;
    private String updateTime;
    private String sex;
    private String pwd;

    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getuserName() {
        return userName;
    }
 
    public void setuserName(String userName) {
        this.userName = userName;
    }
 
    public String getphone() {
        return phone;
    }
 
    public void setphone(String phone) {
        this.phone = phone;
    }


    public String getemail() {
        return email;
    }
 
    public void setemail(String email) {
        this.email = email;
    }

    public String getrealName() {
        return realName;
    }
 
    public void setrealName(String realName) {
        this.realName = realName;
    }

    public String getdepartment() {
        return department;
    }
 
    public void setdepartment(String department) {
        this.department = department;
    }


    public String getjob() {
        return job;
    }
 
    public void setjob(String job) {
        this.job = job;
    }




    public String getrole() {
        return role;
    }
 
    public void setrole(String role) {
        this.role = role;
    }

    public String getupdateTime() {
        return updateTime;
    }
 
    public void setupdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getsex() {
        return sex;
    }
 
    public void setsex(String sex) {
        this.sex = sex;
    }
    public String getpwd() {
        return pwd;
    }
 
    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

}

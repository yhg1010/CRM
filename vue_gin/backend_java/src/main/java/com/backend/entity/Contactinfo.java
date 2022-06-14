package com.backend.entity;

public class Contactinfo {
    private Integer id;
    private String name;
    private String level;
    private String customerName;
    private String phone;
    private String tele;
    private String email;
    private String sex;
    private String createTime;
    private String creator;
    private Integer customerId;

    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }
 
    public void setname(String name) {
        this.name = name;
    }

    public String getlevel() {
        return level;
    }
 
    public void setlevel(String level) {
        this.level = level;
    }

    public String getcustomerName() {
        return customerName;
    }
 
    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getphone() {
        return phone;
    }
 
    public void setphone(String phone) {
        this.phone = phone;
    }

    public String gettele() {
        return tele;
    }
 
    public void settele(String tele) {
        this.tele = tele;
    }

    public String getemail() {
        return email;
    }
 
    public void setemail(String email) {
        this.email = email;
    }


    public String getsex() {
        return sex;
    }
 
    public void setsex(String sex) {
        this.sex = sex;
    }

    public String getcreateTime() {
        return createTime;
    }
 
    public void setcreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getcreator() {
        return creator;
    }
 
    public void setcreator(String creator) {
        this.creator = creator;
    }

    public Integer getcustomerId() {
        return customerId;
    }
 
    public void setcustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    
}

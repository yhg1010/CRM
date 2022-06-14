package com.backend.entity;

public class Orders {
    private Integer id;
    private String orderName;
    private String orderValue;
    private String customerName;
    private String planTime;
    private String tag;
    private String recentTime;
    private String nextTime;
    private String createTime;
    private String creator;
    private Integer customerId;
    private String orderStage;
    private String allocator;
    private String department;
    private String updateTime;

    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }

    public String getorderName() {
        return orderName;
    }
 
    public void setorderName(String orderName) {
        this.orderName = orderName;
    }

    public String getorderValue() {
        return orderValue;
    }
 
    public void setorderValue(String orderValue) {
        this.orderValue = orderValue;
    }

    public String getcustomerName() {
        return customerName;
    }
 
    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getplanTime() {
        return planTime;
    }
 
    public void setplanTime(String planTime) {
        this.planTime = planTime;
    }

    public String gettag() {
        return tag;
    }
 
    public void settag(String tag) {
        this.tag = tag;
    }

    public String getrecentTime() {
        return recentTime;
    }
 
    public void setrecentTime(String recentTime) {
        this.recentTime = recentTime;
    }


    public String getnextTime() {
        return nextTime;
    }
 
    public void setnextTime(String nextTime) {
        this.nextTime = nextTime;
    }

    public String getcreateTime() {
        return createTime;
    }
 
    public void setcreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getorderStage() {
        return orderStage;
    }
 
    public void setorderStage(String orderStage) {
        this.orderStage = orderStage;
    }

    public Integer getcustomerId() {
        return customerId;
    }
 
    public void setcustomerId(Integer customerId) {
        this.customerId = customerId;
    }


    public String getallocator() {
        return allocator;
    }
 
    public void setallocator(String allocator) {
        this.allocator = allocator;
    }

    public String getdepartment() {
        return department;
    }
 
    public void setdepartment(String department) {
        this.department = department;
    }

    public String getupdateTime() {
        return updateTime;
    }
 
    public void setupdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getcreator() {
        return creator;
    }
 
    public void setcreator(String creator) {
        this.creator = creator;
    }
}

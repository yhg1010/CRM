package com.backend.entity;

public class Planitem {
    private Integer id;
    private String plan;
    private String res;
    private String exeTime;
    private String creaTime;
    private String updateTime;
    private Integer customerId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    public String getexeTime() {
        return exeTime;
    }
    public void setexeTime(String exeTime) {
        this.exeTime = exeTime;
    }

    public String getcreaTime() {
        return creaTime;
    }
    public void setcreaTime(String creaTime) {
        this.creaTime = creaTime;
    }

    public String getupdateTime() {
        return updateTime;
    }
    public void setupdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getcustomerId() {
        return customerId;
    }
    public void setcustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}

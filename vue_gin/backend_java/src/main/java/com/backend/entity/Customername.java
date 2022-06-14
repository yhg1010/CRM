package com.backend.entity;

public class Customername {
    private Integer id;
    private String customerName;
    private String chancesource;
    private String successRate;
    private String conclusion;
    private String contact;
    private String contactPhone;
    private String description;
    private String creator;
    private String createTime;
    private String allocateTime;
    private String exploitStatus;

    //private String realName;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getcustomerName() {
        return customerName;
    }
 
    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    public String getchancesource() {
        return chancesource;
    }
 
    public void setchancesource(String chancesource) {
        this.chancesource = chancesource;
    }


    public String getsuccessRate() {
        return successRate;
    }
 
    public void setsuccessRate(String successRate) {
        this.successRate = successRate;
    }

    public String getconclusion() {
        return conclusion;
    }
 
    public void setconclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getcontactPhone() {
        return contactPhone;
    }
 
    public void setcontactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }


    public String getdescription() {
        return description;
    }
 
    public void setdescription(String description) {
        this.description = description;
    }




    public String getcontact() {
        return contact;
    }
 
    public void setcontact(String contact) {
        this.contact = contact;
    }

    public String getcreator() {
        return creator;
    }
 
    public void setcreator(String creator) {
        this.creator = creator;
    }

    public String getcreateTime() {
        return createTime;
    }
 
    public void setcreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getallocateTime() {
        return allocateTime;
    }
 
    public void setallocateTime(String allocateTime) {
        this.allocateTime = allocateTime;
    }
    public String getstatus() {
        return exploitStatus;
    }
 
    public void setstatus(String exploitStatus) {
        this.exploitStatus = exploitStatus;
    }
 
}

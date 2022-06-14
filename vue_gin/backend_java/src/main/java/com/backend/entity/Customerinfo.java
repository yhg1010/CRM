package com.backend.entity;

public class Customerinfo {
    private Integer id;
    private String customerName;
    private String customerSource;
    private String customerJob;
    private String customerLevel;
    private String area;
    private String address;

    private String contactPhone;
    private String email;
    private String saleStatus;
    private String tag;
    private String manager;
    private String nextContact;
    private String creator;

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
 
    public String getcustomerSource() {
        return customerSource;
    }
 
    public void setcustomerSource(String customerSource) {
        this.customerSource = customerSource;
    }


    public String getcustomerJob() {
        return customerJob;
    }
 
    public void setcustomerJob(String customerJob) {
        this.customerJob = customerJob;
    }

    public String getcustomerLevel() {
        return customerLevel;
    }
 
    public void setcustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getcontactPhone() {
        return contactPhone;
    }
 
    public void setcontactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }


    public String getarea() {
        return area;
    }
 
    public void setarea(String area) {
        this.area = area;
    }




    public String getaddress() {
        return address;
    }
 
    public void setaddress(String address) {
        this.address = address;
    }

    public String getemail() {
        return email;
    }
 
    public void setemail(String email) {
        this.email = email;
    }

    public String getsaleStatus() {
        return saleStatus;
    }
 
    public void setsaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }




    public String gettag() {
        return tag;
    }
 
    public void settag(String tag) {
        this.tag = tag;
    }
    public String getmanager() {
        return manager;
    }
 
    public void setmanager(String manager) {
        this.manager = manager;
    }
    public String getnextContact() {
        return nextContact;
    }
 
    public void setnextContact(String nextContact) {
        this.nextContact = nextContact;
    }

    public String getcreator() {
        return creator;
    }
 
    public void setcreator(String creator) {
        this.creator = creator;
    }
}

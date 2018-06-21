package com.wj.demo.entity;

import org.springframework.context.annotation.Primary;


public class User {
    private Integer uId;

    private String uName;

    private String uPwd;

    private String uPhone;

    private Byte uIsValid;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public Byte getuIsValid() {
        return uIsValid;
    }

    public void setuIsValid(Byte uIsValid) {
        this.uIsValid = uIsValid;
    }
}
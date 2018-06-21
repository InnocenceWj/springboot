package com.wj.demo.entity;

public class Good {
    private Integer gId;

    private String gName;

    private Integer gNum;

    private String gDescribe;

    private Byte gIsValid;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public String getgDescribe() {
        return gDescribe;
    }

    public void setgDescribe(String gDescribe) {
        this.gDescribe = gDescribe == null ? null : gDescribe.trim();
    }

    public Byte getgIsValid() {
        return gIsValid;
    }

    public void setgIsValid(Byte gIsValid) {
        this.gIsValid = gIsValid;
    }
}
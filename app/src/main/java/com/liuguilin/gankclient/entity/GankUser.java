package com.liuguilin.gankclient.entity;

/*
 *  项目名：  GankClient 
 *  包名：    com.liuguilin.gankclient.entity
 *  文件名:   GankUser
 *  创建者:   LGL
 *  创建时间:  2016/10/18 22:48
 *  描述：    用戶F扩展类
 */

import cn.bmob.v3.BmobUser;

public class GankUser extends BmobUser{

    //年龄
    private int age;
    //性别
    private boolean sex;
    //简介
    private String desc;
    //生日
    private String birthday;
    //星座
    private String constellation;
    //职业
    private String occupation;
    //学校
    private String school;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

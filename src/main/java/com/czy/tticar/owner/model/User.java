package com.czy.tticar.owner.model;

import com.czy.tticar.owner.common.base.BaseEntity;

/**
 * @author chengxy
 * @date 2018/5/9 10:19
 */
public class User extends BaseEntity {

    /**
     * 用户名
     * */
    private String userName;

    /**
     * 密码
     * */
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

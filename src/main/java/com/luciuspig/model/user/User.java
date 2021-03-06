package com.luciuspig.model.user;

import java.io.Serializable;

/**
 * 用户
 * @author lucius
 * */
public class User implements Serializable {

    /**id*/
    private Long id;

    /**账号*/
    private Account account;

    /**姓名*/
    private String name;

    /** 手机号*/
    private  String mobilePhone;

    public User() {
    }
    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}

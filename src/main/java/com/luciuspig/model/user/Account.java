package com.luciuspig.model.user;

import java.io.Serializable;

/**
 * 账号
 * @author Lucius
 * */
public class Account implements Serializable {

    private Long id;

    /**账号*/
    private String account;

    /**密码 (md5：密码+盐)*/
    private  String password;

    /**盐值 */
    private String salt;

    /**是否启用*/
    private Boolean enable;

    public Account() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCredentialsSalt() {
        return account + salt;
    }


}

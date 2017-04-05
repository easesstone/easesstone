package com.sydney.dream.module;

/**
 * Created by Sydney on 2017/1/10.
 */
public class User {

    private Integer userId; // 用户id
    private String userName; // 用户名
    private String userPassword;  // 用户密码
    private String userPhoneNum;   //用户密码
    private String userEmail;   //用户邮箱

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhoneNum='" + userPhoneNum + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}

package com.sydney.dream.handler;

/**
 * Created by Sydney on 2017/4/16.
 */
public class User
{
    private String username;
    private String userAge;
    private Dog dog;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userAge='" + userAge + '\'' +
                ", dog=" + dog +
                '}';
    }
}

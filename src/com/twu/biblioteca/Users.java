package com.twu.biblioteca;

public class Users {

    private String name;
    private String email;
    private long phoneNumber;
    private String loginId;
    private String password;

    public Users(String name, String email, long phoneNumber, String loginId, String password){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.loginId = loginId;
        this.password = password;
    }

    public String toString(){
        return name + "\n" + email + "\n" + phoneNumber ;
    }
}

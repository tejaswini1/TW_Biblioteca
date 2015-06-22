package com.twu.biblioteca.Models;

public class User {

    private String name;
    private String email;
    private long phoneNumber;
    private String loginId;
    private String password;
    private String role;

    public User(String name, String email, long phoneNumber, String loginId, String password, String role) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.loginId = loginId;
        this.password = password;
        this.role = role;
    }

    public String toString() {
        return name + "\n" + email + "\n" + phoneNumber;
    }

    public boolean match(String loginId, String password) {
        return this.loginId.equals(loginId) && this.password.equals(password);
    }

    public boolean isLibrarian() {
        return this.role.equals("librarian");
    }

    public boolean equals(String loginId) {
        return this.loginId.equals(loginId);
    }

}

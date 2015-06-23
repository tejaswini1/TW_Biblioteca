package com.twu.biblioteca.Validation;

import com.twu.biblioteca.Models.User;

import java.util.ArrayList;

public class Users {

    private ArrayList<User> users;

    public Users(ArrayList<User> users){
        this.users = users;
    }

    public String validUser(String loginID, String password){
        for(User user : users){
            if(user.match(loginID,password)){
                if(user.isLibrarian())
                    return "Librarian";
                return "User";
            }
        }
        return "Please Input Valid Username and password";
    }

    public String displayValidUser(String loginId){
        String result = "";
        for(User user : users){
            if(user.equals(loginId))
                 result = user.toString();
        }
        return "\n"+result+"\n";
    }
}

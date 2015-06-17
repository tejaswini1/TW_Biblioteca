package com.twu.biblioteca;

import java.util.ArrayList;

public class Authentication {

    private ArrayList<User> users;

    public Authentication(ArrayList<User> users){

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
}

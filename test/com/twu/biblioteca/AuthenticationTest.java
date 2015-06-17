package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AuthenticationTest {

    @Test
    public void shouldReturnTrueIfValidUser(){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju", "user"));
        Authentication authentication = new Authentication(users);

        String actual = authentication.validUser("abc-345", "teju");

        assertEquals("User", actual);
    }


    @Test
    public void shouldReturnTrueIfValidLibrarian(){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju", "librarian"));
        Authentication authentication = new Authentication(users);

        String actual = authentication.validUser("abc-345", "teju");

        assertEquals("libarian", actual);
    }

    @Test
    public void shouldReturnInvalidOutputStirngForInCorrectPasswordAndLoginID(){

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju", "librarian"));
        Authentication authentication = new Authentication(users);

        String actual = authentication.validUser("abc-346", "teju");

        assertEquals("Please Input Valid Username and password", actual);
    }

}
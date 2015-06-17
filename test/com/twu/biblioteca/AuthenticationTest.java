package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AuthenticationTest {

    @Test
    public void shouldReturnTrueIfValidUser(){
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju"));
        Authentication authentication = new Authentication(users);

        boolean actual = authentication.validUser("abc-345", "teju");

        assertEquals(true, actual);
    }

}
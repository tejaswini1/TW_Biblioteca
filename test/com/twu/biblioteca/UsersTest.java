package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    @Test
    public void shouldReturnUsersInformation(){
        Users users = new Users("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju");

        String actual = users.toString();

        assertEquals("teju\ntejubhosle123@gmail.com\n9850678439", actual);
    }
}
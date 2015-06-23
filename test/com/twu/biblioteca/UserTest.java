package com.twu.biblioteca;

import com.twu.biblioteca.Models.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldReturnUsersInformation(){
        User users = new User("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju", "user");

        String actual = users.toString();

        assertEquals("NAME : teju\nEMAIL ID : tejubhosle123@gmail.com\nPHONE NO. : 9850678439", actual);
    }

    @Test
    public void shouldReturnTrueForCorrectPasswordAndLoginID(){
        User user = new User("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju", "user");

        boolean actual = user.match("abc-345", "teju");

        assertEquals(true, actual);
    }

    @Test
    public void shouldReturnTrueForCorrectLoginID(){
        User user = new User("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju", "user");

        boolean actual = user.equals("abc-345");

        assertEquals(true, actual);
    }

    @Test
    public void shouldReturnTrueIfUserIsLibrarian(){
        User user = new User("teju", "tejubhosle123@gmail.com", 9850678439l , "abc-345", "teju", "librarian");

        boolean actual = user.isLibrarian();

        assertEquals(true, actual);
    }



}
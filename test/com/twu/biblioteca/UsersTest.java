package com.twu.biblioteca;

import com.twu.biblioteca.Models.User;
import com.twu.biblioteca.Validation.Users;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UsersTest {

    @Test
    public void shouldReturnStringUserIfValidationIsMadeByUser(){
        ArrayList<User> userArrayList = new ArrayList<User>();
        userArrayList.add(new User("teju", "t@gmail", 635839l, "teju-123", "passwrd", "user"));

        Users users = new Users(userArrayList);

        String actualRole = users.validUser("teju-123", "passwrd");

        assertEquals("User", actualRole);
    }

    @Test
    public void shouldReturnStringLibrarianIfValidationIsMadeByLibrarian(){
        ArrayList<User> userArrayList = new ArrayList<User>();
        userArrayList.add(new User("teju", "t@gmail", 635839l, "teju-123", "passwrd", "librarian"));

        Users users = new Users(userArrayList);

        String actualRole = users.validUser("teju-123", "passwrd");

        assertEquals("Librarian", actualRole);
    }



    @Test
    public void shouldReturnStringForInavlidUsernameAndPassword(){
        ArrayList<User> userArrayList = new ArrayList<User>();
        userArrayList.add(new User("teju", "t@gmail", 635839l, "teju-123", "passwrd", "librarian"));

        Users users = new Users(userArrayList);

        String actualRole = users.validUser("teju-123", "hello");

        assertEquals("Please Input Valid Username and password", actualRole);
    }


    @Test
    public void shouldDisplayDetailsOfUser(){
        ArrayList<User> userArrayList = new ArrayList<User>();
        userArrayList.add(new User("teju", "t@gmail", 635839l, "teju-123", "passwrd", "librarian"));

        Users users = new Users(userArrayList);

        String actual = users.displayValidUser("teju-123");

        assertEquals("teju\nt@gmail\n635839", actual);
    }

}
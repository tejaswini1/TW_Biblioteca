package com.twu.biblioteca;

import com.twu.biblioteca.Validation.User;
import com.twu.biblioteca.Validation.Users;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BibliotecaAppTest {


    @Test
    public void shouldCallReadIntegerMethodInStartMethod() {
        Users authenticationStub = mock(Users.class);
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("List Books", "Quit");
        MenuController menuControllerStub = mock(MenuController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, menuControllerStub, authenticationStub);

        bibliotecaApp.start();

        verify(bibliotecaViewStub, times(2)).read();
    }


    @Test
    public void shouldCallMethodsInStartMethod() {
        Users authenticationStub = mock(Users.class);
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("List Books", "Quit");
        MenuController menuControllerStub = mock(MenuController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, menuControllerStub, authenticationStub);

        bibliotecaApp.start();

        verify(bibliotecaViewStub, times(3)).display(anyString());
    }


    @Test
    public void shouldCallReadMethodForTakingLoginIDAndPassword() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("teju", "tejubhosle@gmail", 9850748390l, "pune-123", "teju", "user"));
        Users authentication = new Users(users);
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("pune-123", "jone");
        MenuController menuControllerStub = mock(MenuController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, menuControllerStub, authentication);

        bibliotecaApp.start();

        String actualRole = authentication.validUser("pune-123", "teju");

        assertEquals("Please Input Valid Username and password", actualRole);
    }


}
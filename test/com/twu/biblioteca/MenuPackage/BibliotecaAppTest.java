package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.Messages;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {
    @Test
    public void shouldCallDisplayForPritingWelcomeMessage() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        BooksController booksControllerStub = mock(BooksController.class);
        MenuController menuControllerStub = mock(MenuController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, booksControllerStub, menuControllerStub);

        bibliotecaApp.start();

        verify(bibliotecaViewStub, times(1)).display(Messages.WELCOME_MESSAGE);
    }

}
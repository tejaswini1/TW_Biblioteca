package com.twu.biblioteca;

import com.twu.biblioteca.*;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
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


    @Test
    public void shouldPrintListOfMenuItems() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        BooksController booksControllerStub = mock(BooksController.class);
        MenuController menuControllerStub = mock(MenuController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, booksControllerStub, menuControllerStub);

        bibliotecaApp.start();

        verify(bibliotecaViewStub, times(1)).display(Messages.MENU_ITEMS);
    }

    @Test
    public void shouldPrintListOfBooksDetails() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        BooksController booksControllerStub = mock(BooksController.class);
        MenuController menuControllerStub = mock(MenuController.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaViewStub, booksControllerStub, menuControllerStub);

        bibliotecaApp.start();

        verify(menuControllerStub, times(1)).selectOption(anyInt());
    }
}
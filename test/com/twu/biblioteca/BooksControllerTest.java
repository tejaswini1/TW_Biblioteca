package com.twu.biblioteca;


import com.twu.biblioteca.MenuPackage.BooksController;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class BooksControllerTest {

    @Test
    public void shouldCallDisplayMethodOfBibliotecaView(){
        HashMap<Book, Boolean> list = new HashMap<Book, Boolean>();
        list.put(new Book("java","f","r"),true);
        list.put(new Book("os", "e", "r"), false);
        Books books = new Books(list);
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        BooksController booksController = new BooksController(bibliotecaViewStub, books);

        booksController.listAllBooks();

        verify(bibliotecaViewStub, times(1)).display("java, f, r\n");

    }

    @Test
    public void shouldDisplayCheckoutMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
            when(bibliotecaViewStub.read())
                    .thenReturn("java");
        HashMap<Book, Boolean> list = new HashMap<Book, Boolean>();
        list.put(new Book("java", "h", "s"), true);
        Books books = new Books(list);
        BooksController booksController = new BooksController(bibliotecaViewStub, books);

        booksController.checkout();

        verify(bibliotecaViewStub,times(1)).display(Messages.CHECKOUT_SUCCESSFUL);

    }

    @Test
    public void shouldDisplayUnsuccessfulCheckoutMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        HashMap<Book, Boolean> list = new HashMap<Book, Boolean>();
        list.put(new Book("java", "h", "s"), true);
        Books books = new Books(list);
        BooksController booksController = new BooksController(bibliotecaViewStub, books);

        booksController.checkout();

        verify(bibliotecaViewStub,times(1)).display(Messages.CHECKOUT_SUCCESSFUL);

    }

}
package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class LibraryControllerTest {

    @Test
    public void shouldCallDisplayMethodOfBibliotecaView(){
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "f", "r"));
        list.add(new Book("os", "e", "r"));
        Library library = new Library(list, new ArrayList<Book>());
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.listAllBooks();

        verify(bibliotecaViewStub, times(1)).display("java, f, r\n");

    }

    @Test
    public void shouldDisplayCheckoutMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
            when(bibliotecaViewStub.read())
                    .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        Library library = new Library(list, new ArrayList<Book>());
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.checkout();

        verify(bibliotecaViewStub,times(1)).display(Messages.CHECKOUT_SUCCESSFUL);

    }

    @Test
    public void shouldDisplayUnsuccessfulCheckoutMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        Library library = new Library(list, new ArrayList<Book>());
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.checkout();

        verify(bibliotecaViewStub,times(1)).display(Messages.CHECKOUT_UNSUCCESSFUL);

    }

    @Test
    public void shouldDisplaySuccessfultReturnMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        Library library = new Library(list, new ArrayList<Book>());
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.returnBook();

        verify(bibliotecaViewStub,times(1)).display(Messages.RETURN_SUCCESSFUL);

    }


    @Test
    public void shouldDisplayUnSuccessfultReturnMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        Library library = new Library(list, new ArrayList<Book>());
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.returnBook();

        verify(bibliotecaViewStub,times(1)).display(Messages.RETURN_UNSUCCESSFUL);

    }

}
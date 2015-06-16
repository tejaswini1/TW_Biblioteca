package com.twu.biblioteca;


import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class LibraryControllerTest {

    @Test
    public void shouldCallDisplayMethodOfBibliotecaView(){
        HashMap<Book, Boolean> list = new HashMap<Book, Boolean>();
        list.put(new Book("java","f","r"),true);
        list.put(new Book("os", "e", "r"), false);
        Library library = new Library(list);
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
        HashMap<Book, Boolean> list = new HashMap<Book, Boolean>();
        list.put(new Book("java", "h", "s"), true);
        Library library = new Library(list);
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.checkout();

        verify(bibliotecaViewStub,times(1)).display(Messages.CHECKOUT_SUCCESSFUL);

    }

    @Test
    public void shouldDisplayUnsuccessfulCheckoutMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        HashMap<Book, Boolean> list = new HashMap<Book, Boolean>();
        list.put(new Book("java", "h", "s"), false);
        Library library = new Library(list);
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.checkout();

        verify(bibliotecaViewStub,times(1)).display(Messages.CHECKOUT_UNSUCCESSFUL);

    }

    @Test
    public void shouldDisplaySuccessfultReturnMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        HashMap<Book, Boolean> list = new HashMap<Book, Boolean>();
        list.put(new Book("java", "h", "s"), false);
        Library library = new Library(list);
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.returnBook();

        verify(bibliotecaViewStub,times(1)).display(Messages.RETURN_SUCCESSFUL);

    }


    @Test
    public void shouldDisplayUnSuccessfultReturnMessageToBibliotecaView(){
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        HashMap<Book, Boolean> list = new HashMap<Book, Boolean>();
        list.put(new Book("java", "h", "s"), true);
        Library library = new Library(list);
        BooksController booksController = new BooksController(bibliotecaViewStub, library);

        booksController.returnBook();

        verify(bibliotecaViewStub,times(1)).display(Messages.RETURN_UNSUCCESSFUL);

    }

}
package com.twu.biblioteca;

import com.twu.biblioteca.BibliotecaView;
import com.twu.biblioteca.Books;
import com.twu.biblioteca.MenuPackage.BooksController;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class BooksControllerTest {

    @Test
    public void shouldCallDisplayMethodOfBibliotecaView(){
        Books booksStub = mock(Books.class);
        when(booksStub.toString())
                .thenReturn("It Works");
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        BooksController booksController = new BooksController(bibliotecaViewStub, booksStub);

        booksController.listAllBooks();

        Mockito.verify(bibliotecaViewStub, times(1)).display(booksStub.toString());

    }

}
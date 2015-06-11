package com.twu.biblioteca;


import com.twu.biblioteca.MenuPackage.BooksController;
import org.junit.Test;
import static org.mockito.Mockito.*;
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

        verify(bibliotecaViewStub, times(1)).display(anyString());

    }

}
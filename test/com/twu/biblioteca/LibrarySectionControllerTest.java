package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class LibrarySectionControllerTest {

    @Test
    public void shouldCallDisplayMethodOfBibliotecaView() {
        LibrarySection librarySectionStub = mock(LibrarySection.class);
        when(librarySectionStub.toString())
                .thenReturn("List of Books");
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        BooksController booksController = new BooksController(bibliotecaViewStub, librarySectionStub);

        booksController.listAllBooks();

        verify(bibliotecaViewStub, times(1)).display("List of Books");

    }

    @Test
    public void shouldDisplayCheckoutMessageToBibliotecaView() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        LibrarySection librarySection = new LibrarySection(list, new ArrayList<Book>());
        BooksController booksController = new BooksController(bibliotecaViewStub, librarySection);

        booksController.checkout();

        verify(bibliotecaViewStub, times(1)).display(Messages.CHECKOUT_SUCCESSFUL);

    }

    @Test
    public void shouldDisplayUnsuccessfulCheckoutMessageToBibliotecaView() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(), list);
        BooksController booksController = new BooksController(bibliotecaViewStub, librarySection);

        booksController.checkout();

        verify(bibliotecaViewStub, times(1)).display(Messages.CHECKOUT_UNSUCCESSFUL);

    }

    @Test
    public void shouldDisplaySuccessfultReturnMessageToBibliotecaView() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(), list);
        BooksController booksController = new BooksController(bibliotecaViewStub, librarySection);

        booksController.returnBook();

        verify(bibliotecaViewStub, times(1)).display(Messages.RETURN_SUCCESSFUL);

    }


    @Test
    public void shouldDisplayUnSuccessfultReturnMessageToBibliotecaView() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        LibrarySection librarySection = new LibrarySection(list, new ArrayList<Book>());
        BooksController booksController = new BooksController(bibliotecaViewStub, librarySection);

        booksController.returnBook();

        verify(bibliotecaViewStub, times(1)).display(Messages.RETURN_UNSUCCESSFUL);

    }

}
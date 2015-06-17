package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class MoviesControllerTest {

    @Test
    public void shouldCallDisplayMethodOfBibliotecaView() {
        LibrarySection librarySectionStub = mock(LibrarySection.class);
        when(librarySectionStub.toString())
                .thenReturn("List of Movies");
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        MoviesController moviesController = new MoviesController(bibliotecaViewStub, librarySectionStub);

        moviesController.listAllMovies();

        verify(bibliotecaViewStub, times(1)).display("List of Movies");

    }

    @Test
    public void shouldDisplayCheckoutMessageToBibliotecaView() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("movie1");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("movie1", "h", "s"));
        LibrarySection librarySection = new LibrarySection(list, new ArrayList<Book>());
        MoviesController moviesController = new MoviesController(bibliotecaViewStub, librarySection);

        moviesController.checkout();

        verify(bibliotecaViewStub, times(1)).display(anyString());

    }

    @Test
    public void shouldDisplayUnsuccessfulCheckoutMessageToBibliotecaView() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(), list);
        MoviesController moviesController = new MoviesController(bibliotecaViewStub, librarySection);

        moviesController.checkout();

        verify(bibliotecaViewStub, times(1)).display(Messages.MOVIE_CHECKOUT_UNSUCCESSFUL);

    }

    @Test
    public void shouldDisplaySuccessfultReturnMessageToBibliotecaView() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(), list);
        MoviesController moviesController = new MoviesController(bibliotecaViewStub, librarySection);

        moviesController.returnMovie();

        verify(bibliotecaViewStub, times(1)).display(anyString());

    }


    @Test
    public void shouldDisplayUnSuccessfultReturnMessageToBibliotecaView() {
        BibliotecaView bibliotecaViewStub = mock(BibliotecaView.class);
        when(bibliotecaViewStub.read())
                .thenReturn("java");
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("java", "h", "s"));
        LibrarySection librarySection = new LibrarySection(list, new ArrayList<Book>());
        MoviesController moviesController = new MoviesController(bibliotecaViewStub, librarySection);

        moviesController.returnMovie();

        verify(bibliotecaViewStub, times(1)).display(Messages.MOVIE_RETURN_UNSUCCESSFUL);

    }


}
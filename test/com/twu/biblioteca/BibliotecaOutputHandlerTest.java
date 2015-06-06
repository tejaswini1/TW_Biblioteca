package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BibliotecaOutputHandlerTest {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }



    @Test
    public void shouldPrintWelcomeMessage(){
        Biblioteca bibliotecaStub = mock(Biblioteca.class);
        when(bibliotecaStub.welcomeMessage())
                .thenReturn("Welcome B");

        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.displayWelcomeMessage(bibliotecaStub);

        assertEquals("Welcome B\n", outContent.toString());

    }

    @Test
    public void shouldPrintListOfBooks(){
        Books books = mock(Books.class);
        when(books.toString())
                .thenReturn("OS\nJava");

        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.displayListBooks(books);

        assertEquals("OS\nJava\n", outContent.toString());

    }

    @Test
    public void shouldPrintBookDetails(){
        Book book = mock(Book.class);
        when(book.toString())
                .thenReturn("Alchemist, Paulo, 26Feb2000");

        BibliotecaOutputHandler bibliotecaOutputHandler = new BibliotecaOutputHandler();
        bibliotecaOutputHandler.displayListBooks(book);

        assertEquals("Alchemist, Paulo, 26Feb2000\n", outContent.toString());

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


}

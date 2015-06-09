package com.twu.biblioteca;

import com.twu.biblioteca.MenuPackage.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class BooksViewTest {

    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDispalyListOfBooksToConsole() throws IOException {
        BooksView booksView = new BooksView(new Books());
        booksView.displayBooks();

        assertEquals("Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n", outContent.toString());

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
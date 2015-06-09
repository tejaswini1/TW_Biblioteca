package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.BooksView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;
public class ListAllBooksTest {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }


        @Test
        public void shouldDisplayListOfBooksOnConsole(){
            BooksView booksView = mock(BooksView.class);
            ListAllBooks listAllBooks = new ListAllBooks(booksView);
            listAllBooks.execute();

            Mockito.verify(booksView, times(1)).displayBooks();
        }
        @After
        public void cleanUpStreams() {
            System.setOut(null);
        }

}

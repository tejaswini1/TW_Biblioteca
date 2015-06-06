package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksTest {

    @Test
    public void shouldDisplayBookList(){
        ArrayList<Book> booksList = new ArrayList<Book>();

        Book firstBookstub = mock(Book.class);
        when(firstBookstub.toString())
                .thenReturn("Java, Jones, 21Feb2019");

        Book secondBookstub = mock(Book.class);
        when(secondBookstub.toString())
                .thenReturn("CN, Stalling, 3Oct1990");

        booksList.add(firstBookstub);
        booksList.add(secondBookstub);
        Books books = new Books(booksList);
        String expectedList = "Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n";

        String actualList = books.toString();

         assertEquals(expectedList, actualList);
    }

}

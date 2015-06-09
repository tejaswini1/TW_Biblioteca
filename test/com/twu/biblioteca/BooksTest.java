package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void shouldReturnBookList(){
        Books books = new Books();

        String expectedList = "Java, Jones, 21Feb2019\nCN, Stalling, 3Oct1990\n";

        String actualList = books.toString();

        assertEquals(expectedList, actualList);
    }

}

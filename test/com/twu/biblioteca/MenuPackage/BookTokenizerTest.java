package com.twu.biblioteca.MenuPackage;

import com.twu.biblioteca.Book;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTokenizerTest {
    @Test
    public void shouldCreateBookObjectWihSpecifiedBookNameAsItsNameState() {
        BookTokenizer bookTokenizer = new BookTokenizer();
        Book expectedBook = new Book("java", "", "");

        Book actualBook = bookTokenizer.get("java");

        assertEquals(expectedBook, actualBook);
    }


}
package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibrarySectionTest {



    @Test
    public void shouldPrintSuccessfulMessageForSuccessfulCheckout(){
        ArrayList booksList = new ArrayList();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        LibrarySection<Book> librarySection = new LibrarySection<Book>(booksList, new ArrayList<Book>());


        String actual = librarySection.checkout("Os");


        assertEquals("Thank you! Enjoy the book", actual);
    }

    @Test
    public void shouldPrintUnSuccessfulMessageForUnSuccessfulCheckout(){
        ArrayList booksList = new ArrayList();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        LibrarySection<Book> librarySection = new LibrarySection<Book>(booksList, new ArrayList<Book>());

        String actualBooleanValue = librarySection.checkout("cn");


        assertEquals("The book is not available", actualBooleanValue);
    }

    @Test
    public void shouldPrintSuccessfulMessageForSuccessfulReturn(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        LibrarySection<Book> librarySection = new LibrarySection<Book>(new ArrayList<Book>(), booksList);


        String actual = librarySection.returnBook("Java");


        assertEquals("Thank you for returning book", actual);
    }

}

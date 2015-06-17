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


        boolean actual = librarySection.checkout("Os");


        assertEquals(true, actual);
    }

    @Test
    public void shouldPrintUnSuccessfulMessageForUnSuccessfulCheckout(){
        ArrayList booksList = new ArrayList();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        LibrarySection<Book> librarySection = new LibrarySection<Book>(booksList, new ArrayList<Book>());

        boolean actualBooleanValue = librarySection.checkout("cn");


        assertEquals(false, actualBooleanValue);
    }

    @Test
    public void shouldPrintSuccessfulMessageForSuccessfulReturn(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        LibrarySection<Book> librarySection = new LibrarySection<Book>(new ArrayList<Book>(), booksList);


        boolean actual = librarySection.returnItem("Java");


        assertEquals(true, actual);
    }


    @Test
    public void shouldPrintUnSuccessfulMessageForSuccessfulReturn(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        LibrarySection<Book> librarySection = new LibrarySection<Book>(new ArrayList<Book>(), booksList);


        boolean actual = librarySection.returnItem("cn");


        assertEquals(false, actual);
    }


    @Test
    public void shouldPrintListOfAvailableBooks(){
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Java", "Jones", "21Feb2019"));
        booksList.add(new Book("Os", "Jones", "21Feb2019"));
        LibrarySection<Book> librarySection = new LibrarySection<Book>( booksList, new ArrayList<Book>());


        String actual = librarySection.toString();


        assertEquals("Java, Jones, 21Feb2019\nOs, Jones, 21Feb2019\n", actual);
    }

}